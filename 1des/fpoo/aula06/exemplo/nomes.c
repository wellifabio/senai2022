#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int i;
	char nomes[5][20];
	
	strcpy(nomes[0],"Joaquin");
	strcpy(nomes[1],"Bruno");
	strcpy(nomes[2],"Marcos");
	strcpy(nomes[3],"Ana");
	strcpy(nomes[4],"Maria");
	
	for(i = 0; i < 5; i++){
		printf("%s\n",nomes[i]);
	}
	
	//Mostrar a letra "q" de "Joaquin"
	printf("%c\n",nomes[0][3]);
	
	//Mostrar o código ascii da letra "a" e "b"
	printf("%d\n",'a');
	printf("%d\n",'b');
}
