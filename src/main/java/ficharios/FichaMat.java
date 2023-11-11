package ficharios;

import entidades.Materia;
import java.util.ArrayList;

public class FichaMat {
    private ArrayList<Materia> mats = new ArrayList<>();

    public FichaMat() {
    }
    
    public void cadastrar(Materia m) {
        mats.add(m);
    }
    
    public void excluir(int pos) {
        mats.remove(pos);
    }
    
    public void alterar(Materia m, int pos) {
        mats.get(pos).setNome(m.getNome());
        mats.get(pos).setEmenta(m.getEmenta());
        mats.get(pos).setPreRequisitos(m.getPreRequisitos());
        mats.get(pos).setProfessores(m.getProfessores());
    }
    
    public Materia consultar(int pos) {
        return mats.get(pos);
    }
    
    public ArrayList<Materia> relatorio() {
        return mats;
    }
    
    public boolean isEmpty() {
        if(mats.isEmpty())
            return true;
        else
            return false;
    }
}
