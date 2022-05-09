package controllers;

import java.util.ArrayList;

import domains.Pet;
import domains.dao.PetDAO;

public class PetProcess {

	public static ArrayList<Pet> pets = new ArrayList<>();
	private static PetDAO pd = new PetDAO();
	
	public static void abrir() {
		pets = pd.ler();
	}
	
	public static void salvar() {
		pd.escrever(pets);
	}
}
