package Collection;

import java.util.ArrayList;
import java.util.Vector;

public class DemoVector {
    public static void main(String[] args) {

        //ArrayList <Integer> v = new ArrayList<>();//50%//NOT THREADSAFE//FAST
        // VECTOR IS SYNCORNIZED
        Vector <Integer> v = new Vector<>();//100%//THREADSAFE// SLOW
        v.add(4);
        v.add(7);
        v.add(6);
        v.add(97);
        v.add(87);
        v.add(67);
        v.add(97);
        v.add(76);
        v.add(17);
        v.add(27);
        v.add(37);
        v.add(47);
        v.add(74);
        v.add(75);
        v.add(72);
        v.add(73);

        System.out.println(v.capacity());
        for(int i:v){
            System.out.println(i);
        }
    }
}

