package estruturasrepeticao;

import java.util.Scanner;

public class ConsumoDoCarro {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantas viagens foram realizadas: ");

        int numViagens = scan.nextInt();
        double totalKm = 0;
        double totalLitros = 0;
        int i = 0;
        double media = 0;

        while (numViagens >= i){
            System.out.println("Digite a quantidade de litros gastos na " + (i + 1) + "a viagem: ");
            double litros = scan.nextDouble();
            System.out.println("Digite a quantidade de km percorridos na " + (i + 1) + "a viagem: ");
            double km = scan.nextDouble();
            totalLitros += litros;
            totalKm += km;
            i++;
            numViagens--;
        }

        media = totalKm / totalLitros;

        System.out.println("A média do carro é de: " + media + "km por litro.");

        scan.close();
    }

}
