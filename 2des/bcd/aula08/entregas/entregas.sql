drop database if exists entregas;
create database entregas charset=UTF8 collate utf8_general_ci;
use entregas;

-- SQL - DDL Criação da estrutura do banco de dados
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
	id_pedido integer not null primary key auto_increment,
    id_cliente integer not null,
    id_entregador integer not null,
    data date not null,
    hora_pedido time,
    hora_entrega time,
    hora_fim time,
    foreign key (id_cliente) references clientes(id_cliente),
    foreign key (id_entregador) references entregadores(id_entregador)
);

create table itens(
    id_pedido integer not null,
    quantidade integer not null,
    id_produto integer not null,
    foreign key (id_pedido) references pedidos(id_pedido),
    foreign key (id_produto) references produtos(id_produto)
);

-- SQL - DML Inserção de dados nas tabelas
insert into clientes values
(null,'101.346.425-70','Quevin Bispo','13919-404','940',null),
(null,'484.876.090-90','Sara de Souza Alves','13919-405','604',null),
(null,'549.915.231-41','Evandro Silva','13919-406','289',null),
(null,'870.478.717-05','Zélia Neto','13919-407','233',null),
(null,'659.924.344-45','Tatiane Oliveira Teixeira','13919-408','488',null),
(null,'455.745.981-16','Gilberto Martim','13919-409','776','fundos'),
(null,'219.826.395-55','Ivo Souza','13919-410','413',null),
(null,'484.584.060-04','Tatiane Silva Souza','13919-411','47',null),
(null,'714.626.501-39','Umberto Oliveira Neto','13919-412','249','AP14 BL24'),
(null,'936.097.170-76','Gisele Matos','13919-413','231',null),
(null,'829.070.043-10','Douglas de Oliveira Oliveira','13919-414','444',null),
(null,'448.299.120-14','Timóteo Bispo','13919-415','77',null),
(null,'164.684.026-70','Hugo Bispo','13919-404','227',null),
(null,'485.230.922-18','Carla Bispo Júnior','13919-405','375',null),
(null,'390.046.454-54','Helena Matos','13919-406','421','AP14 BL26'),
(null,'868.308.397-77','Willian Oliveira Neto','13919-407','336',null),
(null,'629.872.318-81','Xeila Bispo','13919-408','210',null),
(null,'715.425.766-01','Flávia Alves','13919-409','30',null),
(null,'199.535.473-27','Paula Custódio Mattos','13919-410','886','fundos'),
(null,'247.129.753-69','Hugo Martins','13919-411','603',null),
(null,'502.923.709-70','Valéria Martins Custódio','13919-412','753',null),
(null,'174.437.799-50','Evandro Oliveira','13919-413','536','AP44 BL10'),
(null,'838.879.271-76','Antônio Custódio','13919-414','769',null),
(null,'636.671.293-00','Carla Silva','13919-415','663',null),
(null,'894.979.642-26','Luis Filho Teixeira','13919-412','400',null),
(null,'148.904.171-09','Eva Silva','13919-413','542',null),
(null,'500.698.790-10','Xailo Souza de Souza','13919-414','140',null),
(null,'599.764.172-41','Norberto Teixeira','13919-415','103',null),
(null,'282.794.051-51','Bruna Oliveira Neto','13919-404','93',null);

insert into telefones values
(1,'19-04200-6656'),
(1,'19-26629-1637'),
(2,'19-25657-6328'),
(3,'19-58283-5280'),
(4,'19-97210-3688'),
(5,'19-76473-3009'),
(5,'19-32887-0288'),
(6,'19-21656-6673'),
(7,'19-40818-5626'),
(8,'19-23800-1397'),
(9,'19-70369-6223'),
(10,'19-59529-5611'),
(11,'19-08540-4259'),
(11,'19-43807-6196'),
(12,'19-91227-8846'),
(13,'19-84570-8790'),
(14,'19-06113-3302'),
(15,'19-05900-9624'),
(16,'19-65329-2409'),
(17,'19-27994-3411'),
(18,'19-81435-9997'),
(19,'19-68006-4771'),
(20,'19-47152-0661'),
(21,'19-23779-0730'),
(22,'19-85287-3890'),
(23,'19-26713-0996'),
(24,'19-16502-2743'),
(25,'19-82890-0575'),
(26,'19-75170-5820'),
(27,'19-19524-0713'),
(28,'19-65072-7747'),
(29,'19-65099-7930');

insert into entregadores values
(null,'Jair Souza','moto'),
(null,'Felizberto Souza','bicicleta'),
(null,'Huberto Silva','moto'),
(null,'Dagoberto Ribeiro','moto');

insert into produtos values
(null,'Refrigerante - 2L',12),
(null,'Refrigerante - Lata',6),
(null,'X-Bacon',18),
(null,'X-Burguer',15),
(null,'X-Egg',17),
(null,'X-Frango',20),
(null,'X-Tudo',22);

