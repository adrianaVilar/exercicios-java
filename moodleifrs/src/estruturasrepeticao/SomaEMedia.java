package estruturasrepeticao;

import java.util.Scanner;

public class SomaEMedia {

    public static void main(String[] args) {

        System.out.println("Digite números inteiros para somar e zero ou um número negativo para finalizar: ");

        Scanner scan = new Scanner(System.in);

        int valor = scan.nextInt();
        int soma = 0;
        int somaQuad = 0;
        int i = 0;
        double media = 0;


        while (valor > 0){
            soma += valor;
            somaQuad += Math.pow(valor, 2);
            i++;
            valor = scan.nextInt();
        }
        media = soma / (double) i;


        System.out.printf("Média: %.2f \n", media);
        System.out.println("Somatório dos quadrados: " + somaQuad);
        System.out.println("Somatório: " + soma);
        scan.close();
    }
}
