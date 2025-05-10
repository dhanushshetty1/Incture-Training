package Java8;

@FunctionalInterface
interface i1 {
    void m1();
}

@FunctionalInterface
interface i2 {
    int add(int x,int y);
    
}


public class Demo {
    public static void main(String[] args) {
        i1 ref = () -> System.out.println("Good Mrg");
        ref.m1();

        i2 ref1 = (x,y) -> x+y;
        System.out.println(ref1.add(10, 5));



        Runnable ref3 = ()-> {for(int i=0; i<5; i++){System.out.println("child Thread");}};
        Thread t1 = new Thread(ref3);
        t1.start();

        for(int i=0; i<5; i++){System.out.println("main Thread");}
    }

}
