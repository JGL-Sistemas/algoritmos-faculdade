#include<stdio.h>
//somatorio de n com os seus antesesores
                 int main(void){
                     
                     int n,ns;
                     
                     printf("Digite valor para somatorio:\n");
                     scanf("%d", &n);
                     ns=n;
                     while(n>=1){
                            n=n-1;
                            ns=ns+n;
                            }
                            printf("Somatorio eh: %d\n",ns);
                            system("pause");
                     }
