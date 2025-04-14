interface I1{
    public void m1();
}

interface I2{
    public void m1();
}
// it supports inhertance of two parents
class E implements I1,I2{
    public void m1(){
        System.out.println("hello");
    }
}


public class Inter {
    public static void main(String[] args) {
        I1 ob = new E();
        ob.m1();
    }
}
