#include<stdio.h>
#include<locale.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char cidades[5][20];
	int totEleits[5], totVotos[5];
	float participacao[5];
	int n;
	//Entradas + Processamento
	printf("Digite os dados a seguir\n");
	printf("Cidade\tEleitores\tVotos:\n");
	for(n = 0; n < 5; n++){
		scanf("%s",&cidades[n]);
		scanf("%d",&totEleits[n]);
		scanf("%d",&totVotos[n]);
		participacao[n] = (float) totVotos[n] * 100 / totEleits[n];
	}
	//Saídas
	printf("Cidade\tParticipação:\n");
	for(n = 0; n < 5; n++){
		printf("%s\t%.2f\n",cidades[n],participacao[n]);
	}
}
