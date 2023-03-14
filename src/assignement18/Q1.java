package assignement18;

import java.util.Hashtable;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) {
        Map<String,Integer> ht = new Hashtable<>();
        ht.put("Rams",100);
        ht.put("Sathya",200);
        ht.put("Lucky",500);
        ht.put("Manu",400);
        ht.put("Vinod",300);

        System.out.println(ht.keySet());
        System.out.println(ht.entrySet());
        System.out.println(ht.replace("Rams",100,10));

        System.out.println(ht);
        System.out.println(ht.size());
    }
}
