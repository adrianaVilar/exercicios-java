package controle;

import javax.swing.*;

public class DesafioVerificar {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if (num >= 0 && num <= 10) {
            System.out.println("O número está entre 0 e 10.");
        } else {
            System.out.println("O número não está entre 0 e 10.");
        }

        if (num % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}
