public class Salario {
    public static double calculaSalarioComComissao(double valorVendido) {
        double salarioBruto = 1212.00;
        double comissao = 0.04;
        return salarioBruto + valorVendido * comissao;
    }

}
