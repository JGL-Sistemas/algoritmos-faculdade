#include<stdio.h>

	int main(void){
		
		int cont,v,cont2;
		
		for(cont=100; cont>=5; cont--){
			if(cont%2!=0){
			 printf("%d\n",cont);
			 cont2++;
			 v+=cont; /*e igual ah v=v+cont;*/
			}
			media=v/cont2;
			printf("A media eh: %d");
		}
		system("pause");
	}
