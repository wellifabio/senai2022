package models.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import models.Orcamento;

public class OrcamentoDAO {
	private BufferedReader br;
	private BufferedWriter bw;
	private String path = "./bd/orcamentos.csv";

	public ArrayList<Orcamento> ler() {
		ArrayList<Orcamento> linhas = new ArrayList<>();
		Orcamento Orcamento;
		try {
			br = new BufferedReader(new FileReader(path));
			String linha = br.readLine();
			while(linha != null) {
				Orcamento = new Orcamento(linha);
				linhas.add(Orcamento);
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return linhas;
	}
	
	public void escrever(ArrayList<Orcamento> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(path));
			for (Orcamento o : linhas) {
				bw.write(o.toCSV());
			}
			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
