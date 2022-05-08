//Faça um programa que leia três valores numéricos inteiros, identifique e apresente o menor valor informado.

package estruturasdecisao;

import java.util.Scanner;

public class MenorValor {

    public static void main(String[] args) {

        System.out.println("Digite os valores de A, B e C: ");

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < c && b < a) {
            System.out.println(b);
        } else if (c < a && c < b) {
            System.out.println(c);
        } else if (a == b && a == c) {
            System.out.println("Os valores são iguais");
        }
        scan.close();
    }
}
