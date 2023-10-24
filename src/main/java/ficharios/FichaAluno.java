package ficharios;

import entidades.Aluno;
import java.util.ArrayList;

public class FichaAluno {

    public FichaAluno() {
    }
    
    private ArrayList<Aluno> alunos = new ArrayList<>();
    
    public void cadastrar(Aluno a) {
        alunos.add(a);
    }
    
    public void excluir(Aluno a) {
        alunos.remove(a);
    }
    
    public ArrayList<Aluno> consultar() {
        return alunos;
    }
}
