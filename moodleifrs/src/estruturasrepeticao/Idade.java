package estruturasrepeticao;

import java.util.Scanner;

public class Idade {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as idades para fazer a média ou zero para sair.");

        int soma = 0;
        int i = 0;
        double media = 0;
        int idade = scan.nextInt();

        while (idade > 0) {
            soma += idade;
            i++;
            idade = scan.nextInt();
        }

        media = soma / (double) i;
        System.out.println("Média das idades: " + media + "anos");

        scan.close();
    }

}
