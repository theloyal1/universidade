package ficharios;

import entidades.Conexao;
import entidades.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FichaCurso {
    private ArrayList<Curso> cursos = new ArrayList<>();
    private Connection conexao = null;
    
    public FichaCurso() {
        try {
            conexao = Conexao.getConexao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void cadastrar(Curso c) {
        cursos.add(c);
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "INSERT INTO curso (nome, num_disc_obg, num_disc_opc) VALUES (?, ?, ?)";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(0, proximoCodigo());
            ps.setString(1, c.getNome());
            ps.setInt(2, c.getNumDiscObg());
            ps.setInt(3, c.getNumDiscOpc());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void excluir(Curso c, int pos) {
        cursos.remove(pos);
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "DELETE FROM curso WHERE codigo = ?";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(0, c.getCodigo());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void alterar(Curso c, int pos) {
        cursos.get(pos).setNome(c.getNome());
        cursos.get(pos).setNumDiscObg(c.getNumDiscObg());
        cursos.get(pos).setNumDiscOpc(c.getNumDiscOpc());
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "UPDATE curso SET nome = ?, num_disc_obg = ?, num_disc_opc ?";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setInt(2, c.getNumDiscObg());
            ps.setInt(3, c.getNumDiscOpc());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
        
    }
    
    public Curso consultar(int pos) {
        return cursos.get(pos);
    }
    
    public ArrayList<Curso> relatorio() {
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean umaVez = true;
        
        sql = "SELECT * FROM curso";
        
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
        
        return cursos;
    }
    
    public boolean isEmpty() {
        if(cursos.isEmpty())
            return true;
        else
            return false;
    }
    
    private int proximoCodigo() {
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int codigo = -1;
        
        sql = "SELECT MAX(codigo) FROM aluno";
        
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
