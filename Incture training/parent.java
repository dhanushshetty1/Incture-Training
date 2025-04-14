class parent1 {
    public void display(){
        System.out.println("dosplay meth0d of parent class");
    }
}

// class x {
//     public void display(){
//         System.out.println("dosplay meth0d of parent class");    cant have two class inhertiance
//     }
// }
// class child extends parent1, x{

// }

class child extends parent1{

}
public class parent {

    public static void main(String[] args) {
        child ob = new child();
        ob.display();
    }
}