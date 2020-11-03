package control;

import model.Produto;

public interface IControladorProduto {

    void editarProduto(int codigo, String nome, String tipo, double precoCompra, double precoVenda);

    void comprarProduto(int codigo, double quantidade);

    Produto procurarProduto(int codigo);

    void cadastrarProduto(Produto p);

    void removerProduto(int codigo);

    String listarProdutos();

    Produto listarProdutosView();
}
