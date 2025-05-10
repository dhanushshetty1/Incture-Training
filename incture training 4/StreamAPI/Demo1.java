package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(70);
        list.add(90);
        list.add(35);

        System.out.println(list);

        // Comparator <Integer> ref = (i1,i2) -> i2.compareTo(i1);

        // List<Integer> list2 = list.stream().sorted(ref).collect(Collectors.toList());
        // System.out.println(list2);

        // Integer min = list.stream().min(ref).get();
        // Integer max = list.stream().max(ref).get();

        // System.out.println(min);
        // System.out.println(max);

        list.stream().forEach(i -> System.out.println(i));
    }
}
