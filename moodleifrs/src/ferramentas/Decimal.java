package ferramentas;

import java.util.Scanner;

public class Decimal {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em binário que deseja transformar:");
        String valorBinario = scan.next();

        int valorDecimal = Integer.parseInt(valorBinario, 2);

        System.out.printf("O valor %s em decimal é %d.", valorBinario, valorDecimal);

    }

}
