/*Exemplo de extrutura com ponteiros*/

#include <stdio.h>
#include <malloc.h>
#define alturaMaxima 225 //Definição de uma constante global

//Definição de uma estrutura básica de dados
typedef struct{
	int peso; //peso em quilogramas
	int altura; //altura em centímetros
} PesoAltura;

int main(){
	//Estrutura simples uilizando variáveis normais
	PesoAltura pessoa1; //Define uma variável pessoa1 do tipo ponteiro PesoAltura com o tamanho alocado para PesoAltura
	pessoa1.peso = 125; //Atribui o peso de 80 quilos para a pessoa1
	pessoa1.altura = 226; //Atribui a altura de 185cm para a pessoa1
	printf("Pessoa 1 => Peso: %d, Altura %d.\n\n", pessoa1.peso, pessoa1.altura); //Exibe os dados atribuídos
	if(pessoa1.altura>alturaMaxima) printf("Altura acima da maxima!\n");
	else printf("Altura abaixo da maxima!\n");
	printf("\n=================================================\n\n");	
	
	//Estrutura simples utilizando ponteiros
	PesoAltura* pessoa2 = (PesoAltura*) malloc(sizeof(PesoAltura)); //Define uma variável pessoa2 do tipo ponteiro PesoAltura com o tamanho alocado para PesoAltura
	printf("O tamanho de da estrutura PesoAltura e %d\n", sizeof(PesoAltura)); //Mostra em inteiros o tamanho alocado para a estrutura PesoAltura
	pessoa2->peso = 80; //Atribui o peso de 80 quilos apontando para a pessoa1
	pessoa2->altura = 185; //Atribui a altura de 185cm apontando para a pessoa1
	printf("Pessoa 2 => Peso: %d, Altura %d.\n", pessoa2->peso, pessoa2->altura); //Exibe os dados apontados pelos ponteiros ->
	if(pessoa2->altura>alturaMaxima) printf("Altura acima da maxima!\n");
	else printf("Altura abaixo da maxima!\n");
	printf("\n=================================================\n\n\n");	

	return 0;	
}
