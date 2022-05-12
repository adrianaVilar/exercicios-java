package ferramentas;

public class RaizQuadrada {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            double raizQuadrada = Math.sqrt(i);
            System.out.printf("A raiz quadrada de %d é %.2f\n", i, raizQuadrada);
        }
    }
}
