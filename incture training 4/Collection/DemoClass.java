package Collection;


import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class DemoClass {

    public static void main(String[] args) {
        // int values[] = new int[4];
    // Object values1[]=new Object[4];
    // values1[0]="Shetty";
    // values1[1]=7;

    // Collection values = new ArrayList();
    
    // values.add(3);
    // values.add("Navven");
    // values.add(5.8f);

    // Collection<Integer> values = new <Integer> ArrayList();
    
    // values.add(3);

    List <Integer> values = new ArrayList<>();

    values.add(3);
    values.add(1,9);

    Collections.sort(values);
    Collections.reverse(values);

    values.forEach(System.out::println);//Stream API..Lambda Exprestion

    // Iterator i = values.iterator();

    // System.out.println(i.next());
    // System.out.println(i.next());
    // System.out.println(i.next());
    // while(i.hasNext()){
    //     System.out.println(i.next());
    // }

    for(Object i : values){
        System.out.println(i);
    }
    }


    
}

