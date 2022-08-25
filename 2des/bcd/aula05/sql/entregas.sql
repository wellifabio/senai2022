drop database if exists entregas;
create database entregas charset=UTF8 collate utf8_general_ci;
use entregas;

create table clientes(
    id_cliente integer not null primary key auto_increment,
    cpf varchar(11) not null,
    nome varchar(50) not null,
    cep varchar(8) not null,
    numero varchar(6) not null,
    complemento varchar(20)
);

create table telefones(
    id_cliente integer not null,
    numero varchar(15) not null,
    foreign key (id_cliente) references clientes(id_cliente)
);

create table entregadores(
    id_entregador integer not null primary key auto_increment,
    nome varchar(50) not null,
    veiculo varchar(20) not null
);

create table produtos(
    id_produto integer not null primary key auto_increment,
    nome varchar(50) not null,
    preco_unitario float(8,2) not null
);

create table pedidos(
    id_cliente integer not null,
    id_pedido integer not null primary key auto_increment,
    id_intregador integer not null,
    data date not null,
    hora_pedido time,
    hora_entrega time,
    hora_fim time,
    foreign key (id_cliente) references clientes(id_cliente),
    foreign key (id_intregador) references entregadores(id_entregador)
);

create table itens(
    id_pedido integer not null,
    quantidade integer not null,
    id_produto integer not null,
    foreign key (id_pedido) references pedidos(id_pedido),
    foreign key (id_produto) references produtos(id_produto)
);

describe clientes;
describe telefones;
describe entregadores;
describe produtos;
describe pedidos;
describe itens;

show tables;

-- DML Importação dos dados com LOAD DATA de arquivos CSV

LOAD DATA INFILE 'D:/wellington/senai2022/2des/bcd/aula05/csv/entregas/clientes.csv'
INTO TABLE clientes
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'D:/wellington/senai2022/2des/bcd/aula05/csv/entregas/telefones.csv'
INTO TABLE telefones
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'D:/wellington/senai2022/2des/bcd/aula05/csv/entregas/produtos.csv'
INTO TABLE produtos
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'D:/wellington/senai2022/2des/bcd/aula05/csv/entregas/entregadores.csv'
INTO TABLE entregadores
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'D:/wellington/senai2022/2des/bcd/aula05/csv/entregas/pedidos.csv'
INTO TABLE pedidos
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from clientes;
select * from telefones;
select * from entregadores;
select * from produtos;
select * from pedidos;
select * from itens;

-- DQL Junção de tabelas
select * from clientes join telefones on clientes.id_cliente = telefones.id_cliente;
select * from clientes c join telefones t on c.id_cliente = t.id_cliente;

select * from clientes c
join telefones t
on c.id_cliente = t.id_cliente;

-- JOIN = INNER, LEFT, RIGHT

insert into clientes values (null,"11122233311","Marcelo","13458777","1A","Fundos");
-- Exemplo de inner
select * from clientes c
inner join telefones t
on c.id_cliente = t.id_cliente;
-- Exemplo de Left
select * from clientes c
left join telefones t
on c.id_cliente = t.id_cliente;
-- Exemplo de Right
select * from telefones t
right join clientes c
on c.id_cliente = t.id_cliente;

-- Salvando a Consulta
create view vw_clientes as
select c.id_cliente, c.cpf, c.nome, c.cep, c.numero, c.complemento, t.numero as telefone from clientes c
inner join telefones t
on c.id_cliente = t.id_cliente;

select * from vw_clientes;