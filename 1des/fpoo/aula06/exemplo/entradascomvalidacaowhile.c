#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int v[10];
	int i;
	for(i = 0; i < 10; i++){
		//Entrada com validação
		int valor = -1;
		while(valor < 0 || valor > 1000){
			printf("Digite o %dº valor entre 0 e 1000: ",i+1);		
			scanf("%d", &valor);
		}
		v[i] = valor;	
	}
	
}
