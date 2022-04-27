package Array;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrayForeach {

    public static void main (String[] args){

        System.out.println("Digite a quantidade de notas para calcular a média: ");
        Scanner scan = new Scanner(System.in);
        int qtdDeNotas = scan.nextInt();

        double[] notas = new double[qtdDeNotas];

        for(int i = 0; i < qtdDeNotas; i++){
            System.out.println("Digite a nota " + (i+1) + ":");
            notas[i] = scan.nextDouble();
        }


        double soma = 0;
        for(double nota: notas){
           soma += nota;
        }

        double media = soma/qtdDeNotas;
        System.out.println("Notas digitadas: " + Arrays.toString(notas));
        System.out.printf("\nA média é: %.2f", media);

    }
}
