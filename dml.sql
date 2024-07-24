-- mysql -u campus2023 -p

-- // paises:

INSERT INTO paises (id, nombre) VALUES ('ESP', 'España');
INSERT INTO paises (id, nombre) VALUES ('FRA', 'Francia');
INSERT INTO paises (id, nombre) VALUES ('USA', 'Estados Unidos');
INSERT INTO paises (id, nombre) VALUES ('GER', 'Alemania');
INSERT INTO paises (id, nombre) VALUES ('COL', 'Colombia');


--  // ciudades: 

-- Ciudades de España
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('MAD', 'Madrid', 'ESP');
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('BCN', 'Barcelona', 'ESP');
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('VAL', 'Valencia', 'ESP');
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('SEV', 'Sevilla', 'ESP');

-- Ciudades de Francia
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('PAR', 'París', 'FRA');
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('LYO', 'Lyon', 'FRA');
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('MAR', 'Marsella', 'FRA');
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('NIC', 'Niza', 'FRA');

-- Ciudades de Estados Unidos
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('NYC', 'Nueva York', 'USA');
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('LAX', 'Los Ángeles', 'USA');
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('CHI', 'Chicago', 'USA');
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('MIA', 'Miami', 'USA');

-- Ciudades de Alemania
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('BER', 'Berlín', 'GER');
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('MUC', 'Múnich', 'GER');
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('HAM', 'Hamburgo', 'GER');
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('FRA', 'Fráncfort', 'GER');

-- Ciudades de Colombia
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('BOG', 'Bogotá', 'COL');
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('MED', 'Medellín', 'COL');
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('CLO', 'Cali', 'COL');
INSERT INTO ciudades (id, nombre, idpaises) VALUES ('CAR', 'Cartagena', 'COL');


-- // aeropuertos: 

-- Aeropuertos de España
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('MAD1', 'Aeropuerto Adolfo Suárez Madrid-Barajas', 'MAD');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('BCN1', 'Aeropuerto de Barcelona-El Prat', 'BCN');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('VAL1', 'Aeropuerto de Valencia', 'VAL');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('SEV1', 'Aeropuerto de Sevilla', 'SEV');

-- Aeropuertos de Francia
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('PAR1', 'Aeropuerto Charles de Gaulle', 'PAR');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('PAR2', 'Aeropuerto de Orly', 'PAR');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('LYO1', 'Aeropuerto de Lyon-Saint Exupéry', 'LYO');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('MAR1', 'Aeropuerto de Marsella-Provenza', 'MAR');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('NIC1', 'Aeropuerto de Niza-Costa Azul', 'NIC');

-- Aeropuertos de Estados Unidos
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('NYC1', 'Aeropuerto Internacional John F. Kennedy', 'NYC');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('NYC2', 'Aeropuerto de LaGuardia', 'NYC');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('LAX1', 'Aeropuerto Internacional de Los Ángeles', 'LAX');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('CHI1', 'Aeropuerto Internacional Hare', 'CHI');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('MIA1', 'Aeropuerto Internacional de Miami', 'MIA');

-- Aeropuertos de Alemania
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('BER1', 'Aeropuerto de Berlín-Brandeburgo', 'BER');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('MUC1', 'Aeropuerto de Múnich-Franz Josef Strauss', 'MUC');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('HAM1', 'Aeropuerto de Hamburgo', 'HAM');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('FRA1', 'Aeropuerto de Fráncfort', 'FRA');

-- Aeropuertos de Colombia
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('BOG1', 'Aeropuerto Internacional El Dorado', 'BOG');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('MED1', 'Aeropuerto Internacional José María Córdova', 'MED');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('CLO1', 'Aeropuerto Internacional Alfonso Bonilla Aragón', 'CLO');
INSERT INTO aeropuertos (id, nombre, idciudad) VALUES ('CAR1', 'Aeropuerto Internacional Rafael Núñez', 'CAR');


-- // puertas: 

-- Puertas de Aeropuertos de España
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'MAD1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'BCN1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'VAL1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'SEV1');

-- Puertas de Aeropuertos de Francia
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'PAR1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P2', 'PAR1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P3', 'PAR1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'PAR2');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'LYO1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'MAR1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'NIC1');

-- Puertas de Aeropuertos de Estados Unidos
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'NYC1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P2', 'NYC1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'NYC2');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'LAX1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'CHI1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'MIA1');

-- Puertas de Aeropuertos de Alemania
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'BER1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'MUC1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'HAM1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'FRA1');

-- Puertas de Aeropuertos de Colombia
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'BOG1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P2', 'BOG1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P3', 'BOG1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'MED1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'CLO1');
INSERT INTO puertas (numeropuerta, idaeropuerto) VALUES ('P1', 'CAR1');


-- // fabricantes: 

