#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char opcoes(){
	
	printf("\n\t\t----- M E N U -----");
	printf("\n\t\t1 - Cacastrar Item ");
	printf("\n\t\t2 - Exibir Cardapio ");
	printf("\n\t\t3 - Editar Cardapio ");
	printf("\n\t\t4 - Excluir Item ");
	printf("\n\t\t5 - Apagar Cardapio ");
	printf("\n\t\t6 - Salvar ");
	printf("\n\t\t0 - Sair \n");
	fflush(stdin);
	char o = getch();
	system("cls");
	return o;
}

void leiavetor (int *p, char vet[30][30], FILE *f){
	
	f = fopen("teste.txt", "r");
	
	while (!feof (f)){
		fgets(vet[*p], 30, f);
		(*p)++;
	}int main
	
	(*p)--;
	fclose(f);
}

void cadastrar(int *p, char vet[30][30]){
	
	char n[30];
	
	printf("\nInforme o Sabor: ");
    fflush(stdin);
	gets(vet[*p]);
	strcat(vet[*p], "\t\t");
	printf("\nInforme o Preco: ");
	fflush(stdin);
	gets(n);
	strcat(vet[*p], n);
	strcat(vet[*p], "\n");
	(*p)++;
}

void salvar(FILE *f, char vet[30][30], int *p){
	
	f=fopen("teste.txt","w");
	int i;
	
	for (i=0; i<*p; i++){
		fprintf(f, "%s", vet[i]);
    }
    (*p)--;
    
    fclose(f);
}

void apagar(int *p, char vet[30][30], FILE *f){
	
	f=fopen("teste.txt","w");
    fclose(f);
    (*p)=0;
	leiavetor(p, vet, f);
}

void mostrar(int *p, char vet[30][30]){
	
	int i;
	
	for (i=0; i<*p; i++){
		
		printf("%d - %s", i, vet[i]);
    }
}

void editar(int *p, char vet[30][30]){
	
	int x;
	system("cls");
	mostrar(p,vet);
	printf("\n\ninsira o codigo do item a ser editado: ");
	scanf("%d", &x);
	cadastrar(&x, vet);
}

void excluir(int *p, char vet[30][30]){
	
	system("cls");
	int x, i;
	mostrar(p,vet);
	printf("\n\ninsira o codigo do item a ser apagado: ");
	fflush(stdin);
	scanf("%d", &x);
	
	for (i= x+1; x<*p; x++, i++){
		
		strcpy(vet[x], vet[i]);
		
		//vet[x] = vet[i];
    }
    
    (*p)--;
}

int main (){
	
    FILE *fp; 
    char op = opcoes(), vet[30][30];
    int pos = 0, *ps;
    
    ps = &pos;
    
    leiavetor(ps, vet, fp);
    
    while(op !=  '0'){
    	switch(op){
    		case '1':
    			cadastrar(ps, vet);
    			break;
    		case '2':
    			mostrar(ps, vet);
    			break;
    		case '3':
    			editar(ps, vet);
    			break;
    		case '4':
    			excluir(ps, vet);
    			break;
    		case '5':
    			apagar(ps, vet, fp);
    			break;
    		case '6':
    			salvar(fp, vet, ps);
    			(*ps)=0;
    			leiavetor(ps, vet, fp);
    			break;
		}
		op = opcoes();
	}
}
