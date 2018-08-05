#include<stdio.h>
/*
desenvolva um programa em c, que amazene os dados de veiculo
como:
tipo modelo cor preço

menu:

cadatrar carro 
listar todos os carros
vender um carro 
buscar por faixa de preço Ex: 10 a 20 

*/

typedef struct Veiculo{
	char tipoVeiculo[10], modeloVeiculo[10], corVeiculo[10];
	float precoVeiculo;
};


	 int main(void){
		
		struct Veiculo dados[10];
		int carro;
		
		for(carro=0; carro<1; carro++){
			
			fflush(stdin);
			printf("\n\nDigite tipo do Veiculo: ");
			gets(dados[carro].tipoVeiculo);
			
			fflush(stdin);
			printf("Digite Modelo de %s: ",dados[carro].tipoVeiculo);
			gets(dados[carro].modeloVeiculo);
			
			fflush(stdin);
			printf("Digite Cor de %s: ",dados[carro].tipoVeiculo);
			gets(dados[carro].corVeiculo);
			
			fflush(stdin);
			printf("Digite preco de %s: ",dados[carro].tipoVeiculo);
			scanf("%f", &dados[carro].precoVeiculo);
		}
		
		for(carro=0; carro<1; carro++){
			printf("%s | %s | %s | %f\n\n", dados[carro].tipoVeiculo, dados[carro].modeloVeiculo, dados[carro].corVeiculo, dados[carro].precoVeiculo);
		}
		
		system("pause");
		
	}
