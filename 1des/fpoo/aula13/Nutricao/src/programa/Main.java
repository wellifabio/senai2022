package programa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt", "BR"));
		Scanner scan = new Scanner(System.in); //Scanner para ler dados
		Paciente pacientes[] = new Paciente[10]; //10 objetos da classe Paciente
		float totImc = 0, totPeso = 0, totAltura = 0;
		
		//Entrada
		System.out.println("Digite 10 nomes, pesos e alturas:");
		for(int i = 0; i < 10; i++)
			pacientes[i] = new Paciente(scan.next(), scan.nextFloat(), scan.nextFloat());
		
		//Saída
		System.out.println("Nome\tPeso\tAltura\tIMC\tDiagnóstico:");
		for(int i = 0; i < 10; i++) {
			System.out.println(pacientes[i].toString());
			totImc += pacientes[i].imc();
			totPeso += pacientes[i].peso;
			totAltura += pacientes[i].altura;
		}
		float mediaImc = totImc / 10f;
		float mediaPeso = totPeso / 10f;
		float mediaAltura = totAltura / 10f;
		System.out.println("Estatísticas:");
		System.out.printf("Média IMC = %.2f\n",mediaImc);
		System.out.printf("Média Peso = %.2f\n",mediaPeso);
		System.out.printf("Média Altura = %.2f\n",mediaAltura);
	}

}
