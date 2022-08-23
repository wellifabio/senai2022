create database notas;
use notas;
create table alunos(
	ra integer primary key auto_increment,
	nome varchar(40) not null,
	endereco varchar(40) not null,
	telefone varchar(15)
	);
	
create table notas(
	disciplina varchar(20) not null,
	avaliacao varchar(15) not null,
	nota integer not null,
	ra integer not null
	);

alter table notas add
	constraint fk_tem foreign key (ra) references alunos(ra)
	on delete cascade
	on update cascade;

insert into alunos values
(default, "Ermínio", "Rua do sal", ""),
(default, "Lucinda", "Rua do ovo", "(19)3453-5355"),
(default, "Astolfo", "Rua do uva", "");
