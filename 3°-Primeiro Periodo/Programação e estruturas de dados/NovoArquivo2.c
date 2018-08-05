#include <stdio.h>

int main(void){
	char loo[10],letra;
	
	int i, contador=0;
	letra ='a';
	
	
	printf("Digite qualquer coisa\n");
	gets(loo);
	printf("Digitada: %s\n",loo);
						
	for(i=0; i<=10; i++){
		
		if(loo[i] == letra && loo[i]!=NULL){
			loo[i]='b';
			contador++;
		}
		else if(loo[i] == NULL) break;
		
    }
    
    printf("Crter Substituido: %s\n",loo);
    printf("Quantidade de caracteres substituidos: %d\n",contador);
	
	}