insert into pedidos values
(null,21,3,date_sub(curdate(),interval 1 day),'13:12:00','13:33:36','14:03:50'),
(null,25,1,date_sub(curdate(),interval 1 day),'13:12:00','13:46:34','14:18:14'),
(null,19,3,date_sub(curdate(),interval 1 day),'13:55:12','14:12:29','14:54:14'),
(null,12,3,date_sub(curdate(),interval 1 day),'14:09:36','15:01:26','15:54:43'),
(null,10,3,date_sub(curdate(),interval 1 day),'14:52:48','15:21:36','15:40:19'),
(null,7,2,date_sub(curdate(),interval 1 day),'15:07:12','16:03:22','16:52:19'),
(null,28,2,date_sub(curdate(),interval 1 day),'15:07:12','15:41:46','16:13:26'),
(null,2,4,date_sub(curdate(),interval 1 day),'15:50:24','16:43:41','17:16:48'),
(null,20,1,date_sub(curdate(),interval 1 day),'15:50:24','16:32:10','17:02:24'),
(null,3,2,date_sub(curdate(),interval 1 day),'16:19:12','16:52:19','17:28:19'),
(null,18,1,date_sub(curdate(),interval 1 day),'16:48:00','17:34:05','17:57:07'),
(null,29,2,date_sub(curdate(),interval 1 day),'16:48:00','17:38:24','18:11:31'),
(null,6,1,date_sub(curdate(),interval 1 day),'17:16:48','17:55:41','18:40:19'),
(null,22,3,date_sub(curdate(),interval 1 day),'17:45:36','18:04:19','18:48:58'),
(null,4,4,date_sub(curdate(),interval 1 day),'18:00:00','18:14:24','19:06:14'),
(null,24,1,date_sub(curdate(),interval 1 day),'18:14:24','19:06:14','19:43:41'),
(null,23,2,date_sub(curdate(),interval 1 day),'18:43:12','19:23:31','19:49:26'),
(null,26,4,date_sub(curdate(),interval 1 day),'18:57:36','19:53:46','20:25:26'),
(null,5,2,date_sub(curdate(),interval 1 day),'20:38:24','20:55:41','21:40:19'),
(null,9,1,date_sub(curdate(),interval 1 day),'20:38:24','20:52:48','21:14:24'),
(null,27,4,date_sub(curdate(),interval 1 day),'20:38:24','21:34:34','21:54:43'),
(null,1,1,date_sub(curdate(),interval 1 day),'20:52:48','21:17:17','21:44:38'),
(null,16,1,date_sub(curdate(),interval 1 day),'21:07:12','21:47:31','22:13:26'),
(null,15,1,date_sub(curdate(),interval 1 day),'21:36:00','22:29:17','23:11:02'),
(null,13,1,date_sub(curdate(),interval 1 day),'21:50:24','22:33:36','22:59:31'),
(null,17,3,date_sub(curdate(),interval 1 day),'23:02:24','23:19:41','00:10:05'),
(null,14,1,date_sub(curdate(),interval 1 day),'23:31:12','00:28:48','01:24:58'),
(null,8,3,date_sub(curdate(),interval 1 day),'23:45:36','00:38:53','00:53:17'),
(null,11,1,date_sub(curdate(),interval 1 day),'23:45:36','00:00:00','00:31:41'),
(null,10,3,curdate(),'08:00','08:29','09:18'),
(null,11,1,curdate(),'08:05','08:30','09:12'),
(null,12,3,curdate(),'08:08','08:35',null),
(null,13,1,curdate(),'08:12','08:33',null),
(null,14,1,curdate(),'08:20',null,null),
(null,15,1,curdate(),'08:25',null,null);

insert into itens values
(1,2,4),
(2,1,5),
(3,3,1),
(4,3,6),
(5,3,1),
(6,1,1),
(7,1,6),
(8,3,7),
(9,2,3),
(10,2,5),
(11,3,7),
(12,2,3),
(13,1,2),
(14,3,5),
(15,1,2),
(16,3,4),
(17,2,5),
(18,1,6),
(19,2,2),
(20,2,2),
(21,1,1),
(22,3,5),
(23,3,1),
(24,2,6),
(25,3,4),
(26,3,3),
(27,1,2),
(28,2,1),
(29,2,3),
(30,2,6),
(31,3,4),
(31,3,3),
(31,1,2),
(32,2,1),
(32,2,3),
(33,3,7),
(34,2,3),
(34,1,2),
(35,3,5);

-- SQL - DQL Consultas
select * from clientes;
select * from telefones;
select * from entregadores;
select * from pedidos;
select * from itens;

create view vw_clientes as
select c.id_cliente, c.cpf, c.nome, c.cep, c.numero, c.complemento, t.numero as telefone
from clientes c inner join telefones t on c.id_cliente = t.id_cliente;

select * from vw_clientes;

create view vw_pedidos_itens as
select p.id_pedido, p.id_cliente, p.id_entregador, p.data, p.hora_pedido, p.hora_entrega, p.hora_fim, i.quantidade, i.id_produto
from pedidos p inner join itens i on p.id_pedido = i.id_pedido;

select * from vw_pedidos_itens;

create view vw_pedidos_full as
select p.id_pedido as Ped, p.id_cliente as Cli, c.nome as Cliente, p.id_entregador as Entr, e.nome as entregador,
p.data, p.hora_pedido as Hora, p.hora_entrega as Entrega, p.hora_fim as Fim,
i.quantidade as qtd, i.id_produto as PrId, pr.nome as Prod, pr.preco_unitario as Preco, pr.preco_unitario * i.quantidade as Subtotal
from pedidos p inner join itens i on p.id_pedido = i.id_pedido
inner join clientes c on c.id_cliente = p.id_cliente
inner join entregadores e on e.id_entregador = p.id_entregador
inner join produtos pr on i.id_produto = pr.id_produto
order by p.id_pedido;

select * from vw_pedidos_full;

-- Possibilidades de Programação neste Banco de Dados
-- Criar uma função que retorne o valor total do pedido
-- Criar uma função que retorne o status do pedido "Aberto", "Entrega", "Finalizado"
-- Criar um procedimento que receba o id_cliente, id_entregador, id_produto a trensação de pedido complete quando apenas um produto é pedido

-- Possibilidade de análise de dados
-- Qual o tempo médio de um pedido finalizado?
-- Qual o tempo médio de entregas?
-- Qual o entregador mais eficiente? (Será que não é necessário mais dados, como distância?)
-- Qual o produto mais pedido?

