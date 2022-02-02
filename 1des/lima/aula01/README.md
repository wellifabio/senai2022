-hyper text market language
	-o que é linguagem de marcação?
		-no caso do html, dizer atraves das tags o que cada parte do texto vai ser


-validação pelo W3C
	-O W3C é uma organização internacional de padrões que desenvolve os pilares de tecnologias Web, logo ao criar uma pagina em html devemos seguir os padrões de normalização


-html
	-<html></html> 
		–Esta tag é o elemento básico da estrutura do HTML. Assim sendo, ela conterá todos os elementos do seu documento. Todo documento HTML deve iniciar e finalizar com essa tag

- head
	- <head></head> 
		–Essa tag delimita o cabeçalho do documento. Não possui nenhum valor visível, porém é capaz de transmitir ao navegador diversas informações muito úteis e essenciais a uma boa apresentação do seu documento HTML

- title
	<title></title> 
		–Essa tag define o título da sua página, o nome que aparecerá na sua aba, janela ou guia. Por esta razão, a tag >title> é de grande importância para o SEO

- body
	<body></body> 
		–Finalmente, a tag que representa o corpo do documento. Em síntese, é nessa tag que todos os elementos visíveis do seu site devem ser inseridos

- meta tags
	- o que são?
		- Uma meta tag (ou meta description) é uma tag HTML usada para descrever o conteúdo de uma página da web. Esta descrição será exibida abaixo do título e do URL da sua página nos resultados do mecanismo de pesquisa.

	- exemplo
		- <meta charset="UTF- 8">

- comentários
	-  <!-- Meu comentário em HTML -->

- semantica

- manipulação
	- fonte
		- <font></font>
			- family
				- Atributo para definir a fonte do texto

			- color
				- Atributo para definir a cor do texto

			- size
				- Atributo para definir o tamanho do texto

	- formatação
		- b
			- <b></b> 
				–Transforma o conteúdo em negrito
		- strong
			- <strong></strong>
				- Dá intensidade ao texto

		- Quando você usa STRONG, você dá um significado para aquela parte especifica do texto. Você diz que ela deve ser lida com mais força, com mais intensidade. Já com o elemento B você apenas marca em negrito o texto, e só. Ou seja, quando um browser para cegos (acho que ainda não existe nenhum assim) lê aquela parte com STRONG, a “voz dele” será alterada, ele passará a ler com mais força, já com o B isso não deve acontecer.

		- i
			- <i></i> 
				–Transforma o conteúdo em itálico
		- em
			- <em></em>
				–Dá enfaze ao conteudo
		
		- O resultado visual é, por padrão o mesmo, ambas as tags renderizam seu conteúdo em itálicos. Mas o significado semântico é diferente. A tag <em> representa ênfase importante de seus conteúdos, enquanto que a tag <i> representa o texto que é iniciado de uma prosa, como uma palavra estrangeira, pensamentos de um personagem ficcional, ou quando o texto se refere á definição de uma palavra em vez de representar seu significado semântico. 

		- sub
			- <sub></sub>
				- Define um texto subscrito

		- sup
			- <sup></sup>
				- Define um texto sobrescrito

		- del
			- <del></del>
				- Deixa o texto taxado

	- parágrafo
		- <p></p>
			- Representa um parágrafo dentro do texto

	- elementos de cabeçalho (h1 - h6)
		- <h1></h1> - Título de maior valor hierárquico
		 <h2></h2>
		 <h3></h3>
		 <h4></h4>
		 <h5></h5>
		 <h6></h6> - Título de menor valor hierárquico
	
	- quebra de linha
		- <br/> 
			–Essa tag não necessita de fechamento, ela executa a função de quebra de linha.
		
		- <hr/> 
			–Essa tag não necessita de fechamento, ela forma uma linha horizontal.

	- alinhamentos
		- align
			- right
				- Alinha o texto para a direita
			
			- left
				- Alinha o texto para a esquerda

			- center
				- Alinha o texto para ao centro