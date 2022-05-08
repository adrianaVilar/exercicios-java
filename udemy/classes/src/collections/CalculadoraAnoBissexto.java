package collections;

import java.util.Scanner;

public class CalculadoraAnoBissexto {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite que ano deseja verificar se é ou não bissexto: ");

        int ano = scan.nextInt();

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("O ano é bissexto.");
        } else {
            System.out.println("O ano não é bissexto.");
        }
        scan.close();
    }
}

