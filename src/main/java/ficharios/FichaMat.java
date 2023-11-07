package ficharios;

import entidades.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FichaMat {
    private ArrayList<Materia> mats = new ArrayList<>();
    private ArrayList<Professor> profs = new ArrayList<>();

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
        mats.get(pos).setProfessor(m.getProfessor());
    }
    
    public Materia consultar(int pos) {
        return mats.get(pos);
    }
    
    public boolean isEmpty() {
        if(mats.isEmpty())
            return true;
        else
            return false;
    }
    
    public void salvarMat(Materia mat) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("deps.txt", true));

            writer.write(mat.getNome() + ", " + mat.getEmenta() + ", " + mat.getPreRequisitos() + ", "
                + mat.getProfessor() + ", " + mat.getCargaHoraria());
            writer.newLine();

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public boolean procurarProf() {
        try {
            FileReader fr = new FileReader("mats.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine();
            
            while(linha!=null)
                linha = br.readLine();
            
            Iterator<Professor> iterator = profs.iterator();
            boolean achou = false;
            int pos = 0;
            
            while (iterator.hasNext()) {
                Professor prof = iterator.next();
                if(achou) {
                    mats.get(pos).setProfessor(prof);
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
