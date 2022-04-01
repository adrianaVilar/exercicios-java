package controle;

public class DesafioFor2 {
    public static void main(String[] args) {

       /* String imprime = "#";

        for (int i = 0; i < 5; i++) {
            System.out.println(imprime);
            imprime += "#";
        }*/

        // Sem usar valor numérico
        for (String x = "#"; !"######".equals(x); x += "#") {
            System.out.println(x);

        }
    }
}
