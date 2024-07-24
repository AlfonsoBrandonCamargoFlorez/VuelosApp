package com.agencia.reserva.infraestructure.in;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.agencia.escala.application.FindEscalaUseCase;
import com.agencia.escala.domain.entity.Escala;
import com.agencia.reserva.application.*;
import com.agencia.reserva.domain.entity.Asientosdetalles;
import com.agencia.reserva.domain.entity.BuscarVuelo;
import com.agencia.reserva.domain.entity.Ciudad;
import com.agencia.reserva.domain.entity.DetalleReserva;
import com.agencia.reserva.domain.entity.Pasajero;
import com.agencia.tipoDocumento.domain.entity.TipoDocumento;
import com.toedter.calendar.JCalendar;

public class vueloController {
  private final ConsultvueloUseCase consultvueloUseCase;
  private final BuscarCiudades buscarCiudades;
  private final BuscarvuelosUseCase buscarvuelosUseCase;
  private final CrearReservaUseCase crearReservaUseCase;
  private final VerificarPasajero verificarPasajero;
  private final BuscarTiposDocumentos buscarTiposDocumentos;
  private final FindEscalaUseCase findEscalaUseCase;
  private final CrearReservaDetalleUseCase crearReservaDetalleUseCase;
  private final AsignarsillaUseCase asignarsillaUseCase;
  private final BuscarSillasOcupadas buscarSillasOcupadas;
  private final CrearPasajeroUseCase crearPasajeroUseCase;

  

  public vueloController(ConsultvueloUseCase consultvueloUseCase, BuscarCiudades buscarCiudades,
      BuscarvuelosUseCase buscarvuelosUseCase, CrearReservaUseCase crearReservaUseCase,
      VerificarPasajero verificarPasajero, BuscarTiposDocumentos buscarTiposDocumentos,
      FindEscalaUseCase findEscalaUseCase, CrearReservaDetalleUseCase crearReservaDetalleUseCase,
      AsignarsillaUseCase asignarsillaUseCase, BuscarSillasOcupadas buscarSillasOcupadas,
      CrearPasajeroUseCase crearPasajeroUseCase) {
    this.consultvueloUseCase = consultvueloUseCase;
    this.buscarCiudades = buscarCiudades;
    this.buscarvuelosUseCase = buscarvuelosUseCase;
    this.crearReservaUseCase = crearReservaUseCase;
    this.verificarPasajero = verificarPasajero;
    this.buscarTiposDocumentos = buscarTiposDocumentos;
    this.findEscalaUseCase = findEscalaUseCase;
    this.crearReservaDetalleUseCase = crearReservaDetalleUseCase;
    this.asignarsillaUseCase = asignarsillaUseCase;
    this.buscarSillasOcupadas = buscarSillasOcupadas;
    this.crearPasajeroUseCase = crearPasajeroUseCase;
  }

  public void consultar() throws SQLException {
    String idString = JOptionPane.showInputDialog("Ingrese ID vuelo");
    int id = Integer.parseInt(idString);
    consultvueloUseCase.execute(id);

  }

