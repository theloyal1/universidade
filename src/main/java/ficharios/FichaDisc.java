package ficharios;

import entidades.Disciplina;
import java.util.ArrayList;

public class FichaDisc {
    private ArrayList<Disciplina> disc = new ArrayList<>();

    public FichaDisc() {
    }
    
    public void cadastrar(Disciplina d) {
        disc.add(d);
    }
    
    public void excluir(int pos) {
        disc.remove(pos);
    }
    
    public void alterar(Disciplina d, int pos) {
        disc.get(pos).setNome(d.getNome());
        disc.get(pos).setAluno(d.getAluno());
        disc.get(pos).setProfessor(d.getProfessor());
        disc.get(pos).setMateria(d.getMateria());
        disc.get(pos).setNota(d.getNota());
        disc.get(pos).setAno(d.getAno());
        disc.get(pos).setSemestre(d.getSemestre());
        disc.get(pos).setFrequencia(d.getFrequencia());
        disc.get(pos).setAprovacao(d.isAprovacao());
    }
    
    public Disciplina consultar(int pos) {
        return disc.get(pos);
    }
    
    public ArrayList<Disciplina> relatorio() {
        return disc;
    }
    
    public boolean isEmpty() {
        if(disc.isEmpty())
            return true;
        else
            return false;
    }
}
