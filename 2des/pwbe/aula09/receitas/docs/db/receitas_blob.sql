drop database if exists receitas;
create database receitas charset = UTF8 collate = utf8_general_ci;
use receitas;

create table receitas(
    id integer primary key not null auto_increment,
    tipo varchar(15) not null,
    nome varchar(40) not null,
    ingredientes varchar(255) not null,
    modo_preparo varchar(255) not null,
    foto mediumblob
);

load data infile 'D:/well/senai2022/2des/pwbe/aula09/receitas/docs/db/receitas.csv'
into table receitas
fields terminated by ';'
enclosed by '"'
lines terminated by '\r\n'
ignore 1 rows
set foto=null;

select * from receitas;
