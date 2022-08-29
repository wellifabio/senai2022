#include<stdio.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"");
	int p1 = -1, p2 = -1, p3 = -1, p4 = -1, p5 = -1;
	//Entradas
	while(p1 < 0 || p1 > 1){
		printf("Telefonou para a vítima? 0.não, 1.sim ");
		scanf("%d",&p1);
	}
	while(p2 < 0 || p2 > 1){
		printf("Esteve no local do crime? 0.não, 1.sim ");
		scanf("%d",&p2);
	}
	while(p3 < 0 || p3 > 1){
		printf("Mora perto da vítima? 0.não, 1.sim ");
		scanf("%d",&p3);
	}
	while(p4 < 0 || p4 > 1){
		printf("Devia para a vítima? 0.não, 1.sim ");
		scanf("%d",&p4);
	}
	while(p5 < 0 || p5 > 1){
		printf("Já trabalhou com a vítima? 0.não, 1.sim ");
		scanf("%d",&p5);
	}
	//Processamento
	int total = p1 + p2 + p3 + p4 + p5;
	
	//Saída com processamento
	if(total < 2){
		printf("Está liberado.");
	}else if(total < 3){
		printf("Você é Suspeito.");
	}else if(total < 5){
		printf("Você é cúmplice.");
	}else{
		printf("Você é o assassino.");
	}
	
}
