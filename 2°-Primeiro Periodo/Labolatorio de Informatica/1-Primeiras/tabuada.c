#include<stdio.h>
#include<stdlib.h>

	int main(void){
		
		int c,n;
		float n2,c2;
		
		printf("Digite valor:");
		scanf("%d", &c);
		system("cls");
        c2=c;		
			printf("Soma:\n");
			for(n=0; n<=10; n++) printf("%d + %d = %d\n",c,n,(c+n));
			printf("\n");
			for(n=0; n<=10; n++) printf("%d - %d = %d\n",c,n,(c-n));
			printf("\n");
			for(n=0; n<=10; n++) printf("%d * %d = %d\n",c,n,(c*n));
			printf("\n");
			for(n2=0; n2<=10; n2++) printf("%2.f / %2.f = %2.f\n",c2,n2,(c2/n2));
			printf("\n");
			
		system("pause");
		return 0;
	}
