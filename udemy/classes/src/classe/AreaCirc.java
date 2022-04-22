package classe;

public class AreaCirc {

    static final double PI = Math.PI;
    public double raio;

    public AreaCirc (double raio){
        this.raio = raio;
    }

    public double raioC () {
        return PI * Math.pow(raio, 2);
    }
}
