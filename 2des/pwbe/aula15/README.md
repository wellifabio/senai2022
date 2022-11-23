# VPF01 - Back-End - Design Patterns
- 1. A partir dos três arquivos CSV na pasta "docs":
    - A. Crie um Modelo Conceitual MER x DER do banco de dados e salve em uma pasta chamada "docs/der.png"
    - B. Crie um script de Criação DDL e Inserção dos dados DML conforme arquivos CSV, salvem em "docs/script.sql"
        - OBS: você pode inserir os dados via comandos DML (INSERT INTO) ou importar os dados (LOAD DATA INFILE)
    - C. Crie uma view que junte os dados das três tabelas (p.id, p.nome, p.especialidade, c.id, c.paciente, c.data, c.horario, t.id, t.tratamento, t.valor)
        - OBS: profissionais p, consultas c, tratamentos t
- 2. Crie uma API com 7 End Points no padrão de projeto MVC, crie em uma pasta chamada "back"
    - A. Read de Profissionais (1 EndPoint) "/profissionais/read/"
    - B. Read de Consultas (1 EndPoint) "/consultas/read/"
    - C. CRUD de Tratamentos (4 EndPoint) "/tratamentos/create/", "/tratamentos/read/", "/tratamentos/update/", "/tratamentos/delete/"
    - D. Read Tratamentos por id do Profissional (1 EndPoint) "/tratamentos/profissional/:id" (Utilize o Gof Pattern Composite)
        - OBS: o result deve vir no formato apresentado no arquivo "docs/composite.json"
- 3. Exporte o arquivo de testes do Insomnia e salve na pasta "docs/insomnia.json"
- 4. Deixe a estrutura de pastas de seu projeto organizada
    - Uma única pasta com o nome do projeto "dentistas"
    - Dentro desta pasta uma chamada "docs" contendo o script.sql, o der.png, os arquivos CSV e JSON
    - Também dentro da pasta de seu projeto a API NodeJS em uma pasta chamada "back"
- 5. Crie um repositório público no GitHub com o nome do seu projeto "dentistas", suba seu projeto e apresente ao professor.

# Critérios de avaliação
- 1. <b>Identificar as características de programação backend em ambiente web</b>
	- Evidência: Criou ao menos um EndPoint Read (Crítico)
- 2. <b>Preparar o ambiente necessário ao desenvolvimento back-end para a plataforma web</b>
	- Evidência: Instalou as dependências básicas para o funcionamento da API (Crítico)
- 3. <b>Definir os elementos de entrada, processamento e saída para a programação da aplicação web</b>
	- Evidência: Criou ao menos dois EndPoint Create e Read (Crítico)
- 4. <b>Utilizar design patterns no desenvolvimento da aplicação web</b>
	- Evidência: Estruturar o projeto em MVC, ao menos VC(Rotas e Controller) (Crítico)
- 5. <b>Definir os frameworks a serem utilizados no desenvolvimento da aplicação web</b>
	- Evidência: NodeJS, express, cors, mysql (Rotas e Controller) (Crítico)
- 6. <b>Utilizar interações com base de dados para desenvolvimento de sistemas web</b>
	- Evidência: A API deve estar conectada ao BD (Crítico)
- 7. Transferir arquivos entre cliente e servidor por meio da aplicação web
	- Evidência: Para este desafio não é necessário, porém se desejar enviar o avatar/foto do profissional (Desejável)
- 8. Estabelecer envio de notificações entre cliente e servidor por meio de aplicação web
	- Evidência: Utilizar os códigos HTTP adequados ex: 200 OK, 201 criado e mensagens de erro (Desejável)
- 9. <b>Desenvolver API (web services) para integração de dados entre plataformas</b>
	- Evidência: Utilizar o framework cors na configuração padrão (Crítico)
- 10. Desenvolver sistemas web de acordo com as regras de negócio estabelecidas
	- Evidência: Deixe a estrutura de pastas de seu projeto organizada e com 7 End Points (Desejável)
- 11. Publicar a aplicação web
	- Evidência: Para este projeto não é necessário, apenas colocá-lo em um repositório Git Publico (Desejável)
- 12. Demonstrar atenção a detalhes (27)
	- Evidência: Executar todas as 5 tarefas conforme solicitado (Desejável)
- 13. Demonstrar capacidade de comunicação com profissionais de diferentes áreas e especialidades (4)
	- Evidência: Seguir o padrão de projeto MVC e Código limpo (Desejável)
- 14. Demonstrar capacidade de organização (4)
	- Evidência: Aplicar as técnicas de Código limpo (Desejável)
- 15. Demonstrar raciocínio lógico na organização das informações (14)
	- Evidência: Os requisitos/EndPoints devem ser implementados com sucesso "Passar nos testes via Insomnia" (Desejável)
- 16. Demonstrar visão sistêmica (16)
	- Evidência: O back-end deve se comunicar com o Banco de Dados "Passar no teste ponto a ponto" (Desejável)
- 17. Seguir método de trabalho (15)
	- Evidência: Seguir o padrão de projeto MVC e Código limpo, organização das pastas (Desejável)

# Níveis de desempenho
<table>
<tr><th>NÍVEIS DE DESEMPENHO</th><th>NÍVEIS</th><th>NOTA</th></tr>
<tr><td>Atingiu todos os critérios críticos e desejáveis</td><td>1</td><td>100</td></tr>
<tr><td>Atingiu todos os critérios críticos e 9 desejáveis</td><td>2</td><td>95</td></tr>
<tr><td>Atingiu todos os critérios críticos e 8 desejáveis</td><td>3</td><td>90</td></tr>
<tr><td>Atingiu todos os critérios críticos e 7 desejáveis</td><td>4</td><td>85</td></tr>
<tr><td>Atingiu todos os critérios críticos e 6 desejáveis</td><td>5</td><td>80</td></tr>
<tr><td>Atingiu todos os critérios críticos e 5 desejáveis</td><td>6</td><td>75</td></tr>
<tr><td>Atingiu todos os critérios críticos e 4 desejáveis</td><td>7</td><td>70</td></tr>
<tr><td>Atingiu todos os critérios críticos e 3 desejáveis</td><td>8</td><td>65</td></tr>
<tr><td>Atingiu todos os critérios críticos e 2 desejáveis</td><td>9</td><td>60</td></tr>
<tr><td>Atingiu todos os critérios críticos e 1 desejáveis</td><td>10</td><td>55</td></tr>
<tr><td>Atingiu todos os critérios críticos </td><td>11</td><td>50</td></tr>
<tr><td>Atingiu 6 critérios críticos<td>12</td><td>40</td></tr>
<tr><td>Atingiu 5 critérios críticos<td>13</td><td>30</td></tr>
<tr><td>Atingiu 3 critérios críticos<td>14</td><td>20</td></tr>
<tr><td>Atingiu 1critério crítico</td><td>15</td><td>10</td></tr>
</table>