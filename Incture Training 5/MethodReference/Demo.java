package MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface Parser{
    String parse(String str);
}

class StringParser{
    public static String convert(String s){
        if(s.length() <=3)
        s=s.toUpperCase();
        else 
        s=s.toLowerCase();

        return s;
    }
}

class MyPrinter{
    public void print(String str,Parser p){
        str = p.parse(str);
        System.out.println(str);
    }
}

public class Demo {
    public static void main(String[] args) {
        // List<String> name = Arrays.asList("Dhanush","Shetty","Priya","Anto"); 
        // // Consumer<String> con = new Consumer<String>() {
        // //     public void accept(String s){
        // //         System.out.println(s);
        // //     }
        // // };
        // // name.forEach(con);

        // //name.forEach(s->System.out.println(s));

        // name.forEach(System.out::println);

        

        String str = "Dhanush Shetty";
        MyPrinter mp = new MyPrinter();
        // mp.print(str,new Parser(){
        //    public String parse(String s){
        //     return StringParser.convert(s);
        //    }
        // });

        mp.print(str, StringParser::convert);
        //if it is static methos use class name or if it is non staic methos use object name by creating the object
    }
}
