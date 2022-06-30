# Explorar conceitos básicos de análise de dados

. Data warehouse moderno
---------------
- Processamento e ingestão de dados
    - Orquestração ETL (Extrair, Transformar e Carregar) ou ELT (Extrair, Carregar e Transformar)
    - Processamento distribuído para limpar e reestruturar dados em escala
    - Processamento de dados em lote e em tempo real
- Armazenamento de dados analíticos
    - Armazenamento desnormalizado de dados relacionais em um data warehouse
        - Data Warehouse
            - Armazenamento de banco de dados relacional em grande escala e mecanismo de consulta
            - Os dados são desnormalizados para otimização da consulta
                - Normalmente como um esquema em estrela ou floco de neve de fatos numéricos que podem ser agregados por dimensões
    - Armazenamento semiestruturado de arquivos em um data lake
        - Data Lake
            - Os arquivos de dados são armazenados em um sistema de arquivos distribuído
            - Camadas de armazenamento tabulares podem ser usadas para abstrair arquivos e exibir uma interface relacional
                - Use tabelas externas do PolyBase ou crie um banco de dados Lake no Azure Synapse Analytics
                - Use tabelas de banco de dados e pontos de extremidade SQL no Azure Databricks
                - Use o Delta Lake do Spark para adicionar semântica de armazenamento relacional e criar um data lakehouse no Azure Synapse Analytics, Azure Databricks e Azure HDInsight
- Modelo de dados analíticos
    - Modelos semânticos para entidades analíticas
    - Geralmente na forma de cubos agregados que resumem valores numéricos em uma ou mais dimensões
    - Serviços de armazenamento de dados analíticos
        - Azure Synapse Analytics (Use para uma solução analítica única e unificada em grande escala no Azure)
        - Azure Databricks (Use para aproveitar as habilidades do Databricks e para portabilidade na nuvem)
        - Azure HDInsight (Use quando precisar dar suporte a várias plataformas de código aberto)
- Visualização de dados
    - Relatórios
    - Gráficos
    - Painéis
- Pipelines de processamento e ingestão de dados
    - Crie pipelines no Azure Data Factory ou no Azure Synapse Analytics

- Tipos de análises
    - Análise descritiva (O que aconteceu?)
    - Análise diagnóstica (Por que aconteceu?)
    - Análise preditiva (O que ira aconteceu?)
    - Análise prescritiva (O que posso fazer?)
    - Análise cognitiva (Definir padrões)

. Análises de streaming e em tempo real
---------------

. Visualização de dados
---------------
