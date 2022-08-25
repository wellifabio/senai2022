# Importação de dados de arquivos CSV

LOAD DATA INFILE 'D:/wellington/senai2022/2des/bcd/aula04/telefones.CSV'
INTO TABLE telefones
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

# Algumas funções do banco de dados

- Select nome da função;
- curdate();
- curtime();
- datediff();
- date_add();
- date_sub();
- max();
- min();
- avg();
- sum();

# Buscas (SELECT)

- WHERE - Filtro
- ORDER BY - Ordenar por
- ORDER BY DESC - Ordenar por (decrescent)
- GROUP BY - Agrupar por

# Criar Visões no Banco de Dados
- CREATE VIEW Nome da Visão AS em seguida a consulta
- UNIR tabelas INNER JOIN, LEFT JOIN, RIGHT JOIN

# 2. Modelo relacional
- 2.4. DDL (data definition language)
- 2.4.1. CREATE DATABASE
- 2.4.2. DROP DATABASE
- 2.4.3. USE
- 2.4.4. CREATE TABLE
- 2.4.5. ALTER TABLE
- 2.4.6. DROP TABLE
- 2.4.7. CREATE INDEX
- 2.4.8. DROP INDEX
- 2.5. Migração de dados
- 2.5.1. Exportação de dados
- 2.5.2. Importação de dados