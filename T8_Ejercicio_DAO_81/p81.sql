drop database if exists p81JoseAngelGomezMorillo;
create database p81JoseAngelGomezMorillo;
use p81JoseAngelGomezMorillo;

create table facturas(
	codigo int not null,
	fecha date,
    descripcion varchar (60),
    importe double,
    constraint pk_factutas primary key (codigo)
);