package estruturasdecisao;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as três notas: ");

        double n1 = scan.nextDouble() * 2 / 10;
        double n2 = scan.nextDouble() * 3 / 10;
        double n3 = scan.nextDouble() * 5 / 10;
        double media = n1 + n2 + n3;

        if (media <= 10 && media >= 8) {
            System.out.println("A");
        } else if (media < 8 && media >= 7) {
            System.out.println("B");
        } else if (media < 7 && media >= 6) {
            System.out.println("C");
        } else if (media < 6 && media >= 5) {
            System.out.println("D");
        } else if (media < 5 && media >= 0) {
            System.out.println("E");
        }
        scan.close();
    }

}
