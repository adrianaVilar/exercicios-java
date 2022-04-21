package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    public Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

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
