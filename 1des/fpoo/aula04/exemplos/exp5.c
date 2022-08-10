#include <stdio.h>
#include <locale.h>

int main(){
	//Configurações e Variáveis
	setlocale(LC_ALL,"");
	int numero1 = 10;
	int numero2 = 15;

	//Comparar Números	
	if(numero1 == numero2){
		printf("Os números são iguais\n");
	}else{
		printf("Os números são diferentes\n");
	}

	//Configurações e Variáveis
	char nome1[3] = "Ana";
	char nome2[3] = "Ivo";
	printf("A comparação retornou %d \n",strcmp(nome1,nome2));
	
	if(strcmp(nome1,nome2) == 0){
		printf("Os nomes são iguais\n");
	}else{
		printf("Os nomes são diferentes\n");
	}
		
}

