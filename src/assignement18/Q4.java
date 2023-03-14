package assignement18;

import java.util.Enumeration;
import java.util.Vector;

public class Q4 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Rams");
        v.add("Vinod");
        v.add("Chinni");
        v.add("Sai");
        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println(v.clone());
        System.out.println(v.firstElement());

        System.out.println(v.lastElement());
    }
}
