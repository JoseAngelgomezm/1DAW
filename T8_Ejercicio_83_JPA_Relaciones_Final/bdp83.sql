drop database if exists p83JoseAngelGomez;
create database if not exists p83JoseAngelGomez;
use p83JoseAngelGomez;


create table if not exists proveedores(
	id_proveedor int auto_increment,
    nif_proveedor varchar(9),
	nombre_proveedor varchar(60),
	direccion_proveedor varchar(60),
	constraint pk_proveedores primary key (id_proveedor, nif_proveedor)
);
	
create table if not exists productos(
	id_producto int auto_increment,
    id_proveedor int,
    nif_proveedor varchar(9),
    ref_producto varchar (10),
	nombre_producto varchar(60),
    importe_producto double,
    constraint pk_productos primary key (id_producto, ref_producto),
	constraint fk_productos_proveedores foreign key (id_proveedor, nif_proveedor) references proveedores (id_proveedor, nif_proveedor)
);

create table if not exists tarjetaBancaria(
	id_tarjetaBancaria int auto_increment,
    numero_tarjeta varchar(60),
    constraint pk_tarjetaBancaria primary key (id_tarjetaBancaria , numero_tarjeta)
);


create table if not exists clientes(
	id_cliente int auto_increment,
    nif_cliente varchar(9),
    nombrecliente varchar(60),
    apellidos_cliente varchar(120),
	fechaNacimiento_cliente date,
    constraint pk_clientes primary key (id_cliente, nif_cliente)
);

create table if not exists facturas(
	id_cliente int,
    nif_cliente varchar(9),
    id_producto int,
    ref_producto varchar (10),
    cantidad_productos int,
    fecha_factura date,
    importe_total double,
    constraint pk_facturas primary key (id_cliente, id_producto, nif_cliente, ref_producto),
    constraint fk_facturas_clientes foreign key (id_cliente, nif_cliente) references clientes (id_cliente, nif_cliente),
    constraint fk_facturas_productos foreign key (id_producto, ref_producto) references productos (id_producto, ref_producto)
);


