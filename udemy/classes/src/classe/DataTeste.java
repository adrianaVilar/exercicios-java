package classe;

public class DataTeste {

    public static void main (String [] args) {

        Data d1 = new Data();
        d1.dia = 4;
        d1.mes = 3;
        d1.ano = 1994;

        System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);

        Data d2 = new Data();
        d2.dia = 30;
        d2.mes = 5;
        d2.ano = 1994;

        System.out.printf("\n%d/%d/%d", d2.dia, d2.mes, d2.ano);

        Data d3 = new Data();
        d3.dia = 11;
        d3.mes = 1;
        d3.ano = 2022;

        System.out.printf("\n%d/%d/%d\n", d3.dia, d3.mes, d3.ano);

        System.out.println(d3);

       // String dataFormatada = d1.obterDataFormatada();
       // System.out.println(dataFormatada);

       // System.out.println(d3.obterDataFormatada());

       // d2.imprimirDataFormatada();
    }
}
