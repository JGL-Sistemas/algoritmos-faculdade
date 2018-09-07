
-- 1. Crie um banco de dados chamado Vendas e monte as tabelas conforme modelo.
CREATE DATABASE vendas;

-- use banco de dados

USE vendas;

-- criar dando de dados
CREATE TABLE cliente(
 id_cliente INT NOT NULL AUTO_INCREMENT,
 nome VARCHAR(150),
 telefone VARCHAR(20),
 PRIMARY KEY(id_cliente)
);

-- criar dando de dados
CREATE TABLE produto(
 id_produto INT NOT NULL AUTO_INCREMENT,
 descricao VARCHAR(45),
 sigla_unidade VARCHAR(3),
 quantidade_unidade DECIMAL,
 marca VARCHAR(45),
 preco DECIMAL,
 PRIMARY KEY(id_produto)
);

-- criar dando de dados
CREATE TABLE vendedor(
 id_vendedor INT NOT NULL AUTO_INCREMENT,
 nome VARCHAR(150),
 matricula VARCHAR(150),
 PRIMARY KEY(id_vendedor)
);

-- criar dando de dados
CREATE TABLE venda(
 id_venda INT NOT NULL AUTO_INCREMENT,
 id_cliente INT,
 id_vendedor INT,
 forma_pagamento VARCHAR(45),
 data_venda DATE,
 total FLOAT,
 desconto FLOAT,
 a_pagar DECIMAL,
 PRIMARY KEY(id_venda),
 FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
 FOREIGN KEY (id_vendedor) REFERENCES vendedor(id_vendedor)
);

-- criar dando de dados
CREATE TABLE venda_produto(
 id_venda_produto INT NOT NULL AUTO_INCREMENT,
 id_venda INT,
 id_produto INT,
 preco DECIMAL,
 quantidade INT,
 PRIMARY KEY(id_venda_produto),
 FOREIGN KEY (id_venda) REFERENCES venda(id_venda),
 FOREIGN KEY (id_produto) REFERENCES produto(id_produto)
);


-- 2. Façam as consultas baseadas na modelagem.

SELECT * FROM cliente;
SELECT * FROM produto;
SELECT * FROM vendedor;
SELECT * FROM venda;
SELECT * FROM venda_produto;

-- 3. Povoe o banco conforme seu critério.


INSERT INTO `cliente` (`nome`, `telefone`) VALUES ('Danilo', '988643983');
INSERT INTO `cliente` (`nome`, `telefone`) VALUES ('Jaão', '988643934');
INSERT INTO `cliente` (`nome`, `telefone`) VALUES ('Pedro', '348643983');
INSERT INTO `cliente` (`nome`, `telefone`) VALUES ('Maria', '984563983');
INSERT INTO `cliente` (`nome`, `telefone`) VALUES ('Fernando', '234456454');
INSERT INTO `cliente` (`nome`, `telefone`) VALUES ('Miguel', '234434554');
INSERT INTO `cliente` (`nome`, `telefone`) VALUES ('Lucas', '124434554');
INSERT INTO `cliente` (`nome`, `telefone`) VALUES ('marcelo', '12d433154');
INSERT INTO `cliente` (`nome`, `telefone`) VALUES ('giovanni', '124434554');
INSERT INTO `cliente` (`nome`, `telefone`) VALUES ('dieisson', '124434554');
INSERT INTO `cliente` (`nome`, `telefone`) VALUES ('maria', '124454454');
INSERT INTO `cliente` (`nome`, `telefone`) VALUES ('marcos', '424454554');
INSERT INTO `cliente` (`nome`, `telefone`) VALUES ('lula', '127464554');

