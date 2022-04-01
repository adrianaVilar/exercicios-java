package controle;

public class DesafioFor {
    public static void main(String[] args) {

        int contador2 = 10;
        while (contador2 >= 0) {
            System.out.println(contador2);
            contador2 -= 2;
        }


        for (int contador = 10; contador >= 0; contador -= 2) {
            System.out.printf("Contador: %d\n", contador);
        }
    }
}
