package entidades;

import java.util.ArrayList;

public class Materia {
    private String nome, ementa, preRequisitos;
    private ArrayList<Professor> professores = new ArrayList<>();
    private int cargaHoraria;

    public Materia() {
    }

    public Materia(String nome, String ementa, String preRequisitos, int cargaHoraria) {
        this.nome = nome;
        this.ementa = ementa;
        this.preRequisitos = preRequisitos;
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

    public ArrayList<Professor> getProfs() {
        return professores;
    }

    public void setListaProfs(ArrayList<Professor> professores) {
        this.professores = professores;
    }
    
    public void setProf(Professor professor) {
        this.professores.add(professor);
    }
    
    public void removeProf(Professor professor) {
        this.professores.remove(professor);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public String toString() {
        return nome;
    }
}
