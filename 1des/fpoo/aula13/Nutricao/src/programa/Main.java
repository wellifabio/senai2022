package programa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner para ler dados
		Paciente pacientes[] = new Paciente[10]; //10 objetos da classe Paciente
		//Entrada
		System.out.println("Digite 10 nomes, pesos e alturas:");
		for(int i = 0; i < 10; i++)
			pacientes[i] = new Paciente(scan.next(), scan.nextFloat(), scan.nextFloat());
		//Saída
		System.out.println("Nome\tPeso\tAltura\tIMC\tDiagnóstico:");
		for(int i = 0; i < 10; i++)
			System.out.println(pacientes[i].toString());
	}

}
