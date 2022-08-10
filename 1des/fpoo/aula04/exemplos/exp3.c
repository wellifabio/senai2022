#include <stdio.h>
#include <locale.h>

int main(){
	//Configurações e Variáveis
	setlocale(LC_ALL,"");
	int cor;
	//Entrada
	printf("Digite a cor do semáforo \n[1.verde   ]\n[2.amarelo ]\n[3.vermelho]");
	scanf("%d",&cor);
	//Processamento e Saída
	if(cor == 1){
		printf("Você escolheu verde então pode ir.\n");
	}else if(cor == 2){
		printf("Você escolheu amarelo então fique atento.\n");
	}else if(cor == 3){
		printf("Você escolheu vermelho então espere.\n");
	}else{
		printf("Opção inválida\n");
	}
	printf("Acabou.");
}

