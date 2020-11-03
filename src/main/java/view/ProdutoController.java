package view.gui;

import control.ControladorProduto;
import data.IRepositorioProduto;
import java.net.URL;
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
import model.Produto;

public class ProdutoController implements Initializable {

    @FXML
    private TableView<Produto> tabelaProduto;

    @FXML
    private TableColumn<Produto, Integer> tabelaColunaCodigo;

    @FXML
    private TableColumn<Produto, String> tabelaColunaNome;

    @FXML
    private Label labelProdutoCodigo;

    @FXML
    private Label labelProdutoNome;

    @FXML
    private Label labelProdutoTipo;

    @FXML
    private Label labelProdutoQuantidade;

    @FXML
    private Label labelProdutoPrecoCompra;

    @FXML
    private Label labelProdutoPrecoVenda;

    @FXML
    private Button botaoNovo;

    @FXML
    private Button botaoEditar;

    @FXML
    private Button botaoRemover;

    @FXML
    private Button botaoSalvar;

    @FXML
    private Button botaoVoltar;

    private List<Produto> listaProdutos;

    private ObservableList<Produto> observableListProdutos;

    private IRepositorioProduto repositorioProduto;
    private ControladorProduto controladorProduto = new ControladorProduto(repositorioProduto);

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarTabelaProduto();
    }

    public void carregarTabelaProduto() {
        tabelaColunaCodigo.setCellValueFactory(new PropertyValueFactory<>("CODIGO"));
        tabelaColunaNome.setCellValueFactory(new PropertyValueFactory<>("NOME"));

        Produto arroz = new Produto(1, "Arroz", "Integral");
        System.out.println(arroz);

        observableListProdutos = FXCollections.observableArrayList(controladorProduto.listarProdutosView());
        tabelaProduto.setItems(observableListProdutos);
    }
}
