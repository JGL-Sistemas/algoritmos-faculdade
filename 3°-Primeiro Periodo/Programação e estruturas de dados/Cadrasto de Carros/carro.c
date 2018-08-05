#include<stdio.h>
#include <stdlib.h>
#include <string.h>

char menu(){
	fflush(stdin);
	printf("\n\t\t 1 - Cadrastar Carro:");
	printf("\n\t\t 2 - Listar todos os Carros:");
	printf("\n\t\t 3 - Vender carro:");
	printf("\n\t\t 4 - Buscar faixa de preco:");
	printf("\n\t\t 0 - Sair:");	
	return getch();
	
}
void limpatela(){
	system("cls");
}

typedef struct Veiculo{
	int codVeiculo;
	char tipoVeiculo[10], modeloVeiculo[10], corVeiculo[10];
	float precoVeiculo;
};

cadCarro(int Ncarro, struct Veiculo dados[9]){	
			
  	        fflush(stdin);
			printf("\n\nDigite tipo do Veiculo: ");
			gets(dados[Ncarro].tipoVeiculo);
			
			fflush(stdin);
			printf("Digite Modelo de %s: ",dados[Ncarro].tipoVeiculo);
			gets(dados[Ncarro].modeloVeiculo);
			
			fflush(stdin);
			printf("Digite Cor de %s: ",dados[Ncarro].tipoVeiculo);
			gets(dados[Ncarro].corVeiculo);
			
			fflush(stdin);
			printf("Digite preco de %s: ",dados[Ncarro].tipoVeiculo);
			scanf("%f", &dados[Ncarro].precoVeiculo);	
			return Ncarro;				
}

listCarro(int Ncarro, struct Veiculo dados[9]){
	int i;
	limpatela();
	
	for(i=0; i<Ncarro; i++){
       dados[Ncarro].codVeiculo = i;
	   printf("%d -> %s | %s | %s | %f\n\n",dados[Ncarro].codVeiculo, dados[i].tipoVeiculo, dados[i].modeloVeiculo, dados[i].corVeiculo, dados[i].precoVeiculo);	
   }
}


 /* vendCarro(int Ncarro, struct Veiculo dados){ 
	int codeCarro;
		int i; 
	
	printf("Digite Codigo do Veiculo:");
	scanf("%d", &codeCarro);
	
	for(i=0; i< Ncarro; i++){
	   if(codeCarro == Ncarro){
	   	   		   
	   }
	   
   }
	
	
}*/


faixaPrecoCarro(int Ncarro, struct Veiculo dados[9]){
	
	int i; 
    float valorMenor, valorMaior;
	limpatela();
	
	printf("Digite faixa de preco:");
	scanf("%f%f",&valorMenor, &valorMaior);
	
	for(i=0; i<Ncarro; i++){
	   if(dados[i].precoVeiculo >= valorMenor && dados[i].precoVeiculo <= valorMaior){
	   printf("%d -> %s | %s | %s | %f\n\n",dados[Ncarro].codVeiculo, dados[i].tipoVeiculo, dados[i].modeloVeiculo, dados[i].corVeiculo, dados[i].precoVeiculo);	
   	  }
   }

}

int main(void){
	char op;
	int Ncarro=0;
	struct Veiculo dados[9];
	
	//Ncarro = 0;
	
	while(op != '0'){
		switch(op){
			case '1':
				cadCarro(Ncarro, dados);
				Ncarro++;
				limpatela();
            break;
        
        	case '2':
        		listCarro(Ncarro, dados);
        		
            break;
        
        	case '3':
        		//vendCarro(Ncarro, dados);
            break;
        	case '4':
        		faixaPrecoCarro(Ncarro, dados);
            break;
		}
	op = menu();
	//system("cls");
		
	}
}