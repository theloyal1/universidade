package ficharios;

import entidades.Conexao;
import entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FichaMat {
    private ArrayList<Materia> mats = new ArrayList<>();
    private Connection conexao = null;

    public FichaMat() {
        try {
            conexao = Conexao.getConexao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void cadastrar(Materia m) {
        mats.add(m);
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "INSERT INTO materia (codigo, nome, ementa, pre_requisitos, carga_horaria) "
                + "VALUES (?, ?, ?, ?, ?)";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(0, proximoCodigo());
            ps.setString(1, m.getNome());
            ps.setString(2, m.getEmenta());
            ps.setString(3, m.getPreRequisitos());
            ps.setInt(4, m.getCargaHoraria());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void excluir(Materia m, int pos) {
        mats.remove(pos);
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "DELETE FROM materia WHERE codigo = ?";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(0, m.getCodigo());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void alterar(Materia m, int pos) {
        mats.get(pos).setNome(m.getNome());
        mats.get(pos).setEmenta(m.getEmenta());
        mats.get(pos).setPreRequisitos(m.getPreRequisitos());
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "UPDATE materia SET nome = ?, ementa = ?, pre_requisitos = ?";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, m.getNome());
            ps.setString(2, m.getEmenta());
            ps.setString(3, m.getPreRequisitos());
            ps.setInt(4, m.getCargaHoraria());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public Materia consultar(int pos) {
        return mats.get(pos);
    }
    
    public ArrayList<Materia> relatorio() {
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean umaVez = true;
        
        sql = "SELECT * FROM materia";
        
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
        
        return mats;
    }
    
    public boolean isEmpty() {
        if(mats.isEmpty())
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
