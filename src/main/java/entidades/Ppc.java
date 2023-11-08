package entidades;

import java.util.ArrayList;

public class Ppc {
    private Curso curso;
    private ArrayList<Materia> materias;
    private int anoInicio;

    public Ppc() {
    }

    public Ppc(Curso curso, ArrayList<Materia> materias, int anoInicio) {
        this.curso = curso;
        this.materias = materias;
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

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }
}
