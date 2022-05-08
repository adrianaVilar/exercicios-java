//Construa um programa que leia três valores para os lados de um triângulo (A, B e C).
// O programa deve verificar se os lados fornecidos formam realmente um triângulo.
// Em caso positivo, deve mostrar a mensagem “Os lados formam um triângulo” e caso contrário
// “Os valores informados não podem formar um triângulo”. Para que três valores de lados formem um triângulo,
// cada par de lados somados não pode ser menor ou igual ao terceiro lado.

package estruturasdecisao;

import java.util.Scanner;

public class VerificaTriangulo {

    public static void main(String[] args) {

        System.out.println("Digite os três lados do triângulo: ");

        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if ((a + b) <= c || (b + c) <= a || (c + a) <= b) {
            System.out.println("Os valores informados não podem formar um triângulo");
        } else {
            System.out.println("Os lados formam um triângulo");
        }
        scan.close();
    }
}
