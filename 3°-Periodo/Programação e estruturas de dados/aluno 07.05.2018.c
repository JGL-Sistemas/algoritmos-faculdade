#include<stdio.h>
#include<stdlib.h>


char menu(){
    fflush(stdin);
    printf("\n\t\t 1 - Entrar na fila:");
    printf("\n\t\t 2 - Mostrar fila");
    peintf("\n\t\t 3 - Atender");
    printf("\n\t\t 0 - Sair:");  
    return getch();
  
}

typedef struct al{
	char nome[20], matricula[6], senha[6], atendimento[50],data[10];
	struct al *prox;
}aluno;


aluno *ini, *aux;

limpatela(){
	system("cls");
}

void inicio(){
	ini= NULL;
}

int estaVazia(){
	return (ini==NULL);
}

void inserir (){
	aux=(aluno*) malloc(sizeof(aluno));
	
	printf ("\nInforme o nome pessoa:");
	fflush (stdin);
	gets (aux->nome);
	
	printf ("Informe o numero da matricula: ");
	fflush (stdin);
	gets (aux->matricula);
	
	printf ("Informe a data do atendimento: ");
	fflush (stdin);
	gets (aux->data);
	
	printf ("Informe a descrição: ");
	fflush (stdin);
	gets (aux->atendimento);
		
	
	aux->prox = ini;
	ini = aux;
}

void listar (){
	limpatela();	
	for (aux = ini; aux != NULL; aux = aux->prox){
		printf("\nNome: %s - Senha: %s - Senha: %s - Descricao: %s", aux->nome, aux->matricula, aux->data, aux->atendimento);
	}
}


void atender(){
	
	
}

int main(){
	char op;
	inicio();
	int x=0,nn;
	
	while(op != '0'){
        switch(op){
            case '1':
				inserir();	
            break;
            case '2':
                listar();
            break;
        	case '3':
                //atender();
            break;
        }
    op = menu();   
    }
		
	system("pause");
}
