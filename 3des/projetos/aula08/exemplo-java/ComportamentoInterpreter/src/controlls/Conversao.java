package controlls;

public class Conversao {

	private String questao = "";
	private String resposta = "";
	private String de = "";
	private String para = "";
	private String[] partesDaQuestao;
	private double quantidade;

	//Construtor
	public Conversao(String entrada) {
		questao = entrada;
		partesDaQuestao = getEntrada().split(" ");
		de = capitalizar(partesDaQuestao[1]);
		para = paraMinusculas(partesDaQuestao[3]);
		quantidade = Double.valueOf(partesDaQuestao[0]);
		resposta = partesDaQuestao[0] + " " + partesDaQuestao[1] + " iguais ";
	}

	public String getEntrada() {
		return questao;
	}

	//Deizar a primeira letra do nome de uma palavra em maiúscula e no plural
	private String capitalizar(String palavra) {
		palavra = palavra.toLowerCase();
		palavra = Character.toUpperCase(palavra.charAt(0)) + palavra.substring(1);
		int comprimento = palavra.length();
		if (palavra.charAt(comprimento - 1) != 's') {
			palavra = new StringBuffer(palavra).insert(comprimento, "s").toString();
		}
		return palavra;
	}

	//Deixar todas em minusculas
	private String paraMinusculas(String palavra) {
		return palavra.toLowerCase();
	}
	
	//Getters
	public String getQuestao() {
		return questao;
	}

	public String getResposta() {
		return resposta;
	}

	public String getDe() {
		return de;
	}

	public String getPara() {
		return para;
	}

	public double getQuantidade() {
		return quantidade;
	}
}