INSERT INTO `produto` (`descricao`, `sigla_unidade`, `quantidade_unidade`, `marca`, `preco`) VALUES ('Arroz', 'A', '12', 'maranhão', '12.54');
INSERT INTO `produto` (`descricao`, `sigla_unidade`, `quantidade_unidade`, `marca`, `preco`) VALUES ('carne', 'C', '2', 'friboy', '30.65');
INSERT INTO `produto` (`descricao`, `sigla_unidade`, `quantidade_unidade`, `marca`, `preco`) VALUES ('macarrão', 'M', '10', 'periquito', '10.99');
INSERT INTO `produto` (`descricao`, `sigla_unidade`, `quantidade_unidade`, `marca`, `preco`) VALUES ('uva', 'U', '5', 'uvasris', '45.77');
INSERT INTO `produto` (`descricao`, `sigla_unidade`, `quantidade_unidade`, `marca`, `preco`) VALUES ('pão', 'P', '15', 'vic', '00.32');
INSERT INTO `produto` (`descricao`, `sigla_unidade`, `quantidade_unidade`, `marca`, `preco`) VALUES ('frango', 'F', '12', 'maranhão', '02.54');
INSERT INTO `produto` (`descricao`, `sigla_unidade`, `quantidade_unidade`, `marca`, `preco`) VALUES ('cebola', 'C', '12', 'maranhão', '17.54');
INSERT INTO `produto` (`descricao`, `sigla_unidade`, `quantidade_unidade`, `marca`, `preco`) VALUES ('uva', 'U', '7', 'uvasris', '45.77');
INSERT INTO `produto` (`descricao`, `sigla_unidade`, `quantidade_unidade`, `marca`, `preco`) VALUES ('peixe', 'P', '8', 'pexiris', '49.77');

INSERT INTO `vendedor` (`nome`, `matricula`) VALUES ('Danilo', '231');
INSERT INTO `vendedor` (`nome`, `matricula`) VALUES ('Samuel', '232');
INSERT INTO `vendedor` (`nome`, `matricula`) VALUES ('Ricardo', '233');
INSERT INTO `vendedor` (`nome`, `matricula`) VALUES ('kely', '237');
INSERT INTO `vendedor` (`nome`, `matricula`) VALUES ('maria', '543');

INSERT INTO `venda` (`id_cliente`, `id_vendedor`, `forma_pagamento`, `data_venda`, `total`, `desconto`, `a_pagar`) VALUES ('5', '1', 'cheque', '2018-04-09', '19.76', '00.00', '19.76');
INSERT INTO `venda` (`id_cliente`, `id_vendedor`, `forma_pagamento`, `data_venda`, `total`, `desconto`, `a_pagar`) VALUES ('4', '2', 'a vista', '2015-02-10', '40.65', '01.54', '39.11');
INSERT INTO `venda` (`id_cliente`, `id_vendedor`, `forma_pagamento`, `data_venda`, `total`, `desconto`, `a_pagar`) VALUES ('3', '3', 'a vista', '2018-02-09', '34.67', '03.65', '31.02');
INSERT INTO `venda` (`id_cliente`, `id_vendedor`, `forma_pagamento`, `data_venda`, `total`, `desconto`, `a_pagar`) VALUES ('2', '1', 'cheque', '2011-04-08', '23.65', '00.00', '23.65');
INSERT INTO `venda` (`id_cliente`, `id_vendedor`, `forma_pagamento`, `data_venda`, `total`, `desconto`, `a_pagar`) VALUES ('5', '5', 'a vista', '2015-01-08', '76.65', '00.00', '13.65');
INSERT INTO `venda` (`id_cliente`, `id_vendedor`, `forma_pagamento`, `data_venda`, `total`, `desconto`, `a_pagar`) VALUES ('6', '1', 'cheque', '2009-12-18', '36.65', '00.00', '03.65');
INSERT INTO `venda` (`id_cliente`, `id_vendedor`, `forma_pagamento`, `data_venda`, `total`, `desconto`, `a_pagar`) VALUES ('8', '2', 'a vista', '2001-05-29', '36.65', '00.00', '03.65');
INSERT INTO `venda` (`id_cliente`, `id_vendedor`, `forma_pagamento`, `data_venda`, `total`, `desconto`, `a_pagar`) VALUES ('7', '3', 'cheque', '2051-12-30', '36.65', '00.00', '03.65');
INSERT INTO `venda` (`id_cliente`, `id_vendedor`, `forma_pagamento`, `data_venda`, `total`, `desconto`, `a_pagar`) VALUES ('1', '1', 'a vista', '2018-02-20', '36.65', '00.00', '03.65');
INSERT INTO `venda` (`id_cliente`, `id_vendedor`, `forma_pagamento`, `data_venda`, `total`, `desconto`, `a_pagar`) VALUES ('2', '4', 'cheque', '2017-05-10', '36.65', '00.00', '03.65');

