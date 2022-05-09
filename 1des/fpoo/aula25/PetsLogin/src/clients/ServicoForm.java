package clients;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controllers.PetProcess;
import controllers.ServicoProcess;
import controllers.UsuarioProcess;
import domains.Pet;
import domains.Servico;

public class ServicoForm extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel id, usuario, pet, tipo, data, hora, valor;
	private JTextField tfId, tfUsuario, tfPet, tfData, tfHora, tfValor;
	private JComboBox<String> cbTipo;
	private JScrollPane rolagem1, rolagem2;
	private JTextArea taPets;
	private JTable table;
	private DefaultTableModel tableModel;
	private JButton create, readServico, readPet, update, delete;
	private String imgIco = "./assets/icone.png";
	private int autoId = ServicoProcess.servicos.size() + 1;

	private final Locale BRASIL = new Locale("pt", "BR");
	private DecimalFormat df = new DecimalFormat("#.00");
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private SimpleDateFormat shf = new SimpleDateFormat("HH:mm");

	public ServicoForm() {
		setTitle("Cadastro de Serviços");
		setBounds(150, 170, 800, 600);
		setIconImage(new ImageIcon(imgIco).getImage());
		painel = new JPanel();
		painel.setBackground(new Color(255, 233, 213));
		setContentPane(painel);
		setLayout(null);

		id = new JLabel("Id:");
		id.setBounds(20, 20, 120, 30);
		painel.add(id);
		usuario = new JLabel("Usuário:");
		usuario.setBounds(20, 55, 120, 30);
		painel.add(usuario);
		pet = new JLabel("Id do pet:");
		pet.setBounds(20, 90, 120, 30);
		painel.add(pet);
		tipo = new JLabel("Tipo de Servoço:");
		tipo.setBounds(20, 125, 120, 30);
		painel.add(tipo);
		data = new JLabel("Data:");
		data.setBounds(20, 165, 120, 30);
		painel.add(data);
		hora = new JLabel("Hora:");
		hora.setBounds(20, 200, 120, 30);
		painel.add(hora);
		valor = new JLabel("Valor:");
		valor.setBounds(20, 235, 120, 30);
		painel.add(valor);

		tfId = new JTextField(String.format("%d", autoId));
		tfId.setEditable(false);
		tfId.setBounds(140, 25, 140, 30);
		painel.add(tfId);
		tfUsuario = new JTextField(UsuarioProcess.LoginUsusarioConectado);
		tfUsuario.setBounds(140, 60, 255, 30);
		tfUsuario.setEnabled(false);
		painel.add(tfUsuario);
		tfPet = new JTextField();
		tfPet.setBounds(140, 95, 140, 30);
		painel.add(tfPet);
		cbTipo = new JComboBox<String>(new String[] { "Banho", "Tosa", "Outro" });
		cbTipo.setBounds(140, 130, 255, 30);
		painel.add(cbTipo);
		tfData = new JTextField(sdf.format(new Date()));
		tfData.setBounds(140, 165, 255, 30);
		painel.add(tfData);
		tfHora = new JTextField(shf.format(new Date()));
		tfHora.setBounds(140, 200, 255, 30);
		painel.add(tfHora);
		tfValor = new JTextField();
		tfValor.setBounds(140, 235, 255, 30);
		painel.add(tfValor);

		taPets = new JTextArea(filtroPets(""));
		rolagem2 = new JScrollPane(taPets);
		rolagem2.setBounds(405, 60, 350, 240);
		painel.add(rolagem2);

		// 1º etapa do READ Monta a tabela
		table = new JTable();
		tableModel = new DefaultTableModel();
		tableModel.addColumn("Id");
		tableModel.addColumn("Usuario");
		tableModel.addColumn("Pet");
		tableModel.addColumn("Tipo");
		tableModel.addColumn("Data");
		tableModel.addColumn("Hora");
		tableModel.addColumn("Valor");
		if (PetProcess.pets.size() != 0) {
			preencherTabela();
		}
		table = new JTable(tableModel);
		table.setEnabled(false);
		rolagem1 = new JScrollPane(table);
		rolagem1.setBounds(20, 310, 740, 230);
		painel.add(rolagem1);

		create = new JButton("Cadastrar");
		readServico = new JButton("Buscar Serviço");
		update = new JButton("Atualizar");
		delete = new JButton("Excluir");
		create.setBounds(285, 25, 110, 30);
		readServico.setBounds(405, 25, 110, 30);
		update.setBounds(525, 25, 110, 30);
		delete.setBounds(645, 25, 110, 30);
		update.setEnabled(false);
		delete.setEnabled(false);
		painel.add(create);
		painel.add(readServico);
		painel.add(update);
		painel.add(delete);
		readPet = new JButton("Filtrar Pet");
		readPet.setBounds(285, 95, 110, 30);
		painel.add(readPet);

		// Ouvir os eventos dos Botões, ComboBox e outros
		create.addActionListener(this);
		readServico.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);
		readPet.addActionListener(this);
	}

	private String filtroPets(String filtro) {
		String retorno = "";
		if (filtro.equals("")) {
			for (Pet p : PetProcess.pets) {
				retorno += p.toString();
			}
		} else {
			if (filtro.length() > 0)
				for (Pet p : PetProcess.pets) {
					if (p.getEspecie().toUpperCase().contains(filtro.toUpperCase()) || p.getNomePet().toUpperCase().contains(filtro.toUpperCase())
							|| p.getEspecie().toUpperCase().contains(filtro.toUpperCase()))
						retorno += p.toString();
				}
		}
		return retorno;
	}

	// CREATE - CRUD
	private void cadastrar() {
	}

	private void limparCampos() {
		tfId.setText(String.format("%d", autoId));
		tfUsuario.setText(UsuarioProcess.LoginUsusarioConectado);
		tfPet.setText(null);
		tfData.setText(sdf.format(new Date()));
		tfHora.setText(shf.format(new Date()));
		tfValor.setText(null);
	}

	private void preencherTabela() {
		int totLinhas = tableModel.getRowCount();
		if (tableModel.getRowCount() > 0) {
			for (int i = 0; i < totLinhas; i++) {
				tableModel.removeRow(0);
			}
		}
		for (Servico s : ServicoProcess.servicos) {
			tableModel.addRow(s.toVetor());
		}
	}

	// Retornar índice da espécie
	int obterIndiceServico(String servico) {
		switch (servico) {
		case "Banho":
			return 0;
		case "Tosa":
			return 1;
		case "Outro":
			return 2;
		default:
			return -1;
		}
	}

	// READ - CRUD
	private void buscarServico() {
	}

	private void buscarPet() {
		String filtro = JOptionPane.showInputDialog(this,"Digite o nome ou espécie ou deixe em branco para todos");
		if(filtro != null)
			taPets.setText(filtroPets(filtro));
	}

	// UPDATE - CRUD
	private void alterar() {
	}

	// DELETE - CRUD
	private void excluir() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == create) {
			cadastrar();
		}
		if (e.getSource() == readServico) {
			buscarServico();
		}
		if (e.getSource() == update) {
			alterar();
		}
		if (e.getSource() == delete) {
			excluir();
		}
		if (e.getSource() == readPet) {
			buscarPet();
		}
	}
}
