package controle;

import java.util.Scanner;

public class DesafioNumerosPrimosComSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que gostaria de consultar se é primo: ");

        int numero = scan.nextInt();
        int contadorDeDivisores = 0;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contadorDeDivisores++;
            }
        }

        switch (contadorDeDivisores) {
            case 0:
                System.out.println("É primo.");
                break;
            default:
                System.out.println("Não é primo.");
        }
        scan.close();
    }
}
