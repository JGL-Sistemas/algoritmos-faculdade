#include<stdio.h>

	int main(void){
		int x;
		x=10;
		
		int *ponteiro;
		ponteiro = &x;
		
		printf("%d",*ponteiro);
		getchar();	
		
		return 0;
		
		
	}