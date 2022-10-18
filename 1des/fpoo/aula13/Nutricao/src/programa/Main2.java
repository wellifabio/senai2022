/*Tela principal com as Análises Estatísticas*/
package programa;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt", "BR"));
		Scanner scan = new Scanner(System.in);
		Paciente pacientes[] = new Paciente[10];
		float totImc = 0, totPeso = 0, totAltura = 0;
		float maxPeso = 0, minPeso = 1000;
		float maxAltura = 0, minAltura = 3;
		int magro = -1, obeso = -1;
		int alto = -1, baixo = -1;
		int diags[] = {0,0,0,0,0,0};
		
		//Entrada simples
		System.out.println("Digite 10 nomes, pesos e alturas:");
		for(int i = 0; i < 10; i++)
			pacientes[i] = new Paciente(scan.next(), scan.nextFloat(), scan.nextFloat());
		
		//Saída e Processamento (Acumulando os totais para calcular a média)
		System.out.println("Nome\tPeso\tAltura\tIMC\tDiagnóstico:");
		for(int i = 0; i < 10; i++) {
			System.out.println(pacientes[i].toString());
			totImc += pacientes[i].imc();		//Acumuladores
			totPeso += pacientes[i].peso;		//Acumuladores
			totAltura += pacientes[i].altura;	//Acumuladores
			if(pacientes[i].peso < minPeso) {
				minPeso = pacientes[i].peso;
				magro = i;
			}
			if(pacientes[i].peso > maxPeso) {
				maxPeso = pacientes[i].peso;
				obeso = i;
			}
			if(pacientes[i].altura < minAltura) {
				minAltura = pacientes[i].altura;
				baixo = i;
			}
			if(pacientes[i].altura > maxAltura) {
				maxAltura = pacientes[i].altura;
				alto = i;
			}
			if(pacientes[i].diagnostico().equals("Subpeso Severo")) diags[0]++;
			if(pacientes[i].diagnostico().equals("Subpeso")) diags[1]++;
			if(pacientes[i].diagnostico().equals("Normal")) diags[2]++;
			if(pacientes[i].diagnostico().equals("Sobrepeso")) diags[3]++;
			if(pacientes[i].diagnostico().equals("Obeso")) diags[4]++;
			if(pacientes[i].diagnostico().equals("Obeso Mórbido")) diags[5]++;
		}
		
		//Processamento das médias dos IMCs, pesos e alturas
		float mediaImc = totImc / 10f;
		float mediaPeso = totPeso / 10f;
		float mediaAltura = totAltura / 10f;
		
		//Saídas (Análise Estatística)
		System.out.println("Estatísticas:");
		System.out.printf("Média IMC = %.2f\n",mediaImc);
		System.out.printf("Média Peso = %.2f\n",mediaPeso);
		System.out.printf("Média Altura = %.2f\n",mediaAltura);
		System.out.println("O paciete mais magro é : "+pacientes[magro].toString());
		System.out.println("O paciete mais obeso é : "+pacientes[obeso].toString());
		System.out.println("O paciete mais alto é : "+pacientes[alto].toString());
		System.out.println("O paciete mais baixo é : "+pacientes[baixo].toString());
		System.out.println("Quantidade de pacientes por diagnóstico");
		System.out.printf("Subpeso Severo = %d\n",diags[0]);
		System.out.printf("Subpeso = %d\n",diags[1]);
		System.out.printf("Normal = %d\n",diags[2]);
		System.out.printf("Sobrepeso = %d\n",diags[3]);
		System.out.printf("Obeso = %d\n",diags[4]);
		System.out.printf("Obeso Mórbido = %d\n",diags[5]);
	}

}