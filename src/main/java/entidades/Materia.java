package entidades;

import java.util.ArrayList;

public class Materia {
    private String nome, ementa, preRequisitos;
    private ArrayList<Professor> professores;
    private int cargaHoraria;

    public Materia() {
    }

    public Materia(String nome, String ementa, String preRequisitos, ArrayList<Professor> professores, int cargaHoraria) {
        this.nome = nome;
        this.ementa = ementa;
        this.preRequisitos = preRequisitos;
        this.professores = professores;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getPreRequisitos() {
        return preRequisitos;
    }

    public void setPreRequisitos(String preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