INSERT INTO fabricantes (nombre) VALUES ('Airbus');
INSERT INTO fabricantes (nombre) VALUES ('Boeing');
INSERT INTO fabricantes (nombre) VALUES ('Embraer');
INSERT INTO fabricantes (nombre) VALUES ('Bombardier');



-- // modelos: 

INSERT INTO modelos (nombre, idfabricante) VALUES ('A320', 1);
INSERT INTO modelos (nombre, idfabricante) VALUES ('A330', 1);
INSERT INTO modelos (nombre, idfabricante) VALUES ('A350', 1);

INSERT INTO modelos (nombre, idfabricante) VALUES ('737', 2);
INSERT INTO modelos (nombre, idfabricante) VALUES ('747', 2);
INSERT INTO modelos (nombre, idfabricante) VALUES ('787', 2);

INSERT INTO modelos (nombre, idfabricante) VALUES ('ERJ-145', 3);
INSERT INTO modelos (nombre, idfabricante) VALUES ('E-Jet E2', 3);
INSERT INTO modelos (nombre, idfabricante) VALUES ('Legacy 650', 3);

INSERT INTO modelos (nombre, idfabricante) VALUES ('CRJ700', 4);
INSERT INTO modelos (nombre, idfabricante) VALUES ('Global 7500', 4);
INSERT INTO modelos (nombre, idfabricante) VALUES ('Q400', 4);



--  // estados: Los estados de los aviones.

-- Estados de aviones

INSERT INTO estados (nombre) VALUES ('En servicio');
INSERT INTO estados (nombre) VALUES ('En mantenimiento');
INSERT INTO estados (nombre) VALUES ('Fuera de servicio');
INSERT INTO estados (nombre) VALUES ('En reparación');
INSERT INTO estados (nombre) VALUES ('En espera de revisión');
INSERT INTO estados (nombre) VALUES ('En reserva');



-- // tiposdocumentos: Los tipos de documentos que se usarán en clientes 

INSERT INTO tiposdocumentos (nombre) VALUES ('DNI');
INSERT INTO tiposdocumentos (nombre) VALUES ('Pasaporte');
INSERT INTO tiposdocumentos (nombre) VALUES ('Cédula de identidad');



INSERT INTO roles (id, nombre)
VALUES (1, "cliente");
INSERT INTO roles (id, nombre)
VALUES (2, "pasajero");
-- // clientes: 

-- Clientes para Aerolínea 1
INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Juan Pérez', 30, 1, '12345678',1);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('María López', 25, 2, 'AB123456',1);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Pedro Gómez', 28, 3, 'C1234567',1);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Ana Martínez', 35, 1, '87654321',1);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Carlos Rodríguez', 40, 2, 'CD654321',2);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Laura Sánchez', 32, 3, 'E7654321',2);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Santiago Vargas', 27, 1, '98765432',2);


-- Clientes para Aerolínea 2
INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Elena Rojas', 29, 1, '23456789',1);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Martín Soto', 31, 2, 'EF234567',1);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Luisa Herrera', 26, 3, 'G2345678',1);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Andrés Castro', 33, 1, '87654321',1);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Paula Díaz', 37, 2, 'GH654321',1);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Mario Gutiérrez', 30, 3, 'I7654321',2);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Alejandra Ramírez', 28, 1, '98765432',2);

-- Clientes para Aerolínea 3
INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Gabriel Torres', 34, 1, '34567890',2);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Valeria Núñez', 27, 2, 'IJ345678',2);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)

VALUES ('Jorge Pérez', 32, 3, 'J3456789',2);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Lucía Castro', 36, 1, '98765432',2);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Diego Muñoz', 39, 2, 'KL654321',1);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Carolina Jiménez', 25, 3, 'M7654321',1);

INSERT INTO clientes (nombre, edad, idtipodocumento, numerodocumento,rol)
VALUES ('Mateo Sánchez', 31, 1, '09876543',1);





INSERT INTO tarifasvuelos (descripcion, detalles, valor)
VALUES ('Eco Nac Estándar', 'Asiento estándar, vuelo nacional', 120.00);

INSERT INTO tarifasvuelos (descripcion, detalles, valor)
VALUES ('Eco Int Estándar', 'Asiento estándar, vuelo internacional', 200.00);

INSERT INTO tarifasvuelos (descripcion, detalles, valor)
VALUES ('Eje Nac Amplio', 'Asiento amplio, vuelo nacional', 300.00);

INSERT INTO tarifasvuelos (descripcion, detalles, valor)
VALUES ('Eje Int Amplio', 'Asiento amplio, vuelo internacional', 450.00);

INSERT INTO tarifasvuelos (descripcion, detalles, valor)
VALUES ('Prim Nac Especial', 'Asiento especial, vuelo nacional', 500.00);

INSERT INTO tarifasvuelos (descripcion, detalles, valor)
VALUES ('Prim Int Especial', 'Asiento especial, vuelo internacional', 700.00);

