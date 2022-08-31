#include<stdio.h>
#include<locale.h>
#include<time.h>
int main(){
	setlocale(LC_ALL,"");
	srand(time(NULL));
	int v[10];
	int i, num, encontrado = 0;
	//Gerar os números aleatórios para o vetor
	for(i = 0; i < 10; i++){
		v[i] = rand();
		printf("[%d]%d\n",i,v[i]);
	}
	//Entrada
	printf("Digite um número inteiro\n");
	scanf("%d",&num);
	//Processamento
	i = 0;
	while(!encontrado){
		if(v[i] == num)
			encontrado = 1;
		i++;
		if(i == 10) break;
	}
	//saída
	if(encontrado) printf("Encontrei");
	else printf("Não encontrei");
}
