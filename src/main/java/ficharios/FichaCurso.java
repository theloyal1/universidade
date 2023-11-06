package ficharios;

import entidades.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FichaCurso {
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Professor> profs = new ArrayList<>();

    public FichaCurso() {
    }
    
    public void cadastrar(Curso c) {
        cursos.add(c);
    }
    
    public void excluir(int pos) {
        cursos.remove(pos);
    }
    
    public void alterar(Curso c, int pos) {
        cursos.get(pos).setNumDiscObg(c.getNumDiscObg());
        cursos.get(pos).setNumDiscOpc(c.getNumDiscOpc());
        cursos.get(pos).setAluno(c.getAluno());
        cursos.get(pos).setProfessor(c.getProfessor());
    }
    
    public Curso consultar(int pos) {
        return cursos.get(pos);
    }
    
    public boolean isEmpty() {
        if(cursos.isEmpty())
            return true;
        else
            return false;
    }
    
    public void salvarCurso(Curso curso) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("cursos.txt", true));

            writer.write(curso.getNumDiscObg() + ", " + curso.getNumDiscOpc() + ", " 
                    + curso.getAluno() + ", " + curso.getProfessor());
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
                    cursos.get(pos).setAluno(aluno);
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
                    cursos.get(pos).setProfessor(prof);
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
