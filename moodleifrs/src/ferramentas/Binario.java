package ferramentas;

public class Binario {

    public static void main(String[] args){

        for(int i = 0; i <= 100; i++){
            String valor = Integer.toBinaryString(i);
            System.out.printf("%d em binário é %s\n", i, valor);
        }

    }

}
