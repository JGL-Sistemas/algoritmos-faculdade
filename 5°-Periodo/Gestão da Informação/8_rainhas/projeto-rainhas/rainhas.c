#include<stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>

int dimensaoTabuleiro(dimensao){
	
	printf("Digite dimensão do tabuleiro:");
	scanf("%d", &dimensao);
	return dimensao;
}

int aleatorio(varAleatorio){
	
	return rand()%varAleatorio;
}

int main(void){
	
	int dimensao=0;
	int rainhas;
	int matriz;
	int casaRainha;
	int i,j;
	int tabuleiro[dimensao][dimensao];
	//int aleatorio = rand();
	
	
	matriz = dimensaoTabuleiro(dimensao);
	printf("%d", matriz);
	tabuleiro[matriz][matriz];
	
	//printf("%d",aleatorio( dimensaoTabuleiro(dimensao) ) );
	
	//printf("%d", aleatorio%100);
	
	
	
	
	for(i=0; i<matriz; i++){
		for(j=0; j<matriz; j++){	
			tabuleiro[i][j] = 0;
		}		
	}
	
	tabuleiro[0][0] = 1;
	
	for(i=0; i<matriz; i++){
		
		printf("\n");
		
		for(j=0; j<matriz; j++){	
			printf("%d", tabuleiro[i][j]);
		}		
	}
		
	return 0;
}
