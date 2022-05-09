package tests;

import controllers.PetProcess;
import domains.Pet;

public class TesteUnitario {

	public static void main(String[] args) {
		PetProcess.carregarTestes();
		for (Pet p : PetProcess.pets) {
			System.out.println(p.toString());
		}
	}

}
