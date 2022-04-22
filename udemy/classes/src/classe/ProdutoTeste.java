package classe;

public class ProdutoTeste {

   /* public static void main1(String[] args) {
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
    }*/

    public static void main(String [] args) {
        Produto p1 = new Produto();
        p1.nome = "Caneta";
        p1.preco = 7.90;

        System.out.printf("O valor com desconto é: R$%.2f", p1.precoComDesconto());

        Produto p2 = new Produto();
        p2.nome = "Caneca";
        p2.preco = 8.99;
        Produto.desconto = 0.50;
        
        System.out.printf("\nO valor com desconto de natal e do gerente é: R$%.2f", p2.precoComDesconto(0.1));
        System.out.printf("\nO valor com desconto de natal é: R$%.2f", p2.precoComDesconto());
    }
}
