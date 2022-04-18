package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    public double precoComDesconto(double preco, double desconto) {
        this.preco = preco;
        this.desconto = desconto;
        double descontoTransformado = 1 - desconto;
        return descontoTransformado * preco;
    }

}
