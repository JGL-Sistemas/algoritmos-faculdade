#include<stdio.h>

int main(void){
	
	int numero;
	
	printf("digte sua idade\n");
	scanf("%d", &numero);
	
	if(numero>=18) printf("pode entrar\n");
	
	else{ printf("não pode entrar.\n"); }
}
