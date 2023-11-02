package ficharios;

import entidades.Usuario;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CadastroUsuario {
    
    ArrayList<Usuario> users = new ArrayList<>();
    
    public CadastroUsuario() {
    }
    
    public static void salvarUsuarios() {
        List<String> usuarios = new ArrayList<>();

        // 1. Ler o arquivo .txt existente para carregar os dados dos usuários
        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                usuarios.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Verificar se o novo usuário já existe
        String novoUsuario = "NovoUsuario";
        if (!usuarios.contains(novoUsuario)) {
            // 3. Adicione o novo usuário à lista
            usuarios.add(novoUsuario);
            System.out.println("Novo usuário adicionado: " + novoUsuario);
        } else {
            System.out.println("Usuário já existe: " + novoUsuario);
        }

        // 4. Salvar os dados de volta no arquivo .txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("usuarios.txt"))) {
            for (String usuario : usuarios) {
                bw.write(usuario);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
