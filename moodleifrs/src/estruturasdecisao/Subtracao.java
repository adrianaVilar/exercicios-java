//Faça um programa que leia dois valores numéricos inteiros
// e apresente o resultado da diferença do maior valor pelo menor valor.
// Se os valores forem iguais, o programa deve mostrar zero.

package estruturasdecisao;

import java.util.Scanner;

public class Subtracao {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();

        if(num1 > num2){
            System.out.println("O primeiro menos o segundo número é: " + (num1 - num2));
        } else if(num2 > num1){
            System.out.println("O segundo menos o primeiro número é: " + (num2 - num1));
        }else {
            System.out.println("0");
        }

        scan.close();

    }

}
