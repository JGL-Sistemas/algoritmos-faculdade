Algoritmo "semnome"
// Disciplina  :  [Algoritmos] 
// Professor   : 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/05/2017
Var
// Seção de Declarações das variáveis 
  nome:caracter
  salario:real
  tvendas:inteiro
  comisao:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite o seu nome:")
leia(nome)
escreva("Digite o seu salario/mês:")
leia(salario)
escreva("digite o valor de vendas:")
leia(tvendas)

comisao<-tvendas*0.15/100


escreva(nome," seu salario foi de",salario,"e sua comisão foi de,",comisao," sendo o seu total foi de R$",salario+comisao)

Fimalgoritmo