INSERT INTO tarifasvuelos (descripcion, detalles, valor)
VALUES ('Eco Prom Nac Est', 'Asiento estándar, vuelo nacional (promoción)', 90.00);

INSERT INTO tarifasvuelos (descripcion, detalles, valor)
VALUES ('Eco Prom Int Est', 'Asiento estándar, vuelo internacional (promoción)', 150.00);




-- Inserciones de viajes programados

INSERT INTO viajes (fechaviaje, precioviaje,idorigenaeropuerto,iddestinoaeropuerto)
VALUES ('2024-08-15', 250.00,"MAD1",'LAX1');

INSERT INTO viajes (fechaviaje, precioviaje,idorigenaeropuerto,iddestinoaeropuerto)
VALUES ('2024-08-20', 300.00,'LYO1','MAR1');

INSERT INTO viajes (fechaviaje, precioviaje,idorigenaeropuerto,iddestinoaeropuerto)
VALUES ('2024-09-05', 200.00,'HAM1','MIA1');

INSERT INTO viajes (fechaviaje, precioviaje,idorigenaeropuerto,iddestinoaeropuerto)
VALUES ('2024-09-10', 350.00,'BOG1','MIA1');

INSERT INTO viajes (fechaviaje, precioviaje,idorigenaeropuerto,iddestinoaeropuerto)
VALUES ('2024-10-01', 180.00,'NYC1','PAR1');

-- Inserciones de reservas de viajes


-- // reservaviaje: Las reservas de los viajes.

-- Inserciones de reservas de viajes

INSERT INTO reservaviaje (fecha, idvuelos,idclientes)
VALUES ('2024-08-10', 1,1); -- Reserva para el viaje programado con ID 1

INSERT INTO reservaviaje (fecha, idvuelos,idclientes)
VALUES ('2024-08-18', 2,2); -- Reserva para el viaje programado con ID 2

INSERT INTO reservaviaje (fecha, idvuelos,idclientes)
VALUES ('2024-09-02', 3,3); -- Reserva para el viaje programado con ID 3

INSERT INTO reservaviaje (fecha, idvuelos,idclientes)
VALUES ('2024-09-08', 4,4); -- Reserva para el viaje programado con ID 4

INSERT INTO reservaviaje (fecha, idvuelos,idclientes)
VALUES ('2024-09-25', 5,5); -- Reserva para el viaje programado con ID 5




INSERT INTO detallesreservaviaje (idreserva, idpasajero, idtarifa)
VALUES (1, 1, 1); -- Detalle de reserva para la reserva ID 1, cliente ID 1 y tarifa ID 1

INSERT INTO detallesreservaviaje (idreserva, idpasajero, idtarifa)
VALUES (2, 2, 2); -- Detalle de reserva para la reserva ID 2, cliente ID 2 y tarifa ID 2

INSERT INTO detallesreservaviaje (idreserva, idpasajero, idtarifa)
VALUES (3, 3, 3); -- Detalle de reserva para la reserva ID 3, cliente ID 3 y tarifa ID 3

INSERT INTO detallesreservaviaje (idreserva, idpasajero, idtarifa)
VALUES (4, 4, 4); -- Detalle de reserva para la reserva ID 4, cliente ID 4 y tarifa ID 4

INSERT INTO detallesreservaviaje (idreserva, idpasajero, idtarifa)
VALUES (5, 5, 5); -- Detalle de reserva para la reserva ID 5, cliente ID 5 y tarifa ID 5



-- Inserciones en la tabla 'asientos'

INSERT INTO asientos (numeroasiento) VALUES (1);
INSERT INTO asientos (numeroasiento) VALUES (2);
INSERT INTO asientos (numeroasiento) VALUES (3);
INSERT INTO asientos (numeroasiento) VALUES (4);
INSERT INTO asientos (numeroasiento) VALUES (5);
INSERT INTO asientos (numeroasiento) VALUES (6);
INSERT INTO asientos (numeroasiento) VALUES (7);
INSERT INTO asientos (numeroasiento) VALUES (8);
INSERT INTO asientos (numeroasiento) VALUES (9);
INSERT INTO asientos (numeroasiento) VALUES (10);
INSERT INTO asientos (numeroasiento) VALUES (11);
INSERT INTO asientos (numeroasiento) VALUES (12);
INSERT INTO asientos (numeroasiento) VALUES (13);
INSERT INTO asientos (numeroasiento) VALUES (14);
INSERT INTO asientos (numeroasiento) VALUES (15);
INSERT INTO asientos (numeroasiento) VALUES (16);
INSERT INTO asientos (numeroasiento) VALUES (17);
INSERT INTO asientos (numeroasiento) VALUES (18);
INSERT INTO asientos (numeroasiento) VALUES (19);
INSERT INTO asientos (numeroasiento) VALUES (20);




-- // aerolineas: Las aerolíneas.

-- Inserciones en la tabla 'aerolineas'

