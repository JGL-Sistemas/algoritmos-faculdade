#include<stdio.h>
#include<conio.h>

 char cript(char frase){	

 	char alf[26]= { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char alfc[26]= { 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b'};
 	
 	if(alf[1] == frase){
 		printf("valido");	
	 }	 	

}

 int main(void){
 	
 	int j =100;
 	char frase[j];
 	
 	printf("digite frase:");
 	gets(frase);
 	
 	cript(frase);
 	
 	system("pause");
 	return 0;
 	
 }
