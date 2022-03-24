public class CalculadoraPrecoCarro {
    public static String calculaPrecoCarro (double precoFabrica, double percentualLucro, double percentualImposto) {
        double lucroDistribuidor = precoFabrica * percentualLucro / 100;
        double imposto = precoFabrica * percentualImposto / 100;
        double precoFinal = imposto + precoFabrica + lucroDistribuidor;
        return "Lucro do distribuidor: " + lucroDistribuidor + "\nImpostos: " + imposto + "\nPreço final: " + precoFinal;
    }
}
