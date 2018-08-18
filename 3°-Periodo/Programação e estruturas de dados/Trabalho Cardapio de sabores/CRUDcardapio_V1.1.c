#include <stdio.h>
#include<string.h>
#include<stdlib.h>

//Autor: Dieisson Martins
//Turma: Sistemas 3°Periodo 18/03/2018
//Editado:25/03/2018
/*Descrição: Programa de cadastro,exclusao, edição e visualizar 
de sabores de um cardapio*/

/*
Erros sem corrigir:

	Estrutura da planinha bugada
	
*/
//Função menu opcoes OK
char opcoes(){
	printf("\n\t\t######## MENU #########");
	printf("\n\t\t1 - Cadastrar Cardapio");
	printf("\n\t\t2 - Exibir Cardapio ");
	printf("\n\t\t3 - Editar Cardapio");
	printf("\n\t\t4 - Excluir Cardapio ");
	printf("\n\t\t5 - Exibir Lixeira ");
	printf("\n\t\t6 - Apagar todos os Dados");
	printf("\n\t\t7 - Converter p/ Excel");
	printf("\n\t\t0 - Sair \n");
	fflush(stdin);
	char o = getch();
	system("cls");
	return o;
}
//Função menu cadastro cardapio OK
void cadastrar(FILE *f){	
	char n[30];
	f=fopen("cardapio.txt","a");
	printf("\nInforme o Sabor: ");
    fflush(stdin);
	gets(n);
    fprintf(f,"%s\t\t",n);  
	printf("\nInforme o Preco: ");
	fflush(stdin);
	gets(n);
	fprintf(f,"R$%s\n",n); 
    fclose(f);
}
//Função mostrar cardapio OK
void mostrar(FILE *f){
	f=fopen("cardapio.txt","r");
	char n[30];
	int cont;
	printf("\n");
	cont=1;
	printf("Codigo\t  Sabor\t\tPreco\n\n");
	while(!feof(f)){
        fgets(n,20,f);
        if(feof(f)) break;
        printf("%d\t  %s",cont,n);
        cont++;		
    } 
	printf("\n");
    fclose(f);
}
//função editar cardapio OK
void editar(FILE *f){
	f=fopen("cardapio.txt","r");
	FILE *fp;
	char n[30];
	int cont;
	int nSabor;
	printf("\n");	
	mostrar(fp);		
	printf("Codigo do sabor para editar: ");
	scanf("%d", &nSabor);		
	system("cls");
	cont = 1;	
	//limpa arquivo temporario 
	FILE *tp;
    tp = fopen("temporario.txt","w");	
	while(!feof(f)){	
		//copia no arquivo temporario
		 if(nSabor == cont){		 	
		 	FILE *tp;
	        fgets(n,20,f);
	        //printf("%s",n);
	        tp = fopen("lixeira.txt","r+");
	        if(feof(tp)) break;
	        if(feof(f)) break;
	    	fprintf(tp,"%s",n);  
		    fclose(tp);		 	
			cadastrar(fp);							    
		}else{
	        FILE *tp;
	        fgets(n,20,f);
	        //printf("%s",n);
	        tp = fopen("temporario.txt","a");
	        if(feof(tp)) break;
	        if(feof(f)) break;
	    	fprintf(tp,"%s",n);  
		    fclose(tp);
		}
        cont++;
		if(feof(f)) break;
    }
    fclose(f);    
    //abre temporario
    //FILE *tp;
    tp = fopen("temporario.txt","r");    
    //limpa cardapio
	f = fopen("cardapio.txt","w");
	fclose(f);	
	//add sabores do arq temporario para o cardapio
	while(!feof(tp)){		
		fgets(n,20,tp);
		f = fopen("cardapio.txt","a");
		if(feof(tp)) break;
		//if(feof(f)) break;
		fprintf(f,"%s",n);
		fclose(f);
		//if(feof(f)) break;
	}
}
//função excluir cardapio OK
void excluir(FILE *f){
	f=fopen("cardapio.txt","r");
	FILE *fp;
	char n[30];
	int codigo;
	int nSabor;
	printf("\n");	
	mostrar(fp);		
	printf("excluir sabor:");
	scanf("%d", &nSabor);		
	system("cls");
	codigo = 1;	
	//limpa arquivo temporario 
	FILE *tp;
    tp = fopen("temporario.txt","w");	
	while(!feof(f)){	
		//copia no arquivo temporario
		 if(nSabor != codigo){
			FILE *tp;
	        fgets(n,20,f);
	        //printf("%s",n);
	        tp = fopen("temporario.txt","a");
	        if(feof(tp)) break;
	        if(feof(f)) break;
	    	fprintf(tp,"%s",n);  
		    fclose(tp);
		}else{
			FILE *tp;
	        fgets(n,20,f);
	        //printf("%s",n);
	        tp = fopen("lixeira.txt","a");
	        if(feof(tp)) break;
	        if(feof(f)) break;
	    	fprintf(tp,"%s",n);  
		    fclose(tp);
		}
        codigo++;
		if(feof(f)) break;
    }
    fclose(f);    
    //abre temporario
    //FILE *tp;
    tp = fopen("temporario.txt","r");  
    //limpa cardapio
	f = fopen("cardapio.txt","w");
	fclose(f);	
	//add sabores do arq temporario para o cardapio
	while(!feof(tp)){		
		fgets(n,20,tp);
		f = fopen("cardapio.txt","a");
		if(feof(tp)) break;
		//if(feof(f)) break;
		fprintf(f,"%s",n);
		fclose(f);
		//if(feof(f)) break;
	}		
}
//função mostrar Lixeira OK
void mostrarLixeira(FILE *f){
	f=fopen("lixeira.txt","r");
	char n[30];
	printf("\n");
	while(!feof(f)){
        fgets(n,20,f);
        printf("%s",n);
		if(feof(f)) break;
    } 
    fclose(f);
}
//Função apagar todos os arquivos Bugado************
void zerarTudo(FILE *f){	
			f = fopen("cardapio.txt","w");
			fclose(f);			
			f = fopen("temporario.txt","w");
			fclose(f);			
			f = fopen("temporario.txt","w");
			fclose(f);	
	printf("\nTodos os seus dados foram apagados...\n\t se ferro****");
	//int zerar;	
	/*printf("Apagar Tudo:\n\t1-SIM\n\t2-NAO");
	scanf("%d", &zerar);
	switch(zerar){
		case '1':
			f = fopen("cardapio.txt","w");
			fclose(f);
			
			f = fopen("temporario.txt","w");
			fclose(f);
			
			f = fopen("temporario.txt","w");
			fclose(f);
			
			printf("Todos os seus dados foram apagados:\n");
		break;
		case '2':
			return  opcoes();
		break;
	}	*/
}
//Função converte dados para Excel Nâo terminado meio que buga estrutura da planinha
convertExcel(FILE *f){
	
	//abre cardapio
	f=fopen("cardapio.txt","r");
	FILE *fp;
	FILE *Exl;
	char n[30];
	int codigo;
	printf("\n");				
	codigo = 1;
	char cabecalho[30]="Codigo ; Sabor ; Valor";
	
	//criar cabeçalho da Planilha
	Exl = fopen("CardapioExcel.csv","w");
	fprintf(Exl,"%s",cabecalho);
	fclose(Exl);
	
	//copia dados do cabeçalho para a planinha		
	while(!feof(f)){	
			FILE *tp;
	        fgets(n,20,f);
	        tp = fopen("CardapioExcel.csv","a");
	        if(feof(tp)) break;
	        if(feof(f)) break;
	    	fprintf(tp,"%d ; %s",codigo,n);  
		    fclose(tp);
        	codigo++;
			if(feof(f)) break;
    }
    fclose(f);
    
    //fala para user que dados foram copiados
	printf("Seu Cardapio foi convertido\n*Salvo no diretorio do programa...\n");    
	
}



//Pricipal do programa
main (){
    FILE *fp;
    char op = opcoes();
    while(op !=  '0'){
    	switch(op){
    		case '1':
    			cadastrar(fp);
    			break;
    		case '2':
    			mostrar(fp);
    			break;
    		case '3':
    			editar(fp);
    			break;
    		case '4':
    			excluir(fp);
    			break;
    		case '5':
    			mostrarLixeira(fp);
    			break;
    		case '6':
    			zerarTudo(fp);
    			break;
    		case '7':
    			convertExcel(fp);
    			break;
		}
		op = opcoes();
	}
}