package ficharios;

import entidades.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FichaDisc {
    private ArrayList<Disciplina> disc = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Professor> profs = new ArrayList<>();
    private ArrayList<Materia> mats = new ArrayList<>();

    public FichaDisc() {
    }
    
    public void cadastrar(Disciplina d) {
        disc.add(d);
    }
    
    public void excluir(int pos) {
        disc.remove(pos);
    }
    
    public void alterar(Disciplina d, int pos) {
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
    
    public boolean isEmpty() {
        if(disc.isEmpty())
            return true;
        else
            return false;
    }
    
    public void salvarDisc(Disciplina disc) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("disc.txt", true));

            writer.write(disc.getAluno() + ", " + disc.getProfessor() + ", " + disc.getMateria() + 
                    ", " + disc.getNota() + ", " + disc.getAno() + ", " + disc.getSemestre() + 
                    ", " + disc.getFrequencia() + ", " + disc.isAprovacao());
            writer.newLine();

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public boolean procurarAluno() {
        try {
            FileReader fr = new FileReader("alunos.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine();
            
            while(linha!=null)
                linha = br.readLine();
            
            Iterator<Aluno> iterator = alunos.iterator();
            boolean achou = false;
            int pos = 0;
            
            while (iterator.hasNext()) {
                Aluno aluno = iterator.next();
                if(achou) {
                    disc.get(pos).setAluno(aluno);
                    break;
                }
                pos++;
            }
        } catch (IOException ex) {
            Logger.getLogger(FichaCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public boolean procurarProf() {
        try {
            FileReader fr = new FileReader("profs.txt");
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
                    disc.get(pos).setProfessor(prof);
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
                    disc.get(pos).setMateria(mat);
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
