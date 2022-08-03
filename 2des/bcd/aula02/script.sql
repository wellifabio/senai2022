-- Exclui o banco se existir e cria um novo com o padrão utf8 de caracteres
drop database if exists pedidos;
create database pedidos charset=UTF8 collate utf8_general_ci;
use pedidos;
-- DDL Criação da estrutura do Banco de dados
create table clientes(
    id_cliente integer not null primary key auto_increment,
    pri_nome varchar(20) not null,
    sobrenome varchar(20) not null,
    endereco varchar(100) not null
);
create table telefones(
    id_cliente integer not null,
    telefone varchar(15) not null,
    foreign key (id_cliente) references clientes(id_cliente)
);
create table pedidos(
    num_pedido integer not null primary key auto_increment,
    id_cliente integer not null,
    data timestamp not null,
    valor decimal(8,2) not null,
    descricao varchar(50) not null,
    quantidade integer(4) not null,
    foreign key (id_cliente) references clientes(id_cliente)
);

describe clientes;
describe telefones;
describe pedidos;
show tables;

-- DML Alimentar o banco de dados com dados de teste
insert into clientes values
(null,"Jorge","Silva","Rua Coisa Bueno - Jaguariúna - SP"),
(null,"Vanessa","Silva","Rua Amâncio Bueno - Jaguariúna - SP"),
(null,"Mercelo","Souza","Rua Dois - Pedreira - SP"),
(null,"Juliana","Tavares","Rua Bueno Bueno - Jaguariúna - SP");

insert into telefones values
(1,"19-48242-7664"),
(1,"19-06443-6521"),
(2,"19-00717-3704"),
(2,"19-91262-8871"),
(3,"19-18833-6028");

insert into pedidos values
(null,1,null,10,"Pastel de Flango",2),
(null,1,null,10,"Pastel de Carne",3),
(null,2,null,8,"Coxinha",1),
(null,2,null,8,"Pastel de Queijo",2),
(null,2,null,10,"Refri Lata 600ML",1),
(null,3,null,10,"Pastel de flango",1),
(null,3,null,12,"Suco de Laranja",2),
(null,3,null,10,"Pastel de Carne",1),
(null,4,null,10,"Pastel de Queijo",3),
(null,4,null,8,"Coxinha",2);

select * from clientes;
select * from telefones;
select * from pedidos;