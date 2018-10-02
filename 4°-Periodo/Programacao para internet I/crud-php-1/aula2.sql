<<<<<<< HEAD

CREATE DATABASE crud_1;

USE crud_1;

-- tabela pessoa 
create table pessoa(
	id_pessoa int not null AUTO_INCREMENT,
	nome varchar(50),
	cpf varchar(14),
	ci varchar(10),
	nascimento date,
	primary key(id_pessoa)
);

-- tabela professor 
create table professor(
	id_professor int not null AUTO_INCREMENT,
	id_pessoa int not null,
	admissao date,
	titulacao varchar(20),
	primary key(id_professor), 
	FOREIGN KEY (id_pessoa) REFERENCES pessoa(id_pessoa)	
);

-- aluno 
create table aluno(
	id_aluno int not null AUTO_INCREMENT,
	id_pessoa int not null,
	mae varchar(20),
	pai varchar(20),
	primary key(id_aluno),
	FOREIGN KEY (id_pessoa) REFERENCES pessoa(id_pessoa)	
);
=======

CREATE DATABASE crud_1;

USE crud_1;

-- tabela pessoa 
create table pessoa(
	id_pessoa int not null AUTO_INCREMENT,
	nome varchar(50),
	cpf varchar(14),
	ci varchar(10),
	nascimento date,
	primary key(id_pessoa)
);

-- tabela professor 
create table professor(
	id_professor int not null AUTO_INCREMENT,
	id_pessoa int not null,
	admissao date,
	titulacao varchar(20),
	primary key(id_professor), 
	FOREIGN KEY (id_pessoa) REFERENCES pessoa(id_pessoa)	
);

-- aluno 
create table aluno(
	id_aluno int not null AUTO_INCREMENT,
	id_pessoa int not null,
	mae varchar(20),
	pai varchar(20),
	primary key(id_aluno),
	FOREIGN KEY (id_pessoa) REFERENCES pessoa(id_pessoa)	
);
>>>>>>> dadd0d060fe0030eb8497360fafdb214cf628125
