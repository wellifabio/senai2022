Compitar por linha de comando "cmd":
1) Criar uma variável de ambiente apontando para o JDK (C:\Program Files\Java\jdk*versão*\bin)

a) comando cmd para verificar se a variável de ambiente está configurada:
-javac -version

b) Para criar a variável de ambiente acesse:
- (Windows + Pause/Break)
- Configurações avançadas do sistema,
- Em "Variáveis do Sistema" clique em "Novo".
- Nome da Variável: JAVA_HOME
- Valor da Variável: C:\Program Files\Java\jdk1.8.0_144\bin

c)Configurar o path, adicionar ao final:
-;%JAVA_HOME%

2) Escrever o programa sem referência a pacotes, colocar codificação de caracteres ANSI e salvar com a extenção .java

3) Para compilar digitar o comando (javac Arquivo.java)

4) Para executar digitar o comando (java Arquivo)

Vídeo eplicativo: https://www.youtube.com/watch?v=BHvI_IQkAYg