#include<stdio.h>
#include<stdlib.h>

/*5. Escreva um programa que leia três arestas e
verifique se elas podem formar um triangulo (a
soma de dois lados tem que ser maior que o lado
que sobrou)*/

	int main(void){
		float are1,are2,are3;
		
			printf("Digite valor das duas primeiras arestas:\n");
			scanf("%f%f", &are1, &are2);
			system("cls");
			
			printf("Digite valor da terceira aresta:\n");
			scanf("%f", &are3);
			system("cls");
			
				if(are1+are2>are3) printf("eh posivel formar triagulo.\n");
			
				else{ printf("nao eh posivel formar triangulo.\n");}				
   system("pause");
   return 0;
}
