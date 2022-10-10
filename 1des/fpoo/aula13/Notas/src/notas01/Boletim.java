package notas01;

public class Boletim {

	String aluno;
	float portugues;
	float matematica;
	float ciencias;

	Boletim(){}
	
	Boletim(String alu, float port, float mat, float cie){
		aluno = alu;
		portugues = port;
		matematica = mat;
		ciencias = cie;
	}
	
	String conceito() {
		if(portugues >= 5 && matematica >= 5 && ciencias >= 5)
			return "Aprovado";
		else
			return "Reprovado";
	}
	
	public String toString() {
		return String.format("%s\t%.1f\t%.1f\t%.1f\t%s", aluno, portugues, matematica, ciencias, conceito());
	}
}
