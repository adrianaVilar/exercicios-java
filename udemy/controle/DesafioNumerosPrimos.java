package controle;

import java.util.Scanner;

public class DesafioNumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Digite o número que deseja verificar se é primo: ");

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        int contadorDeDivisores = 0;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contadorDeDivisores++;
            }
        }

        if (contadorDeDivisores == 0) {
            System.out.println("\nO numero " + numero + " é primo.");
        } else {
            System.out.println("\nO numero " + numero + " não é primo.");
        }
        scan.close();
    }
}