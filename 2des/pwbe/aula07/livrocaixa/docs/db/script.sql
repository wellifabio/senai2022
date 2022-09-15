-- DDL criação da estrutura do banco de dados
drop database if exists livrocaixa;
create database livrocaixa charset=UTF8 collate utf8_general_ci;
use livrocaixa;
create table lancamentos(
    n_lancamento integer not null auto_increment primary key,
    data date not null,
    descricao varchar(100) not null,
    valor float(10,2) not null,
    tipo varchar(1) not null
);

-- importação dos dados
LOAD DATA INFILE 'D:/Wellington/pessoal/arquivos/0_senai/2022_2des/exlivrocaixa/docs/db/lancamentos.csv'
INTO TABLE lancamentos
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from lancamentos;
-- Exemplo de exportação dos dados para "csv"
-- SELECT * FROM lancamentos INTO OUTFILE 'C:/Users/wellington.martins/Desktop/exercicio/docs/lancamentos.csv' FIELDS TERMINATED BY ';' LINES TERMINATED BY '/r/n';