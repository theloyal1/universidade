package ficharios;

import entidades.Aluno;
import entidades.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
            ps.setInt(0, a.getCpf());
            ps.setString(1, a.getNome());
            ps.setString(2, a.getEmail());
            ps.setString(3, a.getEndereco());
            ps.setString(4, a.getTelefone());
            ps.setInt(5, a.getNumMatriculas());
            ps.setInt(6, a.getNumConclusoes());
            ps.setInt(7, a.getNumDiscDep());
            ps.setDate(8, a.getDataMatricula());
            ps.execute();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void excluir(Aluno a, int pos) {
        alunos.remove(pos);
        
        String sql;
        PreparedStatement ps = null;
        
        sql = "DELETE FROM aluno WHERE cpf = ?";
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
    }
    
    public Aluno consultar(int pos) {
        return alunos.get(pos);
    }
    
    public ArrayList<Aluno> relatorio() {
        return alunos;
    }
    
    public boolean isEmpty() {
        if(alunos.isEmpty())
            return true;
        else
            return false;
    }
}
