package ficharios;

import entidades.Aluno;
import entidades.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FichaAluno {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Connection conexao = null;
    
    public FichaAluno() {
        try {
            conexao = Conexao.getConexao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void cadastrar(Aluno a) {
        alunos.add(a);
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "INSERT INTO aluno (cpf, nome, email, endereco, telefone, num_matriculas, num_conclusoes, "
                + "num_dependencias, data_matricula) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(0, proximoCodigo());
            ps.setInt(1, a.getCpf());
            ps.setString(2, a.getNome());
            ps.setString(3, a.getEmail());
            ps.setString(4, a.getEndereco());
            ps.setString(5, a.getTelefone());
            ps.setInt(6, a.getNumMatriculas());
            ps.setInt(7, a.getNumConclusoes());
            ps.setInt(8, a.getNumDiscDep());
            ps.setDate(9, a.getDataMatricula());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void excluir(Aluno a, int pos) {
        alunos.remove(pos);
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "DELETE FROM aluno WHERE codigo = ?";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, a.getCodigo());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void alterar(Aluno a, int pos) {
        alunos.get(pos).setCpf(a.getCpf());
        alunos.get(pos).setNome(a.getNome());
        alunos.get(pos).setEmail(a.getEmail());
        alunos.get(pos).setEndereco(a.getEndereco());
        alunos.get(pos).setTelefone(a.getTelefone());
        alunos.get(pos).setNumConclusoes(a.getNumConclusoes());
        alunos.get(pos).setNumMatriculas(a.getNumMatriculas());
        alunos.get(pos).setNumDiscDep(a.getNumDiscDep());
        alunos.get(pos).setDataMatricula(String.valueOf(a.getDataMatricula()));
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "UPDATE aluno SET cpf = ?, nome = ?, email = ?, endereco = ?, telefone = ?, "
                + "num_matriculas = ?, num_conclusoes = ?, num_dependencias = ?, data_matricula = ?";
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, a.getCpf());
            ps.setString(2, a.getNome());
            ps.setString(3, a.getEmail());
            ps.setString(4, a.getEndereco());
            ps.setString(5, a.getTelefone());
            ps.setInt(6, a.getNumMatriculas());
            ps.setInt(7, a.getNumConclusoes());
            ps.setInt(8, a.getNumDiscDep());
            ps.setDate(9, a.getDataMatricula());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public Aluno consultar(int pos) {
        return alunos.get(pos);
    }
    
    public ArrayList<Aluno> relatorio() {
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean umaVez = true;
        
        sql = "SELECT * FROM aluno";
        
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
        
        return alunos;
    }
    
    public boolean isEmpty() {
        if(alunos.isEmpty())
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
