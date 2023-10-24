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
    
    public void excluir(int pos) {
        alunos.remove(pos);
    }
    
    public ArrayList<Aluno> consultar() {
        return alunos;
    }
}
