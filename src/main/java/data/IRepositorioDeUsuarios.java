package data;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public interface IRepositorioDeUsuarios {

    void incluirUsuario(Usuario user);

    void procurarUsuario(String cpf);

    void excluirUsuario(String cpf);

    ArrayList<Usuario> listarUsuarios();

    boolean editarUsuario(String nome, String sobrenome, String cpf, int telefone);
}
