package classe;

public class Jantar {

    public static void main (String[] args){

        Pessoa p1 = new Pessoa ("Adriana", 46.500);
        Comida c1 = new Comida("Wafer", 0.100);
        Comida c2 = new Comida("Café", 0.200);

        System.out.println(p1.apresentar());

        p1.comer(c1);

        System.out.println(p1.apresentar());

        p1.comer(c2);

        System.out.println(p1.apresentar());
    }
}
