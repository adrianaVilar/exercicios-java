package calculadoracasais;

public class Calculadora {

    public static double calcula(Pessoa p1, Pessoa p2, double gasto){

        return (p1.getSalario() /( p1.getSalario() + p2.getSalario())) * gasto;



    }

}
