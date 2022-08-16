#include <stdio.h>
#include <locale.h>
int main(){
	//Configurações e variáveis
	setlocale(LC_ALL,"");
	int a,b,c;
	printf("Digite três números inteiros separados por espaço ou enter: ");
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%d",&c);
	
	//Processamento
	if(a < b && a < c){
		printf(" %d", a);
		if(b < c){
			printf(" %d %d", b, c);	
		}else{
			printf(" %d %d", c, b);	
		}
	}else if(b < a && b < c){
		printf(" %d", b);
		if(a < c){
			printf(" %d %d", a, c);	
		}else{
			printf(" %d %d", c, a);	
		}
	}else{
		printf(" %d", c);
		if(a < b){
			printf(" %d %d", a, b);	
		}else{
			printf(" %d %d", b, a);	
		}
	}
}
