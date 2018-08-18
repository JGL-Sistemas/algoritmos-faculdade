#include<stdio.h>
#include<stdlib.h>

	int main(void){
		
		int num1,num2,num3;
	
		printf("Digite valor de um");
		scanf("%d", &num1);
		
		printf("Digite valor de dois");
		scanf("%d", &num2);
		
		printf("Digite valor de tres");
		scanf("%d", &num3);
		
		printf("Soma eh %d=\n", num1+num2+num3);
		printf("media eh %d=\n", (num1+num2+num3)/3);
	
		system("pause");
	}
