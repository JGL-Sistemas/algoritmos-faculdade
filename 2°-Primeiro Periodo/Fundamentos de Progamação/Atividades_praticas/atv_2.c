#include<stdio.h>
#include<stdlib.h>

/*2. Escreva um programa que leia tr�s n�meros e
verifique qual � o maior*/

	int main(void){
		int n1,n2,n3;
		
			printf("Digite tres numeros:\n");
			scanf("%d%d%d", &n1, &n2, &n3);
			system("cls");
			
				if(n1>n2 && n1>n3) printf("%d eh maior\n",n1);
				
				else if(n2>n1 && n2>n3) printf("%d eh maior\n",n2);
				
				else{ printf("%d eh maior", n3);}
				
   system("pause");
   return 0;
}
