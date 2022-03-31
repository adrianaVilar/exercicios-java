package controle;

import java.util.Scanner;

public class DesafioDiasDaSemana {
    public static void main(String[] args) {
        System.out.println("Digite um dia da semana para descobrir o seu número correspondente: ");

        Scanner scan = new Scanner(System.in);

        String dia = scan.next();

        if ("domingo".equalsIgnoreCase(dia)) {
            System.out.println("1");
        } else if ("segunda".equalsIgnoreCase(dia)) {
            System.out.println("2");
        } else if ("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
            System.out.println("3");
        } else if ("quarta".equalsIgnoreCase(dia)) {
            System.out.println("4");
        } else if ("quinta".equalsIgnoreCase(dia)) {
            System.out.println("5");
        } else if ("sexta".equalsIgnoreCase(dia)) {
            System.out.println("6");
        } else if ("sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)) {
            System.out.println("7");
        } else {
            System.out.println("Digite um dia válido.");
        }
        System.out.println("Fim.");

        scan.close();
    }
}
