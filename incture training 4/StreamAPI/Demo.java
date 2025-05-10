package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
    for (int i=1; i<=10; i++){
        list.add(i);
    }
    
    System.out.println(list);
    // List<Integer> list2 = list.stream().filter(i -> i %2==0).collect(Collectors.toList());
    // System.out.println(list2);
    System.out.println(list.stream().filter(i -> i %2==0).count());
    
    List<Integer> list3 = list.stream().map(i -> i*2).collect(Collectors.toList());
    System.out.println(list3);
}

}
