package estruturasrepeticao;

public class ArmazemProduto {

    String nome;
    double preco;
    int qtd;

    public ArmazemProduto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Produto= " + nome + ", Preço= R$" + preco + ", Qtd= " + qtd ;
    }
}
