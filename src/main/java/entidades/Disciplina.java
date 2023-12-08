package entidades;

public class Disciplina {
    private String nome;
    private Aluno aluno;
    private Professor professor;
    private Materia materia;
    private float nota, frequencia;
    private int ano, semestre;
    private boolean aprovacao;

    public Disciplina() {
    }

    public Disciplina(String nome, Aluno aluno, Professor professor, Materia materia, float nota, 
            float frequencia, int ano, int semestre, boolean aprovacao) {
        this.nome = nome;
        this.aluno = aluno;
        this.professor = professor;
        this.materia = materia;
        this.nota = nota;
        this.frequencia = frequencia;
        this.ano = ano;
        this.semestre = semestre;
        this.aprovacao = aprovacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public boolean isAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(boolean aprovacao) {
        this.aprovacao = aprovacao;
    }
    
    @Override
    public String toString() {
        return nome;
    }
}
