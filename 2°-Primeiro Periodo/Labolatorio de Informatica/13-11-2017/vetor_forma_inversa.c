//programa que leia 6 num e apresente de forma inversa em um vertor

#include<stdio.h>

int main(void){
    
    float numero[6];
    int i,j;
    
        for(i=0; i<6; i++){
        printf("Digite valor:");
        scanf("%f", &numero[i]);
        }
        
        for (i=5; i>0; i--){
            if(j<6){
                     printf("%f %d\n",numero[j],j); 
                    numero[j]=numero[i];
                    j++;
            }}
            
            i=0;
        for(j=5; j>=0; j--){
            
            if(i<=6){
              printf("%f %d\n",numero[i],i);      
              numero[i]=numero[j];
              i++;
            }
        }       
        system("pause");
        return 0;   
    }
