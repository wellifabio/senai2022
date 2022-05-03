package visao;

import java.text.ParseException;

import controle.PetProcess;
import modelo.Pet;

public class testeUnitario {

	public static void main(String[] args) {
		PetProcess.carregarTestes();
		for (Pet p : PetProcess.pets) {
			System.out.println(p.toString());
		}
	}

}
