package controle;

import javax.swing.*;

public class DesafioMediaDasNotas {
    public static void main(String[] args) {
        //Recebe duas notas parciais;
        //Se for > 7 = Aprovado; < 7 e > 4 = Recuperação e < 4 = Reprovado.

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        double media = (nota1 + nota2) / 2;

        if (nota1 <= 10 && nota1 >= 0 && nota2 <= 10 && nota2 >= 0) {
            if (media >= 7 && media <= 10) {
                System.out.println("Parábens, você foi aprovado!");
            } else if (media > 4 && media < 7) {
                System.out.println("Sinto muito, mas você precisará realizar a prova de recuperação.");
            } else {
                System.out.println("É uma lástima, mas você foi reprovado.");
            }
        } else {
            System.out.println("Digite notas de 0 até 10.");
        }
    }
}
