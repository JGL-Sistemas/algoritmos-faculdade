#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<time.h>
#include<limits.h>



	int *cria_vetor(int tam);
    void le_arq_vetor (char nomearq[], int *vetor);
	void constroi_solucao_aleatorio(int *s, int num_objetos);
	
int *cria_vetor(int tam){
	int *vetor;
	vetor = (int *)malloc(tam*sizeof(int));
	if(!vetor){
		printf("falta de memória");
		exit(1);
	}
	
	return vetor;
}



void le_arq_vetor (char nomearq[], int *vetor){
	int j, valor;
	FILE *arquivo;
	
	arquivo = fopen(nomearq, "r");
	if(!arquivo){
		printf("O arquivo nao pode ser aberto");
		getchar();
		exit(1);
	}
	
	j=0;
	while(!feof(arquivo)){
		fscanf(arquivo, "%d", &valor);
		vetor[j]=valor;
		j++;
	}
	fclose(arquivo);
}

void constroi_solucao_aleatoria(int *s, int num_objetos){
	srand(time(NULL));
	int j;
	for(j = 0; j < num_objetos; j++){
		s[j] = rand() %2;
	}
}

void imprime_solucao(int *s, int num_objetos){
	int j;
	for (j = 0; j< num_objetos; j++){
		printf("%d", s[j]);
	}
	printf("\n");
}

int main (int argc, const char * argv[]){
	int quantObjetos = 10;
	int *peso, *beneficio;
	
	
	peso = cria_vetor(quantObjetos);
	beneficio = cria_vetor(quantObjetos);
	
	le_arq_vetor("peso10.txt", peso);
	le_arq_vetor("beneficio10.txt", beneficio);
	
    int* solucaoInicial;
    solucaoInicial=cria_vetor(quantObjetos);
	constroi_solucao_aleatoria(solucaoInicial, quantObjetos);
	
	return 0;
}















