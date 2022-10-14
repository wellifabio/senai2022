drop database if exists Patrimonio;
create database Patrimonio charset=UTF8 collate utf8_general_ci;
use Patrimonio;
-- DDL
create table itens(
    ni numeric(6) not null,
    aquisicao timestamp not null,
    denominacao varchar(100) not null,
    valor numeric(10,2),
    img varchar(200) default 'default.png',
    constraint pk_item primary key (ni)
);

insert into itens values (10001,'2009-10-06','SERVIDOR ESCOLA MX203 ITAUTEC',22501.08,'servidor.png');
insert into itens values (10002,'2009-10-06','MONITOR VIDEO COLOR 15L1553S ITAUTEC',325.00,'monitor.png');
insert into itens values (10003,'2009-12-22','ACCESS POINT CORP 3COM 3CRWE776075',712.75,'access.png');
insert into itens values (10004,'2010-11-05','PROJETOR MULTIMÍDIA / NEC',1423.51,'projetor.png');
insert into itens values (10005,'2011-02-19','PROJETOR MULTIM.P/SALA/LAORAT/OPTOMA',1430.00,'projetor.png');
insert into itens values (10006,'2011-02-22','MICROCOMPUTADOR INFOWAY SM3330/ITAUTEC',1085.00,'microcomputador.png');
insert into itens values (10007,'2011-02-22','MONITOR COLOR LCD 19 W1942/ITAUTEC',380.00,'monitor.png');
insert into itens values (10008,'2011-04-13','MICROCOMPUTADOR I7 8GB 500GB/LENOVO',2076.68,'microcomputador.png');
insert into itens values (10009,'2011-04-13','MONITOR COLOR LCD 22THINKVISION/LENOVO',730.32,'monitor.png');
insert into itens values (10010,'2011-05-04','MICROCOMPUTADOR POST-AT (I3PF)/POSITIVO',1045.00,'microcomputador.png');
insert into itens values (10011,'2011-05-04','MONITOR LCD 18.5 936SWA/ POSITIVO',404.00,'monitor.png');
insert into itens values (10012,'2013-01-25','NOBREAK SENOIDAL 2KVA /ACTPOWER',2000.00,'nobreak.png');
insert into itens values (10013,'2013-02-08','TELEVISÃO INTERATIVA 3D 60P / LG',6875.00,'televisao.png');
insert into itens values (10014,'2013-02-20','SERVIDOR UNIDADES VERSÃO 2012/DELL T420',21977.81,'servidor.png');
insert into itens values (10015,'2013-03-01','PROJETOR MULTIMÍDIA C/ SUPORTE / EPSON',1401.59,'projetor.png');
insert into itens values (10016,'2013-03-05','PROJETOR MULTIMÍDIA INTERATIVO / EPSON',7201.38,'projetor.png');
insert into itens values (10017,'2013-03-07','MONITOR LED 18.5P / POSITIVO P971WAL',242.00,'monitor.png');
insert into itens values (10018,'2013-03-25','MICROCOMPUTADOR POSITIVO MASTER D510',2053.27,'microcomputador.png');
insert into itens values (10019,'2013-03-25','MONITOR LED 21.5P / LG E2241V',300.00,'monitor.png');
insert into itens values (10020,'2014-05-07','APARELHO DE TELEFONE IP /GRANDSTREAM',394.10,'aparelho.png');
insert into itens values (10021,'2014-05-12','SWITCH L2 - 24 PORTAS - UNIDADES /CISCO',2100.45,'switch.png');
insert into itens values (10022,'2014-05-16','NOTEBOOK HP NOTE 440',3590.00,'notebook.png');
insert into itens values (10023,'2014-07-09','MICROCOMPUTADOR EDUCACIONAL/POSITIVO',3088.79,'microcomputador.png');
insert into itens values (10024,'2014-07-09','MONITOR LED 21.5/LG',310.21,'monitor.png');
insert into itens values (10025,'2014-10-02','ACCESS POINT P/USO EDUCACIONAL / CISCO',2237.50,'access.png');
insert into itens values (10026,'2015-02-10','MICROCOMPUTADOR POSITIVO MASTER D360',1723.00,'microcomputador.png');
insert into itens values (10027,'2015-02-10','MONITOR LED 18.5P POSITIVO',302.00,'monitor.png');
insert into itens values (10028,'2015-06-15','ROTEADOR MODULAR C/SOFTWARE IP /CISCO',13214.28,'roteador.png');
insert into itens values (10029,'2016-01-12','MICROCOMPUTADOR EDUCACIONAL BÁSICO / DELL',3125.08,'microcomputador.png');
insert into itens values (10030,'2016-01-31','MONITOR PROFESSIONAL 23 POLEG. WIDESCREEN / DELL',354.95,'monitor.png');
insert into itens values (10031,'2019-04-09','MONITOR LED 21.5 / LG',529.58,'monitor.png');
insert into itens values (10032,'2019-04-09','MICROCOMPUTADOR ADMINISTRATIVO/POSITIVO',3038.89,'microcomputador.png');
insert into itens values (10033,'2020-01-10','MICROCOMPUTADOR CORPORATIVO',2819.24,'microcomputador.png');
insert into itens values (10034,'2020-01-31','MONITOR DE VÍDEO 24 POLEGADAS - DELL',1469.74,'monitor.png');
insert into itens values (10035,'2020-01-31','MONITOR 24 POLEGADAS',1508.76,'monitor.png');