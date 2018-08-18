#include<stdio.h>
#include<stdlib.h>

	int main(void){
		int x=1,cont;
		
		printf("Digite um numero\n");
		scanf("%d", & cont);
		system("cls");
		
		for(x=0; x<=cont; x++){
			printf("%d\n",x);
		}
		system("pause");
		return 0;
	}
