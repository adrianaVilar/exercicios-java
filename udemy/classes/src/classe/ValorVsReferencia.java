package classe;

public class ValorVsReferencia {

    public static void main (String[] args){

        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println("a: " + a + " " + "b: " + b);

        Data d1 = new Data();
        Data d2 = d1;

        d1.dia = 31;
        d2.mes = 12;

        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);

        voltarParaDataPadrao(d1); //realiza uma atribuição de referência
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);

        alterarPrimitivo(b); // realiza uma atribuição de valor, então não altera no final, pq o que é passado para o método é uma cópia e não a referência
        System.out.println("b: " + b);

    }

    public static void voltarParaDataPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    public static void alterarPrimitivo (double b){
        b++;
    }
}
