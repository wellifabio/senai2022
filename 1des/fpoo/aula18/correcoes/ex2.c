#include<stdio.h>
#include<locale.h>

int main(){
	setlocale(LC_ALL,"");
	char nome[5][15];
	int idade[5];
	float peso[5];
	int i;
	printf("Digite o nome e idade e peso de 5 pessoas:\n");
	for(i = 0; i < 5; i++){
		scanf("%s%d%f",&nome[i],&idade[i],&peso[i]);
	}
	for(i = 0; i < 5; i++){
		if(idade[i] >= 18 && idade[i] <= 69 && peso[i] > 50)
			printf("%s\t%d\t%.1f\tPode doar\n", nome[i], idade[i], peso[i]);
		else 
			printf("%s\t%d\t%.1f\tNão pode doar\n", nome[i], idade[i], peso[i]);
	}
	return 0;
}
