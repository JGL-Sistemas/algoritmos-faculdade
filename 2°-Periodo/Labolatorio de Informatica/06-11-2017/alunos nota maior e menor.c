//programa em c que leia as notas de uma turma e informe
//a quatidade de alunos lidos, a média das notas
//a maior nota e a menor nota
//menos um para terminar

// progama em se que leia N numeros e não final informe qtos numeros foram informados e a sua media para n quer mias numeros -1.

#include<stdio.h>


	int main(void){
        int alunos=0;
        float nota=0.0,media=0.0,maior,menor;       
        while(nota!=-1){
                        
                      maior,menor=nota;
                      
                      if(maior>menor){
                                     maior=nota;
                                     menor=menor;
                                     }
                                    
                      
                      alunos++;
                      media+=nota;
                      printf("Digite um numero ou -1 para terminar\n");
                      scanf("%f", &nota);
                      
                     
                      }
                      alunos--;
                      media=media/alunos;
                      
                      printf("termos digitados %d numeros\n",alunos);
                      printf("media:%2.f\n",media);
                      printf("maior:%2.f\n",maior);
                      printf("menor:%2.f\n",menor);
                      
        system("pause");
                      
        }

