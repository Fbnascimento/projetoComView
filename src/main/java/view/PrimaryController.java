package view;

import control.CadastroDeUsuario;
import data.IRepositorioDeUsuarios;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.Funcionario;
import model.Usuario;

public class PrimaryController {

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtSenha;

    private Usuario usuarioMaster = new Funcionario("Anderson", "Ataide", "04723649441", "persel", "Persel00", 1);

    public PrimaryController() {

    }

    @FXML
    private void switchToSecondary() throws IOException {

        if (txtLogin.getText().equals(usuarioMaster.getLogin().getLogin()) && txtSenha.getText().equals(usuarioMaster.getLogin().getSenha())) {
            App.setRoot("TelaPrincipal");
        } else {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Dados Incorretos");
            alerta.setHeaderText("Login ou Senha Incorreto");
            alerta.setResizable(false);
            alerta.show();
        }

    }

}
