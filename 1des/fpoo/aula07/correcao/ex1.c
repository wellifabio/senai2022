#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char nomes[5][10];
	float salarios[5];
	float percentual;
	int i;
	
	//Entradas
	printf("Digite os nomes dos 5 funcionários:\n");
	for(i = 0; i < 5; i++){
		scanf("%s",&nomes[i]);
	}
	printf("Digite os 5 salários respectivamente:\n");
	for(i = 0; i < 5; i++){
		do{
			scanf("%f",&salarios[i]);
		}while(salarios[i] < 0 || salarios[i]>1000000);
	}
	printf("Digite percentual(%%) de Reajuste:\n");
	do{
		scanf("%f",&percentual);
	}while(percentual < 0 || percentual>1000);
	
	//Procesamento e Saída
	for(i = 0; i < 5; i++){
		salarios[i] = salarios[i] * percentual / 100 + salarios[i];
		printf("%s novo salário R$%.2f\n",nomes[i],salarios[i]);
	}
}
