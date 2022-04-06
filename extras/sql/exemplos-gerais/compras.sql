drop database if exists compras;
create database compras;
use compras;
create table clientes(
	rg_cli varchar(10) primary key,
	nome varchar(40) not null,
	telefone varchar(15),
	endereco varchar(40) not null
);

create table produtos(
	nome_prod varchar(20) primary key,
	preco decimal(6,2) not null,
	quantidade integer
);

create table compras(
	rg_cli varchar(10) not null,
	nome_prod varchar(20) not null,
	quantidade integer,
	data date,
	constraint fk_compras_cli foreign key (rg_cli) references clientes(rg_cli)
	on update cascade,
	constraint fk_compras_prod foreign key (nome_prod) references produtos(nome_prod)
	on update cascade
);
show tables;

-- Inserir compras sem ter um cliente cadastrado
-- Inserir compras sem ter um produto cadastrado
-- Inserir clientes sem o nome
-- Inserir clientes sem telefone
-- Inserir produtos sem colocar quantidades
-- Alterar o rg de um cliente e conferir se altera nas compras realizadas
-- ALterar o código ou nome de um cliente

insert into clientes values
("1111111-1","Jãozinho","(19)1341-4152","Rua dos Sabonetes"),
("2141441-1","Zézinho","(19)1341-4152","Rua dos Detergentes"),
("1242355-1","Luizinho","(19)1341-4152","Rua dos Ipês");
insert into produtos values
("Pen Drive",30.25,20),
("Mouse",10.5,10),
("Teclado",13,30);
insert into compras values
("1111111-1","Mouse",2,curdate()),
("1242355-1","Pen Drive",1,curdate()),
("2141441-1","Teclado",2,curdate());

--Testando erros
insert into compras values
("","Mouse",1,curdate());
insert into compras values
("1111111-1",null,1,curdate());
