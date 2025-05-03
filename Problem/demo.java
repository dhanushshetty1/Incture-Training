package Problem;

class Display{
    public synchronized void abc()
    {
        for(char i = 'a' ; i<123 ; i++)
        {
        System.out.println(i);
        try {Thread.sleep(5);} catch (InterruptedException e) {e.printStackTrace();}
        System.out.println();
        }
    }
    public synchronized void num()
    {
        for(int i = 0 ; i<50 ; i++)
        {
        System.out.println(i);
        try {Thread.sleep(5);} catch (InterruptedException e) {}
        System.out.println();
        }
    }
}

class mythread5 extends Thread{
    Display d;

    public mythread5 (Display d){
        this.d =d;
    }
    public void run(){
        d.abc();
    }
}

class mythread6 extends Thread{
    Display d;

    public mythread6 (Display d){
        this.d =d;
    }
    public void run(){
        d.num();
    }
}

public class demo {
    public static void main(String[] args) {
        Display obj1 = new Display();
        mythread5 thread1 = new mythread5(obj1);
        mythread6 thread2 = new mythread6(obj1);

        thread1.start();
        thread2.start();
    }
}
