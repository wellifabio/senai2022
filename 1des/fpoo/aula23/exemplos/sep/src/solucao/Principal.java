package solucao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	// Espaço de memória dinâmico para leitura(Abrir)
	static BufferedReader br;
	// Espaço de memória dinâmico para escrita(Salvar)
	static BufferedWriter bw;
	// Endereçp do aquivo de entrada
	static String entrada = "C:\\Users\\Aluno.DSN5131112167\\Desktop\\work_arquivos\\SomaArquivos\\arquivos\\entrada.csv";
	static String saida = "C:\\Users\\Aluno.DSN5131112167\\Desktop\\work_arquivos\\SomaArquivos\\arquivos\\saida.csv";
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// Menu
		int opcao = 0;
		while (opcao != 5) {
			System.out.println("\n1. Adição\n2. Multiplicação\n3. Subtração\n4. Divisão\n5. Sair");
			opcao = scan.nextInt();

			// Abrir o arquivo tratando os possíveis erros
			try {
				// Abre o arquivo
				br = new BufferedReader(new FileReader(entrada));
				bw = new BufferedWriter(new FileWriter(saida,false));
				String linha = br.readLine();// Lê a primeira linha
				while (linha != null) {
					String[] vetor = linha.split(";");
					int v1 = Integer.parseInt(vetor[0]);
					int v2 = Integer.parseInt(vetor[1]);
					int result = 0;
					if (opcao == 1) {
						result = v1 + v2;
					} else if (opcao == 2) {
						result = v1 * v2;
					} else if (opcao == 3) {
						result = v1 - v2;
					} else {
						result = v1 / v2;
					}
					System.out.println(result);
					bw.write(result+"\r\n");
					linha = br.readLine();// Lê a próxima linha
				}
				// Fecha o arquivo
				br.close();
				bw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Adeus.");
	}
}