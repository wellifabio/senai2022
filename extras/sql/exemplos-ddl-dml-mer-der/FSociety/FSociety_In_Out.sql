/*Criação de um banco de dados exemplo para um Futebol Society*/
-- Comandos para verificar os bancos de dados do SGBD
show databases;

-- Comandos DDL para a Criação e alteração das Tabelas
drop database FSociety;
create database FSociety;
use FSociety;
-- Criação da Tabela de Jogadores
create table Jogadores(
	ident integer primary key auto_increment,
	nome varchar(40) not null,
	telefone varchar(15)
	);
-- Criação da Tabela de Técnicos
create table Tecnicos(
	ident integer primary key auto_increment,
	nome varchar(40) not null,
	telefone varchar(15)
	);
-- Criação da Tabela de Técnicos
create table Agendamentos(
	horario time not null,
	nJogadores integer not null
	);
describe Agendamentos;
describe Jogadores;
describe Tecnicos;
show tables;

insert into Jogadores(nome, telefone) values ("André Olievira","19993452345");
insert into Jogadores(nome, telefone) values ("Jurema Andrade","19984212444");
insert into Jogadores(nome, telefone) values ("Mario Andrade","19932342344");
insert into Jogadores(nome, telefone) values ("José de Oliveira","19942342355");
insert into Jogadores(nome, telefone) values ("Marcio Garcia","1934567832");
insert into Jogadores(nome, telefone) values ("Flávio Galvão","1934566453");
insert into Jogadores(nome, telefone) values ("Mario Jorge Lobo","19943454553");
insert into Jogadores(nome, telefone) values ("Osmar Andrade","1923234255");
insert into Jogadores(nome, telefone) values ("Fabiana Silva","19994556355");
insert into Jogadores(nome, telefone) values ("Simone Braga","19839234299");
insert into Jogadores(nome, telefone) values ("Adelcio Biazi","1930030376");
insert into Jogadores(nome, telefone) values ("Adriano da Silva Ferreira","1930031839");
insert into Jogadores(nome, telefone) values ("Adriano Elias daniel","1930027165");
insert into Jogadores(nome, telefone) values ("Alan demetrius Baria Valejo","1930030115");
insert into Jogadores(nome, telefone) values ("Alan Zanoni Peixinho","1930031286");
insert into Jogadores(nome, telefone) values ("Alciano Gustavo Genovez de Oliveira","1930031664");
insert into Jogadores(nome, telefone) values ("Aldo Marcelo Paim","1930025914");
insert into Jogadores(nome, telefone) values ("Alex Marino Gonçalves de Almeida","1930029833");
insert into Jogadores(nome, telefone) values ("Alexandre Camargo Maia","1930027583");
insert into Jogadores(nome, telefone) values ("Alexandre Lopes Machado","1930029980");
insert into Jogadores(nome, telefone) values ("Alexsanderson Vieira Santos","1930022692");
insert into Jogadores(nome, telefone) values ("Alisson Linhares de Carvalho","1930033086");
insert into Jogadores(nome, telefone) values ("Amanda Cristina davi Resende","1930032224");
insert into Jogadores(nome, telefone) values ("Ana Cláudia de Moura Laurentino","1930029528");
insert into Jogadores(nome, telefone) values ("Ana Claudia Maciel","1930025167");
insert into Jogadores(nome, telefone) values ("Anderson Chaves Carniel","1930025793");
insert into Jogadores(nome, telefone) values ("Anderson da Silva Marcolino","1930022177");
insert into Jogadores(nome, telefone) values ("André Castro Garcia","1930023002");
insert into Jogadores(nome, telefone) values ("André Luiz Dutra Costa","1930028742");
insert into Jogadores(nome, telefone) values ("Andre Luiz Latansio de Oliveira","1930022145");
insert into Jogadores(nome, telefone) values ("Andréa Leme","1930031341");
insert into Jogadores(nome, telefone) values ("Andréia Botto","1930022475");
insert into Jogadores(nome, telefone) values ("Antonio Carlos de Campos","1930029559");
insert into Jogadores(nome, telefone) values ("Antonio Carlos de Marchi","1930024870");
insert into Jogadores(nome, telefone) values ("Antonio Queiroz da Silva Neto","1930031629");
insert into Jogadores(nome, telefone) values ("Argemiro Pentian Junior","1930031739");
insert into Jogadores(nome, telefone) values ("Bento Rafael Siqueira","1930023399");
insert into Jogadores(nome, telefone) values ("Bernardo Moreira Zabadal","1930023167");
insert into Jogadores(nome, telefone) values ("Bruno Hiromitus","1930032098");
insert into Jogadores(nome, telefone) values ("Bruno Luis Botamedi","1930023841");
insert into Jogadores(nome, telefone) values ("Caio Ferreira dos Santos","1930023831");
insert into Jogadores(nome, telefone) values ("Caio Hamamura","1930027345");
insert into Jogadores(nome, telefone) values ("Caio Hoffman","1930022263");
insert into Jogadores(nome, telefone) values ("Camila Martins Saporetti","1930023400");
insert into Jogadores(nome, telefone) values ("Carla Giselle Martins Real","1930031783");
insert into Jogadores(nome, telefone) values ("Carlos Eduardo Câmara","1930030951");
insert into Jogadores(nome, telefone) values ("Carlos Roberto de Oliveira Cazelatto Junior","1930030265");
insert into Jogadores(nome, telefone) values ("Carlos Roberto Do Nascimento Costa","1930027160");
insert into Jogadores(nome, telefone) values ("Cesar Augusto Pascali Rago","1930026115");
insert into Jogadores(nome, telefone) values ("Claudemir de Souza Freitas Junior","1930027725");
insert into Jogadores(nome, telefone) values ("Claudiane Mendes Trigueiro Silva","1930033179");
insert into Jogadores(nome, telefone) values ("Claudiney Ramos Tinoco","1930030621");
insert into Jogadores(nome, telefone) values ("Claudio de Oliveira Vilão Junior","1930025200");
insert into Jogadores(nome, telefone) values ("Cleis Meire Veiga","1930025803");
insert into Jogadores(nome, telefone) values ("Cleiton Passos Cordeiro","1930025281");
insert into Jogadores(nome, telefone) values ("Cleverson Moreira de Souza","1930030804");
insert into Jogadores(nome, telefone) values ("Cristian Schaeffer Greve","1930033143");
insert into Jogadores(nome, telefone) values ("Cristiano Herculano da Silva","1930025254");
insert into Jogadores(nome, telefone) values ("dalton Rogerio Bernini Francisco","1930026504");
insert into Jogadores(nome, telefone) values ("danilo César Pereira","1930024260");
insert into Jogadores(nome, telefone) values ("darvin Ames","1930029910");
insert into Jogadores(nome, telefone) values ("debora Barbosa Aires","1930030606");
insert into Jogadores(nome, telefone) values ("deivison Shindi Takatu","1930027992");
insert into Jogadores(nome, telefone) values ("denis Henrique Caixeta","1930032888");
insert into Jogadores(nome, telefone) values ("deysiane Matos Sande","1930033292");
insert into Jogadores(nome, telefone) values ("Diego Rafael Moraes","1930028115");
insert into Jogadores(nome, telefone) values ("Diogo Matos da Silva","1930025357");
insert into Jogadores(nome, telefone) values ("Diogo Paulino da Cruz dos Santos","1930030980");
insert into Jogadores(nome, telefone) values ("Douglas Brito damalio","1930032948");
insert into Jogadores(nome, telefone) values ("Draylson Micael de Souza","1930022495");
insert into Jogadores(nome, telefone) values ("Eder Almeida Batista de Oliveira","1930032391");
insert into Jogadores(nome, telefone) values ("Ederlon Barbosa Cruz","1930032594");
insert into Jogadores(nome, telefone) values ("Edinei Peres Legaspe","1930022114");
insert into Jogadores(nome, telefone) values ("Ednei Jose de Almeida Junior","1930022353");
insert into Jogadores(nome, telefone) values ("Eduardo de Paula Lima Nascimento","1930031036");
insert into Jogadores(nome, telefone) values ("Eduardo Henrique Spies","1930030921");
insert into Jogadores(nome, telefone) values ("Elaine Cecília Gatto","1930022156");
insert into Jogadores(nome, telefone) values ("Elias Adriano Nogueira da Silva","1930029318");
insert into Jogadores(nome, telefone) values ("Elis Cristina Montoro Hernandes Ervolino","1930031543");
insert into Jogadores(nome, telefone) values ("Erica Aparecida Martins Siqueira","1930032892");
insert into Jogadores(nome, telefone) values ("Erika Arias Barrado","1930033374");
insert into Jogadores(nome, telefone) values ("Esteic Janaina Santos Batista","1930031385");
insert into Jogadores(nome, telefone) values ("Everaldo Costa Silva Neto","1930026091");
insert into Jogadores(nome, telefone) values ("Everaldo Silva de Freitas","1930025087");
insert into Jogadores(nome, telefone) values ("Ewerton José da Silva","1930028831");
insert into Jogadores(nome, telefone) values ("Fabio Luiz de Paula","1930030021");
insert into Jogadores(nome, telefone) values ("Fabio Serafim","1930026076");
insert into Jogadores(nome, telefone) values ("Felipe Gobo Bruno","1930027232");
insert into Jogadores(nome, telefone) values ("Fernanda Zampieri Canaver","1930027461");
insert into Jogadores(nome, telefone) values ("Fernando Claudio dos Santos Junior","1930022991");
insert into Jogadores(nome, telefone) values ("Fernando Henrique Campos","1930029675");
insert into Jogadores(nome, telefone) values ("Flávia Zenaro Nogueira E Silva","1930030326");
insert into Jogadores(nome, telefone) values ("Floriano Ferreira dos Reis Filho","1930026338");
insert into Jogadores(nome, telefone) values ("Frances Albert Santos","1930022281");
insert into Jogadores(nome, telefone) values ("Francisco Assis da Silva","1930027774");
insert into Jogadores(nome, telefone) values ("Francisco Edigleison da Silva Barbosa","1930023218");
insert into Jogadores(nome, telefone) values ("Francisco José Nardi Filho","1930023323");
insert into Jogadores(nome, telefone) values ("Gabriel Ferreira Teles Gomes","1930024962");
insert into Jogadores(nome, telefone) values ("Gabriel Morais Silveira","1930029315");
insert into Jogadores(nome, telefone) values ("Gabriel Sgorlon Tininis","1930029889");
insert into Jogadores(nome, telefone) values ("Gabriel Spadon de Souza","1930032517");
insert into Jogadores(nome, telefone) values ("Gerson Luiz Camillo","1930032298");
insert into Jogadores(nome, telefone) values ("Giovani Bertolla Sampaio","1930032091");
insert into Jogadores(nome, telefone) values ("Giovanna Nascimento Antonieti","1930023111");
insert into Jogadores(nome, telefone) values ("Gracieth Mendes Valenzuela","1930025140");
insert into Jogadores(nome, telefone) values ("Guidson Coelho de Andrade","1930022168");
insert into Jogadores(nome, telefone) values ("Guilherme Corredato Guerino","1930022427");
insert into Jogadores(nome, telefone) values ("Guilherme Pina Cardim","1930027169");
insert into Jogadores(nome, telefone) values ("Guilherme Queiroz Vasconcelos","1930030627");
insert into Jogadores(nome, telefone) values ("Guilherme Rego Rockembach","1930033290");
insert into Jogadores(nome, telefone) values ("Gustavo Botelho de Souza","1930025251");
insert into Jogadores(nome, telefone) values ("Gustavo Moreira Calixto","1930030392");
insert into Jogadores(nome, telefone) values ("Helder Pestana","1930030490");
insert into Jogadores(nome, telefone) values ("Heleno Murilo Campeão Vale","1930029049");
insert into Jogadores(nome, telefone) values ("Helivelton Oliveira Ferreira","1930028172");
insert into Jogadores(nome, telefone) values ("Henrique Araujo Lima","1930029060");
insert into Jogadores(nome, telefone) values ("Hiago Araujo Silva","1930032618");
insert into Jogadores(nome, telefone) values ("Higor Antonio delsoto","1930027393");
insert into Jogadores(nome, telefone) values ("Icaro Cavalcante Dourado","1930022834");
insert into Jogadores(nome, telefone) values ("Ingrid Marçal","1930023351");
insert into Jogadores(nome, telefone) values ("Irapuan Glória Júnior","1930026509");
insert into Jogadores(nome, telefone) values ("Italo Otavio Goncalves de Oliveira","1930022768");
insert into Jogadores(nome, telefone) values ("Ivan Bonora Prado","1930030641");
insert into Jogadores(nome, telefone) values ("Jane Piantoni","1930022756");
insert into Jogadores(nome, telefone) values ("Jaqueline Rissa Franco","1930024182");
insert into Jogadores(nome, telefone) values ("Jean Menossi","1930030796");
insert into Jogadores(nome, telefone) values ("Jean Nunes Ribeiro Araujo","1930022424");
insert into Jogadores(nome, telefone) values ("Jean Roberto Ponciano","1930030615");
insert into Jogadores(nome, telefone) values ("Jeane Aparecida Menegueli","1930033176");
insert into Jogadores(nome, telefone) values ("Jefferson Barbosa Belo da Silva","1930023520");
insert into Jogadores(nome, telefone) values ("Jefferson Carlos Pedroso","1930027585");
insert into Jogadores(nome, telefone) values ("Jessé Italo Silva","1930033196");
insert into Jogadores(nome, telefone) values ("João Eduardo Soares E Silva","1930026622");
insert into Jogadores(nome, telefone) values ("João Gabriel Rocha Silva","1930032868");
insert into Jogadores(nome, telefone) values ("Joice Wolfrann","1930023385");
insert into Jogadores(nome, telefone) values ("Jonas Henrique Mendonça","1930022535");
insert into Jogadores(nome, telefone) values ("Jônatas Leite de Oliveira","1930030492");
insert into Jogadores(nome, telefone) values ("Jonathan Gilliard Richter","1930033540");
insert into Jogadores(nome, telefone) values ("José Avelino Placca","1930027031");
insert into Jogadores(nome, telefone) values ("José Cássio Gimenez","1930032426");
insert into Jogadores(nome, telefone) values ("Jose Ceron Neto","1930031459");
insert into Jogadores(nome, telefone) values ("José Eugênio de Mira","1930031892");
insert into Jogadores(nome, telefone) values ("José Rafael Pilan","1930027198");
insert into Jogadores(nome, telefone) values ("José Renato Paviotti","1930022148");
insert into Jogadores(nome, telefone) values ("José Santiago Moreira de Mello","1930029346");
insert into Jogadores(nome, telefone) values ("Josiane Rosa de Oliveira Gaia Pimenta","1930025218");
insert into Jogadores(nome, telefone) values ("Juliana de Sousa Ribeiro","1930031587");
insert into Jogadores(nome, telefone) values ("Juliano Jinzenji Duque","1930030016");
insert into Jogadores(nome, telefone) values ("Juliano Silva Marçal","1930029615");
insert into Jogadores(nome, telefone) values ("Julio Cesar damasceno","1930029951");
insert into Jogadores(nome, telefone) values ("Julio Cesar de Lemos","1930027732");
insert into Jogadores(nome, telefone) values ("Julio Cesar Pedroso","1930029844");
insert into Jogadores(nome, telefone) values ("Kleber Alessandro Antoniazzi","1930030446");
insert into Jogadores(nome, telefone) values ("Laura Beatriz Alves","1930023013");
insert into Jogadores(nome, telefone) values ("Leandro Arab Marcomini","1930026009");
insert into Jogadores(nome, telefone) values ("Leonardo Rocco","1930031588");
insert into Jogadores(nome, telefone) values ("Liliam Sayuri Sakamoto","1930027073");
insert into Jogadores(nome, telefone) values ("Lucas Hermann Negri","1930029158");
insert into Jogadores(nome, telefone) values ("Luciano Rossi","1930022927");
insert into Jogadores(nome, telefone) values ("Luciano Rovanni Do Nascimento","1930025970");
insert into Jogadores(nome, telefone) values ("Lucio Rogerio Pelizer Paris","1930031980");
insert into Jogadores(nome, telefone) values ("Luis Paulo Fagiolo Augusto","1930031305");
insert into Jogadores(nome, telefone) values ("Luiz Ariovaldo Fabri Junior","1930029896");
insert into Jogadores(nome, telefone) values ("Luiz Gustavo Turatti","1930030014");
insert into Jogadores(nome, telefone) values ("Marcelo Akira Yamamoto","1930023803");
insert into Jogadores(nome, telefone) values ("Marcelo Brondi Mendes","1930023498");
insert into Jogadores(nome, telefone) values ("Marcelo de Almeida Borges","1930033397");
insert into Jogadores(nome, telefone) values ("Marcelo Do Carmo Vieira Scomparim","1930029023");
insert into Jogadores(nome, telefone) values ("Marcelo José Vigorito Campara","1930031207");
insert into Jogadores(nome, telefone) values ("Marcelo Marchi","1930026080");
insert into Jogadores(nome, telefone) values ("Márcia Maria Teresa Baptistella","1930031715");
insert into Jogadores(nome, telefone) values ("Marcilyanne Moreira Gois","1930023794");
insert into Jogadores(nome, telefone) values ("Márcio Jesus de Morais","1930029582");
insert into Jogadores(nome, telefone) values ("Márcio Maestrello","1930022966");
insert into Jogadores(nome, telefone) values ("Marco Antonio Simoes Teixeira","1930025619");
insert into Jogadores(nome, telefone) values ("Marco Aurelio de Carvalho dantas","1930033493");
insert into Jogadores(nome, telefone) values ("Marcos Antonio Leati Pelaes","1930024675");
insert into Jogadores(nome, telefone) values ("Marcos daniel Cano","1930033151");
insert into Jogadores(nome, telefone) values ("Marcos Henrique de Paula","1930027831");
insert into Jogadores(nome, telefone) values ("Marcus Vinícius Contes Calça","1930028089");
insert into Jogadores(nome, telefone) values ("Maria Inez Nobukuni Jorgetto","1930022824");
insert into Jogadores(nome, telefone) values ("Mariana Massimino Feres","1930031340");
insert into Jogadores(nome, telefone) values ("Mario Ferreira de Brito","1930025274");
insert into Jogadores(nome, telefone) values ("Maurício Falvo","1930027790");
insert into Jogadores(nome, telefone) values ("Mauricio Fernando Lima Pereira","1930030296");
insert into Jogadores(nome, telefone) values ("Mayara Chiaroti Brigulato","1930025861");
insert into Jogadores(nome, telefone) values ("Maylon Pires Macedo","1930027053");
insert into Jogadores(nome, telefone) values ("Michel de Souza","1930028595");
insert into Jogadores(nome, telefone) values ("Michelle Guirra Garcia","1930031704");
insert into Jogadores(nome, telefone) values ("Murilo Gleyson Gazzola","1930028300");
insert into Jogadores(nome, telefone) values ("Ovídio José Francisco","1930029355");
insert into Jogadores(nome, telefone) values ("Patrícia Fernanda da Silva Freitas","1930026917");
insert into Jogadores(nome, telefone) values ("Paula Leticia Santos Lima","1930023821");
insert into Jogadores(nome, telefone) values ("Paulo Eduardo Silva Montier","1930027324");
insert into Jogadores(nome, telefone) values ("Pedro Augusto Antunes Zaidan","1930033524");
insert into Jogadores(nome, telefone) values ("Pedro Henrique Dias Valle","1930025728");
insert into Jogadores(nome, telefone) values ("Pedro Henrique Pereira","1930024606");
insert into Jogadores(nome, telefone) values ("Pedro Pablo Calarge Esquivel","1930025648");
insert into Jogadores(nome, telefone) values ("Rafael Ghussn Cano","1930032398");
insert into Jogadores(nome, telefone) values ("Rafael Gonçalves Pires","1930030117");
insert into Jogadores(nome, telefone) values ("Rafael Martins Alves","1930026927");
insert into Jogadores(nome, telefone) values ("Rafael Sanches Rocha","1930022359");
insert into Jogadores(nome, telefone) values ("Rafael Silva Santos","1930029138");
insert into Jogadores(nome, telefone) values ("Rafael Stoffalette João","1930024003");
insert into Jogadores(nome, telefone) values ("Rafael Tomé de Souza","1930029876");
insert into Jogadores(nome, telefone) values ("Rafaela de Jesus Alencar","1930032556");
insert into Jogadores(nome, telefone) values ("Ramon Simões Abílio","1930022120");
insert into Jogadores(nome, telefone) values ("Raphael Hungaro Moretti","1930027798");
insert into Jogadores(nome, telefone) values ("Raquel Cristina Pereira Mina","1930030646");
insert into Jogadores(nome, telefone) values ("Reginaldo Rideaki Kamiya","1930025035");
insert into Jogadores(nome, telefone) values ("Renan Caldeira Menechelli","1930028731");
insert into Jogadores(nome, telefone) values ("Renan Galeane Alboy","1930023230");
insert into Jogadores(nome, telefone) values ("Renato Luiz Cardoso","1930030528");
insert into Jogadores(nome, telefone) values ("Renato Penha","1930025580");
insert into Jogadores(nome, telefone) values ("Ricardo Alexandre Gonçalves Carotta Martins","1930022106");
insert into Jogadores(nome, telefone) values ("Ricardo Ferreira Vilela","1930025721");
insert into Jogadores(nome, telefone) values ("Ricardo Luis Balieiro","1930028227");
insert into Jogadores(nome, telefone) values ("Ricardo Ribeiro Seco","1930029085");
insert into Jogadores(nome, telefone) values ("Ricardo Zanni Mendes da Silveira","1930031157");
insert into Jogadores(nome, telefone) values ("Roberta Akemi Sinoara","1930028796");
insert into Jogadores(nome, telefone) values ("Rodrigo Augusto dos Santos Paula","1930032703");
insert into Jogadores(nome, telefone) values ("Rodrigo Bruno Kehdy","1930025470");
insert into Jogadores(nome, telefone) values ("Rodrigo Kiyoshi Saito","1930031125");
insert into Jogadores(nome, telefone) values ("Rômulo José Franco","1930025398");
insert into Jogadores(nome, telefone) values ("Romulo Mateus Duarte","1930027067");
insert into Jogadores(nome, telefone) values ("Rômulo Rodrigues Pombal","1930032590");
insert into Jogadores(nome, telefone) values ("Ronaldo Toshiaki Oikawa","1930030691");
insert into Jogadores(nome, telefone) values ("Ronnie Shida Marinho","1930027720");
insert into Jogadores(nome, telefone) values ("Sara Luzia de Melo","1930030076");
insert into Jogadores(nome, telefone) values ("Sergio Willians Poneli","1930025992");
insert into Jogadores(nome, telefone) values ("Silvia Roberta de Jesus Garcia","1930027261");
insert into Jogadores(nome, telefone) values ("Suéllen Rodolfo Martinelli","1930028718");
insert into Jogadores(nome, telefone) values ("Taynara Cerigueli Dutra","1930032451");
insert into Jogadores(nome, telefone) values ("Thamires de Campos Luz","1930024362");
insert into Jogadores(nome, telefone) values ("Thatiana Maria Camargo Fernandes","1930032090");
insert into Jogadores(nome, telefone) values ("Thiago Fernandes Oliveira de Lima","1930023440");
insert into Jogadores(nome, telefone) values ("Thiago Gabriel de Melo","1930031532");
insert into Jogadores(nome, telefone) values ("Thiago Thomaz Rolim","1930027676");
insert into Jogadores(nome, telefone) values ("Tiago Pereira Remédio","1930030541");
insert into Jogadores(nome, telefone) values ("Ticiana Sá da Justa","1930022783");
insert into Jogadores(nome, telefone) values ("Veruska Rodrigues Moreira","1930022592");
insert into Jogadores(nome, telefone) values ("Vitor Chaves de Oliveira","1930022167");
insert into Jogadores(nome, telefone) values ("Viviane Mello Bonadia dos Santos","1930030584");
insert into Jogadores(nome, telefone) values ("Walter Paulo Costenaro","1930033039");
insert into Jogadores(nome, telefone) values ("Wellington Fabio de Oliveira Martins","1930030042");
insert into Jogadores(nome, telefone) values ("Wesley Angelino de Souza","1930028526");
insert into Jogadores(nome, telefone) values ("Wesley Pecoraro","1930033557");
insert into Jogadores(nome, telefone) values ("Wesley Soares de Souza","1930023781");
insert into Jogadores(nome, telefone) values ("William Simão de deus","1930025432");
insert into Jogadores(nome, telefone) values ("Willian dener de Oliveira","1930027217");
insert into Jogadores(nome, telefone) values ("Williane Rodrigues de Almeida Silva","1930030827");
insert into Jogadores(nome, telefone) values ("Yujuan Wang","1930029165");
insert into Jogadores(nome, telefone) values ("Alessandro Ramos da Silva","1930023163");
insert into Jogadores(nome, telefone) values ("André Barcelos Silva","1930027265");
insert into Jogadores(nome, telefone) values ("André Luyde da Silva Souza","1930024299");
insert into Jogadores(nome, telefone) values ("Anisio Alfredo da Silva Junior","1930028621");
insert into Jogadores(nome, telefone) values ("Carlos César Farias de Souza","1930027537");
insert into Jogadores(nome, telefone) values ("Dyogo Porfirio Almeida Santos","1930030659");
insert into Jogadores(nome, telefone) values ("Edinilson da Silva Vida","1930024627");
insert into Jogadores(nome, telefone) values ("Everton Jose de Souza","1930029803");
insert into Jogadores(nome, telefone) values ("Flávio Barbosa Pinheiro","1930028909");
insert into Jogadores(nome, telefone) values ("Giliard Gonçalves Vasconcelos","1930032338");
insert into Jogadores(nome, telefone) values ("Giovani Oliveira da Silva","1930028258");
insert into Jogadores(nome, telefone) values ("Herbert Henry Silva Carmo","1930023273");
insert into Jogadores(nome, telefone) values ("Junio Cesar dos Santos Gonçalves","1930030727");
insert into Jogadores(nome, telefone) values ("Leandro Ferreira da Luz","1930023616");
insert into Jogadores(nome, telefone) values ("Michael Gomes da Cunha Lourenço","1930022318");
insert into Jogadores(nome, telefone) values ("Nayse Pereira Do Nascimento","1930029024");
insert into Jogadores(nome, telefone) values ("Neila Pio Raposo","1930029775");
insert into Jogadores(nome, telefone) values ("Welington da Silva Martins","1930025889");

