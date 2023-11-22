package entidades;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private int numDiscObg, numDiscOpc;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> profs;

    public Curso() {
    }

    public Curso(String nome, int numDiscObg, int numDiscOpc, ArrayList<Aluno> alunos, ArrayList<Professor> profs) {
        this.nome = nome;
        this.numDiscObg = numDiscObg;
        this.numDiscOpc = numDiscOpc;
        this.alunos = alunos;
        this.profs = profs;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void setListaAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public void setAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public ArrayList<Professor> getProfs() {
        return profs;
    }

    public void setProfs(ArrayList<Professor> profs) {
        this.profs = profs;
    }
}
