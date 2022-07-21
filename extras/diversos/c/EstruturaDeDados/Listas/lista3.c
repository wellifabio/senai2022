/* LISTA LINEAR LIGADA E ORDENADA
Cada ELEMENTO é precedido por um e Sucedido por outro.
Exceto o PRIMEIRO e o ÚLTIMO, porém agora cada um possui um índice que aponta para o seu sucessor
*/

#include <stdio.h>
#include <stdbool.h>

/* MODELAGEM */

#ifndef _Lista_h //Se as definições em Lista h não existem define abaixo
#define MAX 50 //Tamanho máximo do arranjo Definido
#define INVALIDO -1 //Constante para valores inválidos

typedef int TipoChave; //Outro nome para o tipo de dados int OBS: O int continua funcionando

typedef struct{
	TipoChave chave; //Campo Chave para o controle da Lista
	char nome[MAX+1]; //Nome de uma pessoa - +1 para criar um elemento SENTINELA para busca
	int idade; //Idade, somente de exemplo com inteiro ao invés de dataNascimento
} Registro; //Dados a serem estruturados na Lista (Tema: idade e nome)

typedef struct{
	Registro reg;
	int prox; //Armazena o endereço do próximo elemento
}Elemento; //Estrutura intermediária de elementos

typedef struct{
	Elemento A[MAX]; //Vetor que armazenará os Registros
	int inicio;
	int dispo;  //Indice do primeiro elemento disponível
}Lista; //Arranjo dos Elementos
#endif

/* FUNÇÕES/MÉTODOS */

void iniciarLista(Lista* list);
int comprimentoLista(Lista* list);
void exibirLista(Lista* list);
int buscaSequencialOrdenada(Lista* list, TipoChave ch);
int obterNo(Lista* list); //Função Auxiliar para Inserção Ordenada
bool inserirElemListaOrd(Lista* list, Registro reg);
void devolverNo(Lista* list, int i); //Função Auxiliar para Exclusão
bool excluirElemLista(Lista* list, TipoChave ch);

/* IMPLEMENTAÇÃO DAS FUNÇÕES/MÉTODOS */
void iniciarLista(Lista* list){//Ponteiro da lista
	int i; //Contador
	for(i = 0; i < MAX - 1; i++) list->A[i].prox = i + 1; //Percorre toda a lista apontando para o proximo elemento
	list->A[MAX - 1].prox = INVALIDO; //Pró elemento definido como inválido
	list->inicio = INVALIDO; //Elemento inicial definido como inválido
	list->dispo = 0; //Primeiro elemento disponível iniciada em 0
}//Inicializar a estrutura

int comprimentoLista(Lista* list){//O ponteiro de uma Lista
	int i = list->inicio; //Contador para o laço iniciado
	int comprimento = 0; //Contador de elementos
	while(i != INVALIDO){
		comprimento++;
		i = list->A[i].prox;
	}//Percorre um por um os elementos da lista Ligada
	return comprimento;
}//Retornar a quantidade de elementos válidos

void exibirLista(Lista* list){//O ponteiro de uma Lista
	int i = list->inicio; //Contador para o laço iniciado
	printf("\n\n\n");
	printf("Chave, Nome, Idade\n");
	while(i != INVALIDO){
		printf("%d, %s, %d\n", list->A[i].reg.chave, list->A[i].reg.nome, list->A[i].reg.idade);
		i = list->A[i].prox;
	}//Percorre um por um os elementos da lista Ligada
	printf("\n\n\n");
}//Exibe a lista com todos os elementos válidos

int buscaSequencialOrdenada(Lista* list, TipoChave ch){
	int i = list->inicio;
	while(i != INVALIDO && list->A[i].reg.chave < ch)//Enquanto i não for inválido e for menor que a chave
		i = list->A[i].prox; //Recebe o proximo
	if(i != INVALIDO && list->A[i].reg.chave == ch)//Se i não for inválido e for menor que a chave
		return i; //Retorna o indice encontrado
	else return INVALIDO;
}//Também só funciona se a lista estiver ordenada

int obterNo(Lista* list){
	int resultado = list->dispo; //Guarda a posição do primeiro elemento DISPONÍVEL
	if(list->dispo != INVALIDO)
		list->dispo = list->A[list->dispo].prox; //O primeiro disponível será o próximo disponivel
	return resultado;
}//Função Auxiliar para Inserção Ordenada - retorna o próximo disponível

