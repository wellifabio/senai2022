.GUI (Graphics User Interface)
------------
- Exemplo com um sistema simples de Login com tela Gráfica e base de dados .CSV:
	- Login/src (Códigos MVC do sistema como um todo)
	- Login/dados (Bando de dados semi-estruturado tipo CSV)
	- Login/doc (Documento do projeto UML [Diagrama de Casos de Uso, Diagrama de Classes e Protótipo])
- LoginMVC.png (Esboço da aula com os principais tópicos)
- Exemplo com um sistema de Cadastro de Pets/Animais com tela Gráfica e base de dados .CSV:
	- Pets/src (Códigos MVC do sistema como um todo)
	- Pets/dados (Bando de dados semi-estruturado tipo CSV)
	- Pets/assets (Imagens utilizadas na interface gráfica GUI)
	- Pets/doc (Documento do projeto UML [Diagrama de Casos de Uso, Diagrama de Classes e Protótipo])
------------
.Elementos Gráficos externos
------------
- String caminhoAbsoluto = "C:\\Users\\Aluno.DSN5131112167\\Desktop\\gui\\Pets\\assets\\miau.png"
- String caminhoRelativo = "./assets/miau.png"
------------
.CRUD (Create, Read, Update, Delete)
------------
- Create: Cadastro
	- A primeira funcionalidade (inserir, criar, cadastrar)
- Read: Listar, Filtrar, Buscar
	- Listar: listar todos
	- Filtrar: Listar usando um critério "Só os da data de hoje"
	- Buscar: campo Chave: deve ser único.
	- Índice x Id (Id é chave, índice não, Id é para o Usuário, Índice é para o Programa)
	- Índice x Id Exemplo:
		<table>
			<tr><td>Indice</td><td>Id</td></tr>
			<tr><td>0</td><td>1</td></tr>
			<tr><td>1</td><td>2</td></tr>
			<tr><td>2</td><td>4</td></tr>
			<tr><td>3</td><td>5</td></tr>
			<tr><td>4</td><td>7</td></tr>
		</table>
	- Entendendo Equals And HashCode https://www.youtube.com/watch?v=T008B4vURk4
- Delete:
	- 1º utilizamos o Buscar do Read para encontrar o registro a ser excluído
	- 2º Utilizamos o método .contains() para encontrar verificar e encontrar o índice
	- 3º E efetivamente excluímos com o método .remove()
- Update:
	- Utilizamos a soma das estruturas do DELETE e do CREATE
	- Ao invés do método .add() utilizamos o método set()
-------------
.DAO (Data Access Object)
-------------
	- Como estamos utilizando arquivos .CSV separados por ";" como Banco de Dados
	- Podemos criar uma classe DAO com apenas dois métodos ler() e escrever()
	- BufferedReader br e BufferedWriter bw
	- Esta classe pode estar no Modelo ou Controle do MVC
	- Ela será instânciada no Controle/Process onde criamos métodos abrir() e salvar()
	- Na interface com o usuário, antes de abrir o Formulário chamamos o método abrir()
	- Em cada alteração nos botões Create, Update e Delete chamamos o método salvar()
--------------	