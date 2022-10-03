#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char sexo;
	int idade, dias;
	char saida[9] = "Inapta(o)";
	//Entrada
	printf("Digite o sexo 'M' ou 'F', idade e quantos dias desde a última vez que doou sangue:\n");
	scanf("%c %d %d", &sexo, &idade, &dias);
	//Processamento
	if(sexo == 'm' || sexo == 'M')
		if(idade >= 16 && idade <=69 && dias >= 60)
			strcpy(saida,"Apto");
	if(sexo == 'f' || sexo == 'F')
		if(idade >= 16 && idade <=69 && dias >= 90)
			strcpy(saida,"Apta");
	//Saída
	printf("%s",saida);
}
