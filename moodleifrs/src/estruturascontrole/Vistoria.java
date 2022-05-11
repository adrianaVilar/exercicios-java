package estruturascontrole;

import java.util.Scanner;

public class Vistoria {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a placa do carro: ");
        int placa = scan.nextInt();

        int fimDaPlaca = placa % 10;

        switch (fimDaPlaca) {
            case 0 -> System.out.println("Janeiro do próximo ano.");
            case 1 -> System.out.println("Fevereiro do próximmo ano.");
            case 2 -> System.out.println("Março do próximo ano.");
            case 3 -> System.out.println("Abril do próximo ano.");
            case 4 -> System.out.println("Maio do próximo ano.");
            case 5 -> System.out.println("Junho do próximo ano.");
            case 6 -> System.out.println("Setembro deste ano.");
            case 7 -> System.out.println("Outubro deste ano.");
            case 8 -> System.out.println("Novembro deste ano.");
            case 9 -> System.out.println("Dezembro deste ano.");
        }
    }
}