insert into Tecnicos(nome, telefone) values ("André Castro Garcia","19932342344");
insert into Tecnicos(nome, telefone) values ("Marcos Dutra Costa","19942342355");
insert into Tecnicos(nome, telefone) values ("Simone Latansio de Oliveira","1934567832");
insert into Tecnicos(nome, telefone) values ("Silvia Leme","1923234255");
insert into Tecnicos(nome, telefone) values ("Bruna Botto","19994556355");
insert into Tecnicos(nome, telefone) values ("Carlos Carlos de Campos","1930030376");
insert into Tecnicos(nome, telefone) values ("Lucas Carlos de Marchi","1930031839");
insert into Tecnicos(nome, telefone) values ("Antonio Queiroz da Silva Neto","1930025914");

insert into Agendamentos(horario, nJogadores) values ("13:00:00",20);
insert into Agendamentos(horario, nJogadores) values ("14:00:00",20);
insert into Agendamentos(horario, nJogadores) values ("15:00:00",2);
insert into Agendamentos(horario, nJogadores) values ("16:00:00",15);
insert into Agendamentos(horario, nJogadores) values ("17:00:00",15);
insert into Agendamentos(horario, nJogadores) values ("18:00:00",20);
insert into Agendamentos(horario, nJogadores) values ("19:00:00",15);
insert into Agendamentos(horario, nJogadores) values ("20:00:00",15);
insert into Agendamentos(horario, nJogadores) values ("21:00:00",15);
insert into Agendamentos(horario, nJogadores) values ("22:00:00",20);
insert into Agendamentos(horario, nJogadores) values ("23:00:00",20);
insert into Agendamentos(horario, nJogadores) values ("00:00:00",20);

