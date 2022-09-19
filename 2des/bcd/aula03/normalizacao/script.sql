drop database if exists clientes;
create database clientes charset=UTF8 collate utf8_general_ci;
use clientes;

create table clientes(
    id_cli integer not null primary key auto_increment,
    pri_nome varchar(30) not null,
	sobrenome varchar(30) not null,
	logradouro varchar(30) not null,
	numero varchar(5) not null,
	bairro varchar(30) not null,
	cep varchar(9) not null
);

create table telefones(
    id_cli integer not null,
    telefone varchar(15) not null,
    foreign key (id_cli) references clientes(id_cli)
);

create table produtos(
	id_prod integer not null primary key auto_increment,
	produto varchar(30) not null,
	valor_unitario float(10,2) not null
);

create table pedidos(
	id_ped integer not null primary key auto_increment,
	id_prod integer not null,
	quantidade integer not null
);

insert into clientes values
(1,'José','Silva','Rua Seis','85','Modumbi','12536-965'),
(2,'Maria','Souza','Rua Onze','64','Moema','65985-963'),
(3,'Janio','Silva','Praça Ramos','','Liberdade','68858-633');

insert into telefones values
(1,'(19) 99877-7789'),
(1,'(19)98787-7877'),
(2,'(19) 99877-7788'),
(2,'(19)98787-7878'),
(3,'(19) 99877-7666'),
(3,'(19)98787-7879');

insert into produtos values
(1,'Impressora deskjet',350),
(2,'Impressora matricial',850),
(3,'Impressora laser',1500);

insert into pedidos values
(1005,3,2),
(1006,1,1),
(1007,2,1),
(1008,1,3);

-- Visões (Relatórios que trazem as onformações conforme necessidade do cliente)
-- O oposto da Normalização
create view vw_clientes as
select c.id_cli, concat(c.pri_nome,' ',c.sobrenome) as nome,
t.telefone, concat_ws(',', c.logradouro, c.numero, c.bairro, c.cep) as endereco
from clientes c inner join telefones t on c.id_cli = t.id_cli;

create view vw_pedidos as
select pe.id_ped, pr.id_prod, pr.produto, pe.quantidade, pr.valor_unitario,
pe.quantidade * pr.valor_unitario as subtotal
from pedidos pe inner join produtos pr on pe.id_prod = pr.id_prod;

select * from clientes;
select * from telefones;
select * from produtos;
select * from pedidos;
select * from vw_clientes;
select * from vw_pedidos;