package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

 /*  public String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

   public void imprimirDataFormatada() {
       System.out.println(obterDataFormatada());
   }*/
}
