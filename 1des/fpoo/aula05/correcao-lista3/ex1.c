#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int i; //Declarar o Contador
	int tabulacao = 20;
	for(i = 11; i < 200; i++){
		if(i<100) printf("0");//Acrescenta zeros a esquerda
		printf("%d",i); //Mostra o valor
		if(tabulacao == i){
			printf("\n");
			tabulacao += 10;
		}else{
			printf("\t");
		}
	}
}

/* solução simples

	int i; //Declarar o Contador
	for(i = 11; i < 200; i++){
		printf("%d",i);
	}

*/
