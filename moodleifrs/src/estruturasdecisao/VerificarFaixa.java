//Faça um programa que leia um valor numérico inteiro. O programa deve apresentar
// a mensagem “O valor está na faixa permitida”, caso o valor informado esteja entre 1 e 9.
// Se o valor estiver fora da faixa, o programa deve apresentar a mensagem “O valor está fora da faixa permitida”.

package estruturasdecisao;

import java.util.Scanner;

public class VerificarFaixa {

    public static void main(String[] args) {

        System.out.println("Digite um valor para verificar se está na faixa permitida");

        Scanner scan = new Scanner (System.in);

        int num = scan.nextInt();

        if (1 <= num && num <= 9){
            System.out.println("O valor está na faixa permitida");
        } else {
            System.out.println("O valor está fora da faixa permitida");
        }
    scan.close();

    }
}
