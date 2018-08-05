// progama em se que leia N numeros e não final informe qtos numeros foram informados e a sua media para n quer mias numeros -1.

#include<stdio.h>


	int main(void){
        int cont=0;
        float m=0.0,n=0.0; 
        
        printf("Digite um numero ou -1 para terminar\n");
        scanf("%f", &n);
        cont=1;
        
        while(n!=-1){ 
                      cont++;
                      m+=n;
                      printf("Digite um numero ou -1 para terminar\n");
                      scanf("%f", &n);
                      printf("%d", n);
                     
                      }
                      m=m/cont;
                      
                      printf("termos digitados %d numeros\n",cont);
                      printf("media:%f\n",m);
                      
        system("pause");
                      
        }
