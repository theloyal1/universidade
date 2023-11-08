package ficharios;

import entidades.Professor;
import java.util.ArrayList;

public class FichaProf {
    private ArrayList<Professor> profs = new ArrayList<>();

    public FichaProf() {
    }
    
    public void cadastrar(Professor p) {
        profs.add(p);
    }
    
    public void excluir(int pos) {
        profs.remove(pos);
    }
    
    public void alterar(Professor p, int pos) {
        profs.get(pos).setCpf(p.getCpf());
        profs.get(pos).setNome(p.getNome());
        profs.get(pos).setEmail(p.getEmail());
        profs.get(pos).setEndereco(p.getEndereco());
        profs.get(pos).setTelefone(p.getTelefone());
        profs.get(pos).setEspecializacao(p.getEspecializacao());
    }
    
    public Professor consultar(int pos) {
        return profs.get(pos);
    }
    
    public ArrayList<Professor> relatorio() {
        return profs;
    }
    
    public boolean isEmpty() {
        if(profs.isEmpty())
            return true;
        else
            return false;
    }
}
