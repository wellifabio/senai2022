#include <stdio.h>
#include <locale.h>

int main(){
	//Configurações e Variáveis
	setlocale(LC_ALL,"");
	int cor, alcool;
	//Entrada
	printf("Digite a cor do semáforo \n[1.verde   ]\n[2.amarelo ]\n[3.vermelho]\n");
	scanf("%d",&cor);
	printf("Você ingeriu bebida alcoólica? \n[1.Sim]\n[2.não]\n");
	scanf("%d",&alcool);
	//Processamento e Saída
	printf("Fim.");
}

