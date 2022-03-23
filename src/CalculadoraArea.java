public class CalculadoraArea {

    public static double calculaAreaTriangulo(double b, double h) {
        return b * h / 2;
    }

    public static double calculaAreaQuadrado(double b) {
        return b * b;
    }

    public static double calculaAreaRetangulo(double b, double h) {
        return b * h / 2;
    }

    public static double calculaAreaCirculo(double r) {
        double pi = 3.14;
        return pi * Math.pow( r, 2);
    }

    public static void verificaNumeroValido(double num) {
        // verifica se o numero digitado é menor do que zero
        // se sim lança exceção
        if (num < 0) {
            throw new RuntimeException("Digite um número maior ou igual a zero");
        }

    }
}
