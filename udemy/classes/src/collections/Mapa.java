package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main (String[] args){

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Adri");
        usuarios.put(2, "Érick");
        usuarios.put(1, "Adriana");

        System.out.println("Tamanho: " + usuarios.size());
        System.out.println("Se está vazio: " + usuarios.isEmpty());

        System.out.println("Valores das chaves: " + usuarios.keySet());
        System.out.println("Valores dos valores: " + usuarios.values());
        System.out.println("Chaves e valores: " + usuarios.entrySet());
        System.out.println("Se contém a chave 2: " + usuarios.containsKey(2));
        System.out.println("Se contém o valor Adri: " + usuarios.containsValue("Adri"));

        System.out.println("Retorna o valor da chave 1: " + usuarios.get(1));

        //Percorrer a chave:
        for(int chave : usuarios.keySet()){
            System.out.println("Chaves: " + chave);
        }

        //Percorrer os valores:
        for(String valor : usuarios.values()){
            System.out.println("Valores: " + valor);
        }

        //Percorrer chave e valor juntos:
        for(Map.Entry<Integer, String> usuario : usuarios.entrySet()){
            System.out.print(usuario.getKey() + "=>");
            System.out.println(usuario.getValue());
        }
    }

}
