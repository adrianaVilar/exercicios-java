package fundamentos;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        //System.out.println("Olá, mundo!");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        /*teclado.nextLine(); //lê o "\\n" que o teclado.nextInt() deixa para trás.
        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();
        System.out.println("Qual o seu sobrenome?");
        String sobrenome = teclado.nextLine();*/
        System.out.println("Qual seu nome?");
        String nome = teclado.next();
        System.out.println("Qual seu sobrenome?");
        String sobrenome = teclado.next();

        teclado.close();

    }

}
