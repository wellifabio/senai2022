#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int i, valor = -1;
	while(valor < 0 || valor > 32767){
		printf("Digite um valor inteiro maior do que 0:");
		scanf("%d", &valor);
	}
	
	for(i = 1; i < valor; i++){
		printf("%d ",i);
	}
}
