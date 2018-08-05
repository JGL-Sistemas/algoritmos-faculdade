#include<stdio.h>
#include <stdlib.h>
	int main(void){
		
		int numero=1,tab,resu,i,j;
		
		for(i=1; i<=10; i++){
			numero++;
			
			for(j=1; j<=10; j++){
				resu = numero*j; 
				printf("%d x %d = %d\n",numero,j,resu);
			}
			printf("\n");
		}
			
		system("pause");
		return 0;
		
		
	}