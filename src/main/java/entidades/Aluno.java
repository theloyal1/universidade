package entidades;

public class Aluno extends Pessoa {

    private int numMatriculas, numConclusoes, numDiscDep;
    private String dataMatricula;

    public Aluno() {
    }

    public Aluno(int numMatriculas, int numConclusoes, int numDiscDep, String dataMatricula,
            String cpf, String nome, String email, String endereco, String telefone) {
        super(cpf, nome, email, endereco, telefone);
        this.numMatriculas = numMatriculas;
        this.numConclusoes = numConclusoes;
        this.numDiscDep = numDiscDep;
        this.dataMatricula = dataMatricula;
    }

    public int getNumMatriculas() {
        return numMatriculas;
    }

    public void setNumMatriculas(int numMatriculas) {
        this.numMatriculas = numMatriculas;
    }

    public int getNumConclusoes() {
        return numConclusoes;
    }

    public void setNumConclusoes(int numConclusoes) {
        this.numConclusoes = numConclusoes;
    }

    public int getNumDiscDep() {
        return numDiscDep;
    }

    public void setNumDiscDep(int numDiscDep) {
        this.numDiscDep = numDiscDep;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
