#include<stdio.h>
#include<locale.h>
#include<windows.h>
int idade(int anoNasc);
int main(){
	setlocale(LC_ALL,"");
	int ano;
	printf("Digite o ano que você nasceu:");
	scanf("%d",&ano);
	printf("Você tem %d anos",idade(ano));

}
int idade(int anoNasc){
	SYSTEMTIME hoje; //Tipo de variavel para datas
	GetLocalTime(&hoje); //Obtem a data de hoje
	//Pega apenas o ano menos o ano de nascimento e retorna
	return hoje.wYear - anoNasc;
}
