drop database if exists vendas;
create database vendas charset = UTF8 collate = utf8_general_ci;
use vendas;

create table vendas(
    id int not null auto_increment primary key,
    produto varchar(100) not null,
    quantidade integer not null,
    preco decimal(8,2) not null,
    data date not null
);
