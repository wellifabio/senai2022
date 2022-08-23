/* LISTA LINEAR SEQUÊNCIAL ORDENADA
Cada ELEMENTO é precedido por um e Sucedido por outro.
Exceto o PRIMEIRO e o ÚLTIMo

É Ordenada porque tanto a inserção quanto a inclusão são ordenadas pelo campo Chave
*/

#include <stdio.h>
#include <stdbool.h>

/* MODELAGEM 
Modelar um arranjo de Registros com tamanho fixo
Controlar o número de elementos com uma variável adicional
Elementos seguirão uma ORDEM (De inclusão ou por uma CHAVE)
*/

#ifndef _Lista_h //Se as definições em Lista h não existem define abaixo
#define MAX 50 //Tamanho máximo do arranjo Definido

typedef int TipoChave; //Outro nome para o tipo de dados int OBS: O int continua funcionando

typedef struct{
	TipoChave chave; //Campo Chave para o controle da Lista
	char nome[MAX+1]; //Nome de uma pessoa - +1 para criar um elemento SENTINELA para busca
	int idade; //Idade, somente de exemplo com inteiro ao invés de dataNascimento
} Registro; //Dados a serem estruturados na Lista (Tema: idade e nome)

typedef struct{
	Registro A[MAX]; //Vetor que armazenará os Registros
	int nroElem; //Contador de elementos da Lista
}Lista; //Arranjo dos Registros
#endif

/* FUNÇÕES/MÉTODOS
Inicializar a estrutura
Retornar a quantidade de elementos válidos
Exibir os elementos da estrutura
Buscar por um elemento na estrutura
Inserir elementos na estrutura
Excluir elementos na estrutura
Reinicializar a estrutura */

void iniciarLista(Lista* list);
int comprimentoLista(Lista* list);
void exibirLista(Lista* list);
int buscaSequencial(Lista* list, TipoChave ch);
int buscaSentinela(Lista* list, TipoChave ch); //Este arquivo foi acrescido da busca por SENTINELA
int buscaBinaria(Lista* list, TipoChave ch); //Este arquivo foi acrescido da busca BINÁRIA
bool inserirElemListaOrdByChave(Lista* list, Registro reg);
bool excluirElemLista(TipoChave ch, Lista* list);
void reiniciarLista(Lista* list);

/* IMPLEMENTAÇÃO DAS FUNÇÕES/MÉTODOS */
void iniciarLista(Lista* list){//O parâmetro não é a Lista e sim o ponteiro de uma Lista
	list->nroElem = 0;
}//Inicializar a estrutura

int comprimentoLista(Lista* list){//O ponteiro de uma Lista
	return list->nroElem;
}//Retornar a quantidade de elementos válidos

void exibirLista(Lista* list){//O ponteiro de uma Lista
	int i; //Será utilizado como contador para o laço for
	printf("Chave, Nome, Idade\n"); //Imprime o cabeçalho da Lista
	for(i = 0; i < list->nroElem; i++) //Laço para imprimir o total de elementos
		printf("%d, %s, %d\n", list->A[i].chave, list->A[i].nome, list->A[i].idade); //Imprime cada linha
}//Exibir os elementos da estrutura

int buscaSequencial(Lista* list, TipoChave ch){//Ponteiro da Lista e O Campo CHAVE
	int i = 0; //Será utilizado como contador
	while(i < list->nroElem){//Enquanto o contador for menor que o número de elementos da Lista
		if(ch == list->A[i].chave) return i; //Se a chave passada para a função for igual a chave do Registro na Lista retorna seu índice 
		else i++; //senão incrementa o contador
	}
	return -1;
}//Buscar por um elemento na estrutura

int buscaSentinela(Lista* list, TipoChave ch){//Ponteiro da Lista e O Campo CHAVE
	int i = 0; //Será utilizado como contador
	list->A[list->nroElem].chave = ch; //Cria a SENTINELA armazenando a chave no úntimo elemento da LISTA
	while(list->A[i].chave != ch) i++; //Incrementa o contador enquanto a SENTINELA for diferente da chave informada
	if(i == list->nroElem) return -1; //Se i for igual ao Numero de Elementos significa que passou por todos e não encontrou
	else return i; //Senão retorna a posição
}//Buscar por Sentinela

int buscaBinaria(Lista* list, TipoChave ch){//Ponteiro da Lista e O Campo CHAVE
	int esq, dir, meio; //Divisores da lista
	esq = 0;
	dir = list->nroElem -1;
	while(esq <= dir){//Enquanto eaquerda menor ou igual a direita
		meio = ((esq + dir)/2);
		if(list->A[meio].chave == ch) return meio; //Se as chaves forem iguais encontrada a posição
		else{
			if(list->A[meio].chave < ch) esq = meio + 1; //Se a chave for maior que o meio a esquerda vem para o meio
			else dir = meio - 1; //Senão a direita vem para o meio (Sempre encurtando a lista pela metade)
		}
	}
	return -1;
}//Buscar Binária (OBS: SÓ FUNCIONA PARA LISTAS ORDENADAS

