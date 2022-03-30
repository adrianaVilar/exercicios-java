package desafio.temperatura;

import java.util.Scanner;

public class ConversorCelsiusFarenheint {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scan.nextDouble();
        double fator = 1.8;
        int ajuste = 32;
        double fahrenheit = celsius * fator + ajuste;

        System.out.println(celsius + "° C em Fahrenheit é: " + fahrenheit + " F");
    }

}
