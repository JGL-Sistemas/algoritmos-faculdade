#include <stdio.h>

int main(){
	
    int valores[22] = {22,45,16,27,18,100,95,21,13,17,99,76,2,38,25,88,96,48,66,101,20};
    int i,a[10],b[7],c[10],esp,ai=0,bi=0,ci=0;
 
    for(i=0 ; i<21; i++){
		
        esp = valores[i]%3;
        
		switch(esp){
   	   	   case 0:
			 a[ai] = valores[i];
			 printf("A: %d mode3 = %d = A\n",a[ai],esp);
			 ai++;	      
   	   	   break;
   	      
           case 1:
 		     b[bi] = valores[i];
 		     printf("B: %d mode3 = %d = B\n",b[bi],esp);
 		     bi++;
   	   	   break;
   	      
     	   case 2:
 		     c[ci] = valores[i];
 		     printf("C: %d mode3 = %d = B\n",c[ci],esp);
 		     ci++;
   	   	   break;
		}
	}
	printf("\nNao Ordenado:\n\n");
		
	printf("A: ");
	for(i=0; i<ai; i++) printf("%d ",a[i]);
	
	printf("\nB: ");
	for(i=0; i<bi; i++) printf("%d ",b[i]);
	
	printf("\nC: ");
	for(i=0; i<ci; i++) printf("%d ",c[i]);
	 			    
}
