package entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {
    private static Connection conexao = null;
    
    public static Connection getConexao() throws SQLException{
        if((conexao == null) || (conexao.isClosed()))
            conexao = fabricaDeConexoes();
        
        return conexao;
    }
    
    public static Connection fabricaDeConexoes() {
        try {
            Class.forName("org.postgresql.Driver");
            
            Properties prop = new Properties();
            prop.put("user", "postgres");
            prop.put("password", "vortex");
            prop.put("charset", "UTF-8");
            prop.put("lc_ctype", "ISO8859_1");
            
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/bd-unifed", prop);
        } catch (Exception e) {
        }
        
        return null;
    }
}
