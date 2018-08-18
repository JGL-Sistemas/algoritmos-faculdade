#include<stdio.h>
#include<stdlib.h>

	int main(void){
		char lt;
		int num1,num2,num3;
		
		printf("Digite uma letra:\n");
		scanf("%c", &lt);
		system("cls");
		
		if(lt=='s'){
			printf("Dgite um numero:\n");
			scanf("%d", &num1);
			system("cls");
			
			printf("Imprima outro numero:\n");
			scanf("%d", &num2 );
			system("cls");
		
			printf("A soma dos valores eh %d", num1+num2);
		}
		else if(lt=='m'){
			printf("imprima valor 1:\n");
			scanf("%d", &num1);
			system("cls");
			
			
			printf("imprima valor 2:\n");
			scanf("%d", &num2);
			system("cls");
			
			
			printf("imprima valor 3:\n");
			scanf("%d", &num3);
			system("cls");
			
			printf("A media dos tres valores eh %d",(num1+num2+num3)/3);
		}
		system("pause");
		return 0;
	}
