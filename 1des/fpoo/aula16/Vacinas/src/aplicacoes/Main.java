package aplicacoes;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Vacina> vacinas = new ArrayList<>();
	static int menu = 0;
	static String opcoes[] = { "1. Casastrar Vacina", "2. Listar Todas", "3. Alterar Dados", "4. Excluir Registro",
			"5. Buscar por Pet", "6. Buscar por Veterinário", "7. Buscar por Vacina", "8. Terminar Programa" };

	public static void itens(String[] itens) {
		for (String i : itens)
			System.out.println(i);
	}

	public static void cadastrar() throws ParseException {
		System.out.println("Quantas vacinas deseja cadastrar:");
		int quantas = scan.nextInt();
		System.out.println("Nome do Pet\tVeterinário\tVacina\tData");
		for (int i = 0; i < quantas; i++)
			vacinas.add(new Vacina(scan.next(), scan.next(), scan.next(), scan.next()));
	}

	public static void listarTodas() {
		System.out.println("Indice\tPet\tVeterinário\tVacina\tData\tDias");
		for (int i = 0; i < vacinas.size(); i++) {
			System.out.println(i + "\t" + vacinas.get(i));
		}
	}
	
	public static void alterar() throws ParseException {
		System.out.print("Digite o índice da vacina: ");
		int indice = scan.nextInt();
		System.out.println("Indice\tPet\tVeterinário\tVacina\tData\tDias");
		System.out.println(indice + "\t" + vacinas.get(indice));
		vacinas.set(indice, new Vacina(scan.next(), scan.next(), scan.next(), scan.next()));
		System.out.println("Registro alterado");
	}

	public static void excluir() {
		System.out.print("Digite o índice da vacina: ");
		int indice = scan.nextInt();
		vacinas.remove(indice);
		System.out.println("Registro excluído");
	}

	public static void buscarPet() {
		System.out.print("Digite o nome do Pet: ");
		String pet = scan.next();
		System.out.println("Indice\tPet\tVeterinário\tVacina\tData\tDias");
		for (int i = 0; i < vacinas.size(); i++) {
			if(vacinas.get(i).getNomePet().contains(pet))
				System.out.println(i + "\t" + vacinas.get(i));
		}
	}
	
	public static void buscarVet() {
		System.out.print("Digite o nome do Veterinário: ");
		String vet = scan.next();
		System.out.println("Indice\tPet\tVeterinário\tVacina\tData\tDias");
		for (int i = 0; i < vacinas.size(); i++) {
			if(vacinas.get(i).getVeterinario().contains(vet))
				System.out.println(i + "\t" + vacinas.get(i));
		}
	}
	
	public static void buscarVacina() {
		System.out.print("Digite o nome da Vacina: ");
		String vacina = scan.next();
		System.out.println("Indice\tPet\tVeterinário\tVacina\tData\tDias");
		for (int i = 0; i < vacinas.size(); i++) {
			if(vacinas.get(i).getNomeVacina().contains(vacina))
				System.out.println(i + "\t" + vacinas.get(i));
		}
	}
	
	public static void main(String[] args) throws ParseException {
		while (menu != 8) {
			itens(opcoes);
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				cadastrar();
				break;
			case 2:
				listarTodas();
				break;
			case 3:
				alterar();
				break;
			case 4:
				excluir();
				break;
			case 5:
				buscarPet();
				break;
			case 6:
				buscarVet();
				break;
			case 7:
				buscarVacina();
				break;
			case 8:
				System.out.println("Tchaw!");
				break;
			default:
				System.out.println("Opção inválida");
			}
		}
	}
}
