#include <stdio.h>
	int main(void){
		
		float nuns[5], soma;
		int i;

		for (i = 0; i < 5; i++){
					printf("informe um Numero:\n");
					scanf("%f", &nuns[i]);
		}
		
		i=0;
		for (i = 0; i < 5; i++) soma=soma+nuns[i];
		
        i=0;
    
		for (i = 0; i < 5; i++) printf("notas: %.2f\n", nuns[i]);
		
		i=5;	
		printf("\tmedia: %.2f\n", soma/i);

	system("pause");
	return 0;
	}
