//Construa um programa que leia três valores numéricos (representados pelas variáveis A, B e C)
// e faça o cálculo do delta de uma equação de segundo grau, segundo a fórmula de Báskara.
// O programa deve mostrar quantas raízes reais a equação possui (delta < 0 – mostrar uma
// mensagem dizendo que a equação não possui raízes reais, delta > 0 – mostrar que possui duas
// raízes reais, delta = 0 – mostrar que possui uma única raiz real).

package estruturasdecisao;

import java.util.Scanner;

public class Delta {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os valores de A, B e C: ");

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais");
        } else if (delta > 0) {
            System.out.println("Possui duas raízes reais");
        } else {
            System.out.println("Possui uma única raíz real");
        }
        scan.close();
    }
}
