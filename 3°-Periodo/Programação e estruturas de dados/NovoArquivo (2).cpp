#include<stdio.h>
#include<stdlib.h>
#include<string.h>

char menu(){
	fflush (stdin);
	printf ("\n\t\t-----Menu-----");
	printf ("\n\t\t 1 Add Paciente");
	printf ("\n\t\t 2 Exibir Pacientes");	
	printf ("\n\t\t 3 Atender Paciente");	
	printf ("\n\t\t 0 Sair");
	char op = getch();
	system ("cls");
	return op;
}

typedef struct paciente{
	char nome [20],  data[6], senha[6], atendimento[50];
	struct paciente *prox;
}pacienteat;

pacienteat *ini, *aux;

void inicio(){
	ini= NULL;
}

int estaVazia(){
	return (ini==NULL);
}

void inserir (){
	int senha=1;

	aux=(pacienteat*) malloc(sizeof(pacienteat));
	

	
	printf ("\nInforme o nome do paciente: ");
	fflush (stdin);
	gets (aux->nome);

	printf ("\nInforme o numer: ");
	fflush (stdin);
	gets (aux->matricula);

	printf ("\nInforme a desc atendimento: ");
	fflush (stdin);
	gets (aux->atendimento);

	aux->prox = ini;
	ini = aux;
}

void listar(){	
	for (aux = ini; aux != NULL; aux = aux->prox){
		printf("\nNome: %s - Matricula: %s - Atendimento: %s - Senha: %s", aux->nome, aux->matricula, aux->atendimento, aux->senha);
	}
}

int main(){
	inicio();
	int x=0,nn;
	
	char op=menu();
	while(op != '0'){
		switch (op){
			case'1':
				inserir();
				break;
			case'2':
				listar();
				break;
			//case'3':
				//excluir();
				//break;
		}
		op = menu();
	}
	system("pause");
}