//progama em c que leia meu nome e o mostre na tela usando get

#include<stdio.h>
#include<conio.h>

int main(void){
	int i= 0, j=0, p=1;
	char nome[50];
		
		printf("insira palavra");
		get(nome);
		while(nome[i]!='\0'){
                             i++;
                             
                             }
        while(nome[i] != nome[i]){p=0;}
        i--;
        j++;
		
		          if(p)
		               printf("%d palidromo\n,i");
		               
                  else 
                       printf("não eh palidromo");
                       
	system("pause");
	return 0;
}
