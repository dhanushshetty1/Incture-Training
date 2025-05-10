package Java8;

interface i3{
    void info(String name);
}

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Good morg");
        i3 ob = (name) -> System.out.println(name);
        ob.info("Dhanush");
    }
}