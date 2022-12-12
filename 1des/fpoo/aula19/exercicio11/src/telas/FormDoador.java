package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dao.DoadorDAO;
import modelos.Doador;

public class FormDoador extends JFrame implements ActionListener {

	private static final long serialVersionUID = 4L;
	JPanel painel;
	JLabel lbNome, lbIdade, lbSexo, lbPeso, lbResult;
	JTextField tfNome, tfIdade, tfPeso;
	JComboBox<String> cbSexo;
	JButton btAdicionar, btLimpar;
	JTable taResult;
	DefaultTableModel tableModel;
	JScrollPane barraRolagem;
	DoadorDAO dd = new DoadorDAO();

	FormDoador() {
		setTitle("Doação de Sangue");
		setBounds(500, 200, 640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);

		lbNome = new JLabel("Nome:");
		lbNome.setBounds(10, 10, 100, 30);
		painel.add(lbNome);

		lbIdade = new JLabel("Idade:");
		lbIdade.setBounds(10, 40, 100, 30);
		painel.add(lbIdade);

		lbSexo = new JLabel("Sexo:");
		lbSexo.setBounds(10, 70, 100, 30);
		painel.add(lbSexo);

		lbPeso = new JLabel("Peso:");
		lbPeso.setBounds(300, 70, 100, 30);
		painel.add(lbPeso);

		tfNome = new JTextField();
		tfNome.setBounds(110, 10, 500, 30);
		painel.add(tfNome);

		tfIdade = new JTextField();
		tfIdade.setBounds(110, 40, 500, 30);
		painel.add(tfIdade);

		cbSexo = new JComboBox<String>(new String[] { "M", "F" });
		cbSexo.setBounds(110, 70, 100, 30);
		painel.add(cbSexo);

		tfPeso = new JTextField();
		tfPeso.setBounds(400, 70, 210, 30);
		painel.add(tfPeso);

		lbResult = new JLabel("Resultado:");
		lbResult.setBounds(10, 100, 100, 30);
		painel.add(lbResult);

		btAdicionar = new JButton("Adicionar");
		btAdicionar.setBounds(400, 100, 105, 30);
		painel.add(btAdicionar);
		btAdicionar.addActionListener(this);

		btLimpar = new JButton("Limpar");
		btLimpar.setBounds(505, 100, 105, 30);
		painel.add(btLimpar);
		btLimpar.addActionListener(this);

		tableModel = new DefaultTableModel();
		tableModel.addColumn("Nome");
		tableModel.addColumn("Idade");
		tableModel.addColumn("Sexo");
		tableModel.addColumn("Peso");
		tableModel.addColumn("Diagnóstico");
		preencherTabela();
		taResult = new JTable(tableModel);
		barraRolagem = new JScrollPane(taResult);
		barraRolagem.setBounds(10, 130, 600, 300);
		painel.add(barraRolagem);

	}

	public void preencherTabela() {
		for(Doador d: dd.abrir()) {
			tableModel.addRow(d.toTable());
		}
	}
	
	public void limparTabela() {
		int tamanho = tableModel.getRowCount();
		for (int i = 0; i < tamanho; i++)
			tableModel.removeRow(0);
	}
	
	public void prepararArquivo() {
		int tamanho = tableModel.getRowCount();
		String saidaArquivo = "";
		for (int i = 0; i < tamanho; i++) {
			Doador d = new Doador(tableModel.getValueAt(i, 0).toString(),
					tableModel.getValueAt(i, 1).toString(),
					tableModel.getValueAt(i, 2).toString(),
					tableModel.getValueAt(i, 3).toString());
			saidaArquivo += d.toCSV();
		}
		dd.salvar(saidaArquivo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btLimpar) {
			tfNome.setText("");
			tfIdade.setText("");
			tfPeso.setText("");
			limparTabela();
		}
		if (e.getSource() == btAdicionar) {
			if (tfNome.getText().length() > 0 && tfIdade.getText().length() > 0 && tfPeso.getText().length() > 0) {
				Doador d = new Doador(tfNome.getText(), tfIdade.getText(), cbSexo.getSelectedItem().toString(),
						tfPeso.getText());
				tableModel.addRow(d.toTable());
				prepararArquivo();
			} else {
				JOptionPane.showMessageDialog(this, "Favor preencher todos os campos");
			}
		}
	}
}
