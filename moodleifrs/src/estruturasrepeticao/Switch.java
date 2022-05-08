package estruturasrepeticao;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] data = new int[3];

        System.out.println("Digite um dia: ");
        int dia = scan.nextInt();
        System.out.println("Digite um mês: ");
        int mes = scan.nextInt();
        System.out.println("Digite um ano: ");
        int ano = scan.nextInt();

     /*   switch (data){

            case dia:
                System.out.print("O dia digitado foi " + dia + "de ");

            case mes:
                System.out.print(mes + " de ");

            case ano:
                System.out.print(ano + ".");

                break;
        }*/

    }

}
