package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seus três últimos salários:");

        String ultimoSalario = getSalaryValue(scan, "Último salário");

        String penultimoSalario = getSalaryValue(scan, "Penúltimo salário");

        String antepenultimoSalario = getSalaryValue(scan, "Antepenúltimo salário");

        double salario3 = Double.parseDouble(ultimoSalario);

        double salario2 = Double.parseDouble(penultimoSalario);

        double salario1 = Double.parseDouble(antepenultimoSalario);

        double mediaSalarial = (salario1 + salario2 + salario3) / 3;

        System.out.printf("A média dos últimos três salários recebidos é R$ %.2f", mediaSalarial);

        scan.close();
    }

    private static String getSalaryValue(Scanner scan, String salary){
        System.out.printf("\n %s: ", salary);
        return scan.next().replace(",", ".");
    }
}
