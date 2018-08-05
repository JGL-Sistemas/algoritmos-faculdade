#include<stdio.h>
#include<stdlib.h>
#include<string.h>


char menu(){
	fflush (stdin);
	printf ("\n\t\t-----Menu-----");
	printf ("\n\t\t 1 Cadastrar");
	printf ("\n\t\t 2 Exibir");
	printf ("\n\t\t 3 Alterar");	
	printf ("\n\t\t 4 Excluir");	
	printf ("\n\t\t 5 Propriedades");
	printf ("\n\t\t 6 Salvar");
	printf ("\n\t\t 0 Sair");
	char op = getch();
	system ("cls");
	return op;
}

typedef struct al{
	char nome [20], matricula [6],excluir[6];
	struct al *prox;
}aluno;

aluno *ini, *aux;

void inicio(){
	ini= NULL;
}

int estaVazia(){
	return (ini==NULL);
}

void inserir (){
	aux=(aluno*) malloc(sizeof(aluno));
	printf ("\nInforme o nome do aluno: ");
	fflush (stdin);
	gets (aux->nome);
	printf ("\nInforme o numero da matricula: ");
	fflush (stdin);
	gets (aux->matricula);
	aux->prox = ini;
	ini = aux;
}

void listar(){	
	for (aux = ini; aux != NULL; aux = aux->prox){
		printf("\nNome: %s - Matricula: %s", aux->nome, aux->matricula);
	
	}
}

int quantidadeAluno(){
	int q=0;
	
	printf("Digite matricula que deseja Excluir:");
	
	
	for (aux = ini; aux != NULL; aux = aux->prox){
		q++;
	}
	return q;
}

void propriedade(){
	if (estaVazia()){
		printf("\nLista Vazia!\n");
    }
	else{
		printf("\nA lista possui %d Alunos.\n", quantidadeAluno());
	}
}

void excluir(){
	aux=(aluno*) malloc(sizeof(aluno));
	listar();
	
	printf ("\n\nInforme o numero da matricula: ");
	fflush (stdin);
	gets(aux->excluir);
	
	printf("Matricula: %s", aux->excluir);
	
	FILE *f, cadastro;
	f = fopen("cadastro.txt", "a");
	
		for (aux = ini; aux != NULL; aux = aux->prox){
			if(aux->matricula != aux->excluir){
				fprintf(f,"%s \t %s",aux->nome, aux->matricula);	
		}}
    fclose(f);
}

void alterar(){
	
	listar();
	printf("\nInforme a matricula a ser Alterada: ");
	char pesquisa[6];
	gets(pesquisa);
	for(aux = ini; aux != NULL; aux = aux->prox){
		
	if(!(strcmp(aux->matricula , pesquisa))){
    	printf("\n%s nome atual, \nInforme o outro nome: ", aux -> nome);
	    fflush(stdin);
	    gets(aux->nome);
	    break;
    	}
	}
}

//salve em um aquivo
char salvar(){
	FILE *f, cadastro;
	f = fopen("cadastro.txt", "a");
	for (aux = ini; aux != NULL; aux = aux->prox){
		fprintf(f,"%s \t %s",aux->nome, aux->matricula);
	}
	fclose(f);
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
			case'3':
				alterar();
				break;
			case'4':
				excluir();
				break;
			case'5':
				propriedade();
				break;
			case'6':
				salvar();
				break;
		}
		op = menu();
	}
	system("pause");
}
