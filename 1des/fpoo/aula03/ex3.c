/*
Desenvolva um programa que leia o nome e o salário de uma pessoa,
depois leia o valor do índice percentual (%) de reajuste do salário.
Calcule e apresente na tela, o valor do novo salário e o nome da pessoa.
*/

#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	char nome[10];
	float salario, percentual, novoSalario;
	
	//Entradas
	printf("Digite o nome do funcionário:\n");
	scanf("%s",&nome);
	printf("Digite o salário:\n");
	scanf("%f",&salario);
	printf("Qual será o índice percentual (%%) de reajuste:\n");
	scanf("%f",&percentual);
	//Processamento
	novoSalario = salario + salario * percentual / 100;
	//Saída
	printf("O novo salário do %s é: R$ %.2f", nome, novoSalario);
}
