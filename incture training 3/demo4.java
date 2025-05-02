class Display{
    public synchronized void wish(String name)
    {
        for(int i =0; i<10; i++)
        {
        System.out.println("Good Evening :");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name);
        }
    }
}

class mythread4 extends Thread{
    Display d;
    String name;

    public mythread4(Display d,String name){
        this.d =d;
        this.name = name;
    }
    public void run(){
        d.wish(name);
    }
}

public class demo4 {
    public static void main(String[] args) {
        Display obj1 = new Display();
        mythread4 thread1 = new mythread4(obj1, "Shetty");
        mythread4 thread2 = new mythread4(obj1, "Dhanush");

        thread1.start();
        thread2.start();
    }
}
