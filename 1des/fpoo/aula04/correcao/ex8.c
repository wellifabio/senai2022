#include <stdio.h>
#include <locale.h>
int main(){
	//Configurações e variáveis
	setlocale(LC_ALL,"");
	int a,b;
	printf("Digite dois números inteiros separados por espaço:");
	scanf("%d",&a);
	scanf("%d",&b);
	
	//Processamento
	if(a > b){
		printf("O maior número é %d\n",a);
		printf("O menor número é %d",b);
	}else{
		printf("O maior número é %d\n",b);
		printf("O menor número é %d",a);
	}
}
