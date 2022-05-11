package estruturasrepeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Armazem {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade total de produtos vendidos: ");

        List<Object> produtos = new ArrayList<>();

        produtos.add(new ArmazemProduto("Arroz", 2.99, 10));


        scan.close();
    }

}
