package estruturasrepeticao;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int senha;

        do {
            System.out.println("Digite a senha:");
            senha = scan.nextInt();
        }while (senha != 1234);

        System.out.println("Senha correta. Acesso liberado.");

        scan.close();

    }
}
