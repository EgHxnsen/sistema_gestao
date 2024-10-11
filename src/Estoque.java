import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void exibirPrecosComDesconto(double porcentagem) {
        for (Produto produto : produtos) {
            double precoComDesconto = produto.calcularDesconto(porcentagem);
            System.out.println(produto.getNome() + ": " + precoComDesconto);
        }
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }
}