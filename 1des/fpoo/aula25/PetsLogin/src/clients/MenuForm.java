package clients;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuForm extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JMenuBar barraMenu = new JMenuBar();
	private JMenu menuArquivo, menuSistema;
	private JMenuItem itemPets, itemServicos, itemUsuarios, itemDashBoard, itemSair;
	private String imgIco = "./assets/icone.png";
	private String pathFundo = "./assets/fundo.png";
	private ImageIcon fundo;
	private JLabel lbFundo = new JLabel();

	MenuForm(){
		// COnfigurações do Form principal
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("PetShop - Sistema de Serviços");
		setBounds(100, 100, 900, 700);
		setIconImage(new ImageIcon(imgIco).getImage());
		painel = new JPanel();
		painel.setBackground(new Color(255, 233, 213));
		setJMenuBar(barraMenu);
		setContentPane(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		//Imagem de fundo
		fundo = new ImageIcon(new ImageIcon(pathFundo).getImage().getScaledInstance(850,605, 100));
		lbFundo.setIcon(fundo);
		lbFundo.setBounds(20,15,850,605);
		painel.add(lbFundo);
		
		// Barra de Menús
		menuArquivo = new JMenu("Arquivo");
		menuSistema = new JMenu("Sistema");
		barraMenu.add(menuArquivo);
		barraMenu.add(menuSistema);
		itemPets = new JMenuItem("Gestão de Pets");
		itemServicos = new JMenuItem("Gestão de Serviços");
		itemDashBoard = new JMenuItem("Analizar DashBoard");
		itemUsuarios = new JMenuItem("Gestão de Usuários");
		itemSair = new JMenuItem("Sair do Sistema");
		menuArquivo.add(itemPets);
		menuArquivo.add(itemServicos);
		menuArquivo.add(itemDashBoard);
		menuSistema.add(itemUsuarios);
		menuSistema.add(itemSair);
		barraMenu.setBackground(new Color(255, 233, 213));
		
		// Ações do Menú
		itemPets.addActionListener(this);
		itemServicos.addActionListener(this);
		itemDashBoard.addActionListener(this);
		itemUsuarios.addActionListener(this);
		itemSair.addActionListener(this);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == itemPets) {
			PetForm pf = new PetForm();
			pf.setModal(true);
			pf.setVisible(true);
		}
		if(e.getSource() == itemServicos) {
			ServicoForm sf = new ServicoForm();
			sf.setModal(true);
			sf.setVisible(true);
		}
		if(e.getSource() == itemUsuarios) {
			UsuarioForm uf = new UsuarioForm();
			uf.setModal(true);
			uf.setVisible(true);
		}
		if(e.getSource() == itemSair) {
			this.dispose();
		}
	}
}
