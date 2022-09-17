-- SQL / DDL - Tabela de clientes não normalizada
create table clidp01(
    cod_cli number not null primary key,
    nome varchar(30) not null,
    telefone varchar(15),
    endereco varchar(100)                                                                       
);

-- Excluir tabela
drop table clidp01;

-- Criar a tebela novamente
create table clidp01(
    cod_cli number not null primary key,
    nome varchar(30) not null,
    telefone varchar(50),
    endereco varchar(100)                                                                       
);

-- Alterar tabela - mudar o tamanho do telefone para 40
alter table clidp01 modify telefone varchar(40);

-- Consultar estrutura da tabela
describe clidp01;

-- SQL - DML (Inserir dados na tabela)
insert into CLIDP01 values
(1,'José','7898-7898 7899-7898','Rua seis, 85 Morumbi 12345-789');
insert into CLIDP01 values
(2,'Maria','4568-7898 4444-4444','Rua seis, 85 Morumbi 12345-789');
insert into CLIDP01 values
(3,'Janio','78978-6666 7899-8888','Rua seis, 85 Morumbi 12345-789');

-- Consultar os dados da tabela
select * from clidp01;
select nome from clidp01;
select cod_cli, nome from clidp01;

-- Alterar registros
update clidp01 set nome = 'Ana' where cod_cli = 1;

-- excluir
delete from clidp01 where cod_cli = 1;

-- Cria novamente as tabelas normalizadas 1º Forma normal.
create table clidp02(
    id_cli number not null primary key,
    pri_nome varchar(30) not null,
    sobrenome varchar(30) not null,
    cep varchar(8) not null,
    numero varchar(5),
    complemento varchar(30)
);
create table telefonesdp01(
    id_cli number not null,
    tipo varchar(10) not null,
    numero varchar(15) not null,
    foreign key (id_cli) references clidp02(id_cli)
);

describe clidp02;
describe telefonesdp01;

insert into clidp02 values(1,'Ana','Sousa','13914456','15','');
insert into clidp02 values(2,'Lúcia','Silva','13914452','43B','bl15 ap44');
insert into clidp02 values(3,'Mariana','Melo','13914426','23A','fundos');
insert into clidp02 values(4,'Silvia','Oliveira','13914413','314','');

insert into telefonesdp01 values(1,'celular','(19)99778-8888');
insert into telefonesdp01 values(1,'fixo','(19)99778-7777');
insert into telefonesdp01 values(2,'celular','(19)99778-6666');
insert into telefonesdp01 values(2,'comercial','(19)99778-5555');
insert into telefonesdp01 values(3,'celular','(19)99778-4444');
insert into telefonesdp01 values(3,'fixo','(19)99778-3333');
insert into telefonesdp01 values(3,'comercial','(19)99778-2222');
insert into telefonesdp01 values(5,'celular','(19)99778-1111');
