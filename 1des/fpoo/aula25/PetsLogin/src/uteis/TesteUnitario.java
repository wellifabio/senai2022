package uteis;

import java.util.Random;
import java.util.Scanner;

import controllers.PetProcess;
import controllers.ServicoProcess;
import controllers.UsuarioProcess;
import domains.Pet;
import domains.Servico;

public class TesteUnitario {

	static Scanner scan = new Scanner(System.in);
	static Random r = new Random();
	
	public static void main(String[] args) {
		PetProcess.abrir();
		UsuarioProcess.abrir();
		ServicoProcess.abrir();
		for (Pet p : PetProcess.pets) {
			System.out.println(p.toString());
		}
		System.out.print("Digite quantos serviços aleatórios deseja gerar ex: 1000");
		int servicos = scan.nextInt();
		for(int i = 0; i < servicos; i++) {
		}
		
	}
	
}
