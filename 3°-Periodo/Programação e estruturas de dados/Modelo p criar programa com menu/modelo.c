#include<stdio.h>

char menu(){
	fflush(stdin);
	printf("\n\t\t 0 - opcao1");
	printf("\n\t\t 1 - opcao2");
	printf("\n\t\t 2 - opcao3");
	printf("\n\t\t 3 - opcao3");
	return getch();
}

int main(void){
	char op;
	
	while(op != '0'){
		switch(op){
			case '1':
				printf("Opcao do menu numero 1");
            break;
        
        	case '2':
        		printf("Opcao do menu numero 2");
            break;
        
        	case '3':
        		printf("Opcao do menu numero 3");
            break;
		}
	op = menu();
	system("cls");
		
	}
}