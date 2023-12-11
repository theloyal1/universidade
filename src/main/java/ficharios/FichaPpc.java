package ficharios;

import entidades.Conexao;
import entidades.Ppc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FichaPpc {
    private ArrayList<Ppc> ppcs = new ArrayList<>();
    private Connection conexao = null;

    public FichaPpc() {
        try {
            conexao = Conexao.getConexao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void cadastrar(Ppc p) {
        ppcs.add(p);
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "INSERT INTO ppc (codigo, curso, materias, ano_inicio) VALUES (?, ?, ?, ?)";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(0, proximoCodigo());
            ps.setString(1, p.getCurso().toString());
            ps.setString(2, p.getMaterias().toString());
            ps.setInt(3, p.getAnoInicio());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void excluir(Ppc p, int pos) {
        ppcs.remove(pos);
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "DELETE FROM ppc WHERE codigo = ?";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(0, p.getCodigo());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void alterar(Ppc p, int pos) {
        ppcs.get(pos).setCurso(p.getCurso());
        ppcs.get(pos).setAnoInicio(p.getAnoInicio());
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "UPDATE ppc SET curso = ?, ano_inicio = ?";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, p.getCurso().toString());
            ps.setString(2, p.getMaterias().toString());
            ps.setInt(3, p.getAnoInicio());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public Ppc consultar(int pos) {
        return ppcs.get(pos);
    }
    
    public ArrayList<Ppc> relatorio() {
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean umaVez = true;
        
        sql = "SELECT * FROM ppc";
        
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
        
        return ppcs;
    }
    
    public boolean isEmpty() {
        if(ppcs.isEmpty())
            return true;
        else
            return false;
    }
    
    private int proximoCodigo() {
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int codigo = -1;
        
        sql = "SELECT MAX(codigo) FROM ppc";
        
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
