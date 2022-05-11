package estruturascontrole;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que deseja somar: ");
        int qtd = scan.nextInt();
        double total = 0;

        for(int i = 0; i < qtd; i++){
            System.out.println("Digite o " + (i + 1) + "o número: ");
            double num = scan.nextDouble();
            total += num;
        }

        System.out.printf("O total é: %.2f ", total);
        scan.close();
    }
}
