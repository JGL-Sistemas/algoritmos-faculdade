#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
 

int main(void)
{
     int i,j,jogo[5],sorteio[5],acerto;
 	 acerto =0;
 	 
//digite 6 valores
	 j = 6;
     for(i=0; i<j; i++){
     	
		 printf("digite valor de 1 a 60.");
         scanf("%d", &jogo[i]);
         
			 /*if(jogo[i] <= 60 && jogo[i] >= 1){
			 	printf("Valor valido aperte enter para o proximo\n");
			  }else{
				  printf("Valores validos sao somente entre 1 e 60\n");
			  }*/
		 
	 }
	 for(i=0; i<j; i++){
		 printf("%d\n",jogo[i]);
	 }

	 
	 
//gera 6 valores

     for (i = 0; i<6; i++){
 		   sorteio[i] = rand() % 60-1;
           printf("%d ", sorteio[i]);          
     }
    /* for(i=0; i<6; i++){
		 printf("\n %d\n",sorteio[i]);
	 } */

//processa valores

	 for(j=0; j<5; j++){
         sorteio[j];
		 	
		 for(i=0; i<5; i++){
			jogo[i];
			if( sorteio[j] == jogo[i]){
				printf(" acerto o numero %d\n",jogo[i]);
				acerto++;
			}
			 
		 }
	 }
	 
	 if(acerto == 6 ) printf("Voce agora eh um 1000honario");
	 	
	 printf("\t %d Acertos no total", acerto);
     getch();
     system("pause");
     return 0;
}