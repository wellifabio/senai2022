/*Tela principal simples lendo e listando os 10 pacientes*/
package programa;

import java.util.Locale;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt", "BR")); // Formatação dos caracteres
		Scanner scan = new Scanner(System.in); // Scanner para ler dados
		Paciente pacientes[] = new Paciente[10]; // 10 objetos da classe Paciente

		// Entrada utilizando o Construtor
		System.out.println("Digite 10 nomes, pesos e alturas:");
		for (int i = 0; i < 10; i++)
			pacientes[i] = new Paciente(scan.next(), scan.nextFloat(), scan.nextFloat());

		// Saída utilizando o toString
		System.out.println("Nome\tPeso\tAltura\tIMC\tDiagnóstico:");
		for (int i = 0; i < 10; i++) {
			System.out.println(pacientes[i].toString());
		}

	}

}