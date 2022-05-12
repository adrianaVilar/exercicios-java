package estruturascontrole;

import java.util.Scanner;

public class MenuDeOpcoes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Menu de opções:\n1.Somar dois números.\n2.Número ao quadrado.\n\nDigite a opção desejada:");

        int opcao = scan.nextInt();

        switch (opcao){
            case 1 -> {
                System.out.println("Digite o primeiro número para somar: ");
                double n1 = scan.nextDouble();
                System.out.println("Digite o segundo número para somar: ");
                double n2 = scan.nextDouble();
                System.out.printf("%.2f + %.2f = %.2f.", n1, n2, n1+n2);
            }
            case 2 -> {
                System.out.println("Digite o número para calcular seu quadrado:");
                double n = scan.nextDouble();
                System.out.printf("%.2f ^ 2 = %.2f", n, Math.pow(n,2));
            }
            default -> System.out.print("Digite um número válido.");
        }

        scan.close();
    }

}
