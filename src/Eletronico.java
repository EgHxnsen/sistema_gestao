public class Eletronico extends Produto {

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        return preco - (preco * (porcentagem / 100));
    }
}