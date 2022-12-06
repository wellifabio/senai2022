# GUI (Graphics User Interface)
- Tela de interação com usuário
- Bibliotecas
	- JOptionPane (Mensagens de Entrada e Saída)
		- showMessageDialog("Saída")
		- showImputDialog("Entrada")
	- extends JFrame -> Quadro, tela de relacionento com o usuáruio (Formulário),
	- JPanel -> Painel onde colocamos os objetos, semelhante ao CSS quanto a posicionamento em pixels
	- JLabel -> Rótulos, textos expplicativos,
	- JTextField -> Campos de entrada de dados
	- JTextArea -> Area de texto grande (Saída/Entrada).
	- JButon -> Botões de ação
	- implements ActionListener - Ouvir os eventos / clicar no botão
	- Método actionPerformed(evento) -> onde implementamos os códicos dos eventos

# extends (Herança de Classes (Mãe >> Filha))
- No exemplo nossa classe Filha Formulario herda as propriedades da tela JFrame
- Cada filha pode ter apenas uma Mãe
- Caso precise de mais recursos como neste caso precisamos das ações de click nos botões
- Utilizamos implements

# implements (Implementar intrfaces)
- <b>Interfaces</b> são classes que possuem apenas métodos (assinaturas de métodos a serem implementados)
- Neste caso nós implementamos o método actionPerformed() da interface ActionListener que escuta os clicks nos botões
	
# Exemplo (GUI)
- Com a utilização de telas, precisamos também de eventos
- Por isso nossa programação evolui para <b>Orientada a Eventos</b>
- Temos um exemplo com programação Estrutural orientada a evento e um exemplo com POO

# Exercícios
- 1. "Avaliação de Saúde" - Crie um programa orientado a objeto <img src="./docs/classe_paciente.png"> e interface gráfica.<br/>
O um formulário deve ter os campos nome, peso e altura e ao clicar no botão "Calcular" deve mostrar o IMC do paciente e um diagnóstico:<br/>
Abaixo do peso, Peso normal, Acima do Peso ou Obesidade.<br/>
<img src="./docs/paciente1.png"><br/>
Crie o formulário conforme a imagem
- 2. "Doação de Sangue" - Crie um programa orientado a objeto <img src="./docs/classe_doador.png"> e interface gráfica.<br/>
O um formulário deve ter os campos nome, idade e sexo e ao clicar no botão "Calcular" mostrar se o doador está apto ou não a doar<br/>
Conforme os critérios: idade entre 18 e 69 anos e peso acima de 50kg<br/>
<img src="./docs/doador1.png"><br/>
Crie o formulário conforme a imagem 
