public class CalculadoraMaioridade {
    public static String calculaMaioridade (int idade) {
       int maioridadeBrasil = 18;
       if (idade >= maioridadeBrasil) {
           return "É maior de idade.";
       }else return "Não é maior de idade.";
    }
}


  /* Maioridade
    public static boolean maioridade(int idade) {
        int maioridadeBrasil = 18;
        return idade >= maioridadeBrasil;
    }*/
