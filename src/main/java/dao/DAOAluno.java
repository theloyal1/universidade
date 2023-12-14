package dao;

import entidades.Aluno;
import entidades.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOAluno {
    
    public DAOAluno() {
    }
    
    public void cadastrar(Aluno aluno) {
        String sql = "INSERT INTO aluno (cpf, nome, email, endereco, telefone, num_matriculas, "
                + "num_conclusoes, num_dependencias, data_matricula)";
        PreparedStatement ps = null;
        
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, aluno.getCpf());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getEmail());
            ps.setString(4, aluno.getEndereco());
            ps.setString(5, aluno.getTelefone());
            ps.setInt(6, aluno.getNumMatriculas());
            ps.setInt(7, aluno.getNumConclusoes());
            ps.setInt(8, aluno.getNumDiscDep());
            ps.setString(9, aluno.getDataMatricula().toString());
            
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
