/*
	Desenvolva um programa que leia três
	variáveis (a, b, c) e resolva a
	expressão: ( a + b ) / c.
*/
#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,""); //Configura o programa para aceitar acentos
	//Configuração das variáveis
	int a, b, c, d; //Este programa utiliza 128 bits 16 bytes

	//Entradas do programa
	printf("Digite um valor para a = ");
	scanf("%d", &a);
	printf("Digite um valor para b = ");
	scanf("%d", &b);
	printf("Digite um valor para c = ");
	scanf("%d", &c);

	//Processamento
	d = (a + b) / c;
	
	//Saída do programa
	printf("O resultado da conta (a + b) / c = %d",d);
}

