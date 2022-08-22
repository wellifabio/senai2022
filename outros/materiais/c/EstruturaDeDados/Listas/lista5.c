/* LISTA LINEAR LIGADA ORDENADA POR UM NÓ CABEÇA
Cada ELEMENTO é precedido por um e Sucedido por outro.
Agora cada um possui um índice que aponta para o seu sucessor
A lista encadeada comum, possui um início e vai até o último eleento que é o NULL
Esta possui um nó CABEÇA que é o início e o fim.

COM ALOCAÇÃO DINÂMICA DE MEMÓRIA

*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>


/* MODELAGEM */

#ifndef _lista_h //Se as definições em Lista h não existem define abaixo
#define _lista_h

typedef int TipoChave; //Outro nome para o tipo de dados int OBS: O int continua funcionando

typedef struct{
	TipoChave chave; //Campo Chave para o controle da Lista
	char nome[10]; //Nome de uma pessoa - +1 para criar um elemento SENTINELA para busca
	int idade; //Idade, somente de exemplo com inteiro ao invés de dataNascimento
} Registro; //Dados a serem estruturados na Lista (Tema: idade e nome)

typedef struct tempRegistro{//aux é um auxiliar para um ponteiro do próprio tipo
	Registro reg;
	struct tempRegistro* prox; //O ponteiro prox é do próprio tipo Elemento
}Elemento; //Estrutura intermediária de elementos

typedef Elemento* Pont;

typedef struct{
	Pont cabeca;	
}Lista; //Arranjo dos Elementos
#endif

/* FUNÇÕES/MÉTODOS */

void iniciarLista(Lista* list);
int comprimentoLista(Lista* list);
void exibirLista(Lista* list);
Pont buscaSentinela(Lista* list, TipoChave ch);
int buscaSequencial(Lista* list, TipoChave ch);
Pont buscaSequencialExc(Lista* list, TipoChave ch, Pont *anterior);
bool inserirElemListaOrd(Lista* list, Registro reg);
bool excluirElemLista(Lista* list, TipoChave ch);
void reiniciarLista(Lista* list);

/* IMPLEMENTAÇÃO DAS FUNÇÕES/MÉTODOS */
void iniciarLista(Lista* list){//Ponteiro da lista
	list->cabeca = (Pont) malloc(sizeof(Elemento)); //Aloca memória para o nó cabeça
	list->cabeca->prox = list->cabeca; //O próximo do nó cabeça é ele mesmo
}//Inicializar a estrutura

int comprimentoLista(Lista* list){//O ponteiro de uma Lista
	Pont endereco = list->cabeca->prox; //Endereco aponta para o nó Cabeça
	int comprimento = 0; //Contador de elementos
	while(endereco != list->cabeca){
		comprimento++;
		endereco = endereco->prox;
	}//Percorre um por um os elementos da lista Ligada
	return comprimento;
}//Retornar a quantidade de elementos válidos

void exibirLista(Lista* list){//O ponteiro de uma Lista
	Pont endereco = list->cabeca->prox; //Endereco aponta para o início
	printf("\n\n\n");
	printf("Chave, Nome, Idade\n");
	while(endereco != list->cabeca){
		printf("%d, %s, %d\n", endereco->reg.chave, endereco->reg.nome, endereco->reg.idade);
		endereco = endereco->prox;
	}//Percorre um por um os elementos da lista Ligada
	printf("\n\n\n");
}//Exibe a lista com todos os elementos válidos

Pont buscaSentinela(Lista* list, TipoChave ch){//Esta estrutura com nó CABEÇA permite a busca SENTINELA
	Pont posicao = list->cabeca->prox; //Variável do tipo ponteiro para percorrer a lista
	list->cabeca->reg.chave = ch;
	while(posicao->reg.chave != ch) posicao = posicao->prox;
	if(posicao != list->cabeca) return posicao;
	return NULL;
}//Não precisa estar ordenada pelos valores das chaves

int buscaSequencial(Lista* list, TipoChave ch){//Esta busca retorna a posição numérica na lista
	Pont posicao = list->cabeca->prox; //Variável do tipo ponteiro para percorrer a lista
	int contador; //Contador que retornará a posição
	while(posicao != list->cabeca){
		if(posicao->reg.chave == ch) return contador;
		posicao = posicao->prox;
		contador++;
	}
	return -1;
}

Pont buscaSequencialExc(Lista* list, TipoChave ch, Pont *anterior){//Ponteiro list, Campo CHAVE e Ponteiro que receberá o Anterior
	*anterior = list->cabeca;
	Pont atual = list->cabeca->prox; //Variável do tipo Pont que retornará a posição
	list->cabeca->reg.chave = ch;
	while(atual->reg.chave < ch){
		*anterior = atual;
		atual = atual->prox;
	}
	if(atual != list->cabeca && atual->reg.chave == ch) return atual;
	return NULL;
}//Busca Auxiliar (Dois retornos: atual e o anterior)

