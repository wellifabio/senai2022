-- Os comandos a seguir são exemplos de importação e exportação de dados
-- Para que funcionem corretamente os patch (caminhos) dever ser corrigidos
-- Rodando script externo de banco de dados .sql
source C:/Users/user/Desktop/github/senai2022/3des/projetos/aula06/pizzaria.sql;

-- Importando os dados de arquivos csv
LOAD DATA INFILE 'C:/Users/user/Desktop/github/senai2022/3des/projetos/aula06/pizzas.csv'
INTO TABLE pizzas
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

-- Exportando os dados para arquivos csv
select * from pizzas INTO OUTFILE "C:/Users/user/Desktop/github/senai2022/3des/projetos/aula06/pizzas.csv"
FIELDS TERMINATED BY ';'
ENCLOSED BY '"' 
LINES TERMINATED BY '\r\n';