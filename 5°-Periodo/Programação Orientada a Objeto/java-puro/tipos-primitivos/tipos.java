
byte inteiro1  = 10;

// 2 bytes
short inteiro2 = 10;

int inteiro3   = 10;

// 8 bytes
long inteiro4  = 10;


/*
*quando você atribui um valor para eles (utilizando o operador =),
*este valor será copiado para a sua variável. 
*/

int numero = 4;

int outroNumeroIgual = numero;
numero = numero +5;

System.out.println(numero);
System.out.println(outroNumeroIgual);
