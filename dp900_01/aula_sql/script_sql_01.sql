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
