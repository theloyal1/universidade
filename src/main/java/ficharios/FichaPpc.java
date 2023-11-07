package ficharios;

import entidades.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FichaPpc {
    private ArrayList<Ppc> ppcs = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<Materia> mats = new ArrayList<>();

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
        ppcs.get(pos).setMaterias(p.getMateria());
        ppcs.get(pos).setAnoInicio(p.getAnoInicio());
    }
    
    public Ppc consultar(int pos) {
        return ppcs.get(pos);
    }
    
    public boolean isEmpty() {
        if(ppcs.isEmpty())
            return true;
        else
            return false;
    }
    
    public void salvarPpc(Ppc ppc) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("ppcs.txt", true));

            writer.write(ppc.getCurso() + ", " + ppc.getMateria() + ", " + ppc.getAnoInicio());
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
                    ppcs.get(pos).setCurso(curso);
                    break;
                }
                pos++;
            }
        } catch (IOException ex) {
            Logger.getLogger(FichaCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public boolean procurarMat() {
        try {
            FileReader fr = new FileReader("mats.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine();
            
            while(linha!=null)
                linha = br.readLine();
            
            Iterator<Materia> iterator = mats.iterator();
            boolean achou = false;
            int pos = 0;
            
            while (iterator.hasNext()) {
                Materia mat = iterator.next();
                if(achou) {
                    ppcs.get(pos).setMaterias(mat);
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
