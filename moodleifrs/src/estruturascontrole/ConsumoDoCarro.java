package estruturascontrole;

import java.util.Scanner;

public class ConsumoDoCarro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantas viagens foram realizadas: ");

        int qtdViagens = scan.nextInt();
        double totalLitros = 0;
        double totalKm = 0;
        double media;

        for (int i = 0; i < qtdViagens; i++){
            System.out.println("Digite quantos litros foram gastos durante a " + (i+1) + "a viagem: ");
            double litros = scan.nextDouble();
            totalLitros += litros;
            System.out.println("Digite a quantidade de km rodados na " + (i+1) + "a viagem: ");
            double km = scan.nextDouble();
            totalKm += km;
        }

        media = totalKm / totalLitros;

        System.out.printf("Média: %.2f km/L.", media);

        scan.close();
    }

}
