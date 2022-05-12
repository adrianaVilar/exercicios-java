package ferramentas;

import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        double a = scan.nextDouble();
        System.out.println("Digite o valor de B:");
        double b = scan.nextDouble();
        System.out.println("Digite o valor de C:");
        double c = scan.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double raizDeDelta = Math.sqrt(delta);
        double x1 = (-b + raizDeDelta) / (2 * a);
        double x2 = (-b - raizDeDelta) / (2 * a);

        System.out.println(delta);
        System.out.println("x' = " + x1);
        System.out.println("x'' = " + x2);

        scan.close();
    }

}