-- Aerolíneas de España
INSERT INTO aerolineas (nombre) VALUES ('Iberia');
INSERT INTO aerolineas (nombre) VALUES ('Vueling');
INSERT INTO aerolineas (nombre) VALUES ('Air Europa');

-- Aerolíneas de Francia
INSERT INTO aerolineas (nombre) VALUES ('Air France');
INSERT INTO aerolineas (nombre) VALUES ('EasyJet');
INSERT INTO aerolineas (nombre) VALUES ('Transavia');

-- Aerolíneas de Estados Unidos
INSERT INTO aerolineas (nombre) VALUES ('American Airlines');
INSERT INTO aerolineas (nombre) VALUES ('Delta Air Lines');
INSERT INTO aerolineas (nombre) VALUES ('United Airlines');

-- Aerolíneas de Alemania
INSERT INTO aerolineas (nombre) VALUES ('Lufthansa');
INSERT INTO aerolineas (nombre) VALUES ('Eurowings');
INSERT INTO aerolineas (nombre) VALUES ('Condor');

-- Aerolíneas de Colombia
INSERT INTO aerolineas (nombre) VALUES ('Avianca');
INSERT INTO aerolineas (nombre) VALUES ('LATAM Airlines');
INSERT INTO aerolineas (nombre) VALUES ('Viva Air');


-- // puestostripulacion: Los puestos de la tripulación.

-- Inserciones en la tabla 'puestostripulacion'

INSERT INTO puestostripulacion (nombre) VALUES ('Piloto');
INSERT INTO puestostripulacion (nombre) VALUES ('Copiloto');
INSERT INTO puestostripulacion (nombre) VALUES ('Sobrecargo');
INSERT INTO puestostripulacion (nombre) VALUES ('Azafata');
INSERT INTO puestostripulacion (nombre) VALUES ('Técnico de vuelo');
INSERT INTO puestostripulacion (nombre) VALUES ('Mecánico de vuelo');





-- // empleados: Los empleados que dependen de los tipos de documentos, puestos de tripulación, aeropuertos y aerolíneas.

-- Inserciones en la tabla 'empleados'

