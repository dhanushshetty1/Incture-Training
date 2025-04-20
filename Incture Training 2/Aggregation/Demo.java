package Aggregation;

class Address{
    String city,state,country;
    public Address(String city,String state,String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

public class Demo {
    int id;
    String name;
    Address add;

    public Demo(int id,String name,Address add){
        this.id = id;
        this.name = name;
        this.add = add;
    }

    void display(Demo obj){
        System.out.println(obj.id + " : " + obj.name +" : " + obj.add);
        System.out.println(obj.add.city + "," + obj.add.state + ","+ obj.add.country);
    }
    public static void main(String[] args) {
        Address add1 = new Address("Mysore", "Karnataka", "India");
        Demo obj = new Demo(101, "Shetty", add1);
        obj.display(obj);
    }   
}
