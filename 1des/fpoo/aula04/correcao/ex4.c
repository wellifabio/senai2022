#include <stdio.h>
#include <locale.h>
int main(){
	//Configurações e variáveis
	setlocale(LC_ALL,"");
	float a,b,c;
	//Entradas
	printf("Digite o comprimento do primero lado do triângulo: ");
	scanf("%f",&a);
	printf("Digite o comprimento do segundo lado do triângulo: ");
	scanf("%f",&b);
	printf("Digite o comprimento do terceiro lado do triângulo: ");
	scanf("%f",&c);
	//Processamento
	if(a == b && b == c){
		printf("O triânguo é EQUILÁTERO");
	}else if(a != b && b != c && a != c){
		printf("O triânguo é ESCALENO");
	}else{
		printf("O triânguo é ISÓSCELES");
	}
}
