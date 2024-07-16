package com.agencia.vuelo.infraestructure.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;

import com.agencia.tarifa.domain.entity.Tarifa;
import com.agencia.vuelo.domain.entity.BuscarVuelo;
import com.agencia.vuelo.domain.entity.Ciudad;
import com.agencia.vuelo.domain.entity.Pasajero;
import com.agencia.vuelo.domain.entity.VuelosDto;
import com.agencia.vuelo.domain.entity.vuelo;
import com.agencia.vuelo.domain.service.vueloService;
import com.toedter.calendar.JCalendar;

public class vueloRepository implements vueloService {

  private Connection connection;

  public vueloRepository() {
    try {
      Properties props = new Properties();
      props.load(getClass().getClassLoader().getResourceAsStream("configdb.properties"));
      String url = props.getProperty("url");
      String user = props.getProperty("user");
      String password = props.getProperty("password");

      System.out.println("URL: " + url); // Verificar la URL cargada
      System.out.println("User: " + user); // Verificar el usuario cargado
      // N
      connection = DriverManager.getConnection(url, user, password);
      System.out.println("Conexión exitosa!");
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  @Override
  public vuelo findvuelo(int id) {
    return null;

  }

  @Override
  public void updatevuelo(vuelo vuelo) {
    try {
      String sql = "UPDATE vuelosvuelos SET detalles = ?,descripcion=?,valor=? WHERE id = ?";

      PreparedStatement statement = connection.prepareStatement(sql);
      // statement.setString(1, vuelo.getDetalles());
      // statement.setString(2, vuelo.getDescripcion());
      // statement.setBigDecimal(3, vuelo.getValor());
      statement.setInt(4, vuelo.getId());
      int rowsUpdate = statement.executeUpdate();
      System.out.println("Numero de filas actualizadas  " + rowsUpdate);

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public VuelosDto consultvuelo(int id) {

    VuelosDto vuelo = new VuelosDto();
    try {
      // String sql = "SELECT id, fechaviaje,
      // precioviaje,idorigenaeropuerto,iddestinoaeropuerto FROM viajes WHERE id = ?";
      String sql = "SELECT  v.id,v.precioviaje,v.fechaviaje ,a.nombre AS aeropuertoorigen,c.nombre AS ciudadorigen ,ad.nombre AS aeropuertodestino, cd.nombre AS ciudaddestino from viajes v       Join aeropuertos a       on a.id = v.idorigenaeropuerto       JOIN ciudades c       on a.idciudad =c.id      Join aeropuertos ad       on ad.id = v.iddestinoaeropuerto        JOIN ciudades cd       on ad.idciudad =cd.id      WHERE  v.id=?;";
      PreparedStatement statement = connection.prepareStatement(sql);
      statement.setLong(1, id);
      try (ResultSet resultSet = statement.executeQuery()) {
        if (resultSet.next()) {
          vuelo.setId(resultSet.getInt("id"));
          vuelo.setFechaviaje(resultSet.getString("fechaviaje"));
          vuelo.setPrecioviaje((resultSet.getBigDecimal("precioviaje")));
          vuelo.setAeropuertoOrigen((resultSet.getString("aeropuertoorigen")));
          vuelo.setCiudadOrigen((resultSet.getString("ciudadorigen")));
          vuelo.setAeropuertoDestion((resultSet.getString("aeropuertodestino")));
          vuelo.setCiudadDestino((resultSet.getString("ciudaddestino")));
        }
        JOptionPane.showMessageDialog(null, "vuelo encontrada: \n" +
            "Fecha: " + vuelo.getFechaviaje() + "\n" +
            "Precio: " + vuelo.getPrecioviaje() + "\n" +
            "Aeropuerto Origen: " + vuelo.getAeropuertoOrigen() + "\n" +
            "Ciudad: " + vuelo.getCiudadOrigen() + "\n" +
            "Aeropuerto Destino: " + vuelo.getCiudadDestino() + "\n" +
            "Ciudad: " + vuelo.getCiudadDestino());

      } catch (SQLException e) {
        e.printStackTrace();
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return vuelo;
  }

  @Override
  public void deletevuelo(int id) {
    try {
      String sql = "DELETE FROM vuelosvuelos WHERE id = ?";
      int rowsUpdate = 0;

      PreparedStatement statement = connection.prepareStatement(sql);

      statement.setInt(1, id);
      rowsUpdate = statement.executeUpdate();

      System.out.println("Número de filas eliminadas: " + rowsUpdate);

    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

  @Override
  public void BuscarVuelo(List<Ciudad> ciudades) {
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

    int result = JOptionPane.showConfirmDialog(null, panel, "Seleccionar Ciudad origen y destino",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    if (result == JOptionPane.OK_OPTION) {
      String selectedCiudadorigen = (String) comboBoxCiudadesorigen.getSelectedItem();
      String selectedCiudaddestino = (String) comboBoxCiudadesdestino.getSelectedItem();
      System.out.println("Ciudad origen seleccionada: " + selectedCiudadorigen);
      System.out.println("Ciudad destino seleccionada: " + selectedCiudaddestino);

      JCalendar calendar = new JCalendar();
      JPanel panelc = new JPanel(new GridLayout(0, 2));
      panelc.add(new JLabel("Seleccione una fecha:"));
      panelc.add(calendar);

      int resultc = JOptionPane.showConfirmDialog(null, panelc, "Seleccionar Fecha", JOptionPane.OK_CANCEL_OPTION,
          JOptionPane.PLAIN_MESSAGE);
      if (resultc == JOptionPane.OK_OPTION) {
        Date selectedDate = calendar.getDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(selectedDate);
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH) + 1; // Los meses comienzan en 0 en Calendar, por lo que se añade 1
        int año = cal.get(Calendar.YEAR);
        String fechaida = año + "-" + mes + "-" + dia;
        System.out.println(fechaida);

        String idAeropuertoOrigen = obtenerIdAeropuerto(selectedCiudadorigen);
        String idAeropuertoDestino = obtenerIdAeropuerto(selectedCiudaddestino);

        System.out.println("ID Aeropuerto Origen: " + idAeropuertoOrigen);
        System.out.println("ID Aeropuerto Destino: " + idAeropuertoDestino);

        BuscarVuelo bvuelo = new BuscarVuelo(fechaida, idAeropuertoOrigen, idAeropuertoDestino);
        vuelofecha(bvuelo);

      } else {
        System.out.println("Selección de fecha cancelada");
      }
    } else {
      System.out.println("Selección de ciudades cancelada");
    }
  }

  private void vuelofecha(BuscarVuelo bvuelo) {
    System.out.println(bvuelo.getIdAeropuertoDestino());
    System.out.println(bvuelo.getIdAeropuertoOrigen());
    List<String> vuelos = new ArrayList<>();
    String sql = "SELECT id,precioviaje,fechaviaje from viajes v WHERE fechaviaje = ? AND  idorigenaeropuerto=? AND  iddestinoaeropuerto =?";

    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, bvuelo.getFechaIda());
      statement.setString(2, bvuelo.getIdAeropuertoOrigen());
      statement.setString(3, bvuelo.getIdAeropuertoDestino());
      try (ResultSet resultSet = statement.executeQuery()) {
        while (resultSet.next()) {
          vuelos.add(resultSet.getString("id"));

        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
      System.out.println(vuelos);
      JComboBox<String> comboBoxVuelos = new JComboBox<>(vuelos.toArray(new String[0]));

      JPanel panel = new JPanel(new GridLayout(0, 2));
      panel.add(new JLabel("Seleccione Vuelo:"));
      panel.add(comboBoxVuelos);

      int resultVuelo = JOptionPane.showConfirmDialog(null, panel, "Seleccionar vuelo", JOptionPane.OK_CANCEL_OPTION,
          JOptionPane.PLAIN_MESSAGE);
      String selectVuelo = "0";
      if (resultVuelo == JOptionPane.OK_OPTION) {
        selectVuelo = (String) comboBoxVuelos.getSelectedItem();
        System.out.println(selectVuelo);
      }

      var yesOrNo = 0;

      while (yesOrNo == 0) {

        agregarPasajero();
        yesOrNo = JOptionPane.showConfirmDialog(null, "Desea agregar un nuevo pasajero?");

      }
      if (yesOrNo == 1) {
        JOptionPane.showMessageDialog(null, "Selecciona silla");
      }

      try {
        String query = "INSERT INTO reservaviaje (fecha,idvuelos,idclientes,estado) VALUES (?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query,
            PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setString(1, bvuelo.getFechaIda());
        ps.setInt(2, Integer.parseInt(selectVuelo));
        ps.setInt(3, 1);
        ps.setString(4, "reservado");

        ps.executeUpdate();
      } catch (SQLException e) {
        e.printStackTrace();

      }

      // try (ResultSet resultSet = statement.executeQuery()) {
      // if (resultSet.next()) {
      // int id = resultSet.getInt("id");
      // BigDecimal precio = resultSet.getBigDecimal("precioviaje");
      // JOptionPane.showMessageDialog(null, "vuelo encontrada:" +id +" \n" +
      // "Fecha: " + bvuelo.getFechaIda() + "\n" +
      // "Precio: " + precio + "\n" +
      // "Aeropuerto Origen: " +bvuelo.getIdAeropuertoOrigen() + "\n" +
      // "Aeropuerto Destino: " +bvuelo.getIdAeropuertoDestino() + "\n"
      // );

      // }else{
      // JOptionPane.showMessageDialog(null, " no se encontro vuelo" );
      // }
      // }

    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

  private void agregarPasajero() {
    JPanel panelBuscar = new JPanel(new GridLayout(0, 2));

    List<String> listTiposDocuemtnos = new ArrayList<>();
    String sql = "SELECT nombre FROM tiposdocumentos";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      try (ResultSet resultSet = statement.executeQuery()) {
        while (resultSet.next()) {
          listTiposDocuemtnos.add(resultSet.getString("nombre"));

        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    JComboBox<String> comboBoxTipoDocumento = new JComboBox<>(listTiposDocuemtnos.toArray(new String[0]));

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
      System.out.println(tipoDocumento);
    }
    int idtipo=0;
    try {
      String sqlIdTipos = "SELECT id FROM tiposdocumentos WHERE nombre = ? ";
      PreparedStatement statement = connection.prepareStatement(sqlIdTipos);
      statement.setString(1, tipoDocumento);
   
      try (ResultSet resultSet = statement.executeQuery()) {
        if (resultSet.next()) {
          idtipo = resultSet.getInt("id");
          System.out.println(idtipo);
        }

      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    Pasajero pasajero = null;
    try {
    String sqlPasajero = "SELECT id, nombre, idtipodocumento,numerodocumento FROM    clientes WHERE numerodocumento = ? and idtipodocumento = ? ";

    PreparedStatement statement = connection.prepareStatement(sqlPasajero);
    statement.setString(1, documentoField.getText());
    statement.setInt(2, idtipo);

    try (ResultSet resultSet = statement.executeQuery()) {
    if (resultSet.next()) {
    pasajero = new Pasajero();
    pasajero.setId(resultSet.getInt("id"));
    pasajero.setNombre(resultSet.getString("nombre"));
    pasajero.setIdTipoDocumento(resultSet.getInt("idtipodocumento"));
    pasajero.setDocumento(resultSet.getString("numerodocumento"));
    }
else{

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
    JLabel tipoDLabel = new JLabel(tipoDocumento);
    
    panelPasajero.add(tipoLabel);
    panelPasajero.add(tipoDLabel);
    
    JLabel numeroLabel = new JLabel("numero documento:");
    JLabel numeroDLabel = new JLabel(documentoField.getText());

    
    panelPasajero.add(numeroLabel);
    panelPasajero.add(numeroDLabel);
    int resulta = JOptionPane.showConfirmDialog(null, panelPasajero, "Seleccionar tipo Documento", JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
}
    } catch (SQLException e) {
    e.printStackTrace();
    } } catch (SQLException e) {
    e.printStackTrace();
    }
  

    // // JPanel panel = new JPanel(new GridLayout(0, 2));
    // panel.add(new JLabel("Seleccione tipo Documento:"));
    // // panel.add(comboBoxTipoDocumento);
    // // JLabel documetoJLabel = new JLabel("Numero documento:");
    // // JTextField documentoField = new JTextField();
    // panel.add(documetoJLabel);
    // panel.add(documentoField);
    // int result = JOptionPane.showConfirmDialog(null, panel, "Seleccionar tipo
    // Documento", JOptionPane.OK_CANCEL_OPTION,
    // JOptionPane.PLAIN_MESSAGE);
    // String selectedTipoDocumento="";
    // int edadInt = Integer.parseInt(edadField.getText());
    // if (result == JOptionPane.OK_OPTION) {
    // selectedTipoDocumento = (String) comboBoxTipoDocumento.getSelectedItem();
    // }
    // Pasajero pasajero = new Pasajero(nombreField.getText(), edadInt,
    // selectedTipoDocumento, documentoField.getText());

  }

  private String obtenerIdAeropuerto(String nombreCiudad) {
    String idAeropuerto = null;
    String sql = "SELECT a.id FROM aeropuertos a JOIN ciudades c ON c.id = a.idciudad WHERE c.nombre = ?";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.setString(1, nombreCiudad);
      try (ResultSet resultSet = statement.executeQuery()) {
        if (resultSet.next()) {
          idAeropuerto = resultSet.getString("id");
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return idAeropuerto;
  }

  @Override
  public List<Ciudad> findAllCiudades() {
    List<Ciudad> ciudades = new ArrayList<>();
    String sql = "SELECT id, nombre FROM ciudades";

    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      try (ResultSet resultSet = statement.executeQuery()) {
        while (resultSet.next()) {
          Ciudad ciudad = new Ciudad();
          ciudad.setId(resultSet.getString("id"));
          ciudad.setCiudad(resultSet.getString("nombre"));
          ciudades.add(ciudad);
          System.out.println(ciudad.getCiudad());
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return ciudades;
  }
}