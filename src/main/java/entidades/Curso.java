package entidades;

import java.util.ArrayList;

public class Curso {
    private int numDiscObg, numDiscOpc;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> profs;

    public Curso(int numDiscObg, int numDiscOpc, ArrayList<Aluno> alunos, ArrayList<Professor> profs) {
        this.numDiscObg = numDiscObg;
        this.numDiscOpc = numDiscOpc;
        this.alunos = alunos;
        this.profs = profs;
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

    public ArrayList<Professor> getProfs() {
        return profs;
    }

    public void setProfs(ArrayList<Professor> profs) {
        this.profs = profs;
    }
}
