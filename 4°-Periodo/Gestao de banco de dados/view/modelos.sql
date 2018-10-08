
-- estrutura da view

/*
create view [nome da view]
	as select [colunas]
	from [tabela]
	where [condicoes];
*/

--exemplo numero 1
create view selecionaNomes
	as select nome,idade
	from pessoa
	where idade > 18;

--exemplo numero 2
create view selecionaMatriculados
	as select nome,matricula
	from aluno
	where matricula = 13243;

