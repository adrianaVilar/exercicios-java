import java.util.Scanner;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double area;
        System.out.print("Informe o raio da circunferencia: ");
        // System.console() não é suportado pela IDE, pra executar usar terminal java AreaCircunferencia.java
        // raio = Double.parseDouble(System.console().readLine());
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        area = 3.14159 * raio * raio;
        System.out.printf("Area da circunferencia = %.2f\n", area);
    }
}