  public void buscar() {
    List<Ciudad> ciudades = new ArrayList<>();
    ciudades = buscarCiudades.execute();
    BuscarVuelo bvuelo = new BuscarVuelo();
    bvuelo = seleccionaCiudades(ciudades);
    String fechaida = SeleccionarFecha();
    bvuelo.setFechaIda(fechaida);
    List<String> vuelos = buscarvuelosUseCase.execute(bvuelo);
    String Idvuelo = SeleccionarVuelo(vuelos);
    var yesOrNo = 0;
    bvuelo.setIdvuelo(Idvuelo);
    int idDetalleReserva=0;
    List<Escala> escalas = findEscalaUseCase.execute(Integer.valueOf(Idvuelo));

    if (!escalas.isEmpty()) {
      System.out.println(escalas);
      // escalas.forEach(escala -> System.out.println(escala.getId()));

      for (Escala escala : escalas) {
        System.out.println("Escala id: " + escala.getId());
        System.out.println("Número de conexión: " + escala.getNumeroConexion());
        System.out.println("Id trayecto: " + escala.getIdViaje());
        System.out.println("Id Avión: " + escala.getIdAvion());
        System.out.println("Id aeropuerto origen: " + escala.getIdAeropuertoOrigen());
        System.out.println("Id aeropuerto destino: " + escala.getIdAeropuertoDestino());
        System.out.println("------------"); // Separador para mayor claridad
      }
    }
    Asientosdetalles asientodetalle = new Asientosdetalles();
    while (yesOrNo == 0) {
      int idReserva =crearReservaUseCase.execute(bvuelo);
      List<TipoDocumento> tipos = buscarTiposDocumentos.execute();
      Pasajero pasajero = verificarPasajero(tipos);
      System.out.println(pasajero.getIdTipoDocumento());
      System.out.println(pasajero.getDocumento());
      int idPasajero =verificarPasajero.execute(pasajero);
      for (TipoDocumento tipoDocumento : tipos) {
        if (tipoDocumento.getNombre()==pasajero.getTipoDocumento()) {
          pasajero.setIdTipoDocumento(tipoDocumento.getId());
          System.out.println("tipo id"+pasajero.getIdTipoDocumento());
        }
      }
      if (idPasajero==0) {
        Pasajero pasajeroCreado = crearPasjeros(pasajero);
        idPasajero=crearPasajeroUseCase.execute(pasajeroCreado);
        System.out.println("id clinete"+idPasajero);
        pasajero.setIdTipoDocumento(idPasajero);
      }
      DetalleReserva detalleReserva = new DetalleReserva();

      detalleReserva.setIdReserva(idReserva);
      detalleReserva.setIdPasajero(idPasajero);
      idDetalleReserva= crearReservaDetalleUseCase.execute(detalleReserva);
      detalleReserva.setId(idDetalleReserva);
      System.out.println("cantidad"+escalas.size());
      int sillaseleccionada=0;
  
  
  
      JOptionPane.showMessageDialog(null, "Selecciona silla");

        for (int j = 0; j < escalas.size(); j++) {
          JPanel panelsilla = new JPanel(new GridLayout(0, 2));

          JLabel nombreLabel = new JLabel("Nombre:");
          JTextField nombreField = new JTextField();
          panelsilla.add(nombreField);
          panelsilla.add(nombreField);
          int result = JOptionPane.showConfirmDialog(null, panelsilla, "Seleccionar tipo Documento",
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE);
    String tipoDocumento = null;
    if (result == JOptionPane.OK_OPTION) {
      sillaseleccionada=Integer.parseInt(nombreField.getText());
    }
          asientodetalle.setIdConexion(escalas.get(j).getId());
          asientodetalle.setIdDetalleReserva(idDetalleReserva);
          asientodetalle.setIdAsiento(sillaseleccionada);
  asignarsillaUseCase.execute(asientodetalle);
        }
      
      yesOrNo = JOptionPane.showConfirmDialog(null, "Desea agregar un nuevo pasajero?");
    }

      JOptionPane.showMessageDialog(null, "Entrando a pasarela de pago");

    





  }

