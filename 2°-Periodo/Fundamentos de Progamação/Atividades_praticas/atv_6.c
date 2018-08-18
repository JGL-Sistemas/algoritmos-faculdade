#include<stdio.h>
#include<stdlib.h>

/*
6-Escreva um programa para classificar um triangulo
de lados de comprimentos dados em escaleno (os
três lados de comprimentos diferentes), isósceles
(dois lados de comprimentos iguais) ou equilátero
(os três lados de comprimentos iguais).
*/
		int main(void){
		
		float ld1,ld2,ld3,eq;
		
		printf("Digite lados do triangulo\n");
		scanf("%f%f%f", &ld1, &ld2, &ld3);
		system("cls");
		
		eq=(ld1+ld2+ld3)/3;
		
			if(eq==ld1) printf("equilatero os tres lados de comprimentos iguais\n",eq,ld1);
			
			else if(ld1==ld2 || ld1==ld3) printf("isosceles dois lados de comprimentos iguais\n"); 
			
			else{printf("escaleno os tres lados de comprimentos diferentes\n");}
		
		system("pause");
	}
