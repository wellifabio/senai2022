package visao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Telalogin extends JFrame{

	private static final long serialVersionUID = 1L;
	//Atributos da tela
	private JPanel painel;
	private JLabel rotulo1, rotulo2;
	private JTextField email, senha;
	private JButton login;
	
	Telalogin(){
		//Propriedades Básicas
		setTitle("Tela de Login");
		setBounds(600,300,360,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);
		
		//Conteúdos da tela
		rotulo1 = new JLabel("Email:");
		rotulo1.setBounds(20,20,100,20);
		email = new JTextField();
		email.setBounds(120,20,200,30);
		rotulo2 = new JLabel("Senha:");
		rotulo2.setBounds(20,60,100,20);
		senha = new JTextField();
		senha.setBounds(120,60,200,30);
		login = new JButton("Login");
		login.setBounds(120,100,200,30);
		
		painel.add(rotulo1);
		painel.add(email);
		painel.add(rotulo2);
		painel.add(senha);
		painel.add(login);
	}
	
	public static void main(String[] args) {
		Telalogin tela = new Telalogin();
		tela.setVisible(true);
	}

}
