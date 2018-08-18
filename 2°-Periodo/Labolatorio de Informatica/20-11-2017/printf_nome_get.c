//progama em c que leia meu nome e o mostre na tela usando get

#include<stdio.h>
#include<conio.h>

int main(void){
	
	char nome[30],edereco[30];
	
	/*t i, cont=0;
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
		}*/
		
		printf("insira nome");
		gets(nome);
		
		printf("insira endereco");
		gets(endereco);
		
		
		printf("nome %s\n",nome);
		printf("nome %s\n",endereco);
		
	system("pause");
	return 0;
}
