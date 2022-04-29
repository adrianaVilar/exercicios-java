package classe;

public class Usuario {

    String nome;
    String email;

    public Usuario (String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public boolean equals(Object objeto){
        Usuario outro = (Usuario) objeto;
        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailIgual = outro.email.equals(this.email);
        return nomeIgual && emailIgual;
    }

    public int hashcode(){
        return 0;
    }
}
