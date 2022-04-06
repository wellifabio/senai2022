drop database EscolaDanca;
create database EscolaDanca;
use EscolaDanca;

create table Professores(
	idProf integer primary key auto_increment,
	nomeProf varchar(40) not null,
	telProf varchar(15) not null,
	formacao varchar(30) not null
);
	
create table Disciplinas(
	idDisc integer primary key auto_increment,
	nomeDisc varchar(30) not null
);

create table Alunos(
	ra integer primary key auto_increment,
	nome varchar(40) not null,
	sexo char(1) not null,
	dNascimento date not null
);

create table Turmas(
	codTurma integer primary key auto_increment,
	tipo varchar(20) not null,
	horario varchar(15) not null
);
	
create table Horarios(
	idHorario integer primary key auto_increment,
	inicio time not null,
	fim time not null
);

insert into Alunos(nome, sexo,dNascimento) values ("Adelcio Biazi","m","2000/04/06");
insert into Alunos(nome, sexo,dNascimento) values ("Adriano da Silva Ferreira","m","2000/05/07");
insert into Alunos(nome, sexo,dNascimento) values ("Alisson Linhares de Carvalho","m","2000/06/13");
insert into Alunos(nome, sexo,dNascimento) values ("Amanda Cristina davi Resende","f","2000/07/14");
insert into Alunos(nome, sexo,dNascimento) values ("Ana Cláudia de Moura Laurentino","f","2000/08/15");
insert into Alunos(nome, sexo,dNascimento) values ("Ana Claudia Maciel","f","2000/09/16");
insert into Alunos(nome, sexo,dNascimento) values ("Argemiro Pentian Junior","m","2000/10/17");
insert into Alunos(nome, sexo,dNascimento) values ("Bento Rafael Siqueira","m","2000/02/18");
insert into Alunos(nome, sexo,dNascimento) values ("Bernardo Moreira Zabadal","m","2001/03/19");
insert into Alunos(nome, sexo,dNascimento) values ("Carlos Roberto de Oliveira Cazelatto Junior","m","2002/01/20");
insert into Alunos(nome, sexo,dNascimento) values ("Carlos Roberto Do Nascimento Costa","m","2000/03/21");
insert into Alunos(nome, sexo,dNascimento) values ("Cesar Augusto Pascali Rago","m","2002/12/22");
insert into Alunos(nome, sexo,dNascimento) values ("Claudemir de Souza Freitas Junior","m","2001/11/23");
insert into Alunos(nome, sexo,dNascimento) values ("Claudiane Mendes Trigueiro Silva","f","2000/10/24");
insert into Alunos(nome, sexo,dNascimento) values ("Claudiney Ramos Tinoco","m","2000/10/25");
insert into Alunos(nome, sexo,dNascimento) values ("Danilo César Pereira","m","2000/09/26");
insert into Alunos(nome, sexo,dNascimento) values ("Darvin Ames","m","2000/01/27");
insert into Alunos(nome, sexo,dNascimento) values ("Debora Barbosa Aires","f","2000/04/28");
insert into Alunos(nome, sexo,dNascimento) values ("Deivison Shindi Takatu","m","2000/05/01");
insert into Alunos(nome, sexo,dNascimento) values ("Denis Henrique Caixeta","m","2000/06/02");
insert into Alunos(nome, sexo,dNascimento) values ("Deysiane Matos Sande","f","2000/07/03");
insert into Alunos(nome, sexo,dNascimento) values ("Elaine Cecília Gatto","f","2000/09/12");
insert into Alunos(nome, sexo,dNascimento) values ("Elis Cristina Montoro Hernandes Ervolino","f","2000/04/02");
insert into Alunos(nome, sexo,dNascimento) values ("Erica Aparecida Martins Siqueira","f","2000/05/03");
insert into Alunos(nome, sexo,dNascimento) values ("Erika Arias Barrado","f","2000/06/04");
insert into Alunos(nome, sexo,dNascimento) values ("Esteic Janaina Santos Batista","f","2000/07/05");
insert into Alunos(nome, sexo,dNascimento) values ("Fernanda Zampieri Canaver","f","2000/03/17");
insert into Alunos(nome, sexo,dNascimento) values ("Flávia Zenaro Nogueira E Silva","f","2000/10/20");
insert into Alunos(nome, sexo,dNascimento) values ("Giovanna Nascimento Antonieti","f","2001/03/04");
insert into Alunos(nome, sexo,dNascimento) values ("Ingrid Marçal","f","2000/10/18");
insert into Alunos(nome, sexo,dNascimento) values ("Jeane Aparecida Menegueli","f","2000/09/11");
insert into Alunos(nome, sexo,dNascimento) values ("Josiane Rosa de Oliveira Gaia Pimenta","f","2000/10/07");
insert into Alunos(nome, sexo,dNascimento) values ("Juliana de Sousa Ribeiro","f","2000/01/13");
insert into Alunos(nome, sexo,dNascimento) values ("Liliam Sayuri Sakamoto","f","2000/04/14");
insert into Alunos(nome, sexo,dNascimento) values ("Patrícia Fernanda da Silva Freitas","f","2001/03/22");
insert into Alunos(nome, sexo,dNascimento) values ("Paula Leticia Santos Lima","f","2002/01/23");
insert into Alunos(nome, sexo,dNascimento) values ("Rafaela de Jesus Alencar","f","2002/12/25");
insert into Alunos(nome, sexo,dNascimento) values ("Sara Luzia de Melo","f","2002/01/10");
insert into Alunos(nome, sexo,dNascimento) values ("Silvia Roberta de Jesus Garcia","f","2002/12/12");
insert into Alunos(nome, sexo,dNascimento) values ("Suéllen Rodolfo Martinelli","f","2001/11/01");
insert into Alunos(nome, sexo,dNascimento) values ("Taynara Cerigueli Dutra","f","2000/10/02");
insert into Alunos(nome, sexo,dNascimento) values ("Thamires de Campos Luz","f","2000/10/03");
insert into Alunos(nome, sexo,dNascimento) values ("Viviane Mello Bonadia dos Santos","f","2000/09/04");

