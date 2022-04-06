create database Floricultura;
use Floricultura;

create table Funcionarios(
	codFunc integer primary key auto_increment,
	nome varchar(40) not null,
	telefone varchar(15)
	);
create table if not exists Produtos(
	codProd integer primary key auto_increment,
	nome varchar(40) not null,
	tipo varchar(15) not null
	);
create table Entregas(
	nRo integer primary key auto_increment,
	dataAgenda date not null,
	dataEntrega date,
	);

insert into Funcionarios(nome,  telefone) values("David Meire Veiga","19996521857");
insert into Funcionarios(nome,  telefone) values("Cleiton Passos Cordeiro","19958578484");
insert into Funcionarios(nome,  telefone) values("Draylson Micael de Souza","19989878465");
insert into Funcionarios(nome,  telefone) values("Eder Almeida Batista de Oliveira","19987958965");
insert into Funcionarios(nome,  telefone) values("Ewerton José da Silva","19875887987");
insert into Funcionarios(nome,  telefone) values("Fabio Luiz de Paula","19879879899");
insert into Funcionarios(nome,  telefone) values("Gustavo Moreira Calixto","19989878465");
insert into Funcionarios(nome,  telefone) values("Helder Pestana","19987987965");

insert into Produtos(nome,  tipo) values("MINI ROSA","Maço");
insert into Produtos(nome,  tipo) values("ANTÚRIO VERMELHO","Maço");
insert into Produtos(nome,  tipo) values("ARTER ROXO","Maço");
insert into Produtos(nome,  tipo) values("ASTER BRANCA","Maço");
insert into Produtos(nome,  tipo) values("BOCA DE LEÃO","Maço");
insert into Produtos(nome,  tipo) values("COPO DE LEITE","Maço");
insert into Produtos(nome,  tipo) values("CRAVINAS","Maço");
insert into Produtos(nome,  tipo) values("CRAVO","Maço");
insert into Produtos(nome,  tipo) values("CRISÂNTEMO","Maço");
insert into Produtos(nome,  tipo) values("CYPSOFILA","Maço");
insert into Produtos(nome,  tipo) values("ESTRELITZIA","Maço");
insert into Produtos(nome,  tipo) values("F. DE TRIGO. (ALVEJ.)","Maço");
insert into Produtos(nome,  tipo) values("FLOR DE TRIGO","Maço");
insert into Produtos(nome,  tipo) values("GARDENIA","Maço");
insert into Produtos(nome,  tipo) values("GERBERA","Maço");
insert into Produtos(nome,  tipo) values("GIRASSOL FLOR","Maço");
insert into Produtos(nome,  tipo) values("HELICÔNIAS","Maço");
insert into Produtos(nome,  tipo) values("LÍRIO BRANCO","Maço");
insert into Produtos(nome,  tipo) values("LISIANTOS","Maço");
insert into Produtos(nome,  tipo) values("PALMAS","Maço");
insert into Produtos(nome,  tipo) values("ROSA A","Maço");
insert into Produtos(nome,  tipo) values("ROSA B","Maço");
insert into Produtos(nome,  tipo) values("ROSA C","Maço");
insert into Produtos(nome,  tipo) values("STATICE","Maço");
insert into Produtos(nome,  tipo) values("TANGO","Maço");
insert into Produtos(nome,  tipo) values("SEMPRE VIVA","Maço");
insert into Produtos(nome,  tipo) values("AZALÉIA","Vaso");
insert into Produtos(nome,  tipo) values("ANTÚRIO VERMELHO","Vaso");
insert into Produtos(nome,  tipo) values("BROMELIA","Vaso");
insert into Produtos(nome,  tipo) values("CICLÂMES","Vaso");
insert into Produtos(nome,  tipo) values("ERVA AROMATICA","Vaso");
insert into Produtos(nome,  tipo) values("GIRASSOL","Vaso");
insert into Produtos(nome,  tipo) values("MINI AZALÉIA","Vaso");
insert into Produtos(nome,  tipo) values("ORQUIDEAS","Vaso");
insert into Produtos(nome,  tipo) values("PIMENTAS","Vaso");
insert into Produtos(nome,  tipo) values("FOLHAGEM","Vaso");
insert into Produtos(nome,  tipo) values("ASPARGO","Vaso");
insert into Produtos(nome,  tipo) values("DRACENA","Vaso");
insert into Produtos(nome,  tipo) values("EUCALIPTO","Vaso");
insert into Produtos(nome,  tipo) values("FICUS FOLHAGEM","Vaso");
insert into Produtos(nome,  tipo) values("GALHO DE CIPRESTE","Vaso");
insert into Produtos(nome,  tipo) values("GARDENIA FOLHAGEM","Vaso");
insert into Produtos(nome,  tipo) values("MILINDRO","Vaso");
insert into Produtos(nome,  tipo) values("MURTA","Vaso");
insert into Produtos(nome,  tipo) values("PALMEIRA","Vaso");
insert into Produtos(nome,  tipo) values("PAULISTINHA","Vaso");
insert into Produtos(nome,  tipo) values("PITOSPORO","Vaso");
insert into Produtos(nome,  tipo) values("SMILAX","Vaso");
insert into Produtos(nome,  tipo) values("TUIA","Vaso");
insert into Produtos(nome,  tipo) values("CAXEPO PEQUENO","Embalagem");
insert into Produtos(nome,  tipo) values("CAXEPO MÉDIO","Embalagem");
insert into Produtos(nome,  tipo) values("CAXEPO GRANDE","Embalagem");
insert into Produtos(nome,  tipo) values("CAXEPO PEQUENO REDONDO","Embalagem");
insert into Produtos(nome,  tipo) values("CAXEPO MÉDIO REDONDO","Embalagem");
insert into Produtos(nome,  tipo) values("CAXEPO GRANDE REDONDO","Embalagem");
insert into Produtos(nome,  tipo) values("QUADRO SIMPLES BAMBU","Quadro");
insert into Produtos(nome,  tipo) values("QUADRO DUPLO BAMBU","Quadro");
insert into Produtos(nome,  tipo) values("QUADRO TRIPLO BAMBU","Quadro");

