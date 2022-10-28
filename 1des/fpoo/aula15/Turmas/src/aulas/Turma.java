package aulas;

public class Turma {

	String nomeTurma;
	String periodo;
	String diaSemana;
	int numAlunos;
	int horasSemanais;
	float mensalidade;

	public Turma() {
	}

	public Turma(String nomeTurma, String periodo, String diaSemana, int numAlunos, int horasSemanais,
			float mensalidade) {
		this.nomeTurma = nomeTurma;
		this.periodo = periodo;
		this.diaSemana = diaSemana;
		this.numAlunos = numAlunos;
		this.horasSemanais = horasSemanais;
		this.mensalidade = mensalidade;
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
