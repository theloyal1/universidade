package entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost:3306/bd_unifed";
    
    private static Connection conn;
    
    public static Connection getConexao() {
        try {
            if(conn == null)
                conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