bool inserirElemListaOrd(Lista* list, Registro reg){
	if(list->dispo == INVALIDO) return false;
	//Encontrar o registro anterior e o posterior
	int ant = INVALIDO; //Anterioe
	int i = list->inicio; //Posterior
	TipoChave ch = reg.chave;
	while((i != INVALIDO) && (list->A[i].reg.chave < ch)){//Enquanto i não for inválido e for menor que a chave
		ant = i;
		i = list->A[i].prox;
	}//Este laço nos trás o anterior e o atual
	if((i != INVALIDO) && (list->A[i].reg.chave == ch)) return false; //Se i for válido porém o elemento já existe então retorna FALSO
	i = obterNo(list); //Obter o próximo disponível
	list->A[i].reg = reg; //Insere o Elemento na Lista
	if(ant == INVALIDO){//Verifica se não tem anterior é porque ele é o PRIMEIRO
		list->A[i].prox = list->inicio; //Então o próximo é o primeiro
		list->inicio = i; //O início aponta para este elemento
	}else{ //Senão ele tem um anterior
		list->A[i].prox = list->A[ant].prox; //Então ele aponta para o próximo do anterior
		list->A[ant].prox = i; //O anterior dele aponta para ele	
	}
	return true;
}//Insere elementos na lista ligada ordenada

void devolverNo(Lista* list, int i){
	list->A[i].prox = list->dispo;
	list->dispo = i;
}//Função auxiliar para Exclusão

bool excluirElemLista(Lista* list, TipoChave ch){
	int ant = INVALIDO; //Anterioe
	int i = list->inicio; //Posterior
	while((i != INVALIDO) && (list->A[i].reg.chave < ch)){//Enquanto i não for inválido e for menor que a chave
		ant = i;
		i = list->A[i].prox;
	}//Este laço nos trás o anterior e o atual
	if((i != INVALIDO) && (list->A[i].reg.chave != ch)) return false;
	if(ant == INVALIDO) list->inicio = list->A[i].prox;
	else list->A[ant].prox = list->A[i].prox;
	devolverNo(list, i);
	return true;
}//Exclui elementos na lista ligada ordenada


/*MÉTODO PRINCIPAL PRINCIPAL - EXECUTANDO OS TESTES DAS FUNÇÕES DA Lista*/
int main(){
	int opcao = 0; //Variável de opçao do menu
	int chave, posicao; //Variável para ler a chave e a posição na lista
	Registro nReg; //Variável do tipo Registro para ser inserida na Lista
	Lista nLista; //Variável do tipo Lista a ser manipulada
	iniciarLista(&nLista); //Inicia a Lista de pessoas
	do{
		printf("\n\n");
		printf("Escolha uma das opcoes abaixo:\n 0:SAIR 1:INSERIR 2:EXCLUIR 3:LISTAR 4:BUSCA_SEQ_ORDENADA 5:LIMPAR\n");
		printf("Escolha uma das opcoes do Menu:");scanf("%d", &opcao);
		printf("\n\n");
		switch(opcao){
			case 1:
				printf("Digite um inteiro para Chave: "); scanf("%d",&nReg.chave); //Le a posição do elemento na lista
				printf("Digite o nome: "); scanf("%s",&nReg.nome); //Le a partir do teclado o nome
				printf("Digite a Idade: "); scanf("%d",&nReg.idade); //Le a partir do teclado a idade
				if(inserirElemListaOrd(&nLista, nReg)) printf("Registro adicionado a Lista.\n"); //Insere o Registro na Lista
				else printf("Erro ao adicionar.\n"); //Senão, apresentou algum erro ao inserir
				break;
			case 2:
				printf("Digite a chave do registro a ser Excluido: "); scanf("%d",&chave); //Le a posição do elemento na lista
				if(excluirElemLista(&nLista, chave)) printf("Registro removido da Lista.\n"); //Remove o Registro da Lista
				else printf("Erro ao remover registro.\n"); //Senão, apresentou algum erro ao excluir
				break;
			case 3:
				exibirLista(&nLista);//Mostra a Lista a cada inscrito
				break;
			case 4:
				printf("A lista Possui %d registros\n",comprimentoLista(&nLista));
				printf("Digite a chave do registro a ser encontrada na Lista: "); scanf("%d",&chave); //Le a posição do elemento na lista
				posicao = buscaSequencialOrdenada(&nLista, chave);
				printf("A chave informada fica na posicao %d\n", posicao);
				if(posicao == -1) printf("Registro nao encontrado\n");
				else printf("\nChave: %d\nNome: %s\nIdade: %d\n", nLista.A[posicao].reg.chave, nLista.A[posicao].reg.nome, nLista.A[posicao].reg.idade);
				break;
			case 5:
				iniciarLista(&nLista); //Re-Inicia a Lista de pessoas
				break;
			default: break;
		}
		
	}while(opcao != 0); //Faz as leituras enquanto o usuário não digitar 0 para sair.
	return 0; //Retorna 0 para fim do programa
}


