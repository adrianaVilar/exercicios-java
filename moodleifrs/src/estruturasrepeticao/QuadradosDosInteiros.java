package estruturasrepeticao;

public class QuadradosDosInteiros {

    public static void main(String[] args) {

        for(int i = 15; i <= 200; i++) {
            double quadrado = Math.pow(i, 2);
            System.out.println((int) quadrado);
        }

    }
}
