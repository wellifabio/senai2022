package aulas2;

public class Turma {

	String nomeTurma;
	String periodo;
	String diaSemana;
	int numAlunos;
	int horasSemanais;
	float mensalidade;
	
	public Turma() {	
		nomeTurma = Main.scan.next();
		periodo = Main.scan.next();
		diaSemana = Main.scan.next();
		numAlunos = Main.scan.nextInt();
		horasSemanais = Main.scan.nextInt();
		mensalidade = Main.scan.nextFloat();
	}

	public float faturamentoMensal() {
		return numAlunos * mensalidade;
	}

	public float faturamentoHora() {
		return faturamentoMensal() / (4.5f * horasSemanais);
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%d\t%d\t%.2f\t%.2f\t%.2f", nomeTurma, periodo, diaSemana,
				numAlunos, horasSemanais, mensalidade, faturamentoMensal(), faturamentoHora());
	}

}
