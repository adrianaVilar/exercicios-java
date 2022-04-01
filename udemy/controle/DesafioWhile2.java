package controle;

import java.util.Scanner;
import java.util.Locale;

public class DesafioWhile2 {
    public static void main(String[] args) {
 /*       System.out.println("Digite as notas dos alunos e -1 para finalizar: ");

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        double nota = 0;
        int quantidadeNotas = 0;
        double total = 0;

        while (nota != -1) {
            nota = scan.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeNotas++;
            } else if (nota != -1) {
                System.out.println("Nota inválida.");
            }
        }

        double media = total / quantidadeNotas;
        System.out.println("Número de notas digitadas:" + quantidadeNotas);
        System.out.println(" Média: " + media);

        scan.close();*/

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        int quantidadeNota = 0;
        double nota = 0;
        double total = 0;

        System.out.println("Digite as notas para calcular a média e -1 para finalizar. ");

        while (nota != -1) {
            nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) {
                total += nota;
                quantidadeNota++;

            }    else if (nota != -1) {
                    System.out.println("Digite uma nota válida.");
                }

        }
        System.out.println("O número de notas digitadas foi: " + quantidadeNota);

        double media = total / quantidadeNota;

        System.out.println("\nA média é: " + media);
    }
}