insert into Disciplinas(nomeDisc) values ("Ballet");
insert into Disciplinas(nomeDisc) values ("Dança de Salão Avançada");
insert into Disciplinas(nomeDisc) values ("Dança de Salão Básica");
insert into Disciplinas(nomeDisc) values ("Dança de Salão Intermediária");
insert into Disciplinas(nomeDisc) values ("Forró Avançado");
insert into Disciplinas(nomeDisc) values ("Forró Básico");
insert into Disciplinas(nomeDisc) values ("Hip Hop");
insert into Disciplinas(nomeDisc) values ("Rock and Roll Anos 60");
insert into Disciplinas(nomeDisc) values ("Salsa Avançado");
insert into Disciplinas(nomeDisc) values ("Salsa Básico");
insert into Disciplinas(nomeDisc) values ("Street Dance Avançado");
insert into Disciplinas(nomeDisc) values ("Street Dance Básico");
insert into Disciplinas(nomeDisc) values ("Street Dance Intermediário");
insert into Disciplinas(nomeDisc) values ("Tango Avançado");
insert into Disciplinas(nomeDisc) values ("Tango Básico");

insert into Horarios(inicio, fim) values("08:00","09:00");
insert into Horarios(inicio, fim) values("09:00","10:00");
insert into Horarios(inicio, fim) values("10:00","11:00");
insert into Horarios(inicio, fim) values("11:00","12:00");
insert into Horarios(inicio, fim) values("14:00","15:00");
insert into Horarios(inicio, fim) values("15:00","16:00");
insert into Horarios(inicio, fim) values("16:00","17:00");
insert into Horarios(inicio, fim) values("17:00","18:00");
insert into Horarios(inicio, fim) values("20:00","21:00");
insert into Horarios(inicio, fim) values("21:00","22:00");
insert into Horarios(inicio, fim) values("22:00","23:00");
insert into Horarios(inicio, fim) values("23:00","00:00");

insert into Professores(nomeProf, telProf, formacao) values("Adelcio Biazi","1930030376","Conservatório");
insert into Professores(nomeProf, telProf, formacao) values("Adriano da Silva Ferreira","1930031839","Dança de Salão");
insert into Professores(nomeProf, telProf, formacao) values("Adriano Elias daniel","1930027165","Dança de Rua");
insert into Professores(nomeProf, telProf, formacao) values("Alexandre Lopes Machado","1930029980","Artes Cênicas");
insert into Professores(nomeProf, telProf, formacao) values("Alexsanderson Vieira Santos","1930022692","Dança de Salão");
insert into Professores(nomeProf, telProf, formacao) values("Alisson Linhares de Carvalho","1930033086","Dança de Rua");
insert into Professores(nomeProf, telProf, formacao) values("Amanda Cristina davi Resende","1930032224","Artes Cênicas");
insert into Professores(nomeProf, telProf, formacao) values("Ana Cláudia de Moura Laurentino","1930029528","Ballet Clássico");
insert into Professores(nomeProf, telProf, formacao) values("Ana Claudia Maciel","1930025167","Conservatório");
insert into Professores(nomeProf, telProf, formacao) values("André Olievira","19993452345","Dança de Salão");
insert into Professores(nomeProf, telProf, formacao) values("Fabiana Silva","19994556355","Dança de Rua");
insert into Professores(nomeProf, telProf, formacao) values("Flávio Galvão","1934566453","Artes Cênicas");
insert into Professores(nomeProf, telProf, formacao) values("José de Oliveira","19942342355","Dança de Salão");
insert into Professores(nomeProf, telProf, formacao) values("Jurema Andrade","19984212444","Dança de Rua");
insert into Professores(nomeProf, telProf, formacao) values("Marcio Garcia","1934567832","Artes Cênicas");
insert into Professores(nomeProf, telProf, formacao) values("Mario Andrade","19932342344","Artes Cênicas");
insert into Professores(nomeProf, telProf, formacao) values("Mario Jorge Lobo","19943454553","Dança de Salão");
insert into Professores(nomeProf, telProf, formacao) values("Osmar Andrade","1923234255","Dança de Rua");
insert into Professores(nomeProf, telProf, formacao) values("Simone Braga","19839234299","Dança Popular");

insert into Turmas(tipo, horario) values("Infantil","Manhã");
insert into Turmas(tipo, horario) values("Infantil","Tarde");
insert into Turmas(tipo, horario) values("Juvenil","Manhã");
insert into Turmas(tipo, horario) values("Juvenil","Tarde");
insert into Turmas(tipo, horario) values("adulto","Noite");
insert into Turmas(tipo, horario) values("Juvenil","Noite");
insert into Turmas(tipo, horario) values("Melhor Idade","Tarde");
insert into Turmas(tipo, horario) values("Melhor Idade","Noite");
	
select * from Professores;
select * from Disciplinas;
select * from Alunos;
select * from Turmas;
select * from Horarios;
describe Professores;
describe Disciplinas;
describe Alunos;
describe Turmas;
describe Horarios;
show tables;







 