  private Pasajero crearPasjeros(Pasajero pasajero) {
    JOptionPane.showMessageDialog(null, "Entrando crear usuario");
JPanel panelPasajero = new JPanel(new GridLayout(0, 2));

          JLabel nombreLabel = new JLabel("Nombre:");
          JTextField nombreField = new JTextField();
          panelPasajero.add(nombreLabel);
          panelPasajero.add(nombreField);
          JLabel edadLabel = new JLabel("edad:");
          JTextField edadField = new JTextField();
          panelPasajero.add(edadLabel);
          panelPasajero.add(edadField);
          JLabel tipoLabel = new JLabel("tipo documento:");
          JLabel tipoDLabel = new JLabel(pasajero.getTipoDocumento());

          panelPasajero.add(tipoLabel);
          panelPasajero.add(tipoDLabel);

          JLabel numeroLabel = new JLabel("numero documento:");
          JLabel numeroDLabel = new JLabel(pasajero.getDocumento());

          panelPasajero.add(numeroLabel);
          panelPasajero.add(numeroDLabel);

          // int resulta = 
          JOptionPane.showConfirmDialog(null, panelPasajero, "Seleccionar tipo Documento",
              JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
          pasajero = new Pasajero(nombreField.getText(), Integer.parseInt(edadField.getText()), 1,
              numeroDLabel.getText());
          System.out.println( pasajero.getNombre() + pasajero.getEdad());
          buscarTiposDocumentos.execute();
          return pasajero;

  }

  public Pasajero verificarPasajero(List<TipoDocumento> tipos) {

    List<String> listTiposDocuemtnos = new ArrayList<>();
    for (TipoDocumento tipoDocumento : tipos) {
      listTiposDocuemtnos.add(tipoDocumento.getNombre());
    }

    JComboBox<String> comboBoxTipoDocumento = new JComboBox<>(listTiposDocuemtnos.toArray(new String[0]));
    JPanel panelBuscar = new JPanel(new GridLayout(0, 2));
    // JPanel panel = new JPanel(new GridLayout(0, 2));
    panelBuscar.add(new JLabel("Seleccione tipo Documento:"));
    panelBuscar.add(comboBoxTipoDocumento);
    JLabel documetoJLabel = new JLabel("Numero documento:");
    JTextField documentoField = new JTextField();
    panelBuscar.add(documetoJLabel);
    panelBuscar.add(documentoField);
    int result = JOptionPane.showConfirmDialog(null, panelBuscar, "Seleccionar tipo Documento",
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE);
    String tipoDocumento = null;
    if (result == JOptionPane.OK_OPTION) {
      tipoDocumento = (String) comboBoxTipoDocumento.getSelectedItem();
    }
    int idtipodocumento = 0;
    for (TipoDocumento selecionado : tipos) {
      if (tipoDocumento.equals(selecionado.getNombre())) {
        idtipodocumento = selecionado.getId();
      }
    }
    Pasajero pasajero = new Pasajero(idtipodocumento, documentoField.getText());
    pasajero.setTipoDocumento(tipoDocumento);
    return pasajero;

  }

  public BuscarVuelo seleccionaCiudades(List<Ciudad> ciudades) {
    List<String> nombres = new ArrayList<>();
    for (Ciudad ciudad : ciudades) {
      nombres.add(ciudad.getCiudad());
    }

    JComboBox<String> comboBoxCiudadesorigen = new JComboBox<>(nombres.toArray(new String[0]));
    JComboBox<String> comboBoxCiudadesdestino = new JComboBox<>(nombres.toArray(new String[0]));

    JPanel panel = new JPanel(new GridLayout(0, 2));
    panel.add(new JLabel("Seleccione una ciudad origen:"));
    panel.add(comboBoxCiudadesorigen);
    panel.add(new JLabel("Seleccione una ciudad destino:"));
    panel.add(comboBoxCiudadesdestino);
    BuscarVuelo bvuelo = new BuscarVuelo();
    int result = JOptionPane.showConfirmDialog(null, panel, "Seleccionar Ciudad origen y destino",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    if (result == JOptionPane.OK_OPTION) {
      String selectedCiudadorigen = (String) comboBoxCiudadesorigen.getSelectedItem();
      String selectedCiudaddestino = (String) comboBoxCiudadesdestino.getSelectedItem();
      System.out.println("Ciudad origen seleccionada: " + selectedCiudadorigen);
      System.out.println("Ciudad destino seleccionada: " + selectedCiudaddestino);
      bvuelo.setCiudadOrigen(selectedCiudadorigen);
      bvuelo.setCiudadDestino(selectedCiudaddestino);
    }
    return bvuelo;

  }

  public String SeleccionarFecha() {
    JCalendar calendar = new JCalendar();
    JPanel panelc = new JPanel(new GridLayout(0, 2));
    panelc.add(new JLabel("Seleccione una fecha:"));
    panelc.add(calendar);

    int resultc = JOptionPane.showConfirmDialog(null, panelc, "Seleccionar Fecha", JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE);
    String fechaida = "";
    if (resultc == JOptionPane.OK_OPTION) {
      Date selectedDate = calendar.getDate();
      Calendar cal = Calendar.getInstance();
      cal.setTime(selectedDate);
      int dia = cal.get(Calendar.DAY_OF_MONTH);
      int mes = cal.get(Calendar.MONTH) + 1; // Los meses comienzan en 0 en Calendar, por lo que se añade 1
      int año = cal.get(Calendar.YEAR);
      fechaida = año + "-" + mes + "-" + dia;
      System.out.println(fechaida);
    }
    return fechaida;

  }

  public String SeleccionarVuelo(List<String> vuelos) {
    JComboBox<String> comboBoxVuelos = new JComboBox<>(vuelos.toArray(new String[0]));

    JPanel panel = new JPanel(new GridLayout(0, 2));
    panel.add(new JLabel("Seleccione Vuelo:"));
    panel.add(comboBoxVuelos);

    int resultVuelo = JOptionPane.showConfirmDialog(null, panel, "Seleccionar vuelo", JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE);
    String selectVuelo = "";
    if (resultVuelo == JOptionPane.OK_OPTION) {
      selectVuelo = (String) comboBoxVuelos.getSelectedItem();
      System.out.println(selectVuelo);
    }
    return selectVuelo;
  }

  public void actualizar() throws SQLException {
  
  }

  public void eliminar() throws SQLException {

  }

 
}
