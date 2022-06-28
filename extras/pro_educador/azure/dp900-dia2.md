# Bancos de dados Relacionais
- Tabelas Relacionais
  - Linha -> Instância
  - Chave Primaria e Estrangeira
  - Classe -> Instância
 - Normalização
  - Separar cada entidade na própria tabela
  - Separe cada atributo discreto na própria coluna
  - Identifique exclusivamente cada instância de entidade (linha) usando uma cave primária
  - Use colunas de chave estrangeira para vincular entidades
- Linguagem SQL
  - DDL (Linguagem de Definição de Dados) (CREATE, ALTER, DROP, RENAME)
  - DCL (Linguagem de Controle de Dados) (GRANT, DENY, REVOKE)
  - DML (Linguagem de Manipulação de Dados) (INSERT, UPDATE, DELETE, SELECT)
- Ouros objetos
  - Views (Consultas SQL predefinidas que se comportam como tabelas virtuais)
  - Pocedures (Instruções SQL predefinidas que podem incluir parâmetros)
  - Índices (Estruturas em forma de árvore que melhoram o desempenho da consulta)
    - Índice Clusterizado (Cria uma copia fizica)
    - Índice Não Clusterizado (Apontamento na memória)
  # SQL do Azure
  - IaaS
    - SQL Server em VMs do Azure (Ideal para nuvem híbrida ou migração de configurações complexas locais de banco de dados)
  - IaaS
    - Instância Gerenciada de SQL do Azure (Ideal para migrar a maioria dos bancos de dados locais para a nuvem)
    - Banco de Dados SQL do Azure (Ideal para aplicativos baseados em nuvem)

#OBS:
  - Consulas e transações em bancos de dados diferentes, somente na Instância Gerenciada de SQL do Azure
