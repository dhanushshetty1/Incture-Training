package Aggregation;

class Address{
    String city,state,country;
    public Address(String city,String state,String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

public class Demo2 {
    int id;
    String name;
    Address add;

    public Demo2(int id,String name,Address add){
        this.id = id;
        this.name = name;
        this.add = add;
    }

    void display(){
        System.out.println(id + " : " + name );
        System.out.println(add.city + ","+add.state+","+add.country);
    }
    public static void main(String[] args) {
        Address add1 = new Address("Mysore", "Karnataka", "India");
        Demo2 obj = new Demo2(101, "Shetty", add1);
        obj.display();
    }   
}
