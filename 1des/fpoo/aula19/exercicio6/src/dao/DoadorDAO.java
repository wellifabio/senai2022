package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class DoadorDAO {
	BufferedWriter bw;
	String arquivo = "./bd/doadores.csv";
	public void salvar(String dados) {
		try {
			bw = new BufferedWriter(new FileWriter(arquivo));
			bw.write(dados);
			bw.close();
		} catch (IOException e) {
			JOptionPane.showConfirmDialog(null, "Erro ao salvar dados");
		}
	}
}