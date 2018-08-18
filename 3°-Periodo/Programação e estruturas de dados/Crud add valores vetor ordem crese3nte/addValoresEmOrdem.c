#include<stdio.h>

//menu do programa
char menu(){
	fflush(stdin);
	printf("\n\t\t 0 - Sair");
	printf("\n\t\t 1 - Inserir");
	printf("\n\t\t 2 - Mostrar");
	printf("\n\t\t 3 - Retirar");
	return getch();
}

//função inserir valor
void inserir (int x, int *v, int p){
	while (p>0){
		if(v[p-1]>x){
			v[p] = v[p-1];
		}else{
			break;
		}
		p--;
	}
	v[p]=x;
}
//função retirar valor
int retirar (int x, int *v, int p){
	int t=0,i=0;
	while(t<p){
		if(v[i] == x){
			i=t;
			while(i<p){
				v[i] = v[i+1];
				i++;
			}
			p--;
		}else{
			t++;
		}
				
	}
	return p;
}

//função mostrar valor
void mostrar(int *v, int p){
	int i=0;
	printf("\n\t--------valor inseridos------\n\t");
	while(i<p){
		printf("%d, ", v[i] );
		i++;
	}
	printf("\n\t ------------->\n\t");
}

//principal do programa
int main(){
	int vetor[12], n, t = 0;
	char op;
	
	while(op!='0'){
    //caso do menu do programa
	switch(op) {
		case '1':
			printf("\n\t\tInsira um numero a seguir: ");
			scanf("%d", &n);
			inserir(n, vetor, t);
			t++;
			break;
		case '2':
			mostrar(vetor, t);
			break;
		case '3':
			mostrar(vetor, t);
			printf("Infome o numero A retirar :	 ");
			scanf("%d", &n);
			retirar(n, vetor, t);
			break;				
	}	
		
	op = menu();
	system("cls");		
			
	}
}
