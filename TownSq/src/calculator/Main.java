package calculator;

public class Main {

    public static void main(String[] args) {

        int[] flavors = {1, 1, 1, 2, 2, 2, 0, 0, 0};

        System.out.println("O código do sabor é: " + Calculator.getFrequency(flavors));

    }
}
