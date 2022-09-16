#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char alunos[5][10];
	int nota1[5], nota2[5], i;
	float medias[5];
	//Entradas
	printf("Digite os nomes e notas dos 5 alunos\n");
	printf("Nome\tNota 1\tNota 2\n");
	for(i = 0; i < 5; i++){
		scanf("%s", &alunos[i]);
		scanf("%d", &nota1[i]);
		scanf("%d", &nota2[i]);
	}
	//Processamento e Saída
	printf("[Aluno][Nota 1][Nota 2][Média]\n");
	for(i = 0; i < 5; i++){
		medias[i] = (float)(nota1[i] + nota2[i]) / 2;
		printf("[%s][%d][%d][%.1f]\n",alunos[i],nota1[i],nota2[i],medias[i]);
	}
}
