import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque(new ArrayList<>());

        Produto eletronico1 = new Eletronico("Smartphone", 1500.00);
        Produto alimento1 = new Alimento("Arroz", 20.00);

        estoque.adicionarProduto(eletronico1);
        estoque.adicionarProduto(alimento1);

        estoque.exibirPrecosComDesconto(10.0); // Exibir preços com 10% de desconto
    }
}