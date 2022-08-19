drop database if exists duplicatas;
create database duplicatas charset=UTF8 collate utf8_general_ci;
use duplicatas;

create table clientes(
    cod_cli integer not null primary key auto_increment,
    nome varchar(50) not null,
    endereco varchar(50) not null,
    bairro varchar(30) not null,
    cidade varchar(30) not null,
    uf varchar(2) not null
);

create table telefones(
    cod_cli integer not null,
    tipo varchar(10) not null,
    numero varchar(15) not null,
    foreign key (cod_cli) references clientes(cod_cli)
);

create table duplicatas(
    num_dupli integer not null primary key auto_increment,
    cod_cli integer not null,
    data_compra date not null,
    vencimento date not null,
    pagamento date not null,
    valor float(10,2) not null,
    diferenca float(9,2) not null,
    foreign key (cod_cli) references clientes(cod_cli)
);

describe clientes;
describe telefones;
describe duplicatas;

show tables;