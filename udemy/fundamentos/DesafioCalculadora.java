package fundamentos;
import javax.swing.*;

public class DesafioCalculadora {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        String operador = JOptionPane.showInputDialog("Digite a operação desejada");

        String resultado = "+".equals(operador) ? (num1 + num2) + "" : "-".equals(operador) ? (num1 - num2) + "" :
                "*".equals(operador) ? (num1 * num2) + "" : "/".equals(operador) ? (num1 / num2) + "" :
                "Digite um operador valido";

                System.out.println(resultado);
    }
}
