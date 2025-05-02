class mythread2 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        // for(int i=0; i<5; i++){
        //     System.out.println("child thread");
        // }
    }
}

public class demo1 {
    public static void main(String[] args) {
        mythread2 thread = new mythread2();
        
       Thread t = new Thread(thread);
       t.start();
    //    for(int i=0; i<5; i++){
    //     System.out.println("main thread");
    // }
    System.out.println(Thread.currentThread().getName());
    System.out.println(t.getName());
    }
}
