Algoritmo "semnome"
// Disciplina  :  [Algoritmos] 
// Professor   : 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/05/2017
Var
// Se��o de Declara��es das vari�veis 
  nome:caracter
  salario:real
  tvendas:inteiro
  comisao:real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreva("Digite o seu nome:")
leia(nome)
escreva("Digite o seu salario/m�s:")
leia(salario)
escreva("digite o valor de vendas:")
leia(tvendas)

comisao<-tvendas*0.15/100


escreva(nome," seu salario foi de",salario,"e sua comis�o foi de,",comisao," sendo o seu total foi de R$",salario+comisao)

Fimalgoritmo