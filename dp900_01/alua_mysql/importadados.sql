LOAD DATA INFILE 'C:/clientes.csv'
INTO TABLE clientes
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from clientes;

LOAD DATA INFILE 'C:/telefones.csv'
INTO TABLE telefones
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from telefones;

LOAD DATA INFILE 'C:/produtos.csv'
INTO TABLE produtos
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from produtos;

LOAD DATA INFILE 'C:/entregadores.csv'
INTO TABLE entregadores
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from entregadores;

LOAD DATA INFILE 'C:/pedidos.csv'
INTO TABLE pedidos
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from pedidos;

LOAD DATA INFILE 'C:/itens.csv'
INTO TABLE itens
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from itens;
