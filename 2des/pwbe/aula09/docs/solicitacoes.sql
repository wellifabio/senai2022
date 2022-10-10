drop database if exists solicitacoes;
create database solicitacoes charset=utf8 collate utf8_general_ci;
use solicitacoes;
-- SQL - DDL
Create table Funcionarios(
	Cod_Func numeric(4) not null,   
	Nome_Func varchar(50) not null,
	Sexo char(1) not null,            
	Cidade varchar(30),
	Estado varchar(2),
	constraint pk_func_1 primary key(Cod_Func)
);

Create table Departamentos(
	Cod_Depto numeric(4) not null,
	Nome_Depto varchar(50) not null,
	constraint pk_dep_1 primary key(Cod_Depto)
); 

Create table Produtos(
	Cod_Produto numeric(4) not null,  
	Nome_produto varchar(50) not null,
	constraint pk_prod_1 primary key(Cod_Produto)
);

Create table Solicitacoes(
	Num_Sol numeric(4) not null,     
	Data_sol date null,
	Cod_Depto numeric(4) not null,           
	Cod_Func  numeric(4) not null,
	constraint pk_sol_1 primary key(Num_Sol),
	constraint fk_sol_dep_1 Foreign Key(Cod_Depto) references Departamentos(Cod_Depto),
	constraint fk_sol_fun_1 Foreign Key(Cod_Func) references Funcionarios(Cod_Func)
);

Create table Itens_Solicitacao(
	Num_Sol numeric(4) not null,
	Cod_Produto numeric(4) not null,
	Qtde numeric(4) not null,
	Valor numeric(12,2) not null,
	constraint pk_itens_sol primary key(Num_Sol, cod_produto),
	constraint fk_itens_sol_1 foreign Key(Num_Sol) references Solicitacoes(Num_Sol),
	constraint fk_itens_prod_1 Foreign Key(Cod_Produto) references Produtos(Cod_Produto)
);

-- OBS Na tabela Itens_Solicitacao a chave primária é uma chave "COMPOSTA" por (Num_Sol, cod_produto)

-- SQL - DML
insert into Departamentos values
(1000,"Vendas"),
(2000,"Compras"),
(2001,"Recursos Humanos");
insert into Funcionarios values
(100,"Jose Pedro","M","Sumare","SP"),
(150,"Ana Pereira","F","Nova Odessa","SP"),
(200,"Maria da Silva","F","Londrina","PR"),
(300,"Joao Antonio","M","Campinas","SP");
insert into Produtos values
(125,"Parafuso"),
(135,"Arruela"),
(145,"Difusor"),
(155,"Paralama");
insert into Solicitacoes values
(1000,"2018/12/01",1000,100),
(1001,"2018/03/13",2001,200),
(1005,"2018/02/10",2001,150),
(1010,"2019/02/22",2000,100),
(1020,"2019/03/23",1000,200),
(1040,"2019/03/24",2001,300);
insert into Itens_Solicitacao values
(1000,125,2,4.36),
(1000,145,1,85),
(1001,135,3,2.12),
(1001,155,2,522),
(1010,145,2,170),
(1010,135,2,1.06),
(1020,125,1,2.18),
(1020,145,2,170),
(1040,155,3,783),
(1005,125,1,50),
(1005,145,3,54.5);
-- Coluna Valor representa o valor total do item (Não é necessário multiplicar pela quantidade)

-- SQL - DQL
select * from Departamentos;
select * from Funcionarios;
select * from Produtos;
select * from Solicitacoes;
select * from Itens_Solicitacao;
select max(valor) from Itens_Solicitacao;
Select Year(curdate()) as ano;
Select month(curdate()) as mes;
show tables;

-- Crie uma view(visão) que mostre os seguintes campos: 
-- Num_Sol, Data_sol, Cod_Depto, Nome_Depto , Cod_Func, Nome_Func, Cod_Produto, Nome_produto, Qtde, valor e ordene por num_sol decrescente;
create view vw_solicitacoes as
select s.Num_Sol, s.Data_sol , s.Cod_Depto, d.Nome_Depto,
s.Cod_Func, f.Nome_Func, i.Cod_Produto, p.Nome_produto,
i.Qtde, i.valor from solicitacoes s
inner join departamentos d on s.Cod_Depto = d.Cod_Depto
inner join funcionarios f on s.Cod_Func = f.Cod_Func
inner join itens_solicitacao i on s.Num_Sol = i.Num_Sol
inner join produtos p on i.Cod_Produto = p.Cod_Produto
order by num_sol desc;

-- Crie um procedimento armazenado chamado solicita_um_item(n_sol,depto,func,prod,qtd,total)
-- que receba estes valores e cadastre uma solicitação e um item na data atual.
drop procedure if exists solicita_um_item;
delimiter //
create procedure solicita_um_item(n_sol int,depto int,func int,prod int,qtd int,total float)
BEGIN
	declare erro_sql tinyint default false;
	declare continue handler for sqlexception set erro_sql = true;
	insert into Solicitacoes values (n_sol,curdate(),depto,func);
	insert into Itens_Solicitacao values (n_sol,prod,qtd,total);
	IF erro_sql = false THEN
		select * from vw_solicitacoes where Num_Sol = n_sol;
		select 'Solicitação cadastrada com sucesso' as 'Sucesso';
	ELSE
		select 'Erro ao inserir solicitação' as 'Erro';
	END IF;
end //
delimiter ;

call solicita_um_item(1055,1000,100,125,1,10);
