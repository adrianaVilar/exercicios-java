package collections;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args){

        //Set<String> lista = new HashSet<>(); - Não mantém a ordem
        Set<String> lista = new TreeSet<>(); //Mantém a ordem alfabética
        lista.add("Adri");
        lista.add("Erick");
        lista.add("Lu");
        lista.add("Jerry");

        for(String aprovados : lista){
            System.out.println(aprovados);
        }

        Set<Integer> listaDeNumeros = new TreeSet<>(); //Mantém a ordem crescente
        listaDeNumeros.add(1);
        listaDeNumeros.add(7);
        listaDeNumeros.add(5);
        listaDeNumeros.add(8);
        listaDeNumeros.add(9);

        for(Integer num : listaDeNumeros){
            System.out.println(num);
        }

    }
}
