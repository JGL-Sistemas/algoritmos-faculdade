//progama e c dividido em funções que calcule:
//O fatorial de um numero passado
//As raizes de uma equação do segundo grau
//Os volumes de: Um cubo, de uma esfera.

/*O progama tem que apresentar um menu de opções para
o usuários decidir se quer calcular um fatorial, saber as raizes
de uma equação do segundo grau calcular os volumes de esfera ou cubo
ou calcular a distância entre dois pontos cartesianos*/

#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

//funcao em andamento
	int fatorial(int f){
		int i,r,p,j;
		
		printf("%d! >>>",f);
	
		for(r=f; r>0; r--) printf(" %d ",r);
		i=f;
		j=f-3;
		for(r=i; r>0; r--){
			p=r;
			j=j*p;
			
			printf("%d",r);
		} 
		printf(" = %d",j);
		}

//funcao em andamento
	float distaciaPlano(float x1,float y1,float x2,float y2){
		
		}
		
//funcao em andamento
	char raizes(float a, float b, float c){
		
		float delta = b*b + (-1*4*a*c );
		
		if(delta>=0){
			float b1 = (-1*b + sqrt(delta));
			float b2 = (-1*b + -1* sqrt(delta));
				printf("\nB1 = %d.3f\n B2 = %.3f", b1,b2);
				return b1;
				
		}else printf("Nao posui raiz valida");
	}

//funcao concluida 
	float volumeEsfera(float r){
		float v,pi=3.14;
		
		v=(( 4*pi ) * ((r*r)*r))/3;
		
		printf("O volume de dessa esfera eh: %2.f",v);
		}
		
//funcao concluida
	float volumeCubo(float x,float y,float z){
		 float vol;
		 vol=x*y*z;
		 printf("O volume do Cube eh: %2.f\n",vol);
		
		}

//funcao concluida		
	char menu(){
		printf("\n\tOpcoes do Progama:\n");
			printf("\n\t\t>>1 - Raiz de segundo Grau:");
			printf("\n\t\t>>2 - Fatorial:");
			printf("\n\t\t>>3 - Distancia Plano Cartesiano:");
			printf("\n\t\t>>4 - Volume de uma esfera:");
			printf("\n\t\t>>5 - Volume de um Cubo:");
			printf("\n\t\t>>0 - Sair:\n");
		return getch();
		system("cls");
	}
		
//fim funcoes
	
	
	int main(void){
		
		char op =menu();
		float a, b, c;
		float x, y, z;
		int f;
		float r;		
		
		while(op!='0'){
			switch(op){
				case '1':
					printf("\n Raiz de segundo grau");
						printf("Informe os valores de A, B, e C");
						
						scanf("%f%f%f",&a,&b,&c);
						raizes(a,b,c);
				break;
				
				case '2':
					printf("\n Fatorial de um numero");
						printf("Informe valor para fatorial:");

						scanf("%d",&f);
						fatorial(f);
				break;
				
				case '3':
					printf("\n Distancia em um plano cartesiano");	
				break;
				
				case '4':
					printf("\n Volume de uma esfera");
						printf("Digite raio mediano:");
						
						scanf("%f", &r);
						volumeEsfera(r);
					
				break;
				
				case '5':
					printf("\n Volume de um Cubo");
						printf("Informe os valores de X, Y, e Z");
						
						scanf("%f%f%f",&x,&y,&z);
						volumeCubo(x,y,z);
					
				break;
				
				default:
					printf("\nOpcao Invalida");
				break;
			}
			op=menu();	
		}
	}
	

  
