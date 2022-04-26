package controle;

import java.util.ArrayList;

import modelo.Planilha;

public class ProcessaPlanilha {
	
	public static ArrayList<Planilha> linhas = new ArrayList<>();
	private static DAO dao = new DAO();
	
	public static void carregar() {
		linhas = dao.abrir();
	}
	
	public static void enviar(int opcao) {
		switch(opcao) {
		case 1: dao.salvarSoma(linhas); break;
		case 2: dao.salvarSub(linhas); break;
		case 3: dao.salvarMult(linhas); break;
		case 4: dao.salvarDiv(linhas); break;
		case 5:
			System.out.println("Adeus");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}
	
}
