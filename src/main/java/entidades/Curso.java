package entidades;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private int numDiscObg, numDiscOpc;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Professor> profs = new ArrayList<>();

    public Curso() {
    }

    public Curso(String nome, int numDiscObg, int numDiscOpc) {
        this.nome = nome;
        this.numDiscObg = numDiscObg;
        this.numDiscOpc = numDiscOpc;
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
    
    public void removeAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public ArrayList<Professor> getProfs() {
        return profs;
    }

    public void setListaProfs(ArrayList<Professor> profs) {
        this.profs = profs;
    }
    
    public void setProf(Professor professor) {
        this.profs.add(professor);
    }
    
    public void removeProf(Professor professor) {
        this.profs.remove(professor);
    }
    
    @Override
    public String toString() {
        return nome;
    }
}
