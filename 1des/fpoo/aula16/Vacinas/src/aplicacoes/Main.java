package aplicacoes;

import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException{
		Vacina v = new Vacina("Totó", "Jair", "Viratec", "03/10/2022");
		System.out.println(v.toString());
	}
}
