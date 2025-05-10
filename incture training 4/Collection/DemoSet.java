package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {
    public static void main(String[] args) {
        Set<Integer> value = new HashSet<>();

        value.add(55);
        value.add(64);
        value.add(97);
        value.add(64);
        //as wwe r using hashing nearest values gets called 1st so no order is maintained
        System.out.println(value.add(6));

        Set<Integer> values = new TreeSet<>();
        values.add(55);
        values.add(64);
        values.add(97);
        values.add(64);
        //gives in asc order

        for(int i : value){
            System.out.println(i);
        }

        for(int i : values){
            System.out.println(i);
        }
    }
}
