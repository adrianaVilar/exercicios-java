public class CalculadoraSalario {
    public static double calculaSalario (double horasTrabalhadas, double salarioMinimo) {
        double valorHora = salarioMinimo * 0.01;
        double salarioBruto = horasTrabalhadas * valorHora;
        double imposto = salarioBruto * 0.03;
        return salarioBruto - imposto;
    }

    public static double calculaSalario (double salario){
        double gratificacaoSalario = salario * 1.05;
        return gratificacaoSalario * 0.93;
    }
     /*Salário

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do salário: ");
        double salarioBase = scan.nextDouble();
        double gratificacaoSalario = salarioBase * 1.05;
        double salarioLiquido = gratificacaoSalario * 0.93;

        System.out.printf("O salário ao final é: R$ %.2f", salarioLiquido);*/
}
