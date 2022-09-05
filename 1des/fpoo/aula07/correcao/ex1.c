#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char nomes[5][20];
	float salarios[5];
	int i;
	
	//Entrada
	printf("Digite os nomes dos 5 funcionários:");
	for(i = 0; i < 5; i++){
		scanf("%s",nomes[i]);
	}
	
}
