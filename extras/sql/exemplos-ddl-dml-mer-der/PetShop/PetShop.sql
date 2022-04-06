drop database PetShop;
create database PetShop;
use PetShop;

create table Funcionarios(
	idFunc integer primary key auto_increment,
	pNome varchar(40) not null,
	sobrenome varchar(40) not null,
	cargoFunc varchar(20) not null,
	salarioFunc decimal(6,2)
	);

create table Clientes(
	idCli integer primary key auto_increment,
	pNome varchar(40) not null,
	sobrenome varchar(40) not null,
	telCli varchar(15) not null,
	endCli varchar(50) not null
	);
	
create table if not exists Produtos(
	codProd integer primary key auto_increment,
	nomeProd varchar(40) not null,
	descrProd varchar(40) not null,
	qtdeProd integer not null,
	precoProd decimal(5,2) not null
	);


insert into Funcionarios(pNome, sobrenome, cargoFunc, salarioFunc) values("Argemiro","Pentian Junior","Ajudante Geral",1350.25);
insert into Funcionarios(pNome, sobrenome, cargoFunc, salarioFunc) values("Bento Rafael","Siqueira","Veteriário",4380.00);
insert into Funcionarios(pNome, sobrenome, cargoFunc, salarioFunc) values("Bernardo","Moreira Zabadal","Veteriário",4320.00);
insert into Funcionarios(pNome, sobrenome, cargoFunc, salarioFunc) values("Carlos Roberto","de Oliveira Cazelatto Junior","Ajudante Geral",1350.25);
insert into Funcionarios(pNome, sobrenome, cargoFunc, salarioFunc) values("Diogo","Paulino da Cruz dos Santos","Balconista",1250.50);
insert into Funcionarios(pNome, sobrenome, cargoFunc, salarioFunc) values("Ednei Jose","de Almeida Junior","Balconista",1250.50);
insert into Funcionarios(pNome, sobrenome, cargoFunc, salarioFunc) values("Frances","Albert Santos","Ajudante Geral",1475.95);

