package entidades;

import java.util.ArrayList;

public class Departamento {
    private int codigo;
    private String nome;
    private ArrayList<Curso> cursos;

    public Departamento() {
    }

    public Departamento(int codigo, String nome, ArrayList<Curso> cursos) {
        this.codigo = codigo;
        this.nome = nome;
        this.cursos = cursos;
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

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
}
