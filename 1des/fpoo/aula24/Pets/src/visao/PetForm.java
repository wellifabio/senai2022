package visao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PetForm extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel id, especie, nomePet, raca, peso, nascimento, nomeDono, telefone, rotulos, imagem;
	private JTextField tfId, tfNomePet, tfRaca, tfPeso, tfNascimento, tfNomeDono, tfTelefone;
	private JComboBox<String> cbEspecie;
	private JTextArea verResultados;
	private JButton create, read, update, delete;
	private String imgIco = "C:\\Users\\Professor\\Desktop\\work\\Pets\\assets\\icone.png";
	private String[] imagens = { "C:\\Users\\Professor\\Desktop\\work\\Pets\\assets\\doguinho.png",
			"C:\\Users\\Professor\\Desktop\\work\\Pets\\assets\\miau.png",
			"C:\\Users\\Professor\\Desktop\\work\\Pets\\assets\\coelho.png",
			"C:\\Users\\Professor\\Desktop\\work\\Pets\\assets\\ornitorrinco.png" };
	private ImageIcon icon;
	private int autoId = 1;

	PetForm() {
		setTitle("Formulário de Pets");
		setBounds(200, 300, 500, 500);
		setIconImage(new ImageIcon(imgIco).getImage());
		painel = new JPanel();
		painel.setBackground(new Color(255, 233, 213));
		setContentPane(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		id = new JLabel("Id:");
		id.setBounds(20, 20, 120, 30);
		painel.add(id);
		especie = new JLabel("Especie:");
		especie.setBounds(20, 50, 120, 30);
		painel.add(especie);
		nomePet = new JLabel("Nome pet:");
		nomePet.setBounds(20, 80, 120, 30);
		painel.add(nomePet);
		raca = new JLabel("Raça:");
		raca.setBounds(20, 110, 120, 30);
		painel.add(raca);
		peso = new JLabel("Peso:");
		peso.setBounds(20, 140, 120, 30);
		painel.add(peso);
		nascimento = new JLabel("Nascimento:");
		nascimento.setBounds(20, 170, 120, 30);
		painel.add(nascimento);
		nomeDono = new JLabel("Nome dono:");
		nomeDono.setBounds(20, 200, 120, 30);
		painel.add(nomeDono);
		telefone = new JLabel("Telefone:");
		telefone.setBounds(20, 230, 120, 30);
		painel.add(telefone);
		rotulos = new JLabel("Id:     Espécie:       Pet:        Peso:       Idade:       Dono:        Telefone:");
		rotulos.setBounds(20, 260, 400, 30);
		painel.add(rotulos);

		tfId = new JTextField(String.format("%d", autoId));
		tfId.setEditable(false);
		tfId.setBounds(140, 20, 160, 30);
		painel.add(tfId);
		cbEspecie = new JComboBox<String>(new String[] {"Cachorro", "Gato", "Coelho", "Outro" });
		cbEspecie.setBounds(140, 50, 160, 30);
		painel.add(cbEspecie);
		tfNomePet = new JTextField();
		tfNomePet.setBounds(140, 80, 160, 30);
		painel.add(tfNomePet);
		tfRaca = new JTextField();
		tfRaca.setBounds(140, 110, 160, 30);
		painel.add(tfRaca);
		tfPeso = new JTextField();
		tfPeso.setBounds(140, 140, 160, 30);
		painel.add(tfPeso);
		tfNascimento = new JTextField();
		tfNascimento.setBounds(140, 170, 160, 30);
		painel.add(tfNascimento);
		tfNomeDono = new JTextField();
		tfNomeDono.setBounds(140, 200, 160, 30);
		painel.add(tfNomeDono);
		tfTelefone = new JTextField();
		tfTelefone.setBounds(140, 230, 160, 30);
		painel.add(tfTelefone);
		verResultados = new JTextArea();
		verResultados.setEnabled(false);
		verResultados.setBounds(20, 290, 445, 150);
		verResultados.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		painel.add(verResultados);
		imagem = new JLabel();
		imagem.setBounds(310, 145, 150, 115);
		imagem.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		mostrarImagem(0);
		painel.add(imagem);

		create = new JButton("Cadastrar");
		read = new JButton("Buscar");
		update = new JButton("Atualizar");
		delete = new JButton("Excluir");
		create.setBounds(310, 20, 150, 30);
		read.setBounds(310, 50, 150, 30);
		update.setBounds(310, 80, 150, 30);
		delete.setBounds(310, 110, 150, 30);
		update.setEnabled(false);
		delete.setEnabled(false);
		painel.add(create);
		painel.add(read);
		painel.add(update);
		painel.add(delete);

		cbEspecie.addActionListener(this);
		create.addActionListener(this);
		read.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);

	}

	private void mostrarImagem(int indice) {
		icon = new ImageIcon(new ImageIcon(imagens[indice]).getImage().getScaledInstance(150, 115, 100));
		imagem.setIcon(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cbEspecie) {
			mostrarImagem(cbEspecie.getSelectedIndex());
		}
	}

	public static void main(String[] agrs) {
		new PetForm().setVisible(true);
	}

}
