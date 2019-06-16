#include<stdio.h>
#include <conio.h>
#include <stdlib.h>
/*
-população Inicial
-avaliar população
-seleção
-pegar linha da rainha vertical, horizontal e diagonal
-quantidades de rainhas de acordo com tamanho do tabuleiro
-a menor probabilidade de uma rainha atacar a outra
*/

//função gera tabuleiro 
int tabuleiro(dimensao){
	
	int i,j;
	int matriz[dimensao][dimensao];
	int ataques, horizontal, vertical, rainhas;
	
	//atribui 0 aos campos do vetor
	for(i=0; i<dimensao; i++){
		for(j=0; j<dimensao; j++){
			matriz[i][j] = 0;
		}
	}
	
	//add 9 rainhas 
	for(i=1; i<=8; i++){
		//valores aleatorios
		int horizontal = rand() %dimensao;
		int vertical = rand() %dimensao;
		//simulação casa da rainha 
		matriz[horizontal][vertical] = 1;
		rainhas = i;		
	}
	
	//valores aleatorios
	//int horizontal = rand() %dimensao;
	//int vertical = rand() %dimensao;
	//simulação casa da rainha 
	//matriz[horizontal][vertical] = 1;
	
	//horizontal ->
	for(i=0; i<dimensao; i++) if(matriz[horizontal][i] == 0) matriz[horizontal][i] = 3;
	
	//vertical
	for(i=0; i<dimensao; i++) if(matriz[i][vertical] == 0) matriz[i][vertical] = 3;
		
	//diagonal
	for(i=0; i<dimensao; i++) if(matriz[horizontal+i][vertical+i] == 0) matriz[horizontal+i][vertical+i] = 3;
	for(i=0; i<dimensao; i++) if(matriz[horizontal-i][vertical-i] == 0) matriz[horizontal-i][vertical-i] = 3;
	for(i=0; i<dimensao; i++) if(matriz[horizontal+i][vertical-i] == 0) matriz[horizontal+i][vertical-i] = 3;
	for(i=0; i<dimensao; i++) if(matriz[horizontal-i][vertical+i] == 0) matriz[horizontal-i][vertical+i] = 3; 
	
	
	//imprime tabuleiro na tela
	for(i=0; i<dimensao; i++){
		printf("\n");
		for(j=0; j<dimensao; j++){
			printf("%d ",matriz[i][j]);
			
			//quantidade de ataques de uma rainha 
			if(matriz[i][j] ==3) ataques++;
			
			//quantidade de rainhas
			//if(matriz[i][j] ==1) rainhas++;
		}
	}
	printf("Ataques: %d", ataques);
	printf("\nRainhas: %d", rainhas);
	printf("\n\n");
}

//principal do programa
int main(void){
	
	int dimensao;
	int i;
	
	printf("Digite a dimensao do tabuleiro: \n");
	scanf("%d", &dimensao);
	
	for(i=0; i<5; i++) tabuleiro(dimensao);
	
	return 0;
}

