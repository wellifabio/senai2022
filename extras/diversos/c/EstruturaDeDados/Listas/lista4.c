/* LISTA LINEAR LIGADA E ORDENADA
Cada ELEMENTO é precedido por um e Sucedido por outro.
Exceto o PRIMEIRO e o ÚLTIMO, porém agora cada um possui um índice que aponta para o seu sucessor

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

typedef struct aux{//aux é um auxiliar para um ponteiro do próprio tipo
	Registro reg;
	struct aux* prox; //O ponteiro prox é do próprio tipo Elemento
}Elemento; //Estrutura intermediária de elementos

typedef Elemento* Pont;

typedef struct{
	Pont inicio;	
}Lista; //Arranjo dos Elementos
#endif

/* FUNÇÕES/MÉTODOS */

void iniciarLista(Lista* list);
int comprimentoLista(Lista* list);
void exibirLista(Lista* list);
int buscaSequencial(Lista* list, TipoChave ch);
Pont buscaSequencialExc(Lista* list, TipoChave ch, Pont *anterior);
Pont buscaSeqOrd(Lista* list, TipoChave ch);
bool inserirElemListaOrd(Lista* list, Registro reg);
bool excluirElemLista(Lista* list, TipoChave ch);
void reiniciarLista(Lista* list);

/* IMPLEMENTAÇÃO DAS FUNÇÕES/MÉTODOS */
void iniciarLista(Lista* list){//Ponteiro da lista
	list->inicio = NULL; //Elemento inicial definido como inválido
}//Inicializar a estrutura

int comprimentoLista(Lista* list){//O ponteiro de uma Lista
	Pont endereco = list->inicio; //Endereco aponta para o início
	int comprimento = 0; //Contador de elementos
	while(endereco != NULL){
		comprimento++;
		endereco = endereco->prox;
	}//Percorre um por um os elementos da lista Ligada
	return comprimento;
}//Retornar a quantidade de elementos válidos

void exibirLista(Lista* list){//O ponteiro de uma Lista
	Pont endereco = list->inicio; //Endereco aponta para o início
	printf("\n\n\n");
	printf("Chave, Nome, Idade\n");
	while(endereco != NULL){
		printf("%d, %s, %d\n", endereco->reg.chave, endereco->reg.nome, endereco->reg.idade);
		endereco = endereco->prox;
	}//Percorre um por um os elementos da lista Ligada
	printf("\n\n\n");
}//Exibe a lista com todos os elementos válidos

int buscaSequencial(Lista* list, TipoChave ch){//Esta busca retorna a posição numérica na lista
	Pont posicao = list->inicio; //Variável do tipo ponteiro para percorrer a lista
	int contador; //Contador que retornará a posição
	while(posicao != NULL){//Enquanto a posição for diferente de NULL
		if(posicao->reg.chave == ch) return contador;
		posicao = posicao->prox;
		contador++;
	}
	return -1;
}

Pont buscaSeqOrd(Lista* list, TipoChave ch){
	Pont posicao = list->inicio; //Variável do tipo ponteiro que retornará a posição
	while(posicao != NULL && posicao->reg.chave < ch) posicao = posicao->prox;
	if(posicao != NULL && posicao->reg.chave == ch) return posicao;
	return NULL;
}//Só funciona se a lista estiver ordenada

Pont buscaSequencialExc(Lista* list, TipoChave ch, Pont *anterior){//Ponteiro list, Campo CHAVE e Ponteiro que receberá o Anterior
	*anterior = NULL;
	Pont atual = list->inicio; //Variável do tipo ponteiro que retornará a posição
	while((atual != NULL)&&(atual->reg.chave < ch)){
		*anterior = atual;
		atual = atual->prox;
	}
	if(atual != NULL && atual->reg.chave == ch) return atual;
	return NULL;
}//Busca Auxiliar (Dois retornos: atual e o anterior)

bool inserirElemListaOrd(Lista* list, Registro reg){
	TipoChave ch = reg.chave;
	Pont anterior, atual;
	atual = buscaSequencialExc(list, ch, &anterior); //Utiliza a Busca Auxiliar
	if(atual != NULL) return false;
	atual = (Pont) malloc(sizeof(Elemento)); //Aloca epaço na memporia para mais um registro
	atual->reg = reg; //Transfere os dados do parâmetro registro para o espaço alocado
	//Varifica o anterior e o próximo
	if(anterior == NULL){//Verifica se não tem anterior- neste caso o atual é o PRIMEIRO
		atual->prox = list->inicio; //O próximo aponta para o início
		list->inicio = atual; //O atual se torna o novo início
	}else{ //Senão ele tem um anterior
		atual->prox = anterior->prox; //O próximo do atual é o que era próximo do anterior
		anterior->prox = atual; //O próximo do anterior é o elemento atual
	}
	return true;
}//Insere elementos na lista ordenada

bool excluirElemLista(Lista* list, TipoChave ch){
	Pont anterior, atual;
	atual = buscaSequencialExc(list, ch, &anterior); //Utiliza a Busca Auxiliar
	if(atual == NULL) return false;
	if(anterior == NULL) list->inicio = atual->prox;
	else anterior->prox = atual->prox;
	free(atual); //Devolve a memória que estava alocada
	return true;	
}//Exclui elementos da lista ordenada

void reiniciarLista(Lista* list){//Ponteiro da lista
	Pont fim = list->inicio;
	while(fim != NULL){ //Laço para percorrer toda a lista devolvendo a memória alocada
		Pont apagar = fim;
		fim = fim->prox;
		free(apagar); //Devolve a memória alocada
	}
	list->inicio = NULL; //Elemento inicial definido como inválido novamente
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
				posicao = buscaSeqOrd(&nLista, chave);
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


