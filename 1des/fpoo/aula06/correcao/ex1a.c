#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int v1[5];
	int v2[5];
	int soma[5];
	int i;
	
	//Entradas para o vetor1
	printf("Usuário, informe 5 valores:");
	for(i = 0; i < 5; i++){
		scanf("%d",&v1[i]);
	}
	//Entradas para o vetor2
	printf("Usuário, mais informe 5 valores:");
	for(i = 0; i < 5; i++){
		scanf("%d",&v2[i]);
	}
	
	//Processamento
	soma[0] = v1[0] + v2[4];
	soma[1] = v1[1] + v2[3];
	soma[2] = v1[2] + v2[2];
	soma[3] = v1[3] + v2[1];
	soma[4] = v1[4] + v2[0];
	
	//Saida
	for(i = 0; i < 5; i++){
		printf("%d\n",soma[i]);
	}
}
