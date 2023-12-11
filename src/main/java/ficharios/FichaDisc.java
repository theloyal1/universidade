package ficharios;

import entidades.Conexao;
import entidades.Disciplina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FichaDisc {
    private ArrayList<Disciplina> disc = new ArrayList<>();
    private Connection conexao = null;

    public FichaDisc() {
        try {
            conexao = Conexao.getConexao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void cadastrar(Disciplina d) {
        disc.add(d);
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "INSERT INTO disciplina (codigo, nome, aluno, professor, materia, nota, ano, "
                + "semestre, frequencia, aprovacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(0, proximoCodigo());
            ps.setString(1, d.getNome());
            ps.setString(2, d.getAluno().toString());
            ps.setString(3, d.getProfessor().toString());
            ps.setString(4, d.getMateria().toString());
            ps.setFloat(5, d.getNota());
            ps.setInt(6, d.getAno());
            ps.setInt(7, d.getSemestre());
            ps.setFloat(8, d.getFrequencia());
            ps.setBoolean(9, d.isAprovacao());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void excluir(Disciplina d, int pos) {
        disc.remove(pos);
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "DELETE FROM disciplina WHERE codigo = ?";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(0, d.getCodigo());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void alterar(Disciplina d, int pos) {
        disc.get(pos).setNome(d.getNome());
        disc.get(pos).setAluno(d.getAluno());
        disc.get(pos).setProfessor(d.getProfessor());
        disc.get(pos).setMateria(d.getMateria());
        disc.get(pos).setNota(d.getNota());
        disc.get(pos).setAno(d.getAno());
        disc.get(pos).setSemestre(d.getSemestre());
        disc.get(pos).setFrequencia(d.getFrequencia());
        disc.get(pos).setAprovacao(d.isAprovacao());
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "UPDATE disciplina SET nome = ?, aluno = ?, professor = ?, materia = ?, nota = ?, "
                + "ano = ?, semestre = ?, frequencia = ?, aprovacao = ?";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, d.getNome());
            ps.setString(2, d.getAluno().toString());
            ps.setString(3, d.getProfessor().toString());
            ps.setString(4, d.getMateria().toString());
            ps.setFloat(5, d.getNota());
            ps.setInt(6, d.getAno());
            ps.setInt(7, d.getSemestre());
            ps.setFloat(8, d.getFrequencia());
            ps.setBoolean(9, d.isAprovacao());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
        
    }
    
    public Disciplina consultar(int pos) {
        return disc.get(pos);
    }
    
    public ArrayList<Disciplina> relatorio() {
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean umaVez = true;
        
        sql = "SELECT * FROM disciplina";
        
        try {
            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                if(umaVez)
                    umaVez = false;
            }
            
            ps.close();
            rs.close();
        } catch (Exception e) {
        }
        
        return disc;
    }
    
    public boolean isEmpty() {
        if(disc.isEmpty())
            return true;
        else
            return false;
    }
    
    private int proximoCodigo() {
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int codigo = -1;
        
        sql = "SELECT MAX(codigo) FROM disciplina";
        
        try {
            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()) {
                codigo = rs.getInt(1);
                codigo++;
            }
            
            ps.close();
        } catch (Exception e) {
        }
        
        return codigo;
    }
}
