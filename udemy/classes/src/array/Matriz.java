package array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos da turma: ");
        int qtdeAlunos = scan.nextInt();
        System.out.println("Digite a quantidade de notas: ");
        int qtdeNotas = scan.nextInt();

        double[][] notasDosAlunos = new double[qtdeAlunos][qtdeNotas];

        double soma = 0;

        for (int a = 0; a < notasDosAlunos.length; a++) {
            for (int n = 0; n < notasDosAlunos[a].length; n++) {
                System.out.printf("Digite a nota %d do aluno %d: ", (n + 1), (a + 1));
                notasDosAlunos[a][n] = scan.nextDouble();
                soma += notasDosAlunos[a][n];
            }
        }

        double media = soma / (qtdeAlunos * qtdeNotas);
        System.out.printf("Média: %.2f\n", media);

        for(double[] notasDaTurma : notasDosAlunos) {
            System.out.println(Arrays.toString(notasDaTurma));
        }

        scan.close();
    }
}
