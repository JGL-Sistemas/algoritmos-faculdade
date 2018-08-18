#include<stdio.h>
#include <stdlib.h>

typedef struct aluno{
	char NomeAluno[10],CursoAluno[10],MatriculaAluno[10];
};

	 int main(void){
		
		struct aluno dados;
		
			fflush(stdin);
			printf("\n\nDigite Nome do Aluno: ");
			gets(dados.NomeAluno);
			
			fflush(stdin);
			printf("Digite Curso de %s: ",dados.NomeAluno);
			gets(dados.CursoAluno);
			
			fflush(stdin);
			printf("Digite Matrula de %s: ",dados.NomeAluno);
			gets(dados.MatriculaAluno);
		
			system("cls");
		
			printf("Nome: %s Curdo: %s Idade: %s\n\n",dados.NomeAluno,dados.CursoAluno,dados.MatriculaAluno);
		
		system("pause");
		return 0;
		
	}
