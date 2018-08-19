
create databese padaria;


create table produto(
	IDproduto int not null AUTO_INCREMENT,
	descricao varchar(255),
	preco text(50),
	primary key(IDproduto)

);

create table comanda(
	IDcomanda int not null AUTO_INCREMENT,
	venda text(50),
	primary key(IDcomanda)	
);

create table comandaproduto(
	IDproduto,
	IDcomanda,
	quantidade int
);

create table venda(
	IDvenda int not null AUTO_INCREMENT,
	data date,
	tipoprogeto varchar(100),
	comanda varchar(150),
	total int not null,
	primaty key(IDvenda)

);

create table relatorio(
	IDvenda,
	IDproduto,
	quantidade,
	preco
);

____________________________________
Produto

id descrição preço 

1|banana   | 2,213
2|maça     | 4,43
3|biscoito | 7,54
4|salgado  | 9,76
5|leite    | 5,86

____________________________________
comanda

id venda

201 |
202 |
203 |
204 |
205 |
____________________________________


create table cadastro(
	IDcadastro int not null auto_increment,
	NUprioridade int not null,
	

);





