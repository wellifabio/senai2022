drop database if exists locadora;
create database locadora charset=UTF8 collate utf8_general_ci;
use locadora;

create table clientes(
    codigo integer not null primary key auto_increment,
    nome varchar(50) not null,
    endereco varchar(100) not null,
    telefone varchar(15) not null
);

create table filmes(
    codigo integer not null primary key auto_increment,
    nome varchar(50) not null,
    genero varchar(30) not null
);

create table locacoes(
    id integer not null primary key auto_increment,
    codigo_cli integer not null,
    codigo_filme integer not null,
    data_locacao date not null,
    data_devolucao date,
    foreign key (codigo_cli) references clientes(codigo),
    foreign key (codigo_filme) references filmes(codigo)
);

LOAD DATA INFILE 'D:/wellington/pessoal/arquivos/0_senai/2022_2des/vps01back/locadorabasica/db/clientes.csv'
INTO TABLE clientes
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'D:/wellington/pessoal/arquivos/0_senai/2022_2des/vps01back/locadorabasica/db/filmes.csv'
INTO TABLE filmes
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'D:/wellington/pessoal/arquivos/0_senai/2022_2des/vps01back/locadorabasica/db/locacoes.csv'
INTO TABLE locacoes
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from clientes;
select * from filmes;
select * from locacoes;

create view vw_devolucoes as
select l.id, c.nome, c.telefone, f.nome as filme, l.data_locacao from clientes c
inner join locacoes l on c.codigo = l.codigo_cli
inner join filmes f on l.codigo_filme = f.codigo where l.data_devolucao is null;

select * from vw_devolucoes;