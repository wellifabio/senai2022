package exercicios;

import java.util.Scanner;

public class INSS {

	public static void main(String[] args) {
		//Variáveis
		Scanner entrada = new Scanner(System.in);
		double salario, desconto;
		float porcentagem;
		//Entrada
		System.out.print("Digite o seu salário: ");
		salario = entrada.nextDouble();
		
		//Processamento
		if(salario > 7087.22) {
			porcentagem = 0f;
		}else if(salario > 3641.03) {
			porcentagem = 14f;
		}else if(salario > 2427.35){
			porcentagem = 12f;
		}else if(salario > 1212.01){
			porcentagem = 9f;
		} else {
			porcentagem = 7.5f;		
		}
		
		//if com apenas um comando precisa das chaves 
		if(porcentagem == 0f)
			desconto = 992.21;
		else
			desconto = salario * porcentagem / 100;	
		
		//Saída
		System.out.printf("A alíquota aplicada é %.2f%% \n",porcentagem);
		System.out.printf("O desconto de INSS é %.2f\n",desconto);
		System.out.printf("Você vai receber %.2f\n",salario  - desconto);	
	}

}
