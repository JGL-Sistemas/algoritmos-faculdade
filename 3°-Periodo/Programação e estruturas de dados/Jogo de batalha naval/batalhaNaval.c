#include<stdio.h>
	
	void quebraLinha(){
		printf("\n");
	}

	int main(void){
		
		int matrs[5][5],i,j,interfce[5][5],cordXY[5][5],jy,cod1;
		char ix;
		
			for(i=0; i<5; i++){
				quebraLinha();
					  		
				for(j=0; j<5; j++){	
					matrs[i][j] =0;
					
					//printf("%d",matrs[i][j]);
					
				}
				
			}
				quebraLinha();
				printf("   ");
			for(i=1; i<6; i++){
				printf("%d",i);
			}
			quebraLinha();
			
			char cord1 = 'a';	
			
			for(i=0; i<5; i++){
				quebraLinha();
				printf("%c  ",cord1);
				cord1++;	
					  		
				for(j=0; j<5; j++){
						
					interfce[i][j] ='~';
					
					printf("%c",interfce[i][j]);
					
				}
				
			}
			
			
			printf("\nDigite cordenada:");
			scanf("%c%d",&ix,&jy);
			
			printf("\nCordenada Digitada: %c %d",ix,jy);
			
			
			for(i=0; i<5; i++){	  		
				for(j=0; j<5; j++){		
					
					if(matrs[ix][jy] == 1){
						printf("Voce ganhou o jogo.");
						break;
					
					}else{
						printf("Voce perdeu tente novamente,");
						break;
					}
					
				}
				
			}
			
			
			
			
			
			
			
	}