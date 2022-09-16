#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char pessoas[5][10];
	float peso[5], altura[5];
	float imc[5];
	int i;
	//Entradas
	printf("Digite [Nome, peso, altura] de 5 pessoas\n");
	printf("Nome\tPeso\tAltura\n");
	for(i = 0; i < 5; i++){
		scanf("%s", &pessoas[i]);
		scanf("%f", &peso[i]);
		scanf("%f", &altura[i]);
	}
	//Processamento e Saída
	printf("[Nome][Peso][Altura][IMC]\n");
	for(i = 0; i < 5; i++){
		imc[i] = (float)peso[i]/(altura[i] * altura[i]);
		printf("[%s][%.1f][%.2f][%.1f]",pessoas[i],peso[i],altura[i],imc[i]);
		if(imc[i] < 18.5) printf("[Baixo Peso]\n");
		else if(imc[i] < 25) printf("[Normal]\n");
		else if(imc[i] < 30) printf("[Sobrepeso]\n");
		else printf("[Obesidade]\n");
	}
}
