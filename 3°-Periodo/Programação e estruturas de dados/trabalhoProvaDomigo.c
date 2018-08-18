#include<stdio.h>
#include <stdlib.h>
#include <string.h>

//funcao menu principal 
char menu(){
    fflush(stdin);
    printf("\n\t\t 1 - Cadrastar Gabarito: ");
    printf("\n\t\t 2 - Cadrastar Questionario: ");
    printf("\n\t\t 3 - Iniciar Prova: ");
    printf("\n\t\t 4 - Corrigir Prova: ");
	printf("\n\t\t 0 - Sair:");   
    return getch();
   
}

//funcao limpa tela 
void limpatela(){
    system("cls");
}

//Objeto gabarito
typedef struct gabarito{
    char alter[5];
    char alterMarcadas[5];
};

//Objeto Questionario
typedef struct questionario{
    char enunciado[100];
    char alternativa[50];    
};

//funcao adiciona gabarito da prova
addGabarito(struct gabarito prova, FILE *f){
	limpatela();
	int i;
	int questao = 1;
	fopen("gabarito.txt","w");
	
	for(i=0; i<5; i++){
		
		fflush(stdin);
		printf("\nDigite Resposta da questao %d:",questao);
		scanf("%c", &prova.alter[i]);
		questao++;
	}
	
	for(i=0; i<5; i++){
		f=fopen("gabarito.txt","a");
		fprintf(f,"%c\n",prova.alter[i]);
		fclose(f);	                             
	}
}

//funcao funcao add questoes da prova
addQuestao(struct questionario daprova, FILE *f){
	limpatela();
	int i;
	//fopen("quest.txt","w");
	f=fopen("quest.txt","a");
		for(i=0; i<=5; i++){
			
			if(i==0){
				fflush(stdin);
				printf("\nDigite Enun");
				//scanf("%c", &daprova.enunciado);
				gets(daprova.enunciado);
				fprintf(f,"%s\n",daprova.enunciado);
			}else{
				fflush(stdin);
			    printf("Digite alternativa de a) :\n");
			    //scanf("%c", &daprova.enunciado);
		 	    gets(daprova.alternativa);
		 	    fprintf(f,"\t a) %s\n",daprova.alternativa);
			}	
		}	
	fclose(f);	
}

//funcao inicia a prova 
iniciarProva(struct gabarito prova, FILE *f){
	limpatela();
	fopen("questoesMarcadas.txt","w");
	f=fopen("quest.txt","r");
	char quest[50];
	int i;
	int questao = 1;
	
	printf("\n");	
		while(!feof(f)){
	        fgets(quest,20,f);
	        if(feof(f)) break;
	        printf("%s",quest);
	    } 
	printf("\n");
    fclose(f);
    
	for(i=0; i<5; i++){
		  fflush(stdin);
		  printf("\nDigite resposta da Questao %d: ", questao);
		  scanf("%c", &prova.alterMarcadas[i]);
          questao++;	  	
	}
	for(i=0; i<5; i++){
		f=fopen("questoesMarcadas.txt","a");
		fprintf(f,"%c\n",prova.alterMarcadas[i]);
		fclose(f);	                             
	}
	
	//for(i=0; i<5; i++){
	//	printf("%c\t",prova.alterMarcadas[i]);
	 //	}
	
	return prova.alterMarcadas;   
}

//funcao que corrige prova compara os dois vetores
corrigirProva(FILE *f){
	limpatela();
	char gabarito[5];
	char gabaritoMarcado[5];
	int i;
	int acertos,pontos;
	printf("\n");
	pontos = 10;
	
		f=fopen("gabarito.txt","r");	
		while(!feof(f)){
			//printf("teste");
	        fgets(gabarito,20,f);
	        if(feof(f)) break;
	        fflush(stdin);
	        //printf("%s\n",gabarito);
	    }
	    fclose(f);
	    
	    f=fopen("questoesMarcadas.txt","r");
	    while(!feof(f)){
	        fgets(gabaritoMarcado,20,f);
	        if(feof(f)) break;
	        fflush(stdin);
	        //printf("%s\n",gabaritoMarcado);
	    }
	    fclose(f);
	    
		for(i=0; i<5; i++){
			if(gabarito[i-1] == gabaritoMarcado[i-1]){
				acertos++;
			}
		}
		pontos*=acertos;
			 
	if( pontos>60 ) printf("Voce acertou %d Questoes\nTirou %d.\n Foi Aprovado",acertos,pontos);
	else printf("Vc fio reprovado\ntirou %d\nteve %d acertos\n",acertos,pontos);

}

//corpo princital do programa
int main(void){
    char op;
    struct gabarito prova;
    struct questionario daprova;
    FILE *fg;

    while(op != '0'){
        switch(op){
            case '1':
                addGabarito(prova,fg);
            break;
        	case '2':
                addQuestao(daprova,fg);
            break;
            case '3':
                iniciarProva(prova,fg);
            break;
            case '4':
                corrigirProva(fg);
            break;
        }
    op = menu();    
    }
}