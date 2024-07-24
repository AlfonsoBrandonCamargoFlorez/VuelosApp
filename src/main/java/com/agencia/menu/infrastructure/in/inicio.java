package com.agencia.menu.infrastructure.in;

import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;

import com.agencia.aeropuerto.aplication.CreateAeropuertoCase;
import com.agencia.aeropuerto.aplication.DeleteAeropuertoCase;
import com.agencia.aeropuerto.aplication.FindAeropuertoCase;
import com.agencia.aeropuerto.aplication.UpdateAeropuertoCase;
import com.agencia.aeropuerto.domain.service.AeropuertoService;
import com.agencia.aeropuerto.infrastructure.in.AeropuertoController;
import com.agencia.aeropuerto.infrastructure.out.AeropuertoRepository;
import com.agencia.avion.application.CreateAvionUseCase;
import com.agencia.avion.application.DeleteAvionUseCase;
import com.agencia.avion.application.FindAvionUseCase;
import com.agencia.avion.application.UpdateAvionUseCase;
import com.agencia.avion.domain.service.AvionService;
import com.agencia.avion.infraestructure.AvionController;
import com.agencia.avion.infraestructure.AvionRepository;
import com.agencia.cliente.aplication.CreateClienteCase;
import com.agencia.cliente.aplication.DeleteClienteCase;
import com.agencia.cliente.aplication.FindClienteCase;
import com.agencia.cliente.aplication.UpdateClienteCase;
import com.agencia.cliente.domain.service.ClienteService;
import com.agencia.cliente.infrastructure.in.ClienteController;
import com.agencia.cliente.infrastructure.out.ClienteRepository;
import com.agencia.escala.application.AsignAvionUseCase;
import com.agencia.escala.application.DeleteEscalaUseCase;
import com.agencia.escala.application.FindEscalaUseCase;
import com.agencia.escala.application.UpdateEscalaUseCase;
import com.agencia.escala.infraestructure.EscalaController;
import com.agencia.escala.infraestructure.EscalaRepository;
import com.agencia.reserva.application.AsignarsillaUseCase;
import com.agencia.reserva.application.BuscarCiudades;
import com.agencia.reserva.application.BuscarSillasOcupadas;
import com.agencia.reserva.application.BuscarTiposDocumentos;
import com.agencia.reserva.application.BuscarvuelosUseCase;
import com.agencia.reserva.application.CancelReservaClienteUseCase;
import com.agencia.reserva.application.ConsultvueloUseCase;
import com.agencia.reserva.application.CrearPasajeroUseCase;
import com.agencia.reserva.application.CrearReservaDetalleUseCase;
import com.agencia.reserva.application.CrearReservaUseCase;
import com.agencia.reserva.application.CreateReservaAgenteUseCase;
import com.agencia.reserva.application.DeleteReservaAgenteUseCase;
import com.agencia.reserva.application.FindReservaAgenteUseCase;
import com.agencia.reserva.application.VerificarPasajero;
import com.agencia.reserva.domain.service.vueloService;
import com.agencia.reserva.infraestructure.in.ReservaController;
import com.agencia.reserva.infraestructure.in.vueloController;
import com.agencia.reserva.infraestructure.out.ReservaRepository;
import com.agencia.reserva.infraestructure.out.vueloRepository;
import com.agencia.revision.application.CreateRevisionUseCase;
import com.agencia.revision.application.DeleteRevisionUseCase;
import com.agencia.revision.application.FindRevisionUseCase;
import com.agencia.revision.application.UpdateRevisionUseCase;
import com.agencia.revision.infraestructure.RevisionController;
import com.agencia.revision.infraestructure.RevisionRepository;
import com.agencia.tarifa.application.CreateTarifaUseCase;
import com.agencia.tarifa.application.DeleteTarifaUseCase;
import com.agencia.tarifa.application.FindTarifaUseCase;
import com.agencia.tarifa.application.UpdateTarifaUseCase;
import com.agencia.tarifa.domain.service.TarifaService;
import com.agencia.tarifa.infraestructure.in.TarifaController;
import com.agencia.tarifa.infraestructure.out.TarifaRepository;
import com.agencia.tipoDocumento.application.CreateTipoDocumentoUseCase;
import com.agencia.tipoDocumento.application.DeleteTipoDocumentoUseCase;
import com.agencia.tipoDocumento.application.FindTipoDocumentoUseCase;
import com.agencia.tipoDocumento.application.UpdateTipoDocumentoUseCase;
import com.agencia.tipoDocumento.domain.service.TipoDocumentoService;
import com.agencia.tipoDocumento.infraestructure.TipoDocumentoController;
import com.agencia.tipoDocumento.infraestructure.TipoDocumentoRepository;
import com.agencia.trayecto.application.DeleteTrayectoUseCase;
import com.agencia.trayecto.application.FindTrayectoUseCase;
import com.agencia.trayecto.application.UpdateTrayectoUseCase;
import com.agencia.trayecto.infraestructure.TrayectoController;
import com.agencia.trayecto.infraestructure.TrayectoRepository;
import com.agencia.tripulacion.application.CreateTripulacionUseCase;
import com.agencia.tripulacion.application.FindTripulacionUseCase;
import com.agencia.tripulacion.domain.service.TripulacionService;
import com.agencia.tripulacion.infraestructure.TripulacionController;
import com.agencia.tripulacion.infraestructure.TripulacionRepository;



