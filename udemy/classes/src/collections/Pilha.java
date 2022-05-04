package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main (String[] args){

        Deque<String> livros = new ArrayDeque<>();

        livros.add("Mitologia para quem tem pressa");
        livros.push("Java 8");
        livros.push("O Hobbit");

        System.out.println("Se está vazio: " + livros.isEmpty());
        System.out.println("Tamanho: " + livros.size());
        System.out.println("Livros: " + livros);

        for(String livro : livros){
            System.out.println("livro no for: " + livro);
        }

        System.out.println("Remove: " + livros.remove());
        System.out.println("Poll: " + livros.poll());
        System.out.println("Pop: " + livros.pop());

    }
}
