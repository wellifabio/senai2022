# Avaliação Front-End

## Preparação do Projeto

- [ ]  Definir workspace (Criar pasta de desenvolvimento e abrir com o VSCode)
- [ ]  Criar as pastas para cada página e os arquivos .html, .css e .js

## **Criação da tela de login**

- [ ]  Criar estrutura html
- [ ]  Conectar os arquivos de estilização e script
- [ ]  Definir a estrutura (inputs para o usuário e senha e um botão para efetuar o login)

---

**Definição do script**

- [ ]  Criar uma função para o login
    - [ ]  Obter os dados digitados pelo usuário nos inputs
    - [ ]  Armazena-los em uma estrutura JSON
    - [ ]  Criar estrutura fetch com url e configurações da requisição
    - [ ]  Dentro da estrutura fetch, caso obtenha sucesso no login armazenar o retorno no localstorage e redirecionar para página home. Caso contrário apresentar uma mensagem de erro para o usuário

---

- [ ]  Criar a estilização

## **Criação da tela de exibição dos salgados**

- [ ]  Criar estrutura html
- [ ]  Conectar os arquivos de estilização e script
- [ ]  Definir a estrutura (menu de navegação entre as páginas e modelo para exibição dos salgados)

---

**Definição do script**

- [ ]  Criar uma função para listar os salgados cadastrados
    - [ ]  Criar um fetch para solicitar a lista de salgados cadastrados
    - [ ]  Dentro da estrutura fetch, quando obter o retorno com o vetor de salgados cadastrados, percorrê-lo, clonar o modelo de exibição, substituir os valores e adicionar a lista
- [ ]  Criar uma função para deletar salgado utilizando fetch
- [ ]  Criar uma função exibir os comentários relacionados a um salgado
    - [ ]  Abrir um modal na mesma página para exibir os comentários
        
        **ou**
        
    - [ ]  Armazenar o ID do salgado no localstorage e navegar para a página de comentários

---

- [ ]  Criar a estilização

## **Criação da tela para cadastrar um salgado**

- [ ]  Criar estrutura html
- [ ]  Conectar os arquivos de estilização e script
- [ ]  Definir a estrutura (Inputs necessários para preenchimento das informações e botão para cadastrar)

---

**Definição do script**

- [ ]  Criar uma função para cadastrar um novo salgado
    - [ ]  Obter os dados digitados pelo usuário nos inputs
    - [ ]  Armazena-los em uma estrutura JSON
    - [ ]  Criar estrutura fetch com url e configurações da requisição
    - [ ]  Dentro da estrutura fetch, caso obtenha sucesso no cadastro redicionar para a tela de exibição. Em caso de erro exibir mensagem de falha para o usuário.

---

- [ ]  Criar a estilização