import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class inicio {
    public static void menu() throws SQLException {

        ClienteService clienteService = new ClienteRepository();
        CreateClienteCase createClienteCase = new CreateClienteCase(clienteService);
        FindClienteCase findClienteCase = new FindClienteCase(clienteService);
        UpdateClienteCase updateClienteCase = new UpdateClienteCase(clienteService);
        DeleteClienteCase deleteClienteCase = new DeleteClienteCase(clienteService);

        ClienteController clienteController = new ClienteController(
                clienteService,
                createClienteCase,
                findClienteCase,
                deleteClienteCase,
                updateClienteCase);




        AeropuertoService aeropuertoService = new AeropuertoRepository();
        CreateAeropuertoCase createAeropuertoCase = new CreateAeropuertoCase(aeropuertoService);
        FindAeropuertoCase findAeropuertoCase = new FindAeropuertoCase(aeropuertoService);
        UpdateAeropuertoCase updateAeropuertoCase = new UpdateAeropuertoCase(aeropuertoService);
        DeleteAeropuertoCase deleteAeropuertoCase = new DeleteAeropuertoCase(aeropuertoService);

        AeropuertoController aeropuertoController = new AeropuertoController(
                createAeropuertoCase,
                findAeropuertoCase,
                deleteAeropuertoCase,
                updateAeropuertoCase);




        AvionService avionService = new AvionRepository();
        CreateAvionUseCase createAvionUseCase = new  CreateAvionUseCase (avionService);
        UpdateAvionUseCase updateAvionUseCase = new UpdateAvionUseCase(avionService);
        DeleteAvionUseCase deleteAvionUseCase = new DeleteAvionUseCase(avionService);
        FindAvionUseCase findAvionUseCase = new  FindAvionUseCase(avionService);

        AvionController avionController = new AvionController(createAvionUseCase, updateAvionUseCase, deleteAvionUseCase, findAvionUseCase);




        TipoDocumentoService tipoDocumentoService = new TipoDocumentoRepository();
        CreateTipoDocumentoUseCase createTipoDocumentoUseCase = new CreateTipoDocumentoUseCase (tipoDocumentoService);
        UpdateTipoDocumentoUseCase updateTipoDocumentoUseCase = new  UpdateTipoDocumentoUseCase(tipoDocumentoService);
        DeleteTipoDocumentoUseCase deleteTipoDocumentoUseCase = new DeleteTipoDocumentoUseCase(tipoDocumentoService) ;
        FindTipoDocumentoUseCase findTipoDocumentoUseCase = new FindTipoDocumentoUseCase(tipoDocumentoService) ;

        TipoDocumentoController tipoDocumentoController = new TipoDocumentoController(createTipoDocumentoUseCase, updateTipoDocumentoUseCase, deleteTipoDocumentoUseCase, findTipoDocumentoUseCase);



        TripulacionService tripulacionService = new TripulacionRepository(); 
        CreateTripulacionUseCase createTripulacionUseCase = new CreateTripulacionUseCase(tripulacionService);
        FindTripulacionUseCase findTripulacionUseCase = new FindTripulacionUseCase(tripulacionService);

        TripulacionController tripulacionController = new TripulacionController(createTripulacionUseCase, findTripulacionUseCase);






        TarifaService tarifaService = new TarifaRepository();
        CreateTarifaUseCase createtarifaUseCase = new CreateTarifaUseCase(tarifaService);
        FindTarifaUseCase findtarifaUseCase = new FindTarifaUseCase(tarifaService);
        UpdateTarifaUseCase updateCaseUsetarifa = new UpdateTarifaUseCase(tarifaService);
        DeleteTarifaUseCase deletetarifaUseCase = new DeleteTarifaUseCase(tarifaService);

        TarifaController tarifaController = new TarifaController(createtarifaUseCase, findtarifaUseCase,
                deletetarifaUseCase, updateCaseUsetarifa);




        vueloService vueloService = new vueloRepository();
        EscalaRepository escalaRepository = new EscalaRepository();
        FindEscalaUseCase findEscalaUseCase = new FindEscalaUseCase(escalaRepository);

        ConsultvueloUseCase consultvueloUseCase = new ConsultvueloUseCase(vueloService);
        BuscarCiudades buscarCiudades = new BuscarCiudades(vueloService);
        BuscarvuelosUseCase buscarvuelosUseCase = new BuscarvuelosUseCase(vueloService);
        CrearReservaUseCase crearReservaUseCase = new CrearReservaUseCase(vueloService);
        VerificarPasajero verificarPasajero = new VerificarPasajero(vueloService);
        BuscarTiposDocumentos buscarTiposDocumentos = new BuscarTiposDocumentos(vueloService);
        AsignarsillaUseCase asignarSillaUseCase = new AsignarsillaUseCase(vueloService);
        CrearReservaDetalleUseCase crearReservaDetalleUseCase = new CrearReservaDetalleUseCase(
                vueloService);
        BuscarSillasOcupadas buscarSillasOcupadas = new BuscarSillasOcupadas(vueloService);
        CrearPasajeroUseCase crearPasajeroUseCase = new CrearPasajeroUseCase(vueloService);


        vueloController consoleAdapterVuelo = new vueloController(consultvueloUseCase, buscarCiudades,
                buscarvuelosUseCase, crearReservaUseCase, verificarPasajero, buscarTiposDocumentos,
                findEscalaUseCase, crearReservaDetalleUseCase, asignarSillaUseCase, buscarSillasOcupadas,
                crearPasajeroUseCase);





        ReservaRepository repository = new ReservaRepository();
        CreateReservaAgenteUseCase createReservaAgenteUseCase = new CreateReservaAgenteUseCase(repository) ;
        FindReservaAgenteUseCase findReservaAgenteUseCase = new FindReservaAgenteUseCase(repository);
        DeleteReservaAgenteUseCase deleteReservaAgenteUseCase = new DeleteReservaAgenteUseCase(repository);
        CancelReservaClienteUseCase cancelReservaClienteUseCase = new CancelReservaClienteUseCase(repository) ;

        ReservaController reservaController = new ReservaController(createReservaAgenteUseCase, findReservaAgenteUseCase, deleteReservaAgenteUseCase, cancelReservaClienteUseCase);


        

        RevisionRepository revisionRepository = new RevisionRepository();
        CreateRevisionUseCase createRevisionUseCase = new CreateRevisionUseCase(revisionRepository) ;
        UpdateRevisionUseCase updateRevisionUseCase = new UpdateRevisionUseCase(revisionRepository);
        FindRevisionUseCase findRevisionUseCase = new FindRevisionUseCase(revisionRepository);
        DeleteRevisionUseCase deleteRevisionUseCase = new DeleteRevisionUseCase(revisionRepository);

        RevisionController revisionController = new RevisionController(createRevisionUseCase, updateRevisionUseCase, findRevisionUseCase, deleteRevisionUseCase);



        TrayectoRepository trayectoRepository = new TrayectoRepository();
        FindTrayectoUseCase findTrayectoUseCase = new FindTrayectoUseCase(trayectoRepository);
        UpdateTrayectoUseCase updateTrayectoUseCase = new UpdateTrayectoUseCase(trayectoRepository);
        DeleteTrayectoUseCase deleteTrayectoUseCase = new DeleteTrayectoUseCase(trayectoRepository);

        TrayectoController trayectoController = new TrayectoController(findTrayectoUseCase, updateTrayectoUseCase, deleteTrayectoUseCase);


        
        UpdateEscalaUseCase updateEscalaUseCase = new UpdateEscalaUseCase(escalaRepository);
        DeleteEscalaUseCase deleteEscalaUseCase = new DeleteEscalaUseCase(escalaRepository);
        AsignAvionUseCase asignAvionUseCase = new AsignAvionUseCase(escalaRepository);

        EscalaController escalaController = new EscalaController(findEscalaUseCase, updateEscalaUseCase, deleteEscalaUseCase, asignAvionUseCase);
        

        








        ArrayList<String> tiposUsuario = new ArrayList<>();
        tiposUsuario.add("Cliente");
        tiposUsuario.add("Administrador");
        tiposUsuario.add("Tecnico");
        tiposUsuario.add("Agente de Ventas");

        JComboBox<String> comboBoxTipoUser = new JComboBox<>(tiposUsuario.toArray(new String[0]));

        JPanel panelTipoUser = new JPanel(new GridLayout(0, 1));
        panelTipoUser.add(new JLabel("Selecciona tu Usuario:"));
        panelTipoUser.add(comboBoxTipoUser);
        int result = JOptionPane.showConfirmDialog(null, panelTipoUser, "Seleccionar tipo Documento",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);
        String TipodeUsuario = null;
        if (result == JOptionPane.OK_OPTION) {
            TipodeUsuario = (String) comboBoxTipoUser.getSelectedItem();
        }

        if (TipodeUsuario.equals("Cliente")) {

            ArrayList<String> opcionCliente = new ArrayList<>();
            opcionCliente.add("Busca tu Vuelo"); // TAL VEZ
            opcionCliente.add("Informacion de la Reserva de tu Vuelo"); //2     RR
            opcionCliente.add("Cancela la Reserva de tu Vuelo"); //3    RR
            opcionCliente.add("Edita la Reserva de tu Vuelo");  //4
            JComboBox<String> comboBoxMenuAgente = new JComboBox<>(opcionCliente.toArray(new String[0]));
            JPanel panelCliente = new JPanel(new GridLayout(0, 1));
            panelCliente.add(new JLabel("Cliente:"));
            panelCliente.add(comboBoxMenuAgente);

            int resultTipo = JOptionPane.showConfirmDialog(null, panelCliente, "Clientes",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            String opcionSeleccionada = "";
            if (resultTipo == JOptionPane.OK_OPTION) {
                opcionSeleccionada = (String) comboBoxMenuAgente.getSelectedItem();

            }
            int selectedIndex = -1;
            for (int i = 0; i < opcionCliente.size(); i++) {
                if (opcionCliente.get(i).equals(opcionSeleccionada)) {
                    selectedIndex = i + 1;
                    break;
                }
            }
            System.out.println(selectedIndex);

            switch (selectedIndex) {
                case 1:
                    consoleAdapterVuelo.consultar();

                    break;

                case 2:
                    reservaController.findReservaAgente();

                    break;

                case 3:
                    reservaController.cancelarReserva();

                    break;

                case 4:

                    break;

                default:
                    break;
            }
        }

        if (TipodeUsuario.equals("Administrador")) {

            ArrayList<String> opcionesAdmin = new ArrayList<>();

            opcionesAdmin.add("Agregar Avión"); // 1        RR
            opcionesAdmin.add("Editar Avión"); // 2     RR
            opcionesAdmin.add("Eliminar Avión"); // 3       RR
            opcionesAdmin.add("Información Avión"); // 4        RR

            opcionesAdmin.add("Asignar Tripulación al Trayecto"); // 5  RR
            opcionesAdmin.add("Información Trayecto"); // 6     RR
            opcionesAdmin.add("Editar Trayecto"); // 7      RR
            opcionesAdmin.add("Eliminar Trayecto"); // 8    RR
            opcionesAdmin.add("Asignar Avión a una Escala"); // 9   RR
            opcionesAdmin.add("Buscar Escalas de un Trayecto"); // 10   RR
            opcionesAdmin.add("Editar Información de Escala"); // 11    RR
            opcionesAdmin.add("Eliminar Escala"); // 12     RR

            opcionesAdmin.add("Agregar Aeropuerto"); // 13 RR
            opcionesAdmin.add("Editar Aeropuerto"); // 14 RR
            opcionesAdmin.add("Eliminar Aeropuerto"); // 15 RR
            opcionesAdmin.add("Información Aeropuerto"); // 16 RR

            opcionesAdmin.add("Crear Tarifa de Vuelo"); // 17 RR
            opcionesAdmin.add("Editar Tarifa de Vuelo"); // 18 RR
            opcionesAdmin.add("Eliminar Tarifa de Vuelo"); // 19 RR
            opcionesAdmin.add("Buscar Tarifa de Vuelo"); // 20 RR

            opcionesAdmin.add("Crear Tipo de Documento"); // 21     RR
            opcionesAdmin.add("Editar Tipo de Documento"); // 22        RR
            opcionesAdmin.add("Eliminar Tipo de Documento"); // 23      RR
            opcionesAdmin.add("Buscar según Tipo de Documento"); // 24      RR

            opcionesAdmin.add("Buscar Información de Vuelo"); // 25 RR
            opcionesAdmin.add("Buscar Asignación de Tripulación"); // 26    RR
            JComboBox<String> comboBoxMenuAdmin = new JComboBox<>(opcionesAdmin.toArray(new String[0]));
            JPanel panelAdministrador = new JPanel(new GridLayout(0, 1));
            panelAdministrador.add(new JLabel("menu administrador:"));
            panelAdministrador.add(comboBoxMenuAdmin);

            int resultTipo = JOptionPane.showConfirmDialog(null, panelAdministrador, "Tipo Usuario",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            String opcionSeleccionada = "";
            if (resultTipo == JOptionPane.OK_OPTION) {
                opcionSeleccionada = (String) comboBoxMenuAdmin.getSelectedItem();

            }

            int selectedIndex = -1;
            for (int i = 0; i < opcionesAdmin.size(); i++) {
                if (opcionesAdmin.get(i).equals(opcionSeleccionada)) {
                    selectedIndex = i + 1;
                    break;
                }
            }
            System.out.println(selectedIndex);

            switch (selectedIndex) {
                case 1:
                avionController.createAvion();
                    break;

                case 2:
                avionController.updateAvion();
                    break;

                case 3:
                avionController.deleteAvion();
                    break;

                case 4:
                avionController.findAvion();
                    break;

                case 5:
                tripulacionController.createTripulacion();
                    break;

                case 6:
                trayectoController.findTrayecto();
                    break;

                case 7:
                trayectoController.updateTrayecto();
                    break;

                case 8:
                trayectoController.deleteTrayecto();
                    break;

                case 9:
                escalaController.asignAvion();
                    break;
                
                case 10:
                escalaController.findEscalas();
                    break;

                case 11:
                escalaController.updateEscala();
                    break;

                case 12:
                escalaController.deleteEscala();
                    break;

                case 13:

                    aeropuertoController.crear();
                    break;

                case 14:
                    aeropuertoController.actualizar();

                    break;

                case 15:
                    aeropuertoController.eliminar();

                    break;

                case 16:
                    aeropuertoController.buscar();

                    break;

                case 17:
                    tarifaController.crear();

                    break;

                case 18:
                    tarifaController.actualizar();
                    break;

                case 19:
                    tarifaController.eliminar();
                    break;

                case 20:
                    tarifaController.buscar();
                    break;

                case 21:
                    tipoDocumentoController.createTipoDocumento();
                    break;

                case 22:
                    tipoDocumentoController.updateTipoDocumento();
                    break;

                case 23:
                    tipoDocumentoController.deleteTipoDocumento();

                    break;

                case 24:
                    tipoDocumentoController.findIdtipoDocumento();

                    break;

                case 25:
                    consoleAdapterVuelo.consultar();

                    break;

                case 26:
                tripulacionController.findTripulacion();
                    break;

                default:

                    break;
            }

        }

        if (TipodeUsuario.equals("Tecnico")) {

            ArrayList<String> opcionTecnico = new ArrayList<>();
            opcionTecnico.add(" Crear Revision");//     RR
            opcionTecnico.add("Borrar Revision");//     RR
            opcionTecnico.add("Encontrar Revisiono");//     RR
            opcionTecnico.add("Actualizar Revisiono");//        RR
            opcionTecnico.add("Salir");
            JComboBox<String> comboBoxMenuAgente = new JComboBox<>(opcionTecnico.toArray(new String[0]));
            JPanel panelTecnico = new JPanel(new GridLayout(0, 1));
            panelTecnico.add(new JLabel("Tecnicos:"));
            panelTecnico.add(comboBoxMenuAgente);

            int resultTipo = JOptionPane.showConfirmDialog(null, panelTecnico, "tecnicos",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            String opcionSeleccionada = "";
            if (resultTipo == JOptionPane.OK_OPTION) {
                opcionSeleccionada = (String) comboBoxMenuAgente.getSelectedItem();

            }
            int selectedIndex = -1;
            for (int i = 0; i < opcionTecnico.size(); i++) {
                if (opcionTecnico.get(i).equals(opcionSeleccionada)) {
                    selectedIndex = i + 1;
                    break;
                }
            }
            System.out.println(selectedIndex);

            switch (selectedIndex) {
                case 1:
                    revisionController.createRevision();
                    break;

                case 2:
                    revisionController.deleteRevision();
                    break;
                case 3:
                    revisionController.findRevision();
                    break;
                case 4:
                    revisionController.updateRevision();
                    break;
                case 5:
                    break ;

                default:
                    break;
            }

        }

        if (TipodeUsuario.equals("Agente de Ventas")) {

            ArrayList<String> opcionesAgente = new ArrayList<>();
            opcionesAgente.add("Crear Reserva de Vuelo"); // 1      RR
            opcionesAgente.add("Eliminar Reserva de Vuelo"); // 2       RR
            opcionesAgente.add("Información Reserva de Vuelo"); // 3        RR

            opcionesAgente.add("Crear Cliente"); // 4 RR
            opcionesAgente.add("Actualizar Información de Cliente"); // 5 RR
            opcionesAgente.add("Información de Cliente"); // RR

            opcionesAgente.add("Información de Vuelo"); // 7 RR
            opcionesAgente.add("Información Asignación de Tripulación"); // 8   RR
            opcionesAgente.add("Información Escalas de un Trayecto"); // 9
            opcionesAgente.add("Información Tarifa de Vuelo"); // 10 RR
            opcionesAgente.add("Información Tipo de Documento"); // 11

            JComboBox<String> comboBoxMenuAgente = new JComboBox<>(opcionesAgente.toArray(new String[0]));
            JPanel panelVentas = new JPanel(new GridLayout(0, 1));
            panelVentas.add(new JLabel("Agente Ventas:"));
            panelVentas.add(comboBoxMenuAgente);

            int resultTipo = JOptionPane.showConfirmDialog(null, panelVentas, "Tipo Usuario",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            String opcionSeleccionada = "";
            if (resultTipo == JOptionPane.OK_OPTION) {
                opcionSeleccionada = (String) comboBoxMenuAgente.getSelectedItem();

            }
            int selectedIndex = -1;
            for (int i = 0; i < opcionesAgente.size(); i++) {
                if (opcionesAgente.get(i).equals(opcionSeleccionada)) {
                    selectedIndex = i + 1;
                    break;
                }
            }
            System.out.println(selectedIndex);

            switch (selectedIndex) {
                case 1:
                    reservaController.createReserva();

                    break;

                case 2:
                    reservaController.deleteReservaAgente();
                    break;

                case 3:
                reservaController.findReservaAgente();
                    break;

                case 4:
                    clienteController.crear();

                    break;

                case 5:
                    clienteController.actualizar();

                    break;

                case 6:
                    clienteController.buscar();

                    break;

                case 7:
                    consoleAdapterVuelo.consultar();

                    break;

                case 8:
                    tripulacionController.findTripulacion();
                    break;

                case 9:
                    break;

                case 10:
                    tarifaController.buscar();
                    break;

                case 11:
                    break;

                default:
                    break;
            }
        }

    }
}
