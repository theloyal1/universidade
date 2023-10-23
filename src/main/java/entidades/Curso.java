package entidades;

import java.util.ArrayList;

public class Curso {
    private int numDiscObg, numDiscOpc;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;

    public Curso() {
    }

    public Curso(int numDiscObg, int numDiscOpc, ArrayList<Aluno> alunos, ArrayList<Professor> professores) {
        this.numDiscObg = numDiscObg;
        this.numDiscOpc = numDiscOpc;
        this.alunos = alunos;
        this.professores = professores;
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

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }
}
