package assignement18;

import java.util.*;
import java.util.TreeMap;

public class Q6 {
    public static void main(String[] args) {
      NavigableMap<String,Integer> nm = new TreeMap<String,Integer>();
          nm.put("Rams",100);
          nm.put("Luck",200);
          nm.put("Lucky",500);
          nm.put("Manu",400);
          nm.put("Vinod",300);

        System.out.println(nm.ceilingEntry("Lucky"));
        System.out.println(nm.ceilingKey("Chandu"));
        System.out.println(nm.firstEntry());
        System.out.println(nm.floorEntry("Manu"));
        System.out.println(nm);


    }
}
