package entidades;

public class Professor extends Pessoa {
    private String especializacao;

    public Professor() {
    }

    public Professor(String especializacao, String cpf, String nome, String email, String endereco, String telefone) {
        super(cpf, nome, email, endereco, telefone);
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}
