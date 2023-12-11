-- Database: universidade

-- DROP DATABASE IF EXISTS universidade;

-- CREATE DATABASE universidade
--    WITH
--    OWNER = postgres
--    ENCODING = 'UTF8'
--    LC_COLLATE = 'Portuguese_Brazil.1252'
--    LC_CTYPE = 'Portuguese_Brazil.1252'
--    LOCALE_PROVIDER = 'libc'
--    TABLESPACE = pg_default
--    CONNECTION LIMIT = -1
--    IS_TEMPLATE = False;
	
CREATE TABLE aluno (
	codigo smallint NOT NULL PRIMARY KEY,
	cpf int NOT NULL,
	nome character varying NOT NULL,
	email character varying NOT NULL,
	endereco character varying NOT NULL,
	telefone character varying NOT NULL,
	num_matriculas int NOT NULL,
	num_conclusoes int NOT NULL,
	num_dependencias int NOT NULL,
	data_matricula date NOT NULL
);

CREATE TABLE professor (
	codigo smallint NOT NULL PRIMARY KEY,
	cpf int NOT NULL,
	nome character varying NOT NULL,
	email character varying NOT NULL,
	endereco character varying NOT NULL,
	telefone character varying NOT NULL,
	especializacao character varying NOT NULL
);

CREATE TABLE curso (
	codigo smallint NOT NULL PRIMARY KEY,
	nome character varying NOT NULL,
	num_disc_obg int NOT NULL,
	num_disc_opc int NOT NULL,
	alunos character varying NOT NULL,
	professores character varying NOT NULL
);

CREATE TABLE departamento (
	codigo smallint NOT NULL PRIMARY KEY,
	nome character varying NOT NULL,
	cursos character varying NOT NULL
);

CREATE TABLE materia (
	codigo smallint NOT NULL PRIMARY KEY,
	nome character varying NOT NULL,
	ementa character varying NOT NULL,
	pre_requisitos character varying NOT NULL,
	carga_horaria int NOT NULL,
	professores character varying NOT NULL
);

CREATE TABLE ppc (
	codigo smallint NOT NULL PRIMARY KEY,
	curso character varying NOT NULL,
	materias character varying NOT NULL,
	ano_inicio int NOT NULL
);

CREATE TABLE disciplina (
	codigo smallint NOT NULL PRIMARY KEY,
	nome character varying NOT NULL,
	aluno character varying NOT NULL,
	professor character varying NOT NULL,
	materia character varying NOT NULL,
	nota float NOT NULL,
	ano int NOT NULL,
	semestre int NOT NULL,
	frequencia float NOT NULL,
	aprovacao boolean NOT NULL
);