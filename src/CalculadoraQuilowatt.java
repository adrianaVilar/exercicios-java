public class CalculadoraQuilowatt {
    public static String calculaKw(double salarioMinimo, int quantidadeKw) {
        double valorKw = salarioMinimo * 0.02;
        double valorpago = valorKw * quantidadeKw;
        double descontoQuinze = valorKw * quantidadeKw * 0.85;
        return "O valor do kW é: R$ " + valorKw + "\nO valor a ser pago nessa residência é: R$ " + valorpago + "\nCom desconto o valor é: R$ " + descontoQuinze;
    }
}
