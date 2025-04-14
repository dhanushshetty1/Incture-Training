class ABC{
    public ABC(){
        this(10);
        System.out.println("no para parent");
    }
    public ABC(int i){
        System.out.println("para parent");
    }
}
class XY extends ABC{
    public XY(){
        this(10);
        System.out.println("no para child");
    }
    public XY(int i){
        super();
        System.out.println("para child");
    }
}

public class thisAsuper {
    public static void main(String[] args) {
        XY ob = new XY();
    }
}