bool inserirElemListaOrd(Lista* list, Registro reg){
	Pont anterior, atual;
	atual = buscaSequencialExc(list, reg.chave, &anterior); //Utiliza a Busca Auxiliar
	if(atual != NULL) return false;
	atual = (Pont) malloc(sizeof(Elemento)); //Aloca epaço na memporia para mais um registro
	atual->reg = reg; //Transfere os dados do parâmetro registro para o espaço alocado
	atual->prox = anterior->prox; //O próximo do atual é o que era próximo do anterior
	anterior->prox = atual; //O próximo do anterior é o elemento atual
	return true;
}//Insere elementos na lista ordenada

bool excluirElemLista(Lista* list, TipoChave ch){
	Pont anterior, atual;
	atual = buscaSequencialExc(list, ch, &anterior); //Utiliza a Busca Auxiliar
	if(atual == NULL) return false;
	anterior->prox = atual->prox;
	free(atual); //Devolve a memória que estava alocada
	return true;	
}//Exclui elementos da lista ordenada

void reiniciarLista(Lista* list){//Ponteiro da lista
	Pont fim = list->cabeca->prox;
	while(fim != list->cabeca){ //Laço para percorrer toda a lista devolvendo a memória alocada
		Pont apagar = fim;
		fim = fim->prox;
		free(apagar); //Devolve a memória alocada
	}
	list->cabeca->prox = list->cabeca; //Elemento inicial aponta para ele mesmo
}

/*MÉTODO PRINCIPAL PRINCIPAL - EXECUTANDO OS TESTES DAS FUNÇÕES DA Lista*/
int main(){

	int opcao = 0; //Variável de opçao do menu
	int chave; //Variável para ler a chave
	Pont posicao; //Variável para receber a posicao na lista
	Registro nReg; //Variável novo Registro a ser inserido na lista
	Lista nLista; //Variável nova Lista
	iniciarLista(&nLista); //Inicia a Lista
	do{
		printf("\n\n");
		printf("Escolha uma das opcoes abaixo:\n 0:SAIR\n 1:INSERIR\n 2:EXCLUIR\n 3:LISTAR\n 4:BUSCA_POR CODIGO\n 5:LIMPAR_LISTA\n");
		printf("Escolha uma das opcoes do Menu:");scanf("%d", &opcao);
		printf("\n\n");
		switch(opcao){
			case 1:
				printf("Digite o Codigo: "); scanf("%d",&nReg.chave); //Le a partir do teclado a CHAVE
				printf("Digite o nome: "); scanf("%s",&nReg.nome); //Le a partir do teclado o nome
				printf("Digite a Idade: "); scanf("%d",&nReg.idade); //Le a partir do teclado a idade
				if(inserirElemListaOrd(&nLista, nReg)) printf("Registro adicionado a Lista.\n"); //Insere o Registro na Lista
				else printf("Erro ao adicionar.\n"); //Senão, apresentou algum erro ao inserir
				break;
			case 2:
				printf("Digite o codigo do registro a ser Excluido: "); scanf("%d",&chave); //Le a posição do elemento na lista
				if(excluirElemLista(&nLista, chave)) printf("Registro removido da Lista.\n"); //Remove o Registro da Lista
				else printf("Erro ao remover registro.\n"); //Senão, apresentou algum erro ao excluir
				break;
			case 3:
				exibirLista(&nLista);//Mostra a Lista a cada inscrito
				break;
			case 4:
				printf("A lista Possui %d registros\n",comprimentoLista(&nLista));
				printf("Digite o codigo do registro a ser encontrado na Lista: "); scanf("%d",&chave); //Le a posição do elemento na lista
				posicao = buscaSentinela(&nLista, chave);
				if(posicao == NULL) printf("Registro nao encontrado\n");
				else{
					printf("O registro informado fica na posicao %d\n", buscaSequencial(&nLista, chave) + 1);
					printf("\nChave: %d\nNome: %s\nIdade: %d\n", posicao->reg.chave, posicao->reg.nome, posicao->reg.idade);
				}
				break;
			case 5:
				iniciarLista(&nLista); //Re-Inicia a Lista de pessoas
				printf("LISTA ESVAZIADA COM SUCESSO");
				break;
			default: break;
		}
		
	}while(opcao != 0); //Faz as leituras enquanto o usuário não digitar 0 para sair.
	return 0; //Retorna 0 para fim do programa
}


