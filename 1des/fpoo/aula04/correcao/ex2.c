#include <stdio.h>
#include <locale.h>
int main(){
	//Configurações e variáveis
	setlocale(LC_ALL,"");
	float salario, salFamilia = 0;
	int filhos;
	//Entradas
	printf("Digite seu salário: ");
	scanf("%f",&salario);
	printf("Quantos filhos você tem? ");
	scanf("%d",&filhos);
	//Processamento
	if(salario < 1655.98){
		salFamilia = 56.47 * filhos;
	}	
	//Saídas
	printf("O seu salário é R$ %.2f \n",salario);
	printf("O salário família é R$ %.2f\n",salFamilia);
	printf("O salário final é R$ %.2f",salario + salFamilia);
}
