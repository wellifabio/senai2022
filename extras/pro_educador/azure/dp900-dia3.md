# Bancos de dados não relacionais do Azure

. Armazenamento do Azure
--------------------
- Armazenamento de Blobs do Azure (objetos binários grandes)
  - Blobs de blocos
    - Objetos binários, grandes e discretos que são alterados com pouca frequência
    - Os blobs podem ter até 4,7 TB e blocos de até 100 MB Um blob pode conter até 50.000 blocos
  - Blobs de páginas
    - Usados como armazenamento em disco virtual para VMs
    - Os blobs podem ter até 8 TB e páginas de tamanho fixo de 512 bytes
  - Blobs de acréscimo
    - São blobs de blocos usados para otimizar as operações de acréscimo
    - Tamanho máximo de pouco mais de 195 GB - cada bloco pode ter até 4MB
  - Camadas de armazenameto
    - Frequnte - Hot -> Quente (maior custo, menor latência)
    - Esporádico - Cold -> Frio (menor custo, maior latência)
    - Arquivos - Archive (menor custo, maior latência)
   - Arquivos de imagem
- Azure Data Lake Store Gen 2
 - Sistema de arquivos distribuído criado no Armazenamento de Blobs
   - Combina o Azure Data Lake Store Gen 1 com o Armazenamento de Blobs do Azure
   - Permite controle e gerenciamento de acesso em nível de arquivo e diretório
   - Compatível com sistemas analíticos comuns de grande escala
 - Habilitado em uma conta de Armazenamento do Azure na opção <b>Namespace Hierárquico</b>
   - Defina durante a criação da conta
   - Atualize a conta de armazenamento
     - Processo de atualização unidirecional
- Arquivos do Azure
  - Compartilhamentos de arquivos na nuvem que podem ser acessados de qualquer lugar que tenha conexão com a Internet
  - Suporte para protocolos comuns de compartilhamento de arquivos:
     - Protocolo SMB
     - NFS (Network File System) – requer camada premium
     - Os dados são replicados para redundância e criptografados quando estão inativos
  - ACL - Lista de Controle de Acessos
- Armazenamento de Tabelas do Azure
  - Armazenamento de <b>chaves-valores</b> para dados de aplicativos
  - As tabelas consistem em colunas de chave e valor
     - Chaves de partição e linha
     - Colunas personalizadas de propriedade para valores de dados
        - Uma coluna Timestamp é adicionada automaticamente para registrar alterações de dados
  - As linhas são agrupadas em partições para melhorar o desempenho
  - As colunas de propriedade recebem um tipo de dados e podem conter qualquer valor desse tipo
      - As linhas não precisam incluir as mesmas colunas de propriedade
- OBS:
 - Redundância
  - LRS -> Dentro do Rack
  - ZRS -> Dentro do Datacenter
  - GRS -> Dentro da Região
  - GZRS -> Combinação
  - RA (Prefixo) -> Somente Leitura
   - Ex: RA-LRS
  - Redundância de <b>Região</b> -> Zonas de Disponibilidade

. Azure Cosmos DB
--------------------
- Um sistema de gerenciamento de banco de dados NoSQL de vários modelos e escala global
  - Suporte para várias APIs de armazenamento
  - Acesso em tempo real com desempenho rápido de leitura e gravação
  - Gravações em várias regiões para replicar dados globalmente, permitindo que usuários em regiões especificadas trabalhem com uma réplica local
  - Documentos
  - Gráficos
  - Tabela de chaves-valores
  - Repositórios de famílias de colunas
  - Suporta um modelo multi-mestre
  - Supota relacionamentos
- APIs do Azure Cosmos DB
 - API do Core (SQL)
    - API nativa para Cosmos DB
    - Consultas SQL baseadas em documentos JSON
    - Ex: (Select SQL e retorna JSON)
    - Definir no nível do contêiner
      - chave de partição
      - taxa de transferência
 - API do MongoDB
   - Compatibilidade com o MongoDB, um banco de dados conhecido baseado em documentos de código aberto
   - Ex de consulta MongoDB: db.products.find({ id: 123})
   - Retorna JSON
 - API de Tabela
   - API de armazenamento de chaves-valores
   - Compatível com o Armazenamento de Tabelas do Azure, mas com maior desempenho e escalabilidade
- API do Cassandra
  - Compatibilidade com o Apache Cassandra, um banco de dados conhecido de família de colunas de código aberto
- API do Gremlin
  - Usado para trabalhar com dados de gráfico/grafos, nós de entidade (vértices) são conectados por meio de relacionamentos (bordas)

. OBS:
--------------
- Data Wharehouse
  - DB Estruturados
  - DB Semiestruturados
- Data Lake
  - Não estruturados
  - Ex: .CSV
  - função (RBAC)
  - listas de controle de acesso (ACLs) compatíveis com POSIX
- Para configurar uma conta de armazenamento do Azure para dar suporte à segurança no nível da pasta e à manipulação de diretório <b>atômico</b>, habilite o namespace <b>hierárquico</b>.
- Tipos de armazenamento <b>colunar</b> (Para informações tipo chave/valor com chaves diversas ex: (id, nome, tel), (id, nome, nascimento)
- Comando para criar um recurso do Azure para armazenar dados no armazenamento de Tabelas do Azure (az storage account create)
