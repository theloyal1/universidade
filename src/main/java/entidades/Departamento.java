package entidades;

import java.util.ArrayList;

public class Departamento {
    private int codigo;
    private String nome;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Departamento() {
    }

    public Departamento(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
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

    public void setListaCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public void setCurso(Curso c) {
        this.cursos.add(c);
    }
    
    public void removeCurso(Curso c) {
        this.cursos.remove(c);
    }
}
