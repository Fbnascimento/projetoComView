/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author ander
 */
public class TelaPrincipalController implements Initializable {

    @FXML
    private MenuItem menuItemCadastroUsuarios;

    @FXML
    private MenuItem menuItemCadastroProdutos;

    @FXML
    private MenuItem menuItemVendasGerenciarVendas;

    @FXML
    private MenuItem menuItemRelatorioContabil;

    @FXML
    private MenuItem menuItemSobre;

    @FXML
    private AnchorPane anchorPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void handleMenuItemCadastroUsuarios() throws IOException {
        //App.setRoot("cadastroClientes");
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("cadastroClientes.fxml"));
        anchorPane.getChildren().setAll(a);
    }

}
