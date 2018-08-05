#include<stdio.h>
#include<stdlib.h>

int main(void){
    
    int numero;
    
    printf("digite o valor para saber se eh PAR ou IMPAR:\n");
    scanf("%d", &numero);
    system("cls");
    
    
    if(numero%2==0){
                   printf("O numero que voce digitou eh par: %d\n", numero);
                   }
    else{
         printf(" O numero que voce digitou eh impar: %d\n", numero);
	     }
    system("pause");
    return 0;
    }
