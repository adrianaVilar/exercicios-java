package calculator;

public class Main {

    public static void main(String[] args) {

        int[] flavors = {1, 1, 1, 2, 2, 2, 0, 0, 0, 1};

        System.out.println("Valor que mais se repete: " + Calculator.getFrequency(flavors));

    }
}
