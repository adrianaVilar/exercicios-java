package classe;

public class ProdutoTeste {

    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.75;

        var p2 = new Produto();

        p2.nome = "Celular";
        p2.preco = 1850.99;
        p2.desconto = 0.90;

        double precoFinalNotebook = p1.preco * p1.desconto;
        double precoFinalCelular = p2.preco * p2.desconto;

        System.out.printf("O valor do notebook com desconto é: R$%.2f.", precoFinalNotebook);
        System.out.printf("\nO valor do celular com desconto é: R$%.2f.", precoFinalCelular);
    }
}
