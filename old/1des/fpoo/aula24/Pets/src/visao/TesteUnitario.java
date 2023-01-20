package visao;

import controle.PetProcess;
import modelo.Pet;

public class TesteUnitario {

	public static void main(String[] args) {
		PetProcess.carregarTestes();
		for (Pet p : PetProcess.pets) {
			System.out.println(p.toString());
		}
	}

}
