import java.util.Scanner;

public class Moodle {
    public static void main(String[] args) {

        System.out.println("Olá, Mundo!");


//1. Faça um programa que receba dois números, calcule e mostre a
//subtração do primeiro número pelo segundo.
        System.out.println(CalculadoraSubtracao.calculaSubtracao(6, 3));


//2. Faça um programa que receba dois números, calcule e mostre a divisão
//do primeiro pelo segundo. Sabe-se que o segundo número não pode ser
//zero, portanto, não é necessário se preocupar com isso neste exercício.
        System.out.println(CalculadoraDivisao.calculaDivisao(9, 2));


//3. Faça um programa que receba três notas de um estudante, calcule e
//mostre a média aritmética entre elas (este exercício é similar ao exemplo
//mostrado a neste capítulo, mas leva em consideração três notas e não
//quatro).
        System.out.println(CalculadoraMedia.calculaMedia(2, 5.8, 10, 9));


//4. Faça um programa que receba o preço de um produto, calcule e mostre
//o novo preço, sabendo-se que este sofreu um desconto de 10%. Por
//exemplo, se o produto custa R$ 100,00, o novo preço será 100 menos
//10% de cem, que é 100 x 10 / 100. Essa conta é igual a 10, ficando o
//novo preço R$ 90,00.
        System.out.println(CalculadoraDesconto.calculaDesconto(50));


//5. Faça um programa que receba o salário base de um funcionário, calcule
//e mostre o salário a receber, sabendo-se que o funcionário tem
//gratificação de 5% sobre o salário base (que será acrescentado ao
//salário) e paga imposto de 7% sobre este salário (o que será
//descontado do salário).
        System.out.println(CalculadoraSalario.calculaSalario(180, 1212));

        System.out.println(CalculadoraSalario.calculaSalario(1212));


//6. Um funcionário recebe um salário fixo mais 4% de comissão sobre as
//vendas (4% do valor das vendas efetuadas pelo funcionário). Faça um
//programa que receba o salário fixo do funcionário e o valor de suas
//vendas, calcule e mostre a comissão e seu salário final.
        System.out.println(Salario.calculaSalarioComComissao(1500.00));


//7. Faça um programa que receba três notas e seus respectivos pesos,
//calcule e mostre a média ponderada dessas notas. Para calcular a
//média ponderada, multiplique cada nota por seus respectivos pesos,
//some todos os resultados e divida pela soma dos pesos. Por exemplo,
//se as notas forem 10, 5 e 6, e os pesos 1, 2 e 3, a média final do
//estudante seria 10 x 1 + 5 x 2+ 3 x 6, que resulta em 10 + 10 + 18 = 38.
//Esse valor deve ser dividido pela soma dos pesos (6), resultando em 6,3.
        System.out.printf("%.1f", MediaPonderada.calculaMediaPonderada(10, 1, 5, 2, 6, 3));


//8. Faça um programa que calcule e mostre a área de um triângulo. Sabe-se que: Área = (base x altura) / 2. A base e altura devem ser informadas pelo usuário.
//9. Faça um programa que calcule e mostre a área de um quadrado. Sabe-se que
//𝐴=𝑙𝑎𝑑𝑜2
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Quadrado; \n2 - Triângulo; \n3 - Círculo; \n4 - Retângulo. \n Digite o número da área que deseja calcular:");

        int i = scan.nextInt();

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
        } else throw new RuntimeException("Digite um valor válido.");

        System.out.print("A área do quadrado é: " + CalculadoraArea.calculaAreaQuadrado(5) + "m²");
        System.out.print("\nA área do triângulo é: " + CalculadoraArea.calculaAreaTriangulo(5, 3) + "m²");
        System.out.print("\nA área do círculo é: " + CalculadoraArea.calculaAreaCirculo(5) + "m²");
        System.out.print("\nA área do retângulo é: " + CalculadoraArea.calculaAreaRetangulo(5, 2) + "m²");


//10. Sabe-se que:
//1 pé = 12 polegadas
//1 jarda = 3 pés
//1 milha = 1.760 jardas
//Faça um programa que receba uma medida em pés , faça as conversões a seguir e mostre os resultados.
//a. polegadas;
//b. jardas;
//c. milhas.
        System.out.println("a. polegadas: " + ConversorMedidas.converteParaPolega(5));

        System.out.println("b. jardas: " + ConversorMedidas.converteParaJarda(5));

        System.out.println("c. milhas: " + ConversorMedidas.converteParaMilha(5));


//11. Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
//a. a idade dessa pessoa em anos;
//b. a idade dessa pessoa em meses;
//c. a idade dessa pessoa em dias (considerando que cada ano possui 365 dias);
//d. a idade dessa pessoa em semanas (cada ano possui 52 semanas).
        System.out.println(CalculadoraIdade.calcularIdade(1994, 2022));

        System.out.println(CalculadoraIdade.calcularIdade(4, 3, 1994));


//12. O custo ao consumidor de um carro novo é a soma do preço de fábrica com o percentual de lucro do distribuidor e dos impostos aplicados ao preço de fábrica. Faça um programa que receba o preço de fábrica de um veículo, o percentual de lucro do distribuidor e o percentual de impostos, calcule e mostre:
//a. o valor correspondente ao lucro do distribuidor;
//b. o valor correspondente aos impostos;
//c. o preço final do produto.
        System.out.println(CalculadoraPrecoCarro.calculaPrecoCarro(15000, 20, 15));


//13. Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo, calcule e mostre o salário a receber seguindo estas regras:
//a. a hora trabalhada vale um décimo do salário mínimo;
//b. o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
//c. o imposto equivale a 3% do salário bruto;
//d. o salário a receber equivale ao salário bruto menos o imposto.
        System.out.println(CalculadoraSalario.calculaSalario(192, 1212));


//14. Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um programa que receba o valor do salário mínimo e a quantidade de quilowatts consumida por uma residência, calcule e mostre:
//a. o valor de cada quilowatt;
//b. o valor a ser pago por essa residência;
//c. o valor a ser pago com desconto de 15%.
        System.out.println(CalculadoraQuilowatt.calculaKw(1212, 500));


//15. Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit. Sabe-se que
//𝐹= 9 ×𝐶5+32
        System.out.println(ConversorTemperatura.converteParaFahrenheint(25.5));

//Extra
        System.out.println(CalculadoraMaioridade.calculaMaioridade(17));

        System.out.println(CalculadoraMaioridade.calculaMaioridade(18));
    }
}