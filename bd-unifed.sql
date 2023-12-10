-- Database: universidade

-- DROP DATABASE IF EXISTS universidade;

CREATE DATABASE universidade
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1S
    IS_TEMPLATE = False;
	
CREATE TABLE aluno (
	cpf_aluno int NOT NULL PRIMARY KEY,
	nome_aluno character varying(30) NOT NULL,
	email_aluno character varying(80) NOT NULL,
	endereco_aluno character varying(80) NOT NULL,
	telefone_aluno character varying(15) NOT NULL,
	num_matriculas int NOT NULL,
	num_conclusoes int NOT NULL,
	num_dependencias int NOT NULL,
	data_matricula date NOT NULL
);

CREATE TABLE professor (
	cpf_prof int NOT NULL PRIMARY KEY,
	nome_prof character varying(30) NOT NULL,
	email_prof character varying(80) NOT NULL,
	endereco_prof character varying(80) NOT NULL,
	telefone_prof character varying(15) NOT NULL,
	especializacao character varying(30) NOT NULL
);

CREATE TABLE curso (
	id_curso smallint NOT NULL PRIMARY KEY,
	nome_curso character varying(30) NOT NULL,
	num_disc_obg int NOT NULL,
	num_disc_opc int NOT NULL,
	alunos text NOT NULL,
	professores text NOT NULL
);

CREATE TABLE departamento (
	codigo smallint NOT NULL PRIMARY KEY,
	nome_dep character varying(30) NOT NULL,
	cursos text NOT NULL
);

CREATE TABLE materia (
	id_materia smallint NOT NULL PRIMARY KEY,
	nome_materia character varying(30) NOT NULL,
	ementa text NOT NULL,
	pre_requisitos text NOT NULL,
	professores text NOT NULL,
	carga_horaria int NOT NULL
);

CREATE TABLE ppc (
	id_ppc smallint NOT NULL PRIMARY KEY,
	curso character varying(30) NOT NULL,
	materias text NOT NULL,
	ano_inicio int NOT NULL
);

CREATE TABLE disciplina (
	id_disc smallint NOT NULL PRIMARY KEY,
	nome_disc character varying(30) NOT NULL,
	aluno character varying(30) NOT NULL,
	professor character varying(30) NOT NULL,
	materia character varying(30) NOT NULL,
	nota real NOT NULL,
	frequencia real NOT NULL,
	ano int NOT NULL,
	semestre int NOT NULL,
	aprovacao boolean NOT NULL
);