package ficharios;

import entidades.Curso;
import java.util.ArrayList;

public class FichaCurso {
    private ArrayList<Curso> cursos = new ArrayList<>();
    
    public FichaCurso() {
    }
    
    public void cadastrar(Curso c) {
        cursos.add(c);
    }
    
    public void excluir(int pos) {
        cursos.remove(pos);
    }
    
    public void alterar(Curso c, int pos) {
        cursos.get(pos).setNome(c.getNome());
        cursos.get(pos).setNumDiscObg(c.getNumDiscObg());
        cursos.get(pos).setNumDiscOpc(c.getNumDiscOpc());
        cursos.get(pos).setListaAlunos(c.getAlunos());
        cursos.get(pos).setProfs(c.getProfs());
    }
    
    public Curso consultar(int pos) {
        return cursos.get(pos);
    }
    
    public ArrayList<Curso> relatorio() {
        return cursos;
    }
    
    public boolean isEmpty() {
        if(cursos.isEmpty())
            return true;
        else
            return false;
    }
}
