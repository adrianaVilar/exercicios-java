package ferramentas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Arredondar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor para arredondar:");
        double numParaArredondar = scan.nextDouble();

        System.out.println("Digite o número de casas decimais desejada:");
        int numDeCasasDecimais = scan.nextInt();

        BigDecimal valor = new BigDecimal(numParaArredondar).setScale(numDeCasasDecimais, RoundingMode.HALF_EVEN);

        System.out.println(valor);

        scan.close();
    }
}