insert into Entregas(dataAgenda, dataEntrega) values("2019/01/22","2019/01/22");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/22","2019/01/22");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/23","2019/01/23");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/24","        ");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/18","2019/01/18");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/18","2019/01/18");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/20","2019/01/20");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/20","2019/01/20");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/23","        ");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/24","2019/01/24");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/25","2019/01/25");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/26","        ");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/28","2019/01/28");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/22","2019/01/22");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/22","2019/01/22");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/23","2019/01/23");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/24","        ");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/18","2019/01/18");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/18","2019/01/18");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/20","2019/01/20");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/20","2019/01/20");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/23","        ");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/24","2019/01/24");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/25","2019/01/25");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/26","        ");
insert into Entregas(dataAgenda, dataEntrega) values("2019/01/28","2019/01/28");
	
show tables;
describe Entregas;
describe Produtos;
describe Funcionarios;

--Exemplo de como Criar e Deletar Indices após a criação da tabela
show index from Produtos;
create index indNomeProd on Produtos(nome);
drop index indNomeProd on Produtos;

--Exemplo de como Criar Indice com múltiplas colunas
CREATE TABLE t1 (col1 INT, col2 INT, INDEX func_index ((ABS(col1))));
CREATE INDEX idx1 ON t1 ((col1 + col2));
CREATE INDEX idx2 ON t1 ((col1 + col2), (col1 - col2), col1);
ALTER TABLE t1 ADD INDEX ((col1 * 40) DESC);

--Exemplo de como Criar indice durante a criação da tabela
CREATE TABLE t1 (
  col1 VARCHAR(10),
  col2 VARCHAR(20),
  INDEX (col1, col2(10))
);

drop table Produtos;
create table if not exists Produtos(
	codProd integer primary key auto_increment,
	nome varchar(40) not null,
	tipo varchar(15) not null,
	index indNome(nome(20))
	);

-- Exemplo de Relacionamentos
drop table Entregas;
create table Entregas(
	nRo integer primary key auto_increment,
	dataAgenda date not null,
	dataEntrega date,
	codProd integer,
	constraint fkProd foreign key (codProd) references produtos(codProd) on delete cascade on update cascade
	);