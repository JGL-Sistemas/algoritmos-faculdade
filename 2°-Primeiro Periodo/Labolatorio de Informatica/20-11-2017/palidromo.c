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
        i--;
        while(i>=0){
        if(nome[i] != nome[i]){p=0;}
        i--;
        j++;
        }
		          if(p == 1)
		               printf("%d palidromo\n",i);
		               
                  else 
                       printf("%d não eh palidromo",i);
                       
	system("pause");
}
