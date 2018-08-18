#include<stdio.h>
#include<stdlib.h>

/*7. Escreva um programa para verificar se um
triangulo de lados de comprimentos dados é
retângulo, exibindo, nos casos afirmativos, sua
hipotenusa e seus catetos. (A soma do quadrado
dos catetos é igual ao quadrado da hipotenusa.*/

	int main(void){
		
		float cto,cta,hip;
	
		printf("Digite os dois catetos:\n");
		scanf("%f%f", &cto, &cta);
		system("cls");
		
		printf("Digite a hipotenusa:\n");
		scanf("%f", &hip);
		system("cls");
		
		if(  (cto*cto)+(cta*cta) == hip*hip ) printf("Sim este triangulo eh retangulo\n\ncateto oposto vale:%.2f\ncateto adjacente vale:%.2f\nhipotenusa vale:%.2f\n", cto, cta, hip);
		
		else{printf("Este nao eh um triangulo retangulo\n");}
		
		system("pause");
	
	}
