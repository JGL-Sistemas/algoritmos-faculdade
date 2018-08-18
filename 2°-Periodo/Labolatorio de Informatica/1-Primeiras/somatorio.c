#include<stdio.h>
//Elabore programa C que dado dois valores A=0 B=1 imprima os dez proximos numeros onde proximo = A+B

                 int main(void){
                     
                     int a=0,b=1,x,prox;
                     
                     for(x=1; x<=10; x++){
                                  prox=a+b;
                                  printf("A: %d\n B: %d\n Proximo: %d\n\n",a,b,prox);
                                  a=b;
                                  b=prox;                              
                                  }
                     
                     system("pause");
                     }
