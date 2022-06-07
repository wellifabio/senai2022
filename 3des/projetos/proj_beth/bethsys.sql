DROP DATABASE IF EXISTS bethsys;
CREATE DATABASE bethsys CHARSET=UTF8 COLLATE UTF8_GENERAL_CI;

USE bethsys;

CREATE TABLE usuarios (
	id integer not null auto_increment primary key,
	nome varchar(153) not null,
	senha varchar(100) not null,
	tipo INTEGER not null
);

CREATE TABLE salgados (
	id integer not null auto_increment primary key,
	nome varchar(50) not null,
	descricao varchar(100) not null,
	foto varchar(20) not null
);

CREATE TABLE comentarios (
	id integer not null auto_increment primary key,
	id_usuario integer not null,
	id_salgado integer not null,
	nota decimal(2,1) not null,
	avaliacao varchar(100) not null,
	constraint fk_user foreign key (id_usuario) references usuarios (id) on delete cascade,
	constraint fk_salgado foreign key (id_salgado) references salgados (id) on delete cascade
);

INSERT INTO usuarios VALUES (DEFAULT, 'Beth', '1234', 1);
INSERT INTO usuarios VALUES (DEFAULT, 'Aluno 1', '1234', 2);
INSERT INTO usuarios VALUES (DEFAULT, 'Aluno 2', '1234', 2);

INSERT INTO salgados VALUES (DEFAULT, 'Coxinha', 'Saboroso salgado recheado de costela', 'coxinha.jpg');
INSERT INTO salgados VALUES (DEFAULT, 'Pão de Queijo', 'Fofinho', 'paodequeijo.jpg');

INSERT INTO comentarios VALUES (DEFAULT, 2, 1, 4, 'Massa sequinha, recheio saboroso');