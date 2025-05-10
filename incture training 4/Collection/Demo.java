package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class ComImpl implements Comparator<Integer>{

    public int compare(Integer o1, Integer o2) {

        if(o1%10>o2%10){
            return 1;
        }
        return -1;
    }
    
}

public class Demo {
    public static void main(String[] args) {

    List <Integer> values = new ArrayList<>();

    values.add(305);
    values.add(998);
    values.add(774);
    values.add(236);
    values.add(881);

    Comparator<Integer> com = new ComImpl();

    Comparator<Integer> coo = (o1,o2)-> {
            return o1>o2?1:-1;
        };
    
    // Collections.sort(values);
    Collections.sort(values,com);
    


    for(Object i : values){
        System.out.println(i);
    }
    Collections.sort(values,coo);
    


    for(Object i : values){
        System.out.println(i);
    }
    }
    

}
