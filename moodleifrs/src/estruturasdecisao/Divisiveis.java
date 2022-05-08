//Desenvolva um programa que leia quatro valores numéricos inteiros e mostre os valores que são divisíveis por 2 e 3.

package estruturasdecisao;

import java.util.Scanner;

public class Divisiveis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quatro valores inteiros: ");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        if(a %2 == 0 && a %3 == 0){
            System.out.println(a);
        }

        if(b %2 == 0 && b %3 == 0){
            System.out.println(b);
        }

        if(c %2 == 0 && c %3 == 0){
            System.out.println(c);
        }

        if(d %2 == 0 && d %3 == 0){
            System.out.println(d);
        }
        scan.close();
    }
}
