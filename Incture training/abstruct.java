abstract class S{
    //this can contain both normal and abstract method 
    public abstract void m1();
    public void display(){
        System.out.println("welcme....");
    }

}
//we can also change the class to abstact
abstract class T extends S{
    //public void m1(){}//we have to create a boody for abstact method only if abstact is not add(abstract class)
}

public class abstruct {
    
}
