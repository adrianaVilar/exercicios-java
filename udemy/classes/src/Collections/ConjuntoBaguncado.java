package Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main (String[] args){

        HashSet conjunto = new HashSet<>();
        conjunto.add("Teste");
        conjunto.add(1.3);
        conjunto.add(true);
        conjunto.add('x');
        conjunto.add(1);

        System.out.println(conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.size());
        System.out.println(conjunto.contains("Teste"));

        Set nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

      /*  conjunto.addAll(nums);
        System.out.println(conjunto);*/

        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }
}
