#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	char candidatos[6][10], auxiliar[10];
	int votos[6];
	float porcentagens[6];
	int i, j, aux, total = 0;
	//Entrada
	printf("Digite os nomes dos candidatos e seus votos:\n");
	for(i = 0; i < 6; i++){
		scanf("%s %d", &candidatos[i], &votos[i]);
		total += votos[i];
	}
	//Processamento
	for(i = 0; i < 6; i++)
		porcentagens[i] = (float) votos[i] * 100 / total;
	//Ordenação (bubble sort)
	for(i = 0; i < 6; i++)
		for(j = i + 1; j < 6; j++)
			if(porcentagens[i]<porcentagens[j]){
				aux = porcentagens[i];
				porcentagens[i] = porcentagens[j];
				porcentagens[j] = aux;
				strcpy(auxiliar,candidatos[i]);
				strcpy(candidatos[i],candidatos[j]);
				strcpy(candidatos[j],auxiliar);
			}
	//Saída
	for(i = 0; i < 6; i++)
		printf("%s %.1f\n",candidatos[i], porcentagens[i]);
	if(porcentagens[0] > 50)
		printf("O candidato %s está eleito em primeiro turno\n",candidatos[0]);
	else
		printf("Haverá segundo turno entre os candidatos %s e %s\n",candidatos[0], candidatos[1]);
}

