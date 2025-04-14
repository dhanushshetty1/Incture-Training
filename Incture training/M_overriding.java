class parent2 {
    public void display(){
        System.out.println("welcome all...........");
    }
}
    class child extends parent2{
        public void display(){ 
            System.out.println("how r u>>>>>>>>>");
        }
    }
public class M_overriding {
    public static void main(String[] args) {
        parent2 ob = new parent2();
        parent2 ob1 = new child();
        child ob2 = new child();
        child ob3 = new parent2();
        ob.display();
        ob1.display();
        ob2.display();
        ob3.display();

    }
        
        
    
}
