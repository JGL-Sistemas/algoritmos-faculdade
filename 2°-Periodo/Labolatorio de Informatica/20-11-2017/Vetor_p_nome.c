//progama em c que leia meu nome e o mostre na tela

#include<stdio.h>
#include<conio.h>

int main(void){
	
	int i, cont=0;
	char nome[30];

		printf("Digite seu nome:\n");
		nome[i]= geth();
	
	while(nome[i]!='0'){
		i++;
	
		printf("%c", &nome[i]);}
		nome[i]= getche();
		
		while(cont<i){
			prinft("%c",nome[cont]);
			cont++;	
		}
	system("pause");
	return 0;
}
