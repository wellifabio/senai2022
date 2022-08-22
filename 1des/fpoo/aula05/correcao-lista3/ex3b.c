#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int i, valor;
	int entrada = 1, tab = 10;
	
	while(entrada){
		printf("Digite um valor inteiro maior do que 0:");
		scanf("%d", &valor);
		if(valor > 0 && valor < 32767) entrada = 0;
	}
	
	for(i = 1; i < valor; i++){
		if(i < 10) printf("0");
		if(i < 100) printf("0");
		printf("%d",i);
		if( i == tab){
			printf("\n");
			tab += 10;
		}else{
			printf("\t");
		}
	}
}
