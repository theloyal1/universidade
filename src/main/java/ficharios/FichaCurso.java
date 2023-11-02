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
        cursos.get(pos).setNumDiscObg(c.getNumDiscObg());
        cursos.get(pos).setNumDiscOpc(c.getNumDiscOpc());
    }
    
    public Curso consultar(int pos) {
        return cursos.get(pos);
    }
    
    public boolean isEmpty() {
        if(cursos.isEmpty())
            return true;
        else
            return false;
    }
}