bool inserirElemListaOrdByChave(Lista* list, Registro reg){//Ponteiro da Lista, Registro com a Posição na Lista
	int i; //Contador para o laço for
	if((list->nroElem == MAX)||(reg.chave < 0)||(reg.chave > list->nroElem)) //Testa as condições básicas para INSERIR
		return false;//Se a Lista já estiver cheia OU a posição for menor que 0 OU maior que Num. de Elementos retorna FALSO
	//O laço abaixo corre de forma decrescente (do Número de Eementos até a posição informada)
	for(i = list->nroElem; i > reg.chave; i--){
		list->A[i] = list->A[i-1]; //Desloca toda a Lista uma posição para frente (da posição informada em diante)
		list->A[i].chave++;//Desloca as chaves uma posição a frente	
	}
	list->A[reg.chave] = reg; //Atribui o Registro lido a posição do contador i (Já fora do laço for)
	list->nroElem++; //Incrementa o contador de elementos
	return true; //Retorna verdadeiro após Incluir	
}//Inserir elementos na estrutura

bool excluirElemLista(TipoChave ch, Lista* list){//O índice CHAVE do elemento a ser excluído e o ponteiro da Lista
	int posicao, i; //Posicao e contador para for
	posicao = buscaSequencial(list, ch); //Usa a função/método já criado para buscar a posicao do Registro
	if(posicao == -1) return false; //Se a posição retornada for = -1, O índice CHAVE não foi encontrado na Lista
	//O laço abaixo corre de forma crescente (da posição informada até o Número de Eementos)
	for(i = posicao; i < list->nroElem; i++){
		list->A[i] = list->A[i+1];//Desloca toda a Lista uma posição para traz (Desta forma removendo o elemento)
		list->A[i].chave--;//Desloca as chaves uma posição atraz
	}
	list->nroElem--; //Decrementa o número de elementos
	return true; //Retorna verdadeiro após Excluir
}//Excluir elementos na estrutura

void reiniciarLista(Lista* list){//Pode ser utilizada a mesma função de inicializar a Lista
	list->nroElem = 0; //Basta zerar o o número de elementos
}//Inicializar a estrutura

/*MÉTODO PRINCIPAL PRINCIPAL - EXECUTANDO OS TESTES DAS FUNÇÕES DA Lista*/
int main(){
	
	int opcao = 0; //Variável de opçao do menu
	int chave; //Variável para ler a posição na lista
	Registro nReg; //Variável do tipo Registro para ser inserida na Lista
	Lista nLista; //Variável do tipo Lista a ser manipulada
	iniciarLista(&nLista); //Inicia a Lista de pessoas
	do{
		printf("\n\n");
		printf("Escolha uma das opcoes abaixo:\n 0:SAIR 1:INSERIR 2:EXCLUIR 3:LISTAR 4:BUSCA_SENTINELA 5:BUSCA_BINARIA 6:LIMPAR\n");
		printf("Escolha uma das opcoes do Menu:");scanf("%d", &opcao);
		printf("\n\n");
		switch(opcao){
			case 1:
				printf("Digite a posicao na Lista iniciada obrigatoriamente em 0: "); scanf("%d",&nReg.chave); //Le a posição do elemento na lista
				printf("Digite o nome: "); scanf("%s",&nReg.nome); //Le a partir do teclado o nome
				printf("Digite a Idade: "); scanf("%d",&nReg.idade); //Le a partir do teclado a idade
				if(inserirElemListaOrdByChave(&nLista, nReg)) printf("Registro adicionado a Lista.\n"); //Insere o Registro na Lista
				else printf("Erro ao adicionar.\n"); //Senão, apresentou algum erro ao inserir
				break;
			case 2:
				printf("Digite a posicao a ser Excluida da Lista: "); scanf("%d",&chave); //Le a posição do elemento na lista
				if(excluirElemLista(chave,&nLista)) printf("Registro removido da Lista.\n"); //Remove o Registro da Lista
				else printf("Erro ao remover registro.\n"); //Senão, apresentou algum erro ao excluir
				break;
			case 3:
				printf("\n\n\n");
				exibirLista(&nLista);//Mostra a Lista a cada inscrito
				printf("\n\n\n");
				break;
			case 4:
				printf("A lista Possui %d registros\n",comprimentoLista(&nLista));
				printf("Digite a chave do registro a ser encontrada na Lista: "); scanf("%d",&chave); //Le a posição do elemento na lista
				printf("A chave informada fica na posicao %d",buscaSentinela(&nLista, chave));
				break;
			case 5:
				printf("A lista Possui %d registros\n",comprimentoLista(&nLista));
				printf("Digite a chave do registro a ser encontrada na Lista: "); scanf("%d",&chave); //Le a posição do elemento na lista
				printf("A chave informada fica na posicao %d",buscaBinaria(&nLista, chave));
				break;				
			case 6:
				reiniciarLista(&nLista); //Re-Inicia a Lista de pessoas
				break;
			default: break;
		}
		
	}while(opcao != 0); //Faz as leituras enquanto o usuário não digitar 0 para sair.
	return 0; //Retorna 0 para fim do programa
}


