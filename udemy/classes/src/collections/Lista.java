package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Adri"));
        lista.add(new Usuario("Érick"));
        lista.add(new Usuario("Lu"));
        lista.add(new Usuario("Jerry"));

        System.out.println(lista.get(3));
        System.out.println(lista.remove(0));
        System.out.println(lista.add(new Usuario("Derick")));
        System.out.println(lista);
        System.out.println(lista.add(new Usuario("Nicole")));
        System.out.println(lista.remove(new Usuario("Nicole")));

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }


    }
}