insert into Clientes(pNome, sobrenome, telCli, endCli) values("André","Olievira","19993452345","Praca Umbelina Bueno, 345, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Jurema","Andrade","19984212444","Rua Candido Bueno, 347, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Mario","Andrade","19932342344","Rodovia Joao Beira - Sp 095, 349, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("José","de Oliveira","19942342355","Avenida Marginal, 351, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Marcio","Garcia","1934567832","Rua Amazonas, 353, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Flávio","Galvão","1934566453","Rua Gaspere, 355, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Mario","Jorge Lobo","19943454553","Rua Jaboticabeira, 357, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Osmar","Andrade","1923234255","Praca Emilio Marconato, 359, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Fabiana","Silva","19994556355","Rua Vicenzo Granguelli, 361, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Simone","Braga","19839234299","Praca Holambra, 363, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Adelcio","Biazi","1930030376","Rua Marchesini, 365, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Adriano","da Silva Ferreira","1930031839","Avenida Rinaldi, 367, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Adriano","Elias daniel","1930027165","Rotatoria, 369, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Alan","demetrius Baria Valejo","1930030115","Rua Um, 371, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Alan","Zanoni Peixinho","1930031286","Av. Pacifico Moneda, 373, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Alciano","Gustavo Genovez de Oliveira","1930031664","Rua Antonio Pinto Catao, 375, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Aldo","Marcelo Paim","1930025914","Rua Minas Gerais, 377, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Alex","Marino Gonçalves de Almeida","1930029833","Rua Coronel Amancio Bueno, 379, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Alexandre","Camargo Maia","1930027583","Rua Alfredo Bueno, 381, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Alexandre","Lopes Machado","1930029980","Praca Umbelina Bueno, 383, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Alexsanderson","Vieira Santos","1930022692","Rua Candido Bueno, 385, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Alisson","Linhares de Carvalho","1930033086","Rodovia Joao Beira - Sp 095, 387, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Amanda","Cristina davi Resende","1930032224","Avenida Marginal, 389, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ana","Cláudia de Moura Laurentino","1930029528","Rua Amazonas, 391, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ana","Claudia Maciel","1930025167","Rua Gaspere, 393, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Anderson","Chaves Carniel","1930025793","Rua Jaboticabeira, 395, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Anderson","da Silva Marcolino","1930022177","Praca Emilio Marconato, 397, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("André","Castro Garcia","1930023002","Rua Vicenzo Granguelli, 399, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("André","Luiz Dutra Costa","1930028742","Rua Gothardo, 401, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Andre","Luiz Latansio de Oliveira","1930022145","Praca Holambra, 403, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Andréa","Leme","1930031341","Rua Marchesini, 405, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Andréia","Botto","1930022475","Avenida Rinaldi, 407, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Antonio","Carlos de Campos","1930029559","Rotatoria, 409, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Antonio","Carlos de Marchi","1930024870","Rua Um, 411, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Antonio","Queiroz da Silva Neto","1930031629","Av. Pacifico Moneda, 413, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Argemiro","Pentian Junior","1930031739","Rua Antonio Pinto Catao, 415, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Bento","Rafael Siqueira","1930023399","Rua Minas Gerais, 417, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Bernardo","Moreira Zabadal","1930023167","Rua Coronel Amancio Bueno, 419, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Bruno","Hiromitus","1930032098","Rua Alfredo Bueno, 421, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Bruno","Luis Botamedi","1930023841","Praca Umbelina Bueno, 423, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Caio","Ferreira dos Santos","1930023831","Rua Candido Bueno, 425, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Caio","Hamamura","1930027345","Rodovia Joao Beira - Sp 095, 427, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Caio","Hoffman","1930022263","Avenida Marginal, 429, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Camila","Martins Saporetti","1930023400","Rua Amazonas, 431, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Carla","Giselle Martins Real","1930031783","Rua Gaspere, 433, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Carlos","Eduardo Câmara","1930030951","Rua Jaboticabeira, 435, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Carlos","Roberto de Oliveira Cazelatto Junior","1930030265","Praca Emilio Marconato, 437, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Carlos","Roberto Do Nascimento Costa","1930027160","Rua Vicenzo Granguelli, 439, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Cesar","Augusto Pascali Rago","1930026115","Rua Gothardo, 441, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Claudemir","de Souza Freitas Junior","1930027725","Praca Holambra, 443, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Claudiane","Mendes Trigueiro Silva","1930033179","Rua Marchesini, 445, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Claudiney","Ramos Tinoco","1930030621","Avenida Rinaldi, 447, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Claudio","de Oliveira Vilão Junior","1930025200","Rotatoria, 449, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Cleis","Meire Veiga","1930025803","Rua Um, 451, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Cleiton","Passos Cordeiro","1930025281","Av. Pacifico Moneda, 453, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Cleverson","Moreira de Souza","1930030804","Rua Antonio Pinto Catao, 455, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Cristian","Schaeffer Greve","1930033143","Rua Minas Gerais, 457, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Cristiano","Herculano da Silva","1930025254","Rua Coronel Amancio Bueno, 459, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("dalton","Rogerio Bernini Francisco","1930026504","Rua Alfredo Bueno, 461, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("danilo","César Pereira","1930024260","Praca Umbelina Bueno, 463, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("darvin","Ames","1930029910","Rua Candido Bueno, 465, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("debora","Barbosa Aires","1930030606","Rodovia Joao Beira - Sp 095, 467, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("deivison","Shindi Takatu","1930027992","Avenida Marginal, 469, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("denis","Henrique Caixeta","1930032888","Rua Amazonas, 471, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("deysiane","Matos Sande","1930033292","Rua Gaspere, 473, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Diego","Rafael Moraes","1930028115","Rua Jaboticabeira, 475, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Diogo","Matos da Silva","1930025357","Praca Emilio Marconato, 477, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Diogo","Paulino da Cruz dos Santos","1930030980","Rua Vicenzo Granguelli, 479, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Douglas","Brito damalio","1930032948","Rua Gothardo, 481, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Draylson","Micael de Souza","1930022495","Praca Holambra, 483, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Eder","Almeida Batista de Oliveira","1930032391","Rua Marchesini, 485, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ederlon","Barbosa Cruz","1930032594","Avenida Rinaldi, 487, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Edinei","Peres Legaspe","1930022114","Rotatoria, 489, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ednei","Jose de Almeida Junior","1930022353","Rua Um, 491, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Eduardo","de Paula Lima Nascimento","1930031036","Av. Pacifico Moneda, 493, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Eduardo","Henrique Spies","1930030921","Rua Antonio Pinto Catao, 495, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Elaine","Cecília Gatto","1930022156","Rua Minas Gerais, 497, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Elias","Adriano Nogueira da Silva","1930029318","Rua Coronel Amancio Bueno, 499, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Elis","Cristina Montoro Hernandes Ervolino","1930031543","Rua Alfredo Bueno, 501, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Erica","Aparecida Martins Siqueira","1930032892","Praca Umbelina Bueno, 503, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Erika","Arias Barrado","1930033374","Rua Candido Bueno, 505, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Esteic","Janaina Santos Batista","1930031385","Rodovia Joao Beira - Sp 095, 507, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Everaldo","Costa Silva Neto","1930026091","Avenida Marginal, 509, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Everaldo","Silva de Freitas","1930025087","Rua Amazonas, 511, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ewerton","José da Silva","1930028831","Rua Gaspere, 513, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Fabio","Luiz de Paula","1930030021","Rua Jaboticabeira, 515, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Fabio","Serafim","1930026076","Praca Emilio Marconato, 517, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Felipe","Gobo Bruno","1930027232","Rua Vicenzo Granguelli, 519, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Fernanda","Zampieri Canaver","1930027461","Rua Gothardo, 521, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Fernando","Claudio dos Santos Junior","1930022991","Praca Holambra, 523, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Fernando","Henrique Campos","1930029675","Rua Marchesini, 525, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Flávia","Zenaro Nogueira E Silva","1930030326","Avenida Rinaldi, 527, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Floriano","Ferreira dos Reis Filho","1930026338","Rotatoria, 529, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Frances","Albert Santos","1930022281","Rua Um, 531, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Francisco","Assis da Silva","1930027774","Av. Pacifico Moneda, 533, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Francisco","Edigleison da Silva Barbosa","1930023218","Rua Antonio Pinto Catao, 535, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Francisco","José Nardi Filho","1930023323","Rua Minas Gerais, 537, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Gabriel","Ferreira Teles Gomes","1930024962","Rua Coronel Amancio Bueno, 539, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Gabriel","Morais Silveira","1930029315","Rua Alfredo Bueno, 541, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Gabriel","Sgorlon Tininis","1930029889","Praca Umbelina Bueno, 543, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Gabriel","Spadon de Souza","1930032517","Rua Candido Bueno, 545, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Gerson","Luiz Camillo","1930032298","Rodovia Joao Beira - Sp 095, 547, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Giovani","Bertolla Sampaio","1930032091","Avenida Marginal, 549, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Giovanna","Nascimento Antonieti","1930023111","Rua Amazonas, 551, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Gracieth","Mendes Valenzuela","1930025140","Rua Gaspere, 553, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Guidson","Coelho de Andrade","1930022168","Rua Jaboticabeira, 555, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Guilherme","Corredato Guerino","1930022427","Av. Pacifico Moneda, 557, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Guilherme","Pina Cardim","1930027169","Rua Antonio Pinto Catao, 559, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Guilherme","Queiroz Vasconcelos","1930030627","Rua Minas Gerais, 561, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Guilherme","Rego Rockembach","1930033290","Rua Coronel Amancio Bueno, 563, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Gustavo","Botelho de Souza","1930025251","Rua Alfredo Bueno, 565, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Gustavo","Moreira Calixto","1930030392","Praca Umbelina Bueno, 567, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Helder","Pestana","1930030490","Rua Candido Bueno, 569, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Heleno","Murilo Campeão Vale","1930029049","Rodovia Joao Beira - Sp 095, 571, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Helivelton","Oliveira Ferreira","1930028172","Avenida Marginal, 573, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Henrique","Araujo Lima","1930029060","Rua Amazonas, 575, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Hiago","Araujo Silva","1930032618","Rua Gaspere, 577, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Higor","Antonio delsoto","1930027393","Rua Jaboticabeira, 579, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Icaro","Cavalcante Dourado","1930022834","Praca Emilio Marconato, 581, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ingrid","Marçal","1930023351","Rua Vicenzo Granguelli, 583, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Irapuan","Glória Júnior","1930026509","Rua Gothardo, 585, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Italo","Otavio Goncalves de Oliveira","1930022768","Praca Holambra, 587, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ivan","Bonora Prado","1930030641","Rua Marchesini, 589, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Jane","Piantoni","1930022756","Avenida Rinaldi, 591, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Jaqueline","Rissa Franco","1930024182","Rua Vicenzo Granguelli, 593, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Jean","Menossi","1930030796","Praca Holambra, 595, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Jean","Nunes Ribeiro Araujo","1930022424","Rua Marchesini, 597, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Jean","Roberto Ponciano","1930030615","Avenida Rinaldi, 599, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Jeane","Aparecida Menegueli","1930033176","Rotatoria, 601, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Jefferson","Barbosa Belo da Silva","1930023520","Rua Um, 603, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Jefferson","Carlos Pedroso","1930027585","Av. Pacifico Moneda, 605, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Jessé","Italo Silva","1930033196","Rua Antonio Pinto Catao, 607, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("João","Eduardo Soares E Silva","1930026622","Rua Minas Gerais, 609, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("João","Gabriel Rocha Silva","1930032868","Rua Coronel Amancio Bueno, 611, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Joice","Wolfrann","1930023385","Rua Alfredo Bueno, 613, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Jonas","Henrique Mendonça","1930022535","Praca Umbelina Bueno, 615, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Jônatas","Leite de Oliveira","1930030492","Rua Candido Bueno, 617, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Jonathan","Gilliard Richter","1930033540","Rodovia Joao Beira - Sp 095, 619, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("José","Avelino Placca","1930027031","Avenida Marginal, 621, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("José","Cássio Gimenez","1930032426","Rua Amazonas, 623, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Jose","Ceron Neto","1930031459","Rua Gaspere, 625, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("José","Eugênio de Mira","1930031892","Rua Jaboticabeira, 627, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("José","Rafael Pilan","1930027198","Praca Emilio Marconato, 629, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("José","Renato Paviotti","1930022148","Rua Vicenzo Granguelli, 631, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("José","Santiago Moreira de Mello","1930029346","Rua Gothardo, 633, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Josiane","Rosa de Oliveira Gaia Pimenta","1930025218","Praca Holambra, 635, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Juliana","de Sousa Ribeiro","1930031587","Rua Marchesini, 637, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Juliano","Jinzenji Duque","1930030016","Avenida Rinaldi, 639, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Juliano","Silva Marçal","1930029615","Rotatoria, 641, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Julio","Cesar damasceno","1930029951","Rua Um, 643, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Julio","Cesar de Lemos","1930027732","Av. Pacifico Moneda, 645, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Julio","Cesar Pedroso","1930029844","Rua Antonio Pinto Catao, 647, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Kleber","Alessandro Antoniazzi","1930030446","Rua Minas Gerais, 649, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Laura","Beatriz Alves","1930023013","Rua Coronel Amancio Bueno, 651, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Leandro","Arab Marcomini","1930026009","Rua Alfredo Bueno, 653, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Leonardo","Rocco","1930031588","Praca Umbelina Bueno, 655, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Liliam","Sayuri Sakamoto","1930027073","Rua Candido Bueno, 657, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Lucas","Hermann Negri","1930029158","Rodovia Joao Beira - Sp 095, 659, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Luciano","Rossi","1930022927","Avenida Marginal, 661, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Luciano","Rovanni Do Nascimento","1930025970","Rua Amazonas, 663, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Lucio","Rogerio Pelizer Paris","1930031980","Rua Gaspere, 665, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Luis","Paulo Fagiolo Augusto","1930031305","Rua Jaboticabeira, 667, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Luiz","Ariovaldo Fabri Junior","1930029896","Praca Emilio Marconato, 669, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Luiz","Gustavo Turatti","1930030014","Rua Vicenzo Granguelli, 671, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Marcelo","Akira Yamamoto","1930023803","Rua Gothardo, 673, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Marcelo","Brondi Mendes","1930023498","Praca Holambra, 675, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Marcelo","de Almeida Borges","1930033397","Rua Marchesini, 677, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Marcelo","Do Carmo Vieira Scomparim","1930029023","Avenida Rinaldi, 679, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Marcelo","José Vigorito Campara","1930031207","Rotatoria, 681, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Marcelo","Marchi","1930026080","Rua Um, 683, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Márcia","Maria Teresa Baptistella","1930031715","Av. Pacifico Moneda, 685, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Marcilyanne","Moreira Gois","1930023794","Rua Antonio Pinto Catao, 687, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Márcio","Jesus de Morais","1930029582","Rua Minas Gerais, 689, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Márcio","Maestrello","1930022966","Rua Coronel Amancio Bueno, 691, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Marco","Antonio Simoes Teixeira","1930025619","Praca Umbelina Bueno, 693, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Marco","Aurelio de Carvalho dantas","1930033493","Rua Candido Bueno, 695, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Marcos","Antonio Leati Pelaes","1930024675","Rodovia Joao Beira - Sp 095, 697, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Marcos","daniel Cano","1930033151","Avenida Marginal, 699, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Marcos","Henrique de Paula","1930027831","Rua Amazonas, 701, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Marcus","Vinícius Contes Calça","1930028089","Rua Gaspere, 703, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Maria","Inez Nobukuni Jorgetto","1930022824","Rua Jaboticabeira, 705, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Mariana","Massimino Feres","1930031340","Praca Emilio Marconato, 707, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Mario","Ferreira de Brito","1930025274","Rua Vicenzo Granguelli, 709, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Maurício","Falvo","1930027790","Praca Holambra, 711, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Mauricio","Fernando Lima Pereira","1930030296","Rua Marchesini, 713, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Mayara","Chiaroti Brigulato","1930025861","Avenida Rinaldi, 715, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Maylon","Pires Macedo","1930027053","Rotatoria, 717, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Michel","de Souza","1930028595","Rua Um, 719, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Michelle","Guirra Garcia","1930031704","Av. Pacifico Moneda, 721, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Murilo","Gleyson Gazzola","1930028300","Rua Antonio Pinto Catao, 723, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ovídio","José Francisco","1930029355","Rua Minas Gerais, 725, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Patrícia","Fernanda da Silva Freitas","1930026917","Rua Coronel Amancio Bueno, 727, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Paula","Leticia Santos Lima","1930023821","Rua Alfredo Bueno, 729, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Paulo","Eduardo Silva Montier","1930027324","Praca Umbelina Bueno, 731, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Pedro","Augusto Antunes Zaidan","1930033524","Rua Candido Bueno, 733, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Pedro","Henrique Dias Valle","1930025728","Rodovia Joao Beira - Sp 095, 735, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Pedro","Henrique Pereira","1930024606","Avenida Marginal, 737, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Pedro","Pablo Calarge Esquivel","1930025648","Rua Amazonas, 739, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Rafael","Ghussn Cano","1930032398","Rua Gaspere, 741, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Rafael","Gonçalves Pires","1930030117","Rua Jaboticabeira, 743, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Rafael","Martins Alves","1930026927","Praca Emilio Marconato, 745, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Rafael","Sanches Rocha","1930022359","Rua Vicenzo Granguelli, 747, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Rafael","Silva Santos","1930029138","Rua Gothardo, 749, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Rafael","Stoffalette João","1930024003","Praca Holambra, 751, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Rafael","Tomé de Souza","1930029876","Rua Marchesini, 753, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Rafaela","de Jesus Alencar","1930032556","Avenida Rinaldi, 755, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ramon","Simões Abílio","1930022120","Rotatoria, 757, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Raphael","Hungaro Moretti","1930027798","Rua Um, 759, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Raquel","Cristina Pereira Mina","1930030646","Av. Pacifico Moneda, 761, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Reginaldo","Rideaki Kamiya","1930025035","Rua Antonio Pinto Catao, 763, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Renan","Caldeira Menechelli","1930028731","Rua Minas Gerais, 765, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Renan","Galeane Alboy","1930023230","Rua Coronel Amancio Bueno, 767, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Renato","Luiz Cardoso","1930030528","Rua Alfredo Bueno, 769, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Renato","Penha","1930025580","Praca Umbelina Bueno, 771, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ricardo","Alexandre Gonçalves Carotta Martins","1930022106","Rua Candido Bueno, 773, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ricardo","Ferreira Vilela","1930025721","Rodovia Joao Beira - Sp 095, 775, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ricardo","Luis Balieiro","1930028227","Avenida Marginal, 777, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ricardo","Ribeiro Seco","1930029085","Rua Amazonas, 779, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ricardo","Zanni Mendes da Silveira","1930031157","Rua Gaspere, 781, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Roberta","Akemi Sinoara","1930028796","Rua Jaboticabeira, 783, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Rodrigo","Augusto dos Santos Paula","1930032703","Praca Emilio Marconato, 785, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Rodrigo","Bruno Kehdy","1930025470","Rua Vicenzo Granguelli, 787, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Rodrigo","Kiyoshi Saito","1930031125","Rua Gothardo, 789, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Rômulo","José Franco","1930025398","Praca Holambra, 791, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Romulo","Mateus Duarte","1930027067","Rua Marchesini, 793, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Rômulo","Rodrigues Pombal","1930032590","Avenida Rinaldi, 795, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ronaldo","Toshiaki Oikawa","1930030691","Rotatoria, 797, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ronnie","Shida Marinho","1930027720","Rua Um, 799, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Sara","Luzia de Melo","1930030076","Av. Pacifico Moneda, 801, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Sergio","Willians Poneli","1930025992","Rua Antonio Pinto Catao, 803, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Silvia","Roberta de Jesus Garcia","1930027261","Rua Minas Gerais, 805, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Suéllen","Rodolfo Martinelli","1930028718","Rua Coronel Amancio Bueno, 807, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Taynara","Cerigueli Dutra","1930032451","Rua Alfredo Bueno, 809, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Thamires","de Campos Luz","1930024362","Praca Umbelina Bueno, 811, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Thatiana","Maria Camargo Fernandes","1930032090","Rua Candido Bueno, 813, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Thiago","Fernandes Oliveira de Lima","1930023440","Rodovia Joao Beira - Sp 095, 815, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Thiago","Gabriel de Melo","1930031532","Avenida Marginal, 817, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Thiago","Thomaz Rolim","1930027676","Rua Amazonas, 819, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Tiago","Pereira Remédio","1930030541","Rua Gaspere, 821, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Ticiana","Sá da Justa","1930022783","Rua Jaboticabeira, 823, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Veruska","Rodrigues Moreira","1930022592","Praca Emilio Marconato, 825, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Vitor","Chaves de Oliveira","1930022167","Rua Vicenzo Granguelli, 827, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Viviane","Mello Bonadia dos Santos","1930030584","Rua Gothardo, 829, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Walter","Paulo Costenaro","1930033039","Praca Holambra, 831, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Wellington","Fabio de Oliveira Martins","1930030042","Rua Marchesini, 833, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Wesley","Angelino de Souza","1930028526","Avenida Rinaldi, 835, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Wesley","Pecoraro","1930033557","Rotatoria, 837, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Wesley","Soares de Souza","1930023781","Rua Um, 839, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("William","Simão de deus","1930025432","Av. Pacifico Moneda, 841, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Willian","dener de Oliveira","1930027217","Rua Antonio Pinto Catao, 843, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Williane","Rodrigues de Almeida Silva","1930030827","Rua Minas Gerais, 845, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Yujuan","Wang","1930029165","Rua Coronel Amancio Bueno, 847, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Alessandro","Ramos da Silva","1930023163","Rua Alfredo Bueno, 849, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("André","Barcelos Silva","1930027265","Praca Umbelina Bueno, 851, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("André","Luyde da Silva Souza","1930024299","Rua Candido Bueno, 853, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Anisio","Alfredo da Silva Junior","1930028621","Rodovia Joao Beira - Sp 095, 855, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Carlos","César Farias de Souza","1930027537","Avenida Marginal, 857, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Dyogo","Porfirio Almeida Santos","1930030659","Rua Amazonas, 859, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Edinilson","da Silva Vida","1930024627","Rua Gaspere, 861, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Everton","Jose de Souza","1930029803","Rua Jaboticabeira, 863, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Flávio","Barbosa Pinheiro","1930028909","Praca Emilio Marconato, 865, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Giliard","Gonçalves Vasconcelos","1930032338","Rua Vicenzo Granguelli, 867, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Giovani","Oliveira da Silva","1930028258","Rua Gothardo, 869, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Herbert","Henry Silva Carmo","1930023273","Praca Holambra, 871, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Junio","Cesar dos Santos Gonçalves","1930030727","Rua Marchesini, 873, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Leandro","Ferreira da Luz","1930023616","Avenida Rinaldi, 875, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Michael","Gomes da Cunha Lourenço","1930022318","Rotatoria, 877, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Nayse","Pereira Do Nascimento","1930029024","Rua Um, 879, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Neila","Pio Raposo","1930029775","Av. Pacifico Moneda, 881, Jaguariuna - SP");
insert into Clientes(pNome, sobrenome, telCli, endCli) values("Welington","da Silva Martins","1930025889","Rua Antonio Pinto Catao, 883, Jaguariuna - SP");

insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Casinhas","Casinhas para Cães",25,125.45);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Caixas de transportes","Caixas de transportes para Cães",23,95.90);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Sanitários","Sanitários para Cães",45,45.40);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Comedouros","Comedouros para Cães",23,15.25);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Brinquedos","Brinquedos para Cães",20,10.00);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Guias","Guias para Cães",12,15.00);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Coleiras","Coleiras para Cães",15,14.00);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Peitorais","Peitorais para Cães",0,25.00);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Colares","Colares para Cães",2,23.00);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Higiêne","Higiêne para Cães",15,25.99);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Petiscos","Petiscos para Cães",12,5.99);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Insetos","Insetos para Cães",5,3.99);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Tecidos","Tecidos para Cães",6,5.99);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Display","Display para Cães",4,75.90);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Bolinhas","Bolinhas para Cães",5,10.00);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Container","Container para Cães",15,25.00);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Fonte Bebedouro","Fonte Bebedouro para Gatos",8,84.00);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Caixas Transportes","Caixas Transportes para Gatos",9,75.00);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Comedouros","Comedouros para Gatos",13,12.00);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Banheira","Banheira para Gatos",21,45.99);
insert into Produtos(nomeProd, descrProd, qtdeProd, precoProd) values ("Kit Alimentação","Kit Alimentação para Gatos",10,49.90);

select * from Funcionarios;
select * from Clientes;
select * from Produtos;
describe Funcionarios;
describe Clientes;
describe Produtos;
show tables;






 


