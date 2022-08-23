# Dados (Matéria prima da informação)
# Dado > Informação > Conhecimento
- Estruturados
- Semiestruturados
- Não estruturados

# Artuivos:
- Texto Delimitado, JSON, XML, Blob (Objeto binário grande), Formatos otimizados: 110101101010100101010... Acro, oC, Parquet

# Bancos de dados
- Relacionais
  - Tabelas normalizadas com chaves primarias para identificar exclusivamentes as entidades
  - Consultados e gerenciados usando linguagem SQL
- Não relacionais
  - Chave-valor, Documents, Gráfos

# Transacional vs Analitco
- OLTP - Processamento transacional online
  - (Uma transação por vez).
- OLAP - Processamento analítico online 
  - (Os dados sao periodicamente caregados, agregados e armazenados em um cubo. processados em um Data Warehouses).

  - Carga de trabalho transacionais
    - Atomicidade (Ou dacerto ou da errado)
    - Concistência (De um estado válido para outro estado válido)
    - Isolamento (A execução concorrente de transações deixa o banco de dados no mesmo estado)
    - Durabilidade (Transação concluída permanece assim)

  - Carga de trabalho analitica
    - Resumo (Ex. Quais clientes compram mais)
    - Tendência (Ex. Extimativa de vendas)
    - Informações comerciais (Ex. quais marcas vendem mais)
 
 # Tipos de Processamento
 - Batch - de Lotes (Processamento de um grupo inteiro em um momento futuro)
 - Streaming - de Fluxo (Cada novo dado é processado quando chega)

# Técnicas de Processamento de Dados
  - Crescimento Horizontal
    - DB Transacional (operações)
    - DB Analitico (Consultas)
    - Vantagens (Baixo custo)
    - Desvatagens (Pouco reaproveitaento de consultas)
   - Crescimento Horizontal com DataWareHouse - DWS
    - DB Produção
    - DB DataWareHouse
   - Tecnica
    - ETL (Extract > Transform > Load)
    - ELT (Extract > Load > Transform)
# Dunções do profissional de dados
  - DBA (Segurança, Acesso, Backup, Monitoramento, Desempenho)
  - Engenheido de dados (Pipeline de integraão de dados e processos ETL, Limpeza e transformação de dados)
  - Analisa de dados (Modelagem analítica, Relatorios e resumo de dados, View)
# modelos de Nuvem (as a Service)
  - IaaS - Infraestructure
  - PaaS - Plataform
  - SaaS - Software

# Serviços de nuvem da Microsoft para dados
  - Armazenamento
    - Azure SQL (SQL Sever)
    - Código aberto (MariaDB, MySQL, PosgresSQL)
    - Azure Cosmos (Não relacional, escalonável)
    - Armazenamento do Azure (Data Lake Storage)
  - Engenharia e análise de dados
    - Data Factory
    - Synapse Analytcs (Apache Spark, Data Explorer)
    - Databricks
    - HDInsigts
    - ...
    - Power BI
