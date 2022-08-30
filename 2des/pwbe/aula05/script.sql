DROP DATABASE IF EXISTS lojinha;
CREATE DATABASE lojinha charset=UTF8 collate utf8_general_ci;

USE lojinha;

CREATE TABLE produtos (
    id INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,
    cod VARCHAR(10) NOT NULL UNIQUE,
    nome VARCHAR(50) NOT NULL,
    qntd INTEGER NOT NULL,
    preco FLOAT(5, 2) NOT NULL 
);

INSERT INTO produtos VALUES (DEFAULT, 'CJ1234', 'Calça Jeans Super Confortável', 10, 90.00);
INSERT INTO produtos VALUES (DEFAULT, 'MO5214', 'Moletom Super Descolado', 5, 120.00);