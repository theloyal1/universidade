package ficharios;

import entidades.Ppc;
import java.util.ArrayList;

public class FichaPpc {
    private ArrayList<Ppc> ppcs = new ArrayList<>();

    public FichaPpc() {
    }
    
    public void cadastrar(Ppc p) {
        ppcs.add(p);
    }
    
    public void excluir(int pos) {
        ppcs.remove(pos);
    }
    
    public void alterar(Ppc p, int pos) {
        ppcs.get(pos).setCurso(p.getCurso());
        ppcs.get(pos).setMaterias(p.getMaterias());
        ppcs.get(pos).setAnoInicio(p.getAnoInicio());
    }
    
    public Ppc consultar(int pos) {
        return ppcs.get(pos);
    }
    
    public ArrayList<Ppc> relatorio() {
        return ppcs;
    }
    
    public boolean isEmpty() {
        if(ppcs.isEmpty())
            return true;
        else
            return false;
    }
}
