#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char nome[7][10];
	int idade[7], i;
	//Entrada
	printf("Digite o nome e idade de 7 pessoas:\n");
	for(i = 0; i < 7; i++)
		scanf("%s %d",&nome[i],&idade[i]);
	//Processamento e Saída
	for(i = 0; i < 7; i++){
		if(idade[i]<12)
			printf("%s Criança\n",nome[i]);
		else if(idade[i]<18)
			printf("%s Jovem\n",nome[i]);
		else if(idade[i]<31)
			printf("%s Adulto\n",nome[i]);
		else if(idade[i]<65)
			printf("%s Meia idade\n",nome[i]);
		else
			printf("%s Idoso\n",nome[i]);
	}
}