-- Empleados de Iberia (España)
INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (1, 'Juan Pérez', 1, '12345678', '2023-01-15', 1, 1, 'MAD1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (2, 'Ana Martínez', 1, '87654321', '2023-02-20', 3, 1, 'BCN1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (3, 'Pedro Gómez', 2, 'P9876543', '2023-03-10', 2, 1, 'MAD1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (4, 'Elena Sánchez', 1, 'S5678901', '2023-04-05', 1, 1, 'BCN1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (5, 'Carlos Ruiz', 3, 'C2345678', '2023-05-15', 3, 1, 'MAD1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (6, 'Laura Fernández', 1, 'L3456789', '2023-06-20', 1, 1, 'BCN1');

-- Empleados de Air France (Francia)
INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (7, 'Pierre Dupont', 2, 'A9876543', '2023-07-15', 1, 4, 'PAR1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (8, 'Marie Leclerc', 1, 'M8765432', '2023-08-20', 2, 4, 'PAR1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (9, 'Jacques Martin', 1, 'J7654321', '2023-09-10', 3, 4, 'PAR1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (10, 'Sophie Bernard', 3, 'S6543210', '2023-10-05', 1, 4, 'PAR1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (11, 'Étienne Lefevre', 1, 'E5432109', '2023-11-15', 2, 4, 'PAR1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (12, 'Charlotte Moreau', 1, 'C4321098', '2023-12-20', 1, 4, 'PAR1');

-- Empleados de American Airlines (Estados Unidos)
INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (13, 'John Smith', 1, 'J5678901', '2024-01-15', 1, 7, 'NYC1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (14, 'Emily Johnson', 1, 'E4567890', '2024-02-20', 2, 7, 'NYC1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (15, 'Michael Brown', 1, 'M3456789', '2024-03-10', 3, 7, 'NYC1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (16, 'Sarah Davis', 1, 'S2345678', '2024-04-05', 1, 7, 'NYC1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (17, 'Robert Miller', 1, 'R1234567', '2024-05-15', 2, 7, 'NYC1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (18, 'Olivia Wilson', 1, 'O0123456', '2024-06-20', 1, 7, 'NYC1');

-- Empleados de Lufthansa (Alemania)
INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (19, 'Hans Müller', 3, 'C2345678', '2024-07-15', 3, 10, 'BER1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (20, 'Greta Schmidt', 1, 'G1234567', '2024-08-20', 1, 10, 'BER1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (21, 'Klaus Fischer', 2, 'K2345678', '2024-09-10', 2, 10, 'BER1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (22, 'Julia Weber', 1, 'J3456789', '2024-10-05', 3, 10, 'BER1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (23, 'Max Lehmann', 1, 'M4567890', '2024-11-15', 1, 10, 'BER1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (24, 'Frieda Schneider', 1, 'F5678901', '2024-12-20', 2, 10, 'BER1');

-- Empleados de Avianca (Colombia)
INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (25, 'Andrés López', 1, 'A5678901', '2025-01-15', 1, 13, 'BOG1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (26, 'Camila Ramírez', 1, 'C4567890', '2025-02-20', 2, 13, 'BOG1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (27, 'Jorge Gutiérrez', 1, 'J3456789', '2025-03-10', 3, 13, 'BOG1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (28, 'María Duarte', 1, 'M2345678', '2025-04-05', 1, 13, 'BOG1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (29, 'Santiago Castillo', 1, 'S1234567', '2025-05-15', 2, 13, 'BOG1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (30, 'Valentina Herrera', 1, 'V0123456', '2025-06-20', 1, 13, 'BOG1');

-- Empleados de Viva Air (Colombia)
INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (31, 'Daniel Ospina', 1, 'D2345678', '2025-07-15', 1, 15, 'BOG1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (32, 'Isabela López', 1, 'I3456789', '2025-08-20', 2, 15, 'BOG1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (33, 'Martín Ramírez', 1, 'M4567890', '2025-09-10', 3, 15, 'BOG1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (34, 'Lucía Gómez', 1, 'L5678901', '2025-10-05', 1, 15, 'BOG1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (35, 'Mateo Rodríguez', 1, 'M6789012', '2025-11-15', 2, 15, 'BOG1');

INSERT INTO empleados (id, nombre, idtipodocumento, numerodocumento, fechaingreso, idpuesto, idaerolinea, idaeropuerto)
VALUES (36, 'Valeria Martínez', 1, 'V7890123', '2025-12-20', 1, 15, 'BOG1');



-- // aviones: Los aviones que dependen de los estados, modelos y aerolíneas.


-- Aviones de Iberia (España)
INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (1, 'EC-JNB', 250, '2018-05-15', 1, 1, 1);  -- Airbus A320

INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (2, 'EC-MVM', 300, '2017-09-20', 2, 2, 1);  -- Airbus A330

INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (3, 'EC-KDH', 350, '2019-02-10', 3, 3, 1);  -- Airbus A350


-- Aviones de Air France (Francia)
INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (4, 'F-GKXA', 200, '2016-11-30', 1, 4, 4);  -- Boeing 737

INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (5, 'F-HMLB', 280, '2018-03-25', 2, 5, 4);  -- Boeing 777

INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (6, 'F-HRBA', 320, '2019-06-12', 3, 6, 4);  -- Boeing 787


-- Aviones de American Airlines (Estados Unidos)
INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (7, 'N123AA', 220, '2017-08-15', 1, 7, 7);  -- Airbus A220

INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (8, 'N234AA', 260, '2018-01-20', 2, 1, 7);  -- Airbus A320

INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (9, 'N345AA', 300, '2019-04-05', 3, 2, 7);  -- Airbus A330


-- Aviones de Lufthansa (Alemania)
INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (10, 'D-AIBC', 220, '2016-10-10', 1, 4, 10);  -- Boeing 737

INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (11, 'D-AILE', 280, '2017-12-05', 2, 5, 10);  -- Boeing 777

INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (12, 'D-AIVA', 320, '2019-08-20', 3, 6, 10);  -- Boeing 787


-- Aviones de Avianca (Colombia)
INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (13, 'HK-5689', 180, '2017-03-10', 1, 1, 13);  -- Airbus A320

INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (14, 'HK-7890', 250, '2018-05-15', 2, 2, 13);  -- Airbus A330

INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (15, 'HK-9012', 300, '2019-10-01', 3, 3, 13);  -- Airbus A350


-- Aviones de Viva Air (Colombia)
INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (16, 'HK-3456', 180, '2018-02-28', 1, 7, 15);  -- ERJ-145

INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (17, 'HK-4567', 250, '2019-04-15', 2, 8, 15);  -- E-Jet E2

INSERT INTO aviones (id, matricula, capacidad, fechafabricacion, idestado, idmodelo, idaerolinea)
VALUES (18, 'HK-5678', 300, '2020-07-20', 3, 9, 15);  -- Legacy 650





-- // revisiones: Las revisiones de los aviones.

-- Revisiones para avión EC-JNB (Iberia)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2023-02-15', 1); -- Mantenimiento programado

INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2024-06-20', 1); -- Inspección anual

-- Revisiones para avión EC-MVM (Iberia)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2023-03-10', 2); -- Revisión de motor

-- Revisiones para avión EC-KDH (Iberia)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2023-08-05', 3); -- Mantenimiento rutinario

-- Revisiones para avión F-GKXA (Air France)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2023-04-10', 4); -- Revisión de seguridad

-- Revisiones para avión F-HMLB (Air France)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2024-01-15', 5); -- Inspección anual

-- Revisiones para avión F-HRBA (Air France)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2023-09-30', 6); -- Mantenimiento programado

-- Revisiones para avión N123AA (American Airlines)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2024-01-05', 7); -- Mantenimiento rutinario

-- Revisiones para avión N234AA (American Airlines)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2023-07-20', 8); -- Inspección anual

-- Revisiones para avión N345AA (American Airlines)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2024-03-15', 9); -- Revisión de seguridad

-- Revisiones para avión D-AIBC (Lufthansa)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2023-08-30', 10); -- Inspección semestral

-- Revisiones para avión D-AILE (Lufthansa)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2024-02-10', 11); -- Mantenimiento programado

-- Revisiones para avión D-AIVA (Lufthansa)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2023-11-20', 12); -- Inspección anual

-- Revisiones para avión HK-5689 (Avianca)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2023-05-10', 13); -- Mantenimiento rutinario

-- Revisiones para avión HK-7890 (Avianca)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2023-10-25', 14); -- Inspección anual

-- Revisiones para avión HK-9012 (Avianca)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2024-04-15', 15); -- Revisión de seguridad

-- Revisiones para avión HK-3456 (Viva Air)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2023-09-10', 16); -- Mantenimiento programado

-- Revisiones para avión HK-4567 (Viva Air)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2024-02-28', 17); -- Inspección anual

-- Revisiones para avión HK-5678 (Viva Air)
INSERT INTO revisiones (fecharevision, idavion)
VALUES ('2023-12-10', 18); -- Mantenimiento rutinario


-- // revisiondetalles: Los detalles de las revisiones, que dependen de las revisiones y empleados.

-- Detalles de revisión para el avión EC-JNB (Iberia)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    1, -- idrevision correspondiente a la revisión programada del avión EC-JNB
    'Revisión completa de motor y sistemas.', -- Descripción de la revisión
    5 -- idempleado correspondiente a Carlos Ruiz, Técnico de vuelo
);

INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    2, -- idrevision correspondiente a la inspección anual del avión EC-JNB
    'Inspección detallada de fuselaje y controles.', -- Descripción de la revisión
    6 -- idempleado correspondiente a Laura Fernández, Mecánico de vuelo
);

-- Detalles de revisión para el avión EC-MVM (Iberia)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    3, -- idrevision correspondiente a la revisión de motor del avión EC-MVM
    'Pruebas de rendimiento y ajustes de motor.', -- Descripción de la revisión
    6 -- idempleado correspondiente a Laura Fernández, Mecánico de vuelo
);

-- Detalles de revisión para el avión EC-KDH (Iberia)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    4, -- idrevision correspondiente a la revisión rutinaria del avión EC-KDH
    'Verificación de sistemas de emergencia y seguridad.', -- Descripción de la revisión
    5 -- idempleado correspondiente a Carlos Ruiz, Técnico de vuelo
);

-- Detalles de revisión para el avión F-GKXA (Air France)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    5, -- idrevision correspondiente a la revisión de seguridad del avión F-GKXA
    'Inspección exhaustiva de componentes críticos.', -- Descripción de la revisión
    10 -- idempleado correspondiente a Sophie Bernard, Técnico de vuelo
);

-- Detalles de revisión para el avión F-HMLB (Air France)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    6, -- idrevision correspondiente a la inspección anual del avión F-HMLB
    'Mantenimiento preventivo de sistemas de aviónica.', -- Descripción de la revisión
    11 -- idempleado correspondiente a Étienne Lefevre, Mecánico de vuelo
);

-- Detalles de revisión para el avión F-HRBA (Air France)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    7, -- idrevision correspondiente a la revisión programada del avión F-HRBA
    'Calibración y ajustes de instrumentos de vuelo.', -- Descripción de la revisión
    12 -- idempleado correspondiente a Charlotte Moreau, Mecánico de vuelo
);

-- Detalles de revisión para el avión N123AA (American Airlines)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    8, -- idrevision correspondiente a la revisión rutinaria del avión N123AA
    'Revisión de sistemas de comunicación y navegación.', -- Descripción de la revisión
    1 -- idempleado correspondiente a Juan Pérez, Técnico de vuelo
);

-- Detalles de revisión para el avión N234AA (American Airlines)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    9, -- idrevision correspondiente a la inspección anual del avión N234AA
    'Verificación de estructuras y componentes de seguridad.', -- Descripción de la revisión
    3 -- idempleado correspondiente a Pedro Gómez, Mecánico de vuelo
);

-- Detalles de revisión para el avión N345AA (American Airlines)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    10, -- idrevision correspondiente a la revisión de seguridad del avión N345AA
    'Pruebas de rendimiento y ajustes de sistema de combustible.', -- Descripción de la revisión
    2 -- idempleado correspondiente a Ana Martínez, Técnico de vuelo
);

-- Detalles de revisión para el avión D-AIBC (Lufthansa)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    11, -- idrevision correspondiente a la inspección semestral del avión D-AIBC
    'Mantenimiento de sistemas de frenos y tren de aterrizaje.', -- Descripción de la revisión
    7 -- idempleado correspondiente a Pierre Dupont, Técnico de vuelo
);

-- Detalles de revisión para el avión D-AILE (Lufthansa)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    12, -- idrevision correspondiente a la revisión programada del avión D-AILE
    'Revisión de aviónica avanzada y sistemas de navegación.', -- Descripción de la revisión
    8 -- idempleado correspondiente a Marie Leclerc, Mecánico de vuelo
);

-- Detalles de revisión para el avión D-AIVA (Lufthansa)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    13, -- idrevision correspondiente a la inspección anual del avión D-AIVA
    'Verificación de sistemas de presurización y climatización.', -- Descripción de la revisión
    9 -- idempleado correspondiente a Jacques Martin, Mecánico de vuelo
);

-- Detalles de revisión para el avión HK-5689 (Avianca)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    14, -- idrevision correspondiente a la revisión rutinaria del avión HK-5689
    'Revisión de sistemas hidráulicos y de control de vuelo.', -- Descripción de la revisión
    13 -- idempleado correspondiente a John Smith, Técnico de vuelo
);

-- Detalles de revisión para el avión HK-7890 (Avianca)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    15, -- idrevision correspondiente a la inspección anual del avión HK-7890
    'Mantenimiento de motores y sistemas de combustible.', -- Descripción de la revisión
    14 -- idempleado correspondiente a Emily Johnson, Mecánico de vuelo
);

-- Detalles de revisión para el avión HK-9012 (Avianca)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    16, -- idrevision correspondiente a la revisión de seguridad del avión HK-9012
    'Inspección detallada de componentes de cabina y confort.', -- Descripción de la revisión
    15 -- idempleado correspondiente a Michael Brown, Técnico de vuelo
);

-- Detalles de revisión para el avión HK-3456 (Viva Air)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    17, -- idrevision correspondiente a la revisión programada del avión HK-3456
    'Calibración de sistemas de navegación y comunicación.', -- Descripción de la revisión
    17 -- idempleado correspondiente a Robert Miller, Técnico de vuelo
);

