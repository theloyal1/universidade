package entidades;

import java.util.ArrayList;

public class Departamento {
    private int codigo;
    private String nome;
    private Curso curso;

    public Departamento() {
    }
    
    public Departamento(int codigo, String nome, Curso curso) {
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
