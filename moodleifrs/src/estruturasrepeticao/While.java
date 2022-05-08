package estruturasrepeticao;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int senha = 0;

        while (senha != 1234) {
            System.out.println("Digite a senha: ");
            senha = scan.nextInt();
        }

        System.out.println("Senha correta, acesso liberado.");

        scan.close();
    }
}
