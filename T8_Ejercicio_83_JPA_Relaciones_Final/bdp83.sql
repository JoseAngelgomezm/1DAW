drop database if exists p83JoseAngelGomez;
create database if not exists p83JoseAngelGomez;
use p83JoseAngelGomez;


create table if not exists proveedores(
	id_proveedor int auto_increment,
    nif_proveedor varchar(9),
	nombre_proveedor varchar(60),
	direccion_proveedor varchar(60),
	constraint pk_proveedores primary key (id_proveedor)
);
	
create table if not exists productos(
	id_producto int auto_increment,
    id_proveedor int,
    ref_producto varchar (10),
	nombre_producto varchar(60),
    importe_producto double,
    constraint pk_productos primary key (id_producto),
	constraint fk_productos_proveedores foreign key (id_proveedor) references proveedores (id_proveedor)
);

create table if not exists tarjetasBancarias(
	id_tarjetaBancaria int auto_increment,
    numero_tarjeta varchar(60),
    constraint pk_tarjetaBancaria primary key (id_tarjetaBancaria)
);


create table if not exists clientes(
	id_cliente int auto_increment,
    id_tarjetaBancaria int,
    nif_cliente varchar(9),
    nombrecliente varchar(60),
    apellidos_cliente varchar(120),
	fechaNacimiento_cliente date,
    constraint pk_clientes primary key (id_cliente),
    constraint fk_clientes_tarjetasBancarias foreign key (id_tarjetaBancaria)  references tarjetasBancarias (id_tarjetaBancaria)
);

create table if not exists facturas(
	id_cliente int,
    id_producto int,
    cantidad_productos int,
    fecha_factura datetime,
    importe_total double,
    constraint pk_facturas primary key (id_cliente, id_producto, fecha_factura),
    constraint fk_facturas_clientes foreign key (id_cliente) references clientes (id_cliente),
    constraint fk_facturas_productos foreign key (id_producto) references productos (id_producto)
);

insert into proveedores values
(default, '77754343S', 'Monitores PC', 'Calle Los Jardines 119 Sevilla' ),
(default, '87553443S', 'Tarjetas Graficas PC', 'Calle Santa Marta 4 Granada' ),
(default, '44124633Z', 'Placas Bases PC', 'Calle Lirios 7 San Fernando' );

insert into productos values
(default, '1',  '88887777', 'Samsung oddysey G5 27', '200'),
(default, '1',  '66625212', 'MSI Optix G24C4 23.6', '160'),
(default, '2',  '23137774', 'Gigabyte rtx 3060 12GB', '350'),
(default, '2',  '34242342', 'Gigabyte RX 6700XT', '400'),
(default, '3',  '23137774', 'Asus TUF GAMING B660 PLUS', '175'),
(default, '3',  '34242342', 'Gigabyte b550 AORUS ELITE', '130');

insert into tarjetasBancarias values 
(default, '4788999883766263'),
(default, '3288884756756757'),
(default, '4839124623754237'),
(default, '2372378457847834');

insert into clientes values 
(default, '1', '72348543F', 'Juan Francisco', 'Perez Melenguez', '1989-02-07'),
(default, '2', '23475895G', 'Andres', 'Diaz Fernandez', '1976-04-01'),
(default, '3', '83764758F', 'Miguel', 'Lomena', '1992-08-03'),
(default, '4', '73365890L', 'Alejandro', 'Hidalgo', '1998-07-22');

insert into facturas values
('1', '1', '2', '2023-05-19', '400'),
('1', '2', '2', '2023-05-19', '320'),
('2', '5', '1', '2023-05-19', '175');


