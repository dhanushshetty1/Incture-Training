package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        //Map<String,String> map = new Hashtable<>();//sycronize

        map.put("myName", "Dhanush");
        map.put("lName", "Shetty");
        map.put("clg", "VVCE");

        Set<String> keys = map.keySet();

        System.out.println(map);

        System.out.println(map.get("myName"));

        for(String key : keys){
            System.out.println(key + " "+ map.get(key));
        }
    }
}
