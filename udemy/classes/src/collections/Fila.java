package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Adri");
        fila.offer("Érick");
        System.out.println("Fila: " + fila);

        System.out.println("Primeiro elemento: " + fila.peek());
        System.out.println("Primeiro elemento: " + fila.element());

        System.out.println("Tamanho: " + fila.size());
        System.out.println("Se está vazia: " + fila.isEmpty());
        //fila.clear();
        System.out.println("Fila: " + fila);

        System.out.println("Remover: " + fila.poll());
        System.out.println("Remover: " + fila.remove());
        System.out.println("Remover: " + fila.poll());
        System.out.println("Fila: " + fila);

    }

}
