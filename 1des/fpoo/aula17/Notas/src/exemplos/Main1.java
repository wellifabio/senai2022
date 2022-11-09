package exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main1 {

	public static void main(String[] args) {
		Random r = new Random();
		String alunos[] = {"Juquinha", "Joãozinho", "Aninha", "Flavinha"};
		float prova = r.nextFloat() * 10;
		float trabalho = r.nextFloat() * 10;
		float atividades = r.nextFloat() * 10;
		float media = (prova + trabalho + atividades) / 3;
		String saida = String.format("%s;%.1f;%.1f;%.1f;%.1f\r\n", alunos[r.nextInt(3)], prova, trabalho, atividades, media);

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./bd/notas.csv",true));
			bw.write(saida);
			bw.close();
			System.out.println("Arquivo criado com sucesso.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
