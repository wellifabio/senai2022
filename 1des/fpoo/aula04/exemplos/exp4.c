#include <stdio.h>
#include <locale.h>

int main(){
	//Configurações e Variáveis
	setlocale(LC_ALL,"");
	char cor[10], result[30];
	
	//Entradas
	printf("Digite a cor do semáforo: ");
	scanf("%s",&cor);
	
	//Processamento
	if(strcmp(cor,"verde") == 0){
		sprintf(result,"pode ir");
	}else if(strcmp(cor,"amarelo") == 0){
		sprintf(result,"atenção");
	}else if(strcmp(cor,"vermelho")== 0){
		sprintf(result,"espere");
	}else{
		sprintf(result,"cor inválida para semáforo");
	}
	
	//Saídas
	printf("Você digitou a cor %s \n",cor);
	printf("Por isso %s \n",result);
}

