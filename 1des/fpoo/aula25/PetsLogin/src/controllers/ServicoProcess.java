package controllers;

import java.util.ArrayList;

import domains.Servico;
import domains.dao.ServicoDAO;

public class ServicoProcess {

	public static ArrayList<Servico> servicos = new ArrayList<>();
	private static ServicoDAO sd = new ServicoDAO();
	
	public static void abrir() {
		servicos = sd.ler();
	}
	
	public static void salvar() {
		sd.escrever(servicos);
	}
}
