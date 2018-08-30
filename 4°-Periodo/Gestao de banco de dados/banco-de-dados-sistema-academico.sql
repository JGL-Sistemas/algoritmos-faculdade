/*
A empresa MIDAI PROF oferece cursos diversos de aperfeiçoamento profissional, o dono 
precisa controla inicialmente os cursos fornecidos a data de início e termino 
o horário de início e término o nome e telefone  celular do professor, para cada curso 
devesse controla a carga horaria, o conteúdo programático e o valor do curso.
observando o cenário ele passou também a controlar a matricula e o cadastro de aluno 
para a matricula cadastra a data da matricula, valor pago aluno e a turma 
o cadastro do aluno compreende, nome cpf data de nascimento endereço completo e contato
desenvolva um modelo de dados que atenda a necessidades

*/


CREATE DATABASE sis_academico;

USE sis_academico;

--
-- Cria tabela tb_curso
--
CREATE TABLE tb_curso(
	id_curso int NOT NULL AUTO_INCREMENT,
    cur_name VARCHAR(100),
    id_disciplina int,
    PRIMARY KEY (id_curso),
    FOREIGN KEY (id_disciplina) REFERENCES tb_disciplinas(id_disciplina)
);

--
-- Cria tabela tb_professor
--
CREATE TABLE tb_professor(
	id_professor int NOT NULL AUTO_INCREMENT,
    nome_professor VARCHAR(30),
    telefone_professor VARCHAR(10),
    PRIMARY KEY (id_professor)
);

--
-- Cria tabela tb_turma
--
CREATE TABLE tb_turma(
	id_turma int NOT NULL AUTO_INCREMENT,
    dt_inicio DATE,
	dt_final DATE,
	hr_inicio DATETIME,
	hr_final DATETIME,
    id_curso int,
    disciplina_carga_horaria INT,
    PRIMARY KEY (id_turma),
    FOREIGN KEY (id_curso) REFERENCES tb_curso(id_curso)
);

--
-- Cria tabela tb_alunos_turma
--
CREATE TABLE tb_alunos_turma(
	id_alunos_turma int NOT NULL AUTO_INCREMENT,
	id_aluno INT,
    id_turma INT,
	PRIMARY KEY (id_alunos_turma),
    FOREIGN KEY (id_aluno) REFERENCES tb_curso(tb_aluno),
	FOREIGN KEY (id_turma) REFERENCES tb_turma(id_turma)
);

--
-- Cria tabela tb_finaceiro
--
CREATE TABLE tb_finaceiro(
	id_valor int NOT NULL AUTO_INCREMENT,
	fn_valor int,
	id_turma int,
	id_aluno int,
    PRIMARY KEY (id_valor),
	FOREIGN KEY (id_turma) REFERENCES tb_curso(id_turma),
    FOREIGN KEY (id_aluno) REFERENCES tb_curso(id_aluno)
);

--
-- Cria tabela tb_matricula
--
CREATE TABLE tb_matricula(
	id_matricula int NOT NULL AUTO_INCREMENT,
	dt_matricula DATE,
    id_aluno int,
	id_valor int,
	PRIMARY KEY (id_matricula),
    FOREIGN KEY (id_aluno) REFERENCES tb_aluno(id_aluno),
    FOREIGN KEY (id_valor) REFERENCES tb_finaceiro(id_valor)
);

--
-- Cria tabela tb_aluno
--
CREATE TABLE tb_aluno(
	id_aluno int NOT NULL AUTO_INCREMENT,
	nome_aluno VARCHAR(30),
	cpf_aluno VARCHAR(12),
	dt_nacimento DATE,
	end_aluno TEXT,
	tel_aluno VARCHAR(15),
	status_aluno int,
    PRIMARY KEY (id_aluno)
    
);

--
-- Cria tabela tb_disciplinas
--
CREATE TABLE tb_disciplinas(
	id_disciplina int NOT NULL AUTO_INCREMENT,
    nome_disciplina VARCHAR(30),
    id_professor int,
    PRIMARY KEY (id_disciplina),
    FOREIGN KEY (id_professor) REFERENCES tb_professor(id_professor)
);