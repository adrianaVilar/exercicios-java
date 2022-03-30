package fundamentos;

import static java.lang.Math.pow;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        int numerador1 = 6 * (3 + 2);
        int numerador1Quadrado = (int) Math.pow(numerador1, 2);
        int denominador1 = 3 * 2;
        int fracao1 = numerador1Quadrado / denominador1;

        int numerador2 = (1 - 5) * (2 - 7);
        int denominador2 = 2;
        int num2den2 = (numerador2 / denominador2);
        int fracao2 = (int) Math.pow(num2den2, 2);

        int numerador3 = fracao1 - fracao2;

        int numerador = (int) Math.pow(numerador3, 3);
        int denominador = (int) Math.pow(10, 3);
        int resultado = numerador / denominador;

        System.out.println("O resultado é: " + resultado);

    }
}
