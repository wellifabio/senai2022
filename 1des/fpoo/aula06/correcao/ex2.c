#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int v[10];
	int i;
	int somaPar = 0, somaImpar = 0, contPar = 0, contImpar = 0;
	int mediaPar = 0, mediaImpar = 0;
	//Entradas
	printf("Digite 10 números inteiros entre 0 e 1000\n");
	for(i = 0; i < 10; i++){
		do{
			printf("[%d]:",i);
			scanf("%d",&v[i]);
		}while(v[i] < 0 || v[i] > 1000);
	}
	//Processamento
	for(i = 0; i < 10; i++){
		if(v[i] % 2 == 0){
			somaPar += v[i];
			contPar++;
		}else{
			somaImpar += v[i];
			contImpar++;
		}
	}
	if(contPar != 0) mediaPar = somaPar / contPar;
	if(contImpar != 0) mediaImpar = somaImpar / contImpar;
	//Saídas
	printf("A soma e média dos pares [%d] e [%d]\n",somaPar,mediaPar);
	printf("A soma e média dos ímpares [%d] e [%d]\n",somaImpar,mediaImpar);
	printf("O total de números pares [%d]\n",contPar);
	printf("O total de números ímpares [%d]\n",contImpar);
}
