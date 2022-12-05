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