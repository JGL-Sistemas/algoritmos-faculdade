Algoritmo "EX13 define categoria de um nadador de acordo a idade 08062017"
// Disciplina  :  Algoritmos 
// Professor   : Giovanni 
// Descrição   : Desenvolva um algoritmo que leia a idade de um nadador, se for
// menor que 3 anos não se aceita a inscrição, se for >= a 3 anos e < 7
// anos, inscreve-se na categoria infantil, de 7 a < 12 anos inscreve-se na
// categoria infanto-juvenil, de 12 a < 15 anos inscreve-se na categoria
// juvenil, de 15 a < 18 inscreve-se na categoria aspirante, > 18 incresve-se
// na categoria adulto
// Autor(a)    : Fernando Kayro
// Data atual  : 08/06/2017
Var

i : inteiro

Inicio

mudacor ("branco","fundos")
mudacor ("azul","frente")

escreva ("Por favor insira a idade do nadador:")
leia (i)

se i < 3 entao

escreval ("")
escreval ("Este candidato não esta habilitado a participar de nenhuma categoria")

senao

se i < 7 entao
     
escreval ("")
escreval ("candidato habilitado a participar da categoria infantil")

senao

se i < 12 entao

escreval ("")
escreval ("candidato habilitado a participar da categoria infanto-juvenil")
          
senao

se i < 15 entao

escreval ("")
escreval ("candidato habilitado a participar da categoria juvenil")

senao

se i < 18 entao

escreval ("")
escreval ("candidato habilitado a participar da categoria aspirante")

senao

escreval ("")
escreval ("candidato habilitado a participar da categoria adulto")

fimse
fimse
fimse
fimse
fimse

Fimalgoritmo
