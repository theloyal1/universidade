package ficharios;

import entidades.Departamento;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
        deps.get(pos).setCursos(d.getCursos());
    }
    
    public Departamento consultar(int pos) {
        return deps.get(pos);
    }
    
    public boolean isEmpty() {
        if(deps.isEmpty())
            return true;
        else
            return false;
    }
    
    public static void salvarProf(Departamento dep) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("profs.txt", true));

            writer.write(dep.getCodigo()+ ", " + dep.getNome() + ", " + dep.getCursos());
            writer.newLine();

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
