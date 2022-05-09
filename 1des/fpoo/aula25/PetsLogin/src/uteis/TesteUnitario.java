package uteis;

import controllers.PetProcess;
import domains.Pet;

public class TesteUnitario {

	public static void main(String[] args) {
		PetProcess.abrir();
		for (Pet p : PetProcess.pets) {
			System.out.println(p.toString());
		}
	}

}
