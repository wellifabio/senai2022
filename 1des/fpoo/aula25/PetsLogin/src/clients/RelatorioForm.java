package clients;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controllers.PetProcess;
import controllers.ServicoProcess;
import controllers.UsuarioProcess;
import domains.Pet;
import domains.Servico;
import domains.Usuario;

public class RelatorioForm extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel cabecalho = new JLabel("Data_______   Pet________   Usuario_____  Tipo________");
	private JTextField tfData, tfPet, tfUsuario, tfTipo;
	private JTextArea areaRelatorio;
	private JScrollPane rolagem;
	private JButton pet, usuario, servico;
	private String imgIco = "./assets/icone.png";
	private String resultados = "";

	public RelatorioForm() {
		setTitle("Relatórios de Serviços");
		setBounds(150, 170, 800, 600);
		setIconImage(new ImageIcon(imgIco).getImage());
		painel = new JPanel();
		painel.setBackground(new Color(255, 233, 213));
		setContentPane(painel);
		setLayout(null);

		cabecalho.setBounds(20, 10, 760, 15);
		painel.add(cabecalho);

		tfData = new JTextField();

		tfPet = new JTextField();
		tfUsuario = new JTextField();
		tfTipo = new JTextField();
		tfData.setBounds(20, 25, 80, 20);
		tfPet.setBounds(105, 25, 80, 20);
		tfUsuario.setBounds(190, 25, 80, 20);
		tfTipo.setBounds(275, 25, 80, 20);
		painel.add(tfData);
		painel.add(tfPet);
		painel.add(tfUsuario);
		painel.add(tfTipo);

		areaRelatorio = new JTextArea();
		areaRelatorio.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
		rolagem = new JScrollPane(areaRelatorio);
		rolagem.setBounds(20, 50, 745, 490);
		painel.add(rolagem);

		pet = new JButton("Pets");
		usuario = new JButton("Usuários");
		servico = new JButton("Serviços");
		servico.setBounds(360, 15, 100, 30);
		usuario.setBounds(460, 15, 100, 30);
		pet.setBounds(560, 15, 100, 30);
		painel.add(pet);
		painel.add(usuario);
		painel.add(servico);

		pet.addActionListener(this);
		usuario.addActionListener(this);
		servico.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pet) {
			pets();
		}
		if (e.getSource() == usuario) {
			usuarios();
		}
		if (e.getSource() == servico) {
			servicos();
		}
	}

	private void servicos() {
		resultados = "Relatório Geral de Serviços";
		resultados += "\n___________________________________________________________________________________\n";
		if (tfData.getText().length() > 0 || tfPet.getText().length() > 0 || tfUsuario.getText().length() > 0
				|| tfTipo.getText().length() > 0) {
			for (Servico s : ServicoProcess.servicos) {
				if (s.getPet().getId("s").contains(tfPet.getText())
						&& s.getTipo().toUpperCase().contains(tfTipo.getText().toUpperCase())
						&& s.getUsuario().getLogin().toUpperCase().contains(tfUsuario.getText().toUpperCase())
						&& s.getData("s").contains(tfData.getText()))
					resultados += s.toString();
			}
		} else {
			for (Servico s : ServicoProcess.servicos) {
				resultados += s.toString();
			}
		}
		resultados += "___________________________________________________________________________________\n";
		resultados += "Data: " + new Date().toString();
		areaRelatorio.setText(resultados);
	}

	private void usuarios() {
		resultados = "Relatório de Serviços por Usuários";
		resultados += "\n__________________________________________________________________________________________________\n";
		if (tfData.getText().length() > 0 || tfPet.getText().length() > 0 || tfUsuario.getText().length() > 0
				|| tfTipo.getText().length() > 0) {
			for (Usuario u : UsuarioProcess.usuarios) {
				if (u.getLogin().toUpperCase().contains(tfUsuario.getText().toUpperCase())) {
					resultados += "\n	Usuário: " + u.getLogin();
					resultados += "\n_____________________________________________________________________________________________\n";
					for (Servico s : ServicoProcess.servicos) {
						if (u.getLogin().equals(s.getUsuario().getLogin()))
							if (s.getPet().getId("s").contains(tfPet.getText())
									&& s.getTipo().toUpperCase().contains(tfTipo.getText().toUpperCase())
									&& s.getData("s").contains(tfData.getText()))
								resultados += "\t" + s.toString();
					}
					resultados += "\n_____________________________________________________________________________________________\n";
				}
			}
		} else {
			for (Usuario u : UsuarioProcess.usuarios) {
				resultados += "\n	Usuário: " + u.getLogin();
				resultados += "\n_____________________________________________________________________________________________\n";
				for (Servico s : ServicoProcess.servicos) {
					if (u.getLogin().equals(s.getUsuario().getLogin()))
						resultados += "\t" + s.toString();
				}
				resultados += "\n_____________________________________________________________________________________________\n";
			}
		}
		resultados += "__________________________________________________________________________________________________\n";
		resultados += "Data: " + new Date().toString();
		areaRelatorio.setText(resultados);
	}

	private void pets() {
		resultados = "Relatório de Serviços por Pets";
		resultados += "\n__________________________________________________________________________________________________________\n";
		if (tfData.getText().length() > 0 || tfPet.getText().length() > 0 || tfUsuario.getText().length() > 0
				|| tfTipo.getText().length() > 0) {
			for (Pet p : PetProcess.pets) {
				if (p.getId("s").contains(tfPet.getText())) {
					resultados += p.toString();
					resultados += "________________________________________________________________________________________________________\n";
					for (Servico s : ServicoProcess.servicos) {
						if (p.getId() == s.getPet().getId())
							if (s.getTipo().toUpperCase().contains(tfTipo.getText().toUpperCase())
									&& s.getUsuario().getLogin().toUpperCase()
											.contains(tfUsuario.getText().toUpperCase())
									&& s.getData("s").contains(tfData.getText()))
								resultados += "\t" + s.toString();
					}
					resultados += "_________________________________________________________________________________________________________\n";
				}
			}
		} else {
			for (Pet p : PetProcess.pets) {
				resultados += p.toString();
				resultados += "________________________________________________________________________________________________________\n";
				for (Servico s : ServicoProcess.servicos) {
					if (p.getId() == s.getPet().getId())
						resultados += "\t" + s.toString();
				}
				resultados += "_________________________________________________________________________________________________________\n";
			}
		}
		resultados += "__________________________________________________________________________________________________________\n";
		resultados += "Data: " + new Date().toString();
		areaRelatorio.setText(resultados);
	}

	public static void main(String[] args) {
		UsuarioProcess.abrir();
		PetProcess.abrir();
		ServicoProcess.abrir();
		new RelatorioForm().setVisible(true);
	}
}
