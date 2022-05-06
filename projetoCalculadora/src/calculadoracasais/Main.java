package calculadoracasais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        Scanner scan = new Scanner (System.in);

        for (int i = 0; i < 2; i++) {

            System.out.println("Olá, bem-vindo(a) a calculadora para casais. Por favor, digite nome da pessoa: ");
            String nome = scan.next();

            System.out.println("Agora digite o salário de " + nome + ":");
            double salario = scan.nextDouble();

            pessoas.add(new Pessoa(nome, salario));
        }
        System.out.println("Digite o gasto total: ");
        double gasto = scan.nextDouble();

        Pessoa p1 = pessoas.get(0);
        Pessoa p2 = pessoas.get(1);

        System.out.println("A(o) " + p1.getNome() + " paga R$ " + (Calculadora.calcula(p1,p2,gasto)));
        System.out.println("A(o) " + p2.getNome() + " paga R$ " + (Calculadora.calcula(p2,p1,gasto)));

        scan.close();
    }

}

