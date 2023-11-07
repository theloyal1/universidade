package ficharios;

import entidades.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FichaCurso {
    private ArrayList<Curso> cursos = new ArrayList<>();
    private String nome;
    
    public FichaCurso() {
    }
    
    public void cadastrar(Curso c) {
        cursos.add(c);
    }
    
    public void excluir(int pos) {
        cursos.remove(pos);
    }
    
    public void alterar(Curso c, int pos) {
        cursos.get(pos).setNumDiscObg(c.getNumDiscObg());
        cursos.get(pos).setNumDiscOpc(c.getNumDiscOpc());
        cursos.get(pos).setAlunos(c.getAlunos());
        cursos.get(pos).setProfs(c.getProfs());
    }
    
    public Curso consultar(int pos) {
        return cursos.get(pos);
    }
    
    public ArrayList<Curso> relatorio() {
        return cursos;
    }
    
    public boolean isEmpty() {
        if(cursos.isEmpty())
            return true;
        else
            return false;
    }
    
    public void salvarCurso(Curso curso) {
        cursos.add(curso);
    }
    
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
