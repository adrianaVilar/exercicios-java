package calculadoracasais;

public class Pessoa {

   private String nome;
   private double salario;

    public Pessoa(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

}
