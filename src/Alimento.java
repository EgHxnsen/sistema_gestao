public class Alimento extends Produto {

    public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        return preco - (preco * (porcentagem / 100) * 0.9); // Desconto adicional de 10%
    }
}