-- Detalles de revisión para el avión HK-4567 (Viva Air)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    18, -- idrevision correspondiente a la inspección anual del avión HK-4567
    'Verificación de sistemas de control de vuelo y seguridad.', -- Descripción de la revisión
    18 -- idempleado correspondiente a Olivia Wilson, Mecánico de vuelo
);

-- Detalles de revisión para el avión HK-5678 (Viva Air)
INSERT INTO revisiondetalles (idrevision, descripcion, idempleado)
VALUES (
    19, -- idrevision correspondiente a la revisión rutinaria del avión HK-5678
    'Revisión de sistemas de aviónica y control ambiental.', -- Descripción de la revisión
    19 -- idempleado correspondiente a Hans Müller, Técnico de vuelo
);





-- // conexionesvuelos: Las conexiones de los vuelos, que dependen de los viajes, aviones y aeropuertos.

-- Inserciones en la tabla conexionesvuelos

-- Inserciones en la tabla conexionesvuelos

-- Vuelo 1: Viaje 1, Avión EC-JNB, Aeropuerto: MAD1
-- Vuelo 1: Viaje 1, Avión EC-JNB, Aeropuerto: MAD1
INSERT INTO conexionesvuelos (numeroconexion, idviaje, idavion, salidaidaeropuerto, llegadaidaeropuerto)
VALUES (
    'CV-001',
    1,
    1,
    'MAD1',
    'MAD1'
);

-- Vuelo 2: Viaje 2, Avión EC-MVM, Aeropuerto: BCN1
INSERT INTO conexionesvuelos (numeroconexion, idviaje, idavion, salidaidaeropuerto, llegadaidaeropuerto)
VALUES (
    'CV-002',
    2,
    2,
    'BCN1',
    'BCN1'
);

-- Vuelo 3: Viaje 3, Avión EC-KDH, Aeropuerto: MAD1
INSERT INTO conexionesvuelos (numeroconexion, idviaje, idavion, salidaidaeropuerto, llegadaidaeropuerto)
VALUES (
    'CV-003',
    3,
    3,
    'MAD1',
    'MAD1'
);

-- Vuelo 4: Viaje 4, Avión F-GKXA, Aeropuerto: PAR1
INSERT INTO conexionesvuelos (numeroconexion, idviaje, idavion, salidaidaeropuerto, llegadaidaeropuerto)
VALUES (
    'CV-004',
    4,
    4,
    'PAR1',
    'PAR1'
);

-- Vuelo 5: Viaje 5, Avión F-HMLB, Aeropuerto: NYC1
INSERT INTO conexionesvuelos (numeroconexion, idviaje, idavion, salidaidaeropuerto, llegadaidaeropuerto)
VALUES (
    'CV-005',
    5,
    5,
    'NYC1',
    'NYC1'
);

