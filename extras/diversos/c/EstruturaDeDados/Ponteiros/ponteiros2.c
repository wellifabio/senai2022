#include <stdio.h>
#include <malloc.h>

int main(){
	int* y = (int*) malloc(sizeof(int)); //aloca um espaço de memória equivalente a um inteiro para o ponteiro de inteiros x
	*y = 20; //Atribui o número 20 a este espaço de memória alocado
	int a = sizeof(int); //Atribui a variável inteira z o tamamnho de um espaço de memória de um inteiro
	int b = sizeof(float); //Atribui a variável inteira z o tamamnho de um espaço de memória de um float
	int c = sizeof(double); //Atribui a variável inteira z o tamamnho de um espaço de memória de um double
	printf("No espaco de memoria alocado e apontado por y esta o valor *y = %d, O tamanho de um int = %d, float = %d, double = %d \n", *y, a, b, c);
	return 0;
}
