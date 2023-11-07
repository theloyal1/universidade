package ficharios;

import entidades.Aluno;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FichaAluno {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    
    public FichaAluno() {
    }
    
    public void cadastrar(Aluno a) {
        alunos.add(a);
    }
    
    public void excluir(int pos) {
        alunos.remove(pos);
    }
    
    public void alterar(Aluno a, int pos) {
        alunos.get(pos).setCpf(a.getCpf());
        alunos.get(pos).setNome(a.getNome());
        alunos.get(pos).setEmail(a.getEmail());
        alunos.get(pos).setEndereco(a.getEndereco());
        alunos.get(pos).setTelefone(a.getTelefone());
        alunos.get(pos).setNumConclusoes(a.getNumConclusoes());
        alunos.get(pos).setNumMatriculas(a.getNumMatriculas());
        alunos.get(pos).setNumDiscDep(a.getNumDiscDep());
        alunos.get(pos).setDataMatricula(String.valueOf(a.getDataMatricula()));
    }
    
    public Aluno consultar(int pos) {
        return alunos.get(pos);
    }
    
    public ArrayList<Aluno> relatorio() {
        return alunos;
    }
    
    public boolean isEmpty() {
        if(alunos.isEmpty())
            return true;
        else
            return false;
    }
    
    public void salvarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
}
