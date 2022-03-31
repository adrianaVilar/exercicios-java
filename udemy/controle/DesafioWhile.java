package controle;


import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        System.out.println("Digite uma palavra para continuar o laço e SAIR para finalizar.");
        Scanner scan = new Scanner(System.in);

        String verificar = scan.nextLine();

        while (!"sair".equalsIgnoreCase(verificar)) {
            System.out.println("Continue digitando!");
            verificar = scan.nextLine();

        }

        scan.close();
    }
}
