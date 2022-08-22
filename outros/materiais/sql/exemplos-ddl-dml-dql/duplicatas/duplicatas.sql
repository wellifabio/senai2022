create database duplicatas;

create table clientes(
	cod_cli integer primary key auto_increment,
	nome varchar(40) not null,
	endereco varchar(40) not null,
	bairro varchar(30) not null,
	cidade varchar(30) not null,
	uf varchar(2) not null
);

create table telefones(
	cod_cli integer not null,
	telefone varchar(15),
	celular varchar(15)
);

alter table telefones add
constraint fk_tel_cli foreign key (cod_cli) references clientes(cod_cli)
on delete cascade;

create table duplicatas(
	num_dupli integer primary key auto_increment,
	cod_cli integer not null,
	data_compra date not null,
	vencimento date not null,
	pagamento date,
	valor decimal(5,2) not null,
	diferenca decimal(5,2),
	v_final decimal(5,2)
);

alter table duplicatas add
constraint fk_dupli_cli foreign key (cod_cli) references clientes(cod_cli);

insert into clientes values(null,'Janaína Costa','Rua do Mel, 25','Zambom','Jaguariúna','SP');
insert into clientes values(null,'Jurema Andrade','Rua do Açúcar, 45','Centro','Jaguariúna','SP');
insert into clientes values(null,'Márcio Garcia','Rua do Milho, 45','Santa Cruz','Jaguariúna','SP');
insert into clientes values(null,'Estevão Marques','Rua dos Amores Perdidos, 21','Vargeão','Jaguariúna','SP');
insert into clientes values(null,'Mariana Silva','Rua do Sentido da Vida, 42','Zambom','Jaguariúna','SP');
insert into clientes values(null,'João Silva','Rua da sorte, 13','Centro','Jaguariúna','SP');
insert into clientes values(null,'José Aldo','Rua das Azaléias, 25','Santa Cruz','Jaguariúna','SP');

insert into telefones values(1,'(19)98798-7987','(19)98798-7987');
insert into telefones values(2,'(19)98798-8798','(19)98798-8798');
insert into telefones values(3,'(19)95465-7459','(19)95465-7459');
insert into telefones values(3,'(19)65466-7897','(19)65466-7897');
insert into telefones values(4,'(19)98457-8779','(19)98457-8779');
insert into telefones values(5,'(19)35465-8565','(19)35465-8565');
insert into telefones values(6,'(19)54654-4654','(19)54654-4654');
insert into telefones values(6,'(19)65465-7877','(19)65465-7877');
insert into telefones values(7,'(19)35464-4565','(19)35464-4565');

insert into duplicatas values(null,2,DATE_SUB(curdate(),INTERVAL 30 DAY),curdate(),DATE_SUB(curdate(),INTERVAL 10 DAY),200,-20,180);
insert into duplicatas values(null,2,DATE_SUB(curdate(),INTERVAL 30 DAY),DATE_ADD(curdate(),INTERVAL 30 DAY),null,200,null,null);
insert into duplicatas values(null,2,DATE_SUB(curdate(),INTERVAL 30 DAY),DATE_ADD(curdate(),INTERVAL 60 DAY),null,200,null,null);
insert into duplicatas values(null,1,DATE_SUB(curdate(),INTERVAL 60 DAY),DATE_SUB(curdate(),INTERVAL 30 DAY),DATE_SUB(curdate(),INTERVAL 30 DAY),150,0,150);
insert into duplicatas values(null,1,DATE_SUB(curdate(),INTERVAL 60 DAY),curdate(),curdate(),150,0,150);
insert into duplicatas values(null,2,DATE_SUB(curdate(),INTERVAL 120 DAY),DATE_SUB(curdate(),INTERVAL 90 DAY),DATE_SUB(curdate(),INTERVAL 90 DAY),120,0,120);
insert into duplicatas values(null,2,DATE_SUB(curdate(),INTERVAL 120 DAY),DATE_SUB(curdate(),INTERVAL 60 DAY),DATE_SUB(curdate(),INTERVAL 60 DAY),120,0,120);
insert into duplicatas values(null,2,DATE_SUB(curdate(),INTERVAL 120 DAY),DATE_SUB(curdate(),INTERVAL 30 DAY),DATE_SUB(curdate(),INTERVAL 30 DAY),120,0,120);
insert into duplicatas values(null,2,DATE_SUB(curdate(),INTERVAL 120 DAY),curdate(),curdate(),120,0,120);
insert into duplicatas values(null,3,curdate(),DATE_ADD(curdate(),INTERVAL 30 DAY),null,200,null,null);
insert into duplicatas values(null,3,curdate(),DATE_ADD(curdate(),INTERVAL 60 DAY),null,200,null,null);
insert into duplicatas values(null,3,curdate(),DATE_ADD(curdate(),INTERVAL 90 DAY),null,200,null,null);
insert into duplicatas values(null,4,curdate(),DATE_ADD(curdate(),INTERVAL 30 DAY),null,150,null,null);
insert into duplicatas values(null,4,curdate(),DATE_ADD(curdate(),INTERVAL 60 DAY),null,150,null,null);
insert into duplicatas values(null,4,curdate(),DATE_ADD(curdate(),INTERVAL 90 DAY),null,150,null,null);
insert into duplicatas values(null,5,curdate(),DATE_ADD(curdate(),INTERVAL 30 DAY),null,125,null,null);
insert into duplicatas values(null,5,curdate(),DATE_ADD(curdate(),INTERVAL 60 DAY),null,125,null,null);
insert into duplicatas values(null,5,curdate(),DATE_ADD(curdate(),INTERVAL 90 DAY),null,125,null,null);
insert into duplicatas values(null,6,curdate(),DATE_ADD(curdate(),INTERVAL 30 DAY),null,180,null,null);
insert into duplicatas values(null,6,curdate(),DATE_ADD(curdate(),INTERVAL 60 DAY),null,180,null,null);
insert into duplicatas values(null,6,curdate(),DATE_ADD(curdate(),INTERVAL 90 DAY),null,180,null,null);
insert into duplicatas values(null,7,curdate(),DATE_ADD(curdate(),INTERVAL 30 DAY),null,500,null,null);
insert into duplicatas values(null,7,curdate(),DATE_ADD(curdate(),INTERVAL 60 DAY),null,500,null,null);
insert into duplicatas values(null,7,curdate(),DATE_ADD(curdate(),INTERVAL 90 DAY),null,500,null,null);

-- Junta duas tabelas grosseiramente "Errada"
SELECT C.NOME, T.TELEFONE, T.CELULAR
FROM CLIENTES C, TELEFONES T
ORDER BY C.NOME;
-- Junta duas tabelas grosseiramente "Certa"
SELECT C.NOME, T.TELEFONE, T.CELULAR
FROM CLIENTES C, TELEFONES T
WHERE C.COD_CLI = T.COD_CLI
ORDER BY C.NOME;
-- Junta duas tabelas sutilmente "Certa"
SELECT C.NOME, T.TELEFONE, T.CELULAR
FROM CLIENTES C INNER JOIN TELEFONES T
ON C.COD_CLI = T.COD_CLI
ORDER BY C.NOME;

SELECT C.NOME, D.NUM_DUPLI, D.DATA_COMPRA, D.VENCIMENTO, D.VALOR
FROM CLIENTES C INNER JOIN DUPLICATAS D
ON C.COD_CLI = D.COD_CLI
ORDER BY D.NUM_DUPLI;

