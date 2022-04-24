package classe;


public class Pessoa {
    String nome;
    double peso;

    public Pessoa (String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public double comer (Comida comida){
        return this.peso += comida.peso;
    }

    String apresentar(){
        return "Olá, sou " + nome + "e peso " + peso + " kg.";
    }
}
