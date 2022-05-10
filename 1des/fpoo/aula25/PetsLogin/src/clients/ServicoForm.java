package clients;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
	private JTable tableServicos, tablePets;
	private DefaultTableModel tableModelServicos, tableModelPets;
	private JButton create, readServico, readPet, update, delete, filtroPet, filtroData, filtroTipo;
	private String imgIco = "./assets/icone.png";
	private int autoId = ServicoProcess.servicos.size() + 1;

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private SimpleDateFormat shf = new SimpleDateFormat("HH:mm");

	public ServicoForm() {
		setTitle("Cadastro de Servi�os");
		setBounds(150, 170, 800, 600);
		setIconImage(new ImageIcon(imgIco).getImage());
		painel = new JPanel();
		painel.setBackground(new Color(255, 233, 213));
		setContentPane(painel);
		setLayout(null);

		id = new JLabel("Id:");
		id.setBounds(20, 20, 120, 30);
		painel.add(id);
		usuario = new JLabel("Usu�rio:");
		usuario.setBounds(20, 55, 120, 30);
		painel.add(usuario);
		pet = new JLabel("Id do pet:");
		pet.setBounds(20, 90, 120, 30);
		painel.add(pet);
		tipo = new JLabel("Tipo de Servo�o:");
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
		tfPet.setEnabled(false);
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

		tableModelPets = new DefaultTableModel();
		tableModelPets.addColumn("Id");
		tableModelPets.addColumn("Espécie");
		tableModelPets.addColumn("Nome Pet");
		tableModelPets.addColumn("Nome Dono");
		tableModelPets.addColumn("Raça");
		if (PetProcess.pets.size() != 0) {
			preencherTabelaPets(PetProcess.pets);
		}
		tablePets = new JTable(tableModelPets);
		rolagem2 = new JScrollPane(tablePets);
		rolagem2.setBounds(405, 60, 350, 240);
		painel.add(rolagem2);
		
		// Evento que pega linha e coluna da tabela que foi selecionada
		tablePets.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int lin = tablePets.getSelectedRow();
				tfPet.setText(tablePets.getValueAt(lin, 0).toString());
			}	
		});
		
		// 1� etapa do READ Monta a tabela
		tableModelServicos = new DefaultTableModel();
		tableModelServicos.addColumn("Id");
		tableModelServicos.addColumn("Usuario");
		tableModelServicos.addColumn("Pet");
		tableModelServicos.addColumn("Tipo");
		tableModelServicos.addColumn("Data");
		tableModelServicos.addColumn("Hora");
		tableModelServicos.addColumn("Valor");
		if (ServicoProcess.servicos.size() != 0) {
			preencherTabelaServicos();
		}
		tableServicos = new JTable(tableModelServicos);
		tableServicos.setEnabled(false);
		rolagem1 = new JScrollPane(tableServicos);
		rolagem1.setBounds(20, 310, 740, 230);
		painel.add(rolagem1);

		create = new JButton("Cadastrar");
		readServico = new JButton("Buscar Servi�o");
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

		filtroPet = new JButton("Pet");
		filtroTipo = new JButton("Tipo");
		filtroData = new JButton("Data");
		filtroPet.setBounds(25, 270, 120, 30);
		filtroTipo.setBounds(150, 270, 120, 30);
		filtroData.setBounds(275, 270, 120, 30);
		painel.add(filtroPet);
		painel.add(filtroTipo);
		painel.add(filtroData);

		// Ouvir os eventos dos Bot�es, ComboBox e outros
		create.addActionListener(this);
		readServico.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);
		readPet.addActionListener(this);
		filtroPet.addActionListener(this);
		filtroTipo.addActionListener(this);
		filtroData.addActionListener(this);
	}

	private ArrayList<Pet> filtroPets(String filtro) {
		ArrayList<Pet> pets = new ArrayList<>();
		if (filtro.equals("")) {
			return PetProcess.pets;
		} else {
			if (filtro.length() > 0)
				for (Pet p : PetProcess.pets) {
					if (p.getEspecie().toUpperCase().contains(filtro.toUpperCase())
							|| p.getNomePet().toUpperCase().contains(filtro.toUpperCase())
							|| p.getEspecie().toUpperCase().contains(filtro.toUpperCase()))
						pets.add(p);
				}
		}
		return pets;
	}

	// CREATE - CRUD
	private void cadastrar() {
		if (tfPet.getText().length() > 0 && tfData.getText().length() > 0 && tfHora.getText().length() > 0
				&& tfValor.getText().length() > 0) {
			ServicoProcess.servicos.add(new Servico(tfId.getText(), tfUsuario.getText(), tfPet.getText(),
					cbTipo.getSelectedItem().toString(), tfData.getText(), tfHora.getText(), tfValor.getText()));
			preencherTabelaServicos();
			autoId++;
			limparCampos();
			ServicoProcess.salvar();
		} else {
			JOptionPane.showMessageDialog(this, "Preencha todos os campos");
		}
	}

	private void limparCampos() {
		tfId.setText(String.format("%d", autoId));
		tfUsuario.setText(UsuarioProcess.LoginUsusarioConectado);
		tfPet.setText(null);
		tfData.setText(sdf.format(new Date()));
		tfHora.setText(shf.format(new Date()));
		tfValor.setText(null);
	}

	private void preencherTabelaServicos() {
		int totLinhas = tableModelServicos.getRowCount();
		if (tableModelServicos.getRowCount() > 0) {
			for (int i = 0; i < totLinhas; i++) {
				tableModelServicos.removeRow(0);
			}
		}
		for (Servico s : ServicoProcess.servicos) {
			tableModelServicos.addRow(s.toVetor());
		}
	}

	private void preencherTabelaPets(ArrayList<Pet> pets) {
		int totLinhas = tableModelPets.getRowCount();
		if (tableModelPets.getRowCount() > 0) {
			for (int i = 0; i < totLinhas; i++) {
				tableModelPets.removeRow(0);
			}
		}
		for (Pet p : pets) {
			tableModelPets.addRow(
					new String[] { p.getId("s"), p.getEspecie(), p.getNomePet(), p.getNomeDono(), p.getRaca() });
		}
	}

	// READ - CRUD
	private void buscarServico() {
	}

	private void buscarPet() {
		String filtro = JOptionPane.showInputDialog(this, "Digite o nome ou esp�cie ou deixe em branco para todos");
		if (filtro != null)
			preencherTabelaPets(filtroPets(filtro));
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
