#include<stdio.h>

	int main(void){
	int y=0,x=1,z=2,prox,cont=0;
	
		printf("Sq %d: %d %d %d\n",cont,y,x,z);
		
		for(cont; cont<10; cont++){
			prox=(z+y+x);
				printf("%d\n",prox);
	       y=x;
		   x=z;
		   z=prox;
		}
			
	}
