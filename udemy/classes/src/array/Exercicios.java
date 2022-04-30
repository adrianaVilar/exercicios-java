package array;

import java.util.Arrays;

public class Exercicios {

    public static void main (String[] args){

        double[] notasAlunoA = new double[3];

        notasAlunoA[0] = 8.5;
        notasAlunoA[1] = 8.4;
        notasAlunoA[2] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }

        System.out.printf("A média do Aluno é: %.2f\n", total/notasAlunoA.length);

        double[] notasAlunoB = {8.3, 9.8, 8.2};

        System.out.println(Arrays.toString(notasAlunoB));
    }
}
