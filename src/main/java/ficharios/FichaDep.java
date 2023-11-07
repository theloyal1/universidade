package ficharios;

import entidades.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FichaDep {

    private ArrayList<Departamento> deps = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    
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
        deps.get(pos).setCurso(d.getCurso());
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
    
    public void salvarDep(Departamento dep) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("deps.txt", true));

            writer.write(dep.getCodigo()+ ", " + dep.getNome() + ", " + dep.getCurso());
            writer.newLine();

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public boolean procurarCurso() {
        try {
            FileReader fr = new FileReader("cursos.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine();
            
            while(linha!=null)
                linha = br.readLine();
            
            Iterator<Curso> iterator = cursos.iterator();
            boolean achou = false;
            int pos = 0;
            
            while (iterator.hasNext()) {
                Curso curso = iterator.next();
                if(achou) {
                    deps.get(pos).setCurso(curso);
                    break;
                }
                pos++;
            }
        } catch (IOException ex) {
            Logger.getLogger(FichaCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
