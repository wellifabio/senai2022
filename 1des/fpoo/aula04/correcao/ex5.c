#include <stdio.h>
#include <locale.h>
int main(){
	//Configurações e variáveis
	setlocale(LC_ALL,"");
	char nome[20];
	float preco;
	//Entradas
	printf("Digite o nome da mercadoria [max 20 letras, sem espaços]: ");
	scanf("%s",&nome);
	printf("Digite o preço da mercadoria: ");
	scanf("%f",&preco);
	//Processamento
	if(preco < 1000){
		preco = preco + preco * (float) 5 / 100;
	}else{
		preco = preco + preco * (float) 7 / 100;
	}
	//Saída
	printf("O novo preço da mercadoria %s é R$%.2f",nome,preco);
}