describe Agendamentos;
describe Jogadores;
describe Tecnicos;
show tables;

--Comandos DML para Inserir dados nas tabelas criadas
insert into Jogadores(nome, telefone) values ("Amaral dos Santos","19993452345 ");
insert into Tecnicos(nome, telefone) values ("André Castro Garcia","19932342344");
insert into Agendamentos(horario, nJogadores) values ("13:00:00",20);

--Mostrar o conteúdo das tabelas
select * from Jogadores;
select * from Tecnicos;
select * from Agendamentos;

-- Comandos para alterar as colunas do banco de dados
-- Remover uma coluna
alter table Jogadores drop ident;
describe Jogadores;
-- Adicionar uma coluna uma coluna
alter table Jogadores add ident integer primary key auto_increment;
describe Jogadores;
-- Remover uma coluna
alter table Jogadores drop nome;
describe Jogadores;
-- Adicionar uma coluna
alter table Jogadores add nome varchar(50) not null;
describe Jogadores;
-- Modificar uma os atributos de uma coluna
alter table Jogadores add nome varchar(40) not null;
describe Jogadores;
-- Modificar a posição de uma coluna, depois de outra
alter table Jogadores modify telefone varchar(15) after nome;
describe Jogadores;

/*Saídas de arquivos em formato Texto e/ou CSV*/
SELECT * FROM Jogadores INTO OUTFILE '/tmp/resultado.txt';
SELECT * FROM Jogadores INTO OUTFILE '/tmp/resultado.csv' FIELDS TERMINATED BY ';' ENCLOSED BY '"' LINES TERMINATED BY '\n';

