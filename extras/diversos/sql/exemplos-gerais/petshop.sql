create database petshop;
use petshop;
create table animais(
	cod integer primary key auto_increment,
	nome varchar(20) not null,
	especie varchar(30) not null,
	raca varchar(30) not null,
	data_cadastro Date not null,
	data_nascimento Date,
	obs varchar(100)
	);
describe animais;

insert into animais values
(default, "MIMI", "GATO", "ANGORÁ", curdate(), "2019/01/15", null),
(default, "RAFAEL", "GATO", "VIRA-LATAS", curdate(), "2016/03/13", ""),
(default, "TICO", "GATO", "VIRA-LATAS", curdate(), "1950/05/20", "RAIVOSO"),
(default, "TOTO", "CACHORRO", "VIRA-LATAS", curdate(), "2015/01/10", ""),
(default, "PAÇOCA", "CACHORRO", "PASTOR ALEMÃO", curdate(), "2010/05/11", "VALENTE"),
(default, "LUZIA", "PÁSSARO", "CALOPSITA", curdate(), "1999/08/20", "ELA FALA");
select * from animais;

insert into animais values
(default, "TECO", "CACHORRO", "PINSHER", curdate(), "2019/01/15", "50% TREME");



