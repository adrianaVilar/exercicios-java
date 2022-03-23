import javax.sound.midi.Soundbank;
import java.io.PrintStream;
import java.util.Scanner;

public class Moodle {
    public static void main(String[] args) {

        // Pegar um valor do scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Quadrado; \n2 - Triângulo; \n3 - Círculo; \n4 - Retângulo. \n Digite o número da área que deseja calcular:");

        // Atribuir o valor para uma variável
        int i = scan.nextInt();

        // Fazer um if para cada variável possível
        // Se o valor for igual a 1, calcular quadrado
        // Se igual a 2, calcular triângulo
        // Se igual a 3 calcular círculo
        // Se igual a 4 calcular retângulo

        if (i == 1) {
            System.out.println("Digite o tamanho da base: ");
            double base = scan.nextDouble();
            CalculadoraArea.verificaNumeroValido(base);
            System.out.println(CalculadoraArea.calculaAreaQuadrado(base));
        } else if (i == 2) {
            System.out.println("Digite o tamanho da base: ");
            double base = scan.nextDouble();
            CalculadoraArea.verificaNumeroValido(base);
            System.out.println("Digite o tamanho da altura: ");
            double altura = scan.nextDouble();
            CalculadoraArea.verificaNumeroValido(altura);
            System.out.println(CalculadoraArea.calculaAreaTriangulo(base, altura));
        } else if (i == 3) {
            System.out.println("Digite o tamanho do raio: ");
            double raio = scan.nextDouble();
            CalculadoraArea.verificaNumeroValido(raio);
            System.out.println(CalculadoraArea.calculaAreaCirculo(raio));
        } else if (i == 4) {
            System.out.println("Digite o tamanho da base: ");
            double base = scan.nextDouble();
            CalculadoraArea.verificaNumeroValido(base);
            System.out.println("Digite o tamanho da altura: ");
            double altura = scan.nextDouble();
            CalculadoraArea.verificaNumeroValido(altura);
            if (base == altura) {
                System.out.println("Isto é um quadrado!");
            }
            System.out.println(CalculadoraArea.calculaAreaRetangulo(base, altura));
        }
        // Se diferente, inserir um valor válido trhow new RuntimeException();
            else throw new RuntimeException("Digite um valor válido.");











     /*   System.out.print("A área do quadrado é: " + CalculadoraArea.calculaAreaQuadrado(5) + "m²");
        System.out.print("\nA área do triângulo é: " + CalculadoraArea.calculaAreaTriangulo(5, 3) + "m²");
        System.out.print("\nA área do círculo é: " + CalculadoraArea.calculaAreaCirculo(5) + "m²");
        System.out.print("\nA área do retângulo é: " + CalculadoraArea.calculaAreaRetangulo(5, 2) + "m²");*/

        // System.out.printf("%.1f", MediaPonderada.calculaMediaPonderada(10,1,5,2,6,3));

        // System.out.println(Salario.calculaSalarioComComissao(1500.00));

        //System.out.println("Olá, Mundo!");
        /* Calculadora de média

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite a primeira nota: ");
        double n1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double n3 = entrada.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double n4 = entrada.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;
        System.out.printf("O resultado da média é: " + "%.2f", media);*/


        /* Subtração

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = scan.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = scan.nextDouble();

        double subtracao = n1 - n2;

        System.out.printf("A subtração de n1 - n2 é: " + "%.2f", subtracao);*/

       /* Divisão
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = scan.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = scan.nextDouble();

        if (n2 != 0) {
            double divisao = n1 / n2;

            System.out.printf("O resultado da divisão é: " + "%.2f", divisao);

        } else {
            System.out.println("Digite um número diferente de zero");
        }*/

        /* Média

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double n3 = scan.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.printf("A média é: " + "%.2f", media);*/

        /* Desconto de 10%
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço cheio do produto: ");
        double precoCheio = scan.nextDouble();

        double precoDesconto = (precoCheio * 0.90);

        System.out.printf("O valor do produto com 10%c de desconto é: R$ %.2f", '%' , precoDesconto);*/

        /*Salário

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do salário: ");
        double salarioBase = scan.nextDouble();
        double gratificacaoSalario = salarioBase * 1.05;
        double salarioLiquido = gratificacaoSalario * 0.93;

        System.out.printf("O salário ao final é: R$ %.2f", salarioLiquido);*/

   /* System.out.println(calculaSalarioLiquido(1000));
        System.out.println(maioridade(18));*/
    }

   /* Salário
   public static double calculaSalarioLiquido(double salario) {

        double percentualGratificacao = 1.25;
        double percentualDesconto = 0.93;
        /*double gratificacaoSalario = salario * percentualGratificacao;
        double salarioLiquido = gratificacaoSalario * percentualDesconto;
        return salarioLiquido;
        return (salario * percentualGratificacao) * percentualDesconto;
    }*/

  /* Maioridade
    public static boolean maioridade(int idade) {
        int maioridadeBrasil = 18;
        return idade >= maioridadeBrasil;
    }*/
}