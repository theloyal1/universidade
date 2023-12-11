package ficharios;

import entidades.Conexao;
import entidades.Departamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FichaDep {

    private ArrayList<Departamento> deps = new ArrayList<>();
    private Connection conexao = null;
    
    public FichaDep() {
        try {
            conexao = Conexao.getConexao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void cadastrar(Departamento d) {
        deps.add(d);
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "INSERT INTO departamento (codigo, nome) VALUES (?, ?)";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(0, proximoCodigo());
            ps.setString(1, d.getNome());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void excluir(Departamento d, int pos) {
        deps.remove(pos);
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "DELETE FROM departamento WHERE codigo = ?";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(0, d.getCodigo());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void alterar(Departamento d, int pos) {
        deps.get(pos).setCodigo(d.getCodigo());
        deps.get(pos).setNome(d.getNome());
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "UPDATE departamento SET nome = ?";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, d.getNome());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public Departamento consultar(int pos) {
        return deps.get(pos);
    }
    
    public ArrayList<Departamento> relatorio() {
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean umaVez = true;
        
        sql = "SELECT * FROM departamento";
        
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
        
        return deps;
    }
    
    public boolean isEmpty() {
        if(deps.isEmpty())
            return true;
        else
            return false;
    }
    
    private int proximoCodigo() {
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int codigo = -1;
        
        sql = "SELECT MAX(codigo) FROM departamento";
        
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
