package ficharios;

import entidades.Usuario;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CadastroUsuario {
    
    ArrayList<Usuario> users = new ArrayList<>();
    Iterator i = users.iterator();
    
    public CadastroUsuario() {
    }
    
    public static boolean usuarioJaCadastrado(Usuario usuario, String arquivo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String linha;

            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(",");
                if (campos.length >= 3) {
                    String emailArquivo = campos[0];
                    String senhaArquivo = campos[1];

                    if (emailArquivo.equals(usuario.getEmail()) &&
                        senhaArquivo.equals(usuario.getSenha())) {
                        reader.close();
                        return true; // O usuário já está cadastrado
                    }
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false; // O usuário não está cadastrado
    }

    public static boolean salvarUsuario(Usuario usuario, String arquivo) {
        if (!usuarioJaCadastrado(usuario, arquivo)) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true));

                writer.write(usuario.getEmail()+ "," + usuario.getSenha());
                writer.newLine();

                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        // Preencha os dados do usuário a partir do formulário

        String arquivo = "usuarios.txt";
        salvarUsuario(usuario, arquivo);
    }
}