/*Executar arquivo .sql de dentro e de fora do mysql, via linha de comando*/
--de dentro do banco OBS(O arquivo encontra-se na pasta C:\TMP)
source /tmp/Fsociety.sql;
--de fora do banco, no shell
mysql -u=root FSociety < arquivo.sql

--Comando para verificar em qual pasta encontra-se os arquivos de dados do MySQL
show variables like 'datadir';

--Alterando a Codificação de caracteres do Banco de Dados
ALTER DATABASE FSociety CHARSET = Latin1 COLLATE = latin1_swedish_ci;
ALTER DATABASE FSociety CHARSET = UTF8 COLLATE = utf8_general_ci;


--Exemplo de como Criar e Deletar Indices após a criação da tabela
show index from Produtos;
create index indNomeProd on Produtos(nome);
drop index indNomeProd on Produtos;

--Exemplo de como Criar Indice com múltiplas colunas
CREATE TABLE t1 (col1 INT, col2 INT, INDEX func_index ((ABS(col1))));
CREATE INDEX idx1 ON t1 ((col1 + col2));
CREATE INDEX idx2 ON t1 ((col1 + col2), (col1 - col2), col1);
ALTER TABLE t1 ADD INDEX ((col1 * 40) DESC);

--Exemplo de como Criar indice durante a criação da tabela
CREATE TABLE t1 (
  col1 VARCHAR(10),
  col2 VARCHAR(20),
  INDEX (col1, col2(10))
);