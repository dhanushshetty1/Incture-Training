public class AB {
    static int x=100;
    int y=200;

    public static void main(String[] args)
    {
        AB ob = null;
        AB ob1=new AB();
        System.out.println("X:"+x);
        System.out.println("x: "+AB.x);
        System.out.println("x: "+ob.x);
        System.out.println("x: "+ob1.y);

    }
}
