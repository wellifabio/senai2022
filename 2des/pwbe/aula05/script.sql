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

CREATE TABLE funcionarios (
    id INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,
    matricula VARCHAR(10) NOT NULL UNIQUE,
    nome VARCHAR(153) NOT NULL,
    cargo VARCHAR(50) NOT NULL,
    salario FLOAT(6, 2) NOT NULL,
    cpf VARCHAR(11) NOT NULL
);

CREATE TABLE vendas (
    id INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,
    id_func INTEGER NOT NULL,
    id_prod INTEGER NOT NULL,
    qntd INTEGER NOT NULL,
    data TIMESTAMP NOT NULL,
    FOREIGN KEY (id_func) REFERENCES funcionarios (id),
    FOREIGN KEY (id_prod) REFERENCES produtos (id)
);

INSERT INTO produtos VALUES (DEFAULT, 'CJ1234', 'Calça Jeans Super Confortável', 10, 90.00);
INSERT INTO produtos VALUES (DEFAULT, 'MO5214', 'Moletom Super Descolado', 5, 120.00);

INSERT INTO funcionarios VALUES (DEFAULT, 'SP1234', 'José Roberto', 'Gerente', 5320.00, '72704721068');
INSERT INTO funcionarios VALUES (DEFAULT, 'SP1245', 'Carlos Alberto', 'Vendedor', 2530.00, '70601631072');

INSERT INTO vendas VALUES (DEFAULT, 2, 1, 2, DEFAULT);
INSERT INTO vendas VALUES (DEFAULT, 1, 2, 1, DEFAULT);
