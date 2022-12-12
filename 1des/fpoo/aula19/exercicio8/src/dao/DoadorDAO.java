package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelos.Doador;

public class DoadorDAO {
	BufferedWriter bw;
	BufferedReader br;
	String arquivo = "./bd/doadores.csv";
	
	public ArrayList<Doador> abrir() {
		ArrayList<Doador> doadores = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(arquivo));
			String linha = br.readLine();
			while(linha != null) {
				doadores.add(new Doador(linha));
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showConfirmDialog(null, "Arquivo não encontrado");
		} catch (IOException e) {
			JOptionPane.showConfirmDialog(null, "Erro ao ler o arquivo");
		}
		return doadores;
	}
	
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