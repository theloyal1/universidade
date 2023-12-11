package ficharios;

import entidades.Conexao;
import entidades.Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FichaProf {
    private ArrayList<Professor> profs = new ArrayList<>();
    private Connection conexao = null;

    public FichaProf() {
        try {
            conexao = Conexao.getConexao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void cadastrar(Professor p) {
        profs.add(p);
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "INSERT INTO professor (codigo, cpf, nome, email, endereco, telefone, especializacao) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(0, proximoCodigo());
            ps.setString(1, p.getCpf());
            ps.setString(2, p.getNome());
            ps.setString(3, p.getEmail());
            ps.setString(4, p.getEndereco());
            ps.setString(5, p.getTelefone());
            ps.setString(6, p.getEspecializacao());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void excluir(Professor p, int pos) {
        profs.remove(pos);
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "DELETE FROM professor WHERE codigo = ?";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(0, p.getCodigo());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void alterar(Professor p, int pos) {
        profs.get(pos).setCpf(p.getCpf());
        profs.get(pos).setNome(p.getNome());
        profs.get(pos).setEmail(p.getEmail());
        profs.get(pos).setEndereco(p.getEndereco());
        profs.get(pos).setTelefone(p.getTelefone());
        profs.get(pos).setEspecializacao(p.getEspecializacao());
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "UPDATE professor SET cpf = ?, nome = ?, email = ?, endereco = ?, telefone = ?, "
                + "especializacao = ?";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, p.getCpf());
            ps.setString(2, p.getNome());
            ps.setString(3, p.getEmail());
            ps.setString(4, p.getEndereco());
            ps.setString(5, p.getTelefone());
            ps.setString(6, p.getEspecializacao());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public Professor consultar(int pos) {
        return profs.get(pos);
    }
    
    public ArrayList<Professor> relatorio() {
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean umaVez = true;
        
        sql = "SELECT * FROM professor";
        
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
        
        return profs;
    }
    
    public boolean isEmpty() {
        if(profs.isEmpty())
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
