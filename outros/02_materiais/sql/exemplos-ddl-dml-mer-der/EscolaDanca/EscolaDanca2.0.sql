drop database Escola_Danca;
create database Escola_Danca;
use Escola_Danca;

create table Professores(
	idProf integer primary key auto_increment,
	nomeProf varchar(30) not null,
	telProf varchar(15) not null,
	formacao varchar(20) not null
);

create table telefones(
	idProf integer not null,
	telefone varchar(15),
	constraint fkProf foreign key (idProf) references Professores(idProf)
	);
	
create table Turmas(
	codTurma varchar(4) primary key,
	idProf integer not null,
	horario varchar(10) not null,
	tipo varchar(10) not null,
	constraint fkprofs foreign key (idProf) references Professores(idProf)
);
	
create table Disciplinas(
	idDisc integer primary key auto_increment,
	codTurma varchar(4) not null,
	nomeDisc varchar(30) not null,
	constraint fkTurma foreign key (codTurma) references Turmas(codTurma)
);

create table Alunos(
	ra varchar(4) primary key,
	codTurma varchar(4) not null,
	nome varchar(30) not null,
	sexo varchar(10) not null,
	dNascimento date not null,
	constraint fkTurmas foreign key (codTurma) references Turmas(codturma)
);

create table Horarios(
	idHorario integer primary key auto_increment,
	idDisc integer not null,
	inicio time not null,
	fim time not null,
	constraint fkDisc foreign key (idDisc) references Disciplinas(idDisc)
);
show tables;
show databases;

describe professores;
alter table professores drop telProf;

insert into professores values
(default,"Wellington","Pé de valsa"),
(default,"Reenye","Bailarino");
select * from professores;

insert into telefones values
(1,"6070707070"),
(1,"6070707071"),
(2,"6070707777");

select * from professores;
select * from telefones;
select * from professores p join telefones t on p.idprof = t.idprof;

select * from professores p join telefones t on p.idprof = t.idprof;
insert into turmas values
("3id1",2,"Tarde","3 idade"),
("cri1",1,"Manhã","Crianças"),
("jov1",2,"Noite","Jovens");
select * from turmas;
select p.nomeProf, t.tipo from professores p join turmas t on p.idprof = t.idprof;
describe disciplinas;
insert into disciplinas values
(default,"3id1","tango"),
(default,"3id1","forró"),
(default,"cri1","ballet"),
(default,"cri1","hip hop"),
(default,"jov1","jazz");
select * from disciplinas;

insert into alunos values
("dc01","3id1","Raul","Masculino","1997-06-17"),
("dc02","3id1","Paiva","Masculino","2002-04-10"),
("dc03","3id1","Correa","Masculino","2001-04-26"),
("dc04","cri1","Bruninho","Masculino","2002-09-05"),
("dc05","cri1","Marcello","Masculino","1999-07-01"),
("dc06","cri1","Gabrielli","Feminino","1999-08-16"),
("dc07","jov1","Tamara","Feminino","2000-02-24"),
("dc08","jov1","Pietra","Feminino","2002-09-19"),
("dc09","jov1","Thais","Feminino","2001-11-20");
select * from alunos;

select * from disciplinas;
insert into horarios values
(null, 1,"13:00","14:00"),
(null, 1,"18:00","19:00"),
(null, 2,"14:00","15:00"),
(null, 2,"19:00","20:00"),
(null, 3,"7:00","8:00"),
(null, 4,"8:00","9:00"),
(null, 5,"20:00","21:00");
select * from  horarios;
select t.tipo, a.nome from turmas t inner join alunos a on t.codTurma like a.codTurma;

create view vw_turmas as
select t.tipo, a.ra, a.nome, a.sexo, a.dNascimento from turmas t inner join alunos a on t.codTurma = a.codTurma;

