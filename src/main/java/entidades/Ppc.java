package entidades;

import java.util.ArrayList;

public class Ppc {
    private Curso curso;
    private ArrayList<Materia> materias = new ArrayList<>();
    private int anoInicio;

    public Ppc() {
    }

    public Ppc(Curso curso, int anoInicio) {
        this.curso = curso;
        this.anoInicio = anoInicio;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setListaMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    
    public void setMateria(Materia m) {
        this.materias.add(m);
    }
    
    public void removeMateria(Materia m) {
        this.materias.remove(m);
    }
    
    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }
}
