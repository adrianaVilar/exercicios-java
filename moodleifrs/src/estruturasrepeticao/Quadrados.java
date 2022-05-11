package estruturasrepeticao;

import java.util.Scanner;

public class Quadrados {

        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);
            System.out.println("Digite os valores que deseja descobrir o quadrado. Digite um número negativo para sair.");

            double valor = scan.nextDouble();
            double quadrado = 0;

            while (valor >= 0) {
                quadrado = Math.pow(valor, 2);
                System.out.printf("O quadrado de %.2f é %.2f\n", valor, quadrado);
                valor = scan.nextDouble();
            }
            System.out.println("Execução finalizada.");
            scan.close();
        }

}
