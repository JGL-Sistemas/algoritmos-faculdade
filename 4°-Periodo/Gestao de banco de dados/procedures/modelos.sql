

-- estrutura de uma procedure 
/*
create procedure nomeProcedimento (parametros)
	declaracoes;
*/

--modelo 1
create procedure mostrarprecos(precolivro int)
	select valor as preco 
	from tblivro
	where precovalor = precolivro;

--chamar procedimento
CALL mostrarprecos(21);
CALL nomeProcedimento(parametros);

--apagar procedimento
