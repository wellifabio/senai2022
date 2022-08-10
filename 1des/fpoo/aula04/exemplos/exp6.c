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
	switch(cor){
		case 1:
			printf("Você escolheu verde então pode ir.\n");
			break;
		case 2:
			printf("Você escolheu amarelo então fique atento.\n");	
			break;
		case 3:
			printf("Você escolheu vermelho então espere.\n");
			break;
		default:
			printf("Opção inválida\n");
	}

	printf("Fim.");
}

