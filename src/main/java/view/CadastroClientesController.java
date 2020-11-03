/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.CadastroDeUsuario;
import data.IRepositorioDeUsuarios;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Funcionario;
import model.Usuario;

/**
 * FXML Controller class
 *
 * @author ander
 */
public class CadastroClientesController implements Initializable {

    @FXML
    private TableView<Usuario> tableViewUsuarios;

    @FXML
    private TableColumn<Usuario, String> tableColumnUsuarioNome;

    @FXML
    private TableColumn<Usuario, String> tableColumnUsuarioCPF;

    @FXML
    private Label labelUsuarioCPF;

    @FXML
    private Label labelUsuarioNome;

    @FXML
    private Label labelUsuarioTelefone;

    @FXML
    private Label labelUsuarioMatricula;

    @FXML
    private Button buttonInserir;

    @FXML
    private Button buttonEditar;

    @FXML
    private Button buttonDeletar;

    @FXML
    private ObservableList<Usuario> observableListUsuarios;
    @FXML
    private IRepositorioDeUsuarios repositorioDeUsuarios;
    @FXML
    public CadastroDeUsuario novoCadastroDeUsuario = new CadastroDeUsuario(repositorioDeUsuarios);

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        carregarTableViewClientes();
    }

    @FXML
    public void carregarTableViewClientes() {
        novoCadastroDeUsuario.incluirUsuario(new Funcionario("Anderson", "Ataide", "04723649441", "persel", "Persel00", 123));

        tableColumnUsuarioNome.setCellValueFactory(new PropertyValueFactory<>("Nome"));
        tableColumnUsuarioCPF.setCellValueFactory(new PropertyValueFactory<>("CPF"));

        observableListUsuarios = FXCollections.observableArrayList(novoCadastroDeUsuario.listarUsuarios());
        tableViewUsuarios.setItems(observableListUsuarios);
    }

}
