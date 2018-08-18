#include<stdio.h>
#include<stdlib.h>

/*
3. Escreva um programa que leia dois números e os
apresente em ordem crescente.
*/

	int main(void){
		int n1,n2;
		
			printf("Digite dois numeros:\n");
			scanf("%d%d", &n1, &n2);
			system("cls");
			
				if(n1<n2) printf("%d, %d\n",n1,n2);
				
				else if(n2<n1) printf("%d, %d\n",n2,n1);
				
				else{ printf("Os valores sao iguais\n");}
				
   system("pause");
   return 0;
}