INSERT INTO `venda_produto` (`id_venda`, `id_produto`, `preco`, `quantidade`) VALUES ('1', '1', '12.45', '1');
INSERT INTO `venda_produto` (`id_venda`, `id_produto`, `preco`, `quantidade`) VALUES ('2', '2', '43.45', '2');
INSERT INTO `venda_produto` (`id_venda`, `id_produto`, `preco`, `quantidade`) VALUES ('3', '3', '65.76', '3');
INSERT INTO `venda_produto` (`id_venda`, `id_produto`, `preco`, `quantidade`) VALUES ('4', '4', '78.98', '5');
INSERT INTO `venda_produto` (`id_venda`, `id_produto`, `preco`, `quantidade`) VALUES ('7', '8', '34.56', '1');
INSERT INTO `venda_produto` (`id_venda`, `id_produto`, `preco`, `quantidade`) VALUES ('6', '9', '44.56', '3');
INSERT INTO `venda_produto` (`id_venda`, `id_produto`, `preco`, `quantidade`) VALUES ('5', '3', '37.56', '4');
INSERT INTO `venda_produto` (`id_venda`, `id_produto`, `preco`, `quantidade`) VALUES ('8', '2', '39.56', '5');
INSERT INTO `venda_produto` (`id_venda`, `id_produto`, `preco`, `quantidade`) VALUES ('9', '1', '24.56', '2');
INSERT INTO `venda_produto` (`id_venda`, `id_produto`, `preco`, `quantidade`) VALUES ('9', '2', '34.56', '1');
INSERT INTO `venda_produto` (`id_venda`, `id_produto`, `preco`, `quantidade`) VALUES ('1', '5', '54.56', '4');
INSERT INTO `venda_produto` (`id_venda`, `id_produto`, `preco`, `quantidade`) VALUES ('3', '7', '04.56', '5');

-- 4. Façam as seguintes consultas:

-- a. Listar as datas da venda do cliente cujo id seja 10
SELECT data_venda FROM venda where id_venda = 10; 

-- b. Listar todos os produtos comparados pelo cliente de id 13.
SELECT distinct venda.id_venda, produto.id_produto, produto.descricao, produto.marca FROM vendas.venda, vendas.venda_produto, vendas.produto where venda.id_cliente = 13 and venda_produto.id_venda = venda.id_venda and venda_produto.id_produto = produto.id_produto; 

-- c. Listar nomes e a matrículas que venderam o produto 17
select vendedor.nome, vendedor.matricula from vendas.venda_produto, vendas.venda, vendas.vendedor where venda_produto.id_produto = 17 and venda_produto.id_venda = venda.id_venda and venda.id_vendedor = vendedor.id_vendedor;

-- d. Listar a soma das vendas de cada vendedor.
SELECT distinct vendedor.nome, sum(venda.total) FROM vendas.venda, vendas.vendedor where venda.id_vendedor = vendedor.id_vendedor;

-- 5. O banco de dados apresentado na modelagem teria o nome de vendas, todos os comandos pedidos devem ser feitos somente para este banco.

-- i. Pesquise e Crie um usuário com o nome de vendedor e com senha 123mudar.
CREATE USER 'vendedor'@'localhost' IDENTIFIED BY '123mudar';

-- ii. Desenvolva os comandos para que dê a este usuário permissão para usar: ALTER, Insert, update na tabela produto;
GRANT ALL PRIVILEGES ON * . * TO 'novousuario'@'localhost';

-- iii. Insert e Update na tabela venda;
GRANT INSERT, UPDATE ON vendas.venda FROM 'vendedor'@'localhost';

-- iv. select para todas as tabelas do banco.
GRANT INSERT, UPDATE ON vendas.* FROM 'vendedor'@'localhost';

-- v. Retire a permissão de Alter da tabela produto.
REVOKE ALTER ON vendas.produto FROM 'vendedor'@'localhost';








