package Collection;

import java.util.ArrayList;
import java.util.List;

class Container<T extends Number>{
    T value;
    public void show(){
        System.out.println(value.getClass().getName());
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void demo(ArrayList<? extends T> obj){

    }

    
    

}

public class GenericsDemo {
    public static void main(String[] args) {
        //int value = 5;

        List<Integer>values = new ArrayList<>();

        values.add(7);
        //values.add("Naveen");//type saftly

        Container<Integer> obj = new Container<>();
        obj.value = 9;
        obj.show();

        Container<Double> obj1 = new Container<>();
        obj1.value = 9.0;
        obj1.show();

        obj.demo(new ArrayList<Integer>());
    }
    
}

