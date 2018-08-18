#include<stdio.h>
#include<stdlib.h>

/*1. Escreva um programa que leia dois números e
informe o maior*/

	int main(void){
		int n1,n2;
		
			printf("Digite dois numero\n");
			scanf("%d%d", &n1, &n2);
			system("cls");
			
				if(n1>n2) printf("%d eh maior\n",n1);
				else if(n1<n2) printf("%d eh maior\n",n2);
				else{ printf("Os valores sao iguais\n");}
   system("pause");
   return 0;
}
