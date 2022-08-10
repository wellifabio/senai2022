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
		printf("Você escolheu verde então Pode ir.");
	}
	//Saída
	printf("Acabou.");
}

