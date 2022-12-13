drop database if exists chamados;
create database chamados charset=UTF8 collate utf8_general_ci;
use chamados;

create table chamados(
	id integer not null primary key auto_increment,
	tipo varchar(50) not null,
	severidade integer(1) not null,
	descricao varchar(256) not null,
	data date not null,
	hora time not null,
	hora_inicio time,
	hora_fim time,
	destino varchar(50) not null
);

LOAD DATA INFILE 'D:/wellington/senai2022/2des/pwfe/aula13/chamados.csv'
INTO TABLE chamados
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from chamados;
