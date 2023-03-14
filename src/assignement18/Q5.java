package assignement18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortString implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class Q5 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1,"Rams",50000));
        list.add(new Employee(4,"Lucky",567));
        list.add(new Employee(3,"Eswar",400000));
        list.add(new Employee(2,"Phani",50000));

        System.out.println("Sorting on bases of Names:");

        Collections.sort(list,new SortString());
        for(Employee e : list){
            System.out.println(e);
        }
        System.out.println();

        for(Employee e : list){
            if(e.salary>15000)
            System.out.println(e);
        }
    }
}
