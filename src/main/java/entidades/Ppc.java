package entidades;

import java.util.ArrayList;

public class Ppc {
    private Curso curso;
    private Materia materia;
    private int anoInicio;

    public Ppc() {
    }

    public Ppc(Curso curso, Materia materia, int anoInicio) {
        this.curso = curso;
        this.materia = materia;
        this.anoInicio = anoInicio;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }
}
