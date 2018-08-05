#include<stdio.h>
#include<stdlib.h>

/*
4. Escreva um programa que leia três números e os
imprima em ordem decrescente.
*/


	int main(void){
		int n1,n2,n3;
		
			printf("Digite tres numeros:\n");
			scanf("%d%d%d", &n1, &n2, &n3);
			system("cls");
			
				if(n1>n2 && n1>n3){
					if(n2>n3) printf("%d %d %d\n",n1,n2,n3);
					else{ 
						printf("%d %d %d\n",n1,n3,n2);
					}
				}
				if(n2>n1 && n2>n3){
					if(n1>n3) printf("%d %d %d\n",n2,n1,n3);
					else{ 
						printf("%d %d %d\n",n2,n3,n1);
					}
				}
				else{
					if(n2>n1) printf("%d %d %d\n",n3,n2,n1);
					else{
					    printf("%d %d %d\n",n3,n1,n2);
					}
					
				}
				
   system("pause");
   return 0;
}
