package estruturascontrole;

import java.util.Scanner;

public class SomaEMedia  {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de números que deseja somar: ");

        int qtdNumeros = scan.nextInt();
        int soma = 0;
        double somaQuad = 0;
        double media = 0;
        int cont = 0;

        for(int i = 0; i < qtdNumeros; i++, cont = i){
            System.out.println("Digite o " + (i+1) + "o número para somar: ");
            int num = scan.nextInt();
            soma += num;
            somaQuad += Math.pow(num, 2);
        }

        media = soma / (double) cont;
        System.out.println("Soma: " + soma);
        System.out.println("Soma dos quadrados: " + somaQuad);
        System.out.printf("Média: %.2f", media);

        scan.close();
    }

}