-- Vuelo 6: Viaje 1, Avión EC-MVM, Aeropuerto: BCN1
INSERT INTO conexionesvuelos (numeroconexion, idviaje, idavion, salidaidaeropuerto, llegadaidaeropuerto)
VALUES (
    'CV-006',
    1,
    2,
    'BCN1',
    'BCN1'
);

-- Vuelo 7: Viaje 2, Avión F-HRBA, Aeropuerto: BER1
INSERT INTO conexionesvuelos (numeroconexion, idviaje, idavion, salidaidaeropuerto, llegadaidaeropuerto)
VALUES (
    'CV-007',
    2,
    6,
    'BER1',
    'BER1'
);

-- Vuelo 8: Viaje 3, Avión N234AA, Aeropuerto: NYC1
INSERT INTO conexionesvuelos (numeroconexion, idviaje, idavion, salidaidaeropuerto, llegadaidaeropuerto)
VALUES (
    'CV-008',
    3,
    8,
    'NYC1',
    'NYC1'
);

-- Vuelo 9: Viaje 4, Avión HK-5678, Aeropuerto: NIC1
INSERT INTO conexionesvuelos (numeroconexion, idviaje, idavion, salidaidaeropuerto, llegadaidaeropuerto)
VALUES (
    'CV-009',
    4,
    18,
    'NIC1',
    'NIC1'
);

-- Vuelo 10: Viaje 5, Avión D-AILE, Aeropuerto: PAR1
INSERT INTO conexionesvuelos (numeroconexion, idviaje, idavion, salidaidaeropuerto, llegadaidaeropuerto)
VALUES (
    'CV-010',
    5,
    11,
    'PAR1',
    'PAR1'
);



-- // tripulantes: Los tripulantes de las conexiones de vuelos.

-- Inserción de tripulantes

-- Tripulante 1: Juan Pérez en la conexión CV-001 (Vuelo 1)
INSERT INTO tripulantes (idconexion, idempleado)
VALUES (
    1, -- idconexion correspondiente a la conexión CV-001
    1  -- idempleado correspondiente a Juan Pérez
);

-- Tripulante 2: Ana Martínez en la conexión CV-001 (Vuelo 1)
INSERT INTO tripulantes (idconexion, idempleado)
VALUES (
    1, -- idconexion correspondiente a la conexión CV-001
    2  -- idempleado correspondiente a Ana Martínez
);

-- Tripulante 3: Pedro Gómez en la conexión CV-002 (Vuelo 2)
INSERT INTO tripulantes (idconexion, idempleado)
VALUES (
    2, -- idconexion correspondiente a la conexión CV-002
    3  -- idempleado correspondiente a Pedro Gómez
);

-- Tripulante 4: Elena Sánchez en la conexión CV-003 (Vuelo 3)
INSERT INTO tripulantes (idconexion, idempleado)
VALUES (
    3, -- idconexion correspondiente a la conexión CV-003
    4  -- idempleado correspondiente a Elena Sánchez
);

-- Tripulante 5: Carlos Ruiz en la conexión CV-004 (Vuelo 4)
INSERT INTO tripulantes (idconexion, idempleado)
VALUES (
    4, -- idconexion correspondiente a la conexión CV-004
    5  -- idempleado correspondiente a Carlos Ruiz
);



-- // asientodetallereservaviajeconexion: La relación entre los asientos, detalles de reserva y conexiones de vuelos.

-- Inserción en la tabla asientodetallereservaviajeconexion

-- Relación 1: Conexión CV-001 (Vuelo 1), Detalle de Reserva 1, Asiento 1
INSERT INTO asientodetallereservaviajeconexion (idconexionvuelos, iddetallereserva, idasientos)
VALUES (1, 1, 1);

-- Relación 2: Conexión CV-002 (Vuelo 2), Detalle de Reserva 2, Asiento 2
INSERT INTO asientodetallereservaviajeconexion (idconexionvuelos, iddetallereserva, idasientos)
VALUES (2, 2, 2);

-- Relación 3: Conexión CV-003 (Vuelo 3), Detalle de Reserva 3, Asiento 3
INSERT INTO asientodetallereservaviajeconexion (idconexionvuelos, iddetallereserva, idasientos)
VALUES (3, 3, 3);

-- Relación 4: Conexión CV-004 (Vuelo 4), Detalle de Reserva 4, Asiento 4
INSERT INTO asientodetallereservaviajeconexion (idconexionvuelos, iddetallereserva, idasientos)
VALUES (4, 4, 4);

-- Relación 5: Conexión CV-005 (Vuelo 5), Detalle de Reserva 5, Asiento 5
INSERT INTO asientodetallereservaviajeconexion (idconexionvuelos, iddetallereserva, idasientos)
VALUES (5, 5, 5);
