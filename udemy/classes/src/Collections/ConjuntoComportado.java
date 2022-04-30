package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args){

        //Set<String> lista = new HashSet<>(); - Não mantém a ordem
        SortedSet<String> lista = new TreeSet<>(); //Mantém a ordem de inserção dos dados
        lista.add("Adri");
        lista.add("Erick");
        lista.add("Lu");
        lista.add("Jerry");

        for(String aprovados : lista){
            System.out.println(aprovados);
        }
    }
}
