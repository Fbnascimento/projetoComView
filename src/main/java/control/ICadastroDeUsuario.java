package control;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public interface ICadastroDeUsuario {

    void incluirUsuario(Usuario user);

    void procurarUsuario(String cpf);

    void excluirUsuario(String cpf);

    ArrayList<Usuario> listarUsuarios();

    boolean editarUsuario(String nome, String sobrenome, String cpf, int telefone);
}
