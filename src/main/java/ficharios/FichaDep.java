package ficharios;

import entidades.Departamento;
import java.util.ArrayList;

public class FichaDep {

    private ArrayList<Departamento> deps = new ArrayList<>();
    
    public FichaDep() {
    }
    
    public void cadastrar(Departamento d) {
        deps.add(d);
    }
    
    public void excluir(int pos) {
        deps.remove(pos);
    }
    
    public void alterar(Departamento d, int pos) {
        deps.get(pos).setCodigo(d.getCodigo());
        deps.get(pos).setNome(d.getNome());
    }
    
    public Departamento consultar(int pos) {
        return deps.get(pos);
    }
    
    public ArrayList<Departamento> relatorio() {
        return deps;
    }
    
    public boolean isEmpty() {
        if(deps.isEmpty())
            return true;
        else
            return false;
    }
}
