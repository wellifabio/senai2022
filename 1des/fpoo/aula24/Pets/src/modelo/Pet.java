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
	private String nomeDono;
	private String telefone;

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Pet(int id, String especie, String nomePet, String raca, float peso, String nascimento, String nomeDono,
			String telefone) throws ParseException {
		this.id = id;
		this.especie = especie;
		this.nomePet = nomePet;
		this.raca = raca;
		this.peso = peso;
		this.nascimento = sdf.parse(nascimento);
		this.nomeDono = nomeDono;
		this.telefone = telefone;
	}

	public int obterIdade() {
		return new Date().getYear() - nascimento.getYear();
	}
	
	@Override
	public String toString() {
		return id + "\t" + especie + "\t" + nomePet + "\t" + raca + "\t" + String.format("%.2f", peso) + "\t"
				+ obterIdade() + "\t" + nomeDono + "\t" + telefone + "\n";
	}

}
