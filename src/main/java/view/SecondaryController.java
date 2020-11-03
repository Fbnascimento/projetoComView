package view;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import view.PrimaryController;

public class SecondaryController {

    @FXML
    private MenuItem btCadastroDeUsuario() throws IOException {
        App.setRoot("TelaPrincipal");
        return null;
    }

}
