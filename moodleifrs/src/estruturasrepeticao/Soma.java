package estruturasrepeticao;

import java.util.Scanner;

public class Soma {

    public static void main (String[] args){

        System.out.println("Digite 10 valores para somar: ");

        Scanner scan = new Scanner(System.in);

        int i = 0;
        double soma = 0;

        while (i < 10){
            double valores = scan.nextDouble();
            soma += valores;
            i++;
        }

        System.out.println(soma);

        scan.close();
    }

}
