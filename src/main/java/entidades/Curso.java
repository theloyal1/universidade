package entidades;

import java.util.ArrayList;

public class Curso {
    private int numDiscObg, numDiscOpc;
    private Aluno aluno;
    private Professor professor;

    public Curso() {
    }

    public Curso(int numDiscObg, int numDiscOpc, Aluno aluno, Professor professor) {
        this.numDiscObg = numDiscObg;
        this.numDiscOpc = numDiscOpc;
        this.aluno = aluno;
        this.professor = professor;
    }

    public int getNumDiscObg() {
        return numDiscObg;
    }

    public void setNumDiscObg(int numDiscObg) {
        this.numDiscObg = numDiscObg;
    }

    public int getNumDiscOpc() {
        return numDiscOpc;
    }

    public void setNumDiscOpc(int numDiscOpc) {
        this.numDiscOpc = numDiscOpc;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
