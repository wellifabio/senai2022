-- ***************************
-- * Standard SQL generation *
-- ***************************


-- Database Section
-- ________________

create database Matriculas;


-- TableSpace Section
-- __________________

-- Table Section
-- _____________

create table ALUNO (
	cpf_aluno varchar(14) not null,
	nom_pnome varchar(30) not null,
	nom_sobrenome varchar(50) not null,
	nascimento_aluno date not null,
	primary key (cpf_aluno));

create table Matricula_se (
	registro_matricula numeric(1) not null,
	data_matricula date not null,
	cod_turma varchar(5) not null,
	cpf_aluno varchar(14) not null,
	primary key (registro_matricula));

create table TURMA (
	cod_turma varchar(5) not null,
	nome_curso varchar(35) not null,
	tipo_curso char(1) not null,
	primary key (cod_turma));


-- Constraints Section
-- ___________________

alter table Matricula_se add constraint FKMat_TUR
	foreign key (cod_turma)
	references TURMA;

alter table TURMA add constraint 
	check(exist(select * from Matricula_se
	            where Matricula_se.cod_turma = cod_turma));

alter table Matricula_se add constraint FKMat_ALU
	foreign key (cpf_aluno)
	references ALUNO;

alter table ALUNO add constraint 
	check(exist(select * from Matricula_se
	            where Matricula_se.cpf_aluno = cpf_aluno));


-- Index Section
-- _____________

create unique index ID_ALUNO
	on ALUNO(cpf_aluno);

create unique index ID_Matricula_se
	on Matricula_se(registro_matricula);

create index FKMat_TUR
	on Matricula_se (cod_turma);

create index FKMat_ALU
	on Matricula_se (cpf_aluno);

create unique index ID_TURMA
	on TURMA(cod_turma);

