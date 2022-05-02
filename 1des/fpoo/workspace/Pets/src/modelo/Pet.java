package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pet {

	private int id;
	private String especie;
	private String nomePet;
	private String raca;
	private float peso;
	private Date nascimento;
	private String dono;
	private String telefone;

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Pet(int id, String especie, String nomePet, String raca, float peso, String nascimento, String dono, String telefone) {
		try {
			this.id = id;
			this.especie = especie;
			this.nomePet = nomePet;
			this.raca = raca;
			this.peso = peso;
			this.nascimento = sdf.parse(nascimento);
			this.dono = dono;
			this.telefone = telefone;
		} catch (ParseException e) {
			System.out.println(e);
		}
	}

	public int getIdade() {
		return new Date().getYear() - nascimento.getYear();
	}

	@Override
	public String toString() {
		return id + " " + especie + "\t" + nomePet +" " + raca + "\t" + String.format("%.2f", peso) + "\t" + getIdade() + "\t" + dono + "\t" + telefone
				+ "\n";
	}

}
