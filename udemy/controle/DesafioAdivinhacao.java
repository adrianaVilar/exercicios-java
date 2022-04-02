package controle;

import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhacao {
    public static void main(String[] args) {

        System.out.println("Tente adivinhar o número gerado!");


        Random num = new Random();
        int contadorTentativas = 0;
        int numeroGerado = num.nextInt(100);

        while (contadorTentativas < 10) {

            System.out.println("Digite um número de 0 até 100: ");

            Scanner scan = new Scanner(System.in);
            int tentativa = scan.nextInt();

            if (tentativa == numeroGerado) {
                System.out.println("Você acertou!");
                break;

            } else if (tentativa > numeroGerado) {
                System.out.println("Você digitou um número maior.");

            } else if (tentativa < numeroGerado) {
                System.out.println("Você digitou um número menor.");

            }
            contadorTentativas++;
            int chances = 10 - contadorTentativas;
            System.out.println("Você já tentou " + contadorTentativas + " vezes. Você possui mais "
                    + chances + " chances.");

           // scan.close();
        }

    }
}
