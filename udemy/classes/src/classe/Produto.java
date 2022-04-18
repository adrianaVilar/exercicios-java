package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    public double precoComDesconto() {
        double descontoTransformado = 1 - desconto;
        return descontoTransformado * preco;
    }

}
