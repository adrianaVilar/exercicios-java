package estruturasrepeticao;

public class WhileFibonacci {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int i = 0;

        System.out.println(b);

        while (i <= 10){
            int r = a + b;
            a = b;
            b = r;
            i++;

            System.out.println(r);
        }
    }
}
