#include<stdio.h>
#include<locale.h>
#include<windows.h>
int idade(int dia, int mes, int ano);
int main(){
	setlocale(LC_ALL,"");
	int dia, mes, ano;
	printf("Digite data que você nasceu:");
	scanf("%d/%d/%d",&dia,&mes,&ano);
	printf("você nasceu em %d/%d/%d\n",dia,mes,ano);
	printf("Você tem %d anos",idade(dia,mes,ano));

}
int idade(int dia, int mes, int ano){
	SYSTEMTIME hoje; //Tipo de variavel para datas
	GetLocalTime(&hoje); //Obtem a data de hoje
	int anoAtual = hoje.wYear;//Pega apenas o ano
	int mesAtual = hoje.wMonth;//Pega apenas o ano
	int diaAtual = hoje.wDay;//Pega apenas o ano
	int idade = anoAtual - ano;
	if(mes > mesAtual)
		idade--;
	else if(mes == mesAtual && dia > diaAtual)
		idade--;
	return idade;
}
