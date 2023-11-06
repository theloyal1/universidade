package ficharios;

import entidades.Usuario;
import java.io.*;
import java.util.ArrayList;

public class CadastroUsuario {
    
    ArrayList<Usuario> users = new ArrayList<>();
    
    public CadastroUsuario() {
    }
    
    public static void salvarUsuario(Usuario usuario) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true));

            writer.write(usuario.getEmail()+ "," + usuario.getSenha());
            writer.newLine();

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
