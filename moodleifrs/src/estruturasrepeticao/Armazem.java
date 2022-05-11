package estruturasrepeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Armazem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double total = 0;

        System.out.println("Digite a quantidade de produtos vendidos: ");
        int qtdProdutos = scan.nextInt();

        List<ArmazemProduto> produtos = new ArrayList<>();

        for (int i = 0; i < qtdProdutos; i++) {
            System.out.println("Digite o nome do " + (i+1) + "o produto: ");
            String nome = scan.next();

            System.out.println("Digite o valor em reais de " + nome + ": ");
            double preco = scan.nextDouble();

            System.out.println("Digite a quantidade de " + nome + ": ");
            int qtd = scan.nextInt();

            produtos.add(new ArmazemProduto(nome, preco, qtd));
        }

        for (ArmazemProduto produto : produtos) {
            System.out.println("Produto: " + produto);
            System.out.printf("Valor total vendido de %s: R$%.2f\n", produto.nome, (produto.preco * produto.qtd));
            total += produto.preco * produto.qtd;
        }
        System.out.printf("Total vendido: R$ %.2f", total);
        scan.close();
    }

}
