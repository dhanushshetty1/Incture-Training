class mythread3 extends Thread{
    public void run(){
        // System.out.println("Child priority : "+Thread.currentThread().getPriority());//deafult priority is same as parent class it is 5 becuase main priority has been changed after been inisalizedd
        for(int i=0; i<5; i++){
            System.out.println("child thread");
        
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
}

public class demo2 {
    public static void main(String[] args) throws InterruptedException {
        mythread3 thread = new mythread3();
        thread.start();
        //thread.join();
        thread.interrupt();
        Thread.currentThread().setPriority(10);//1-10 is the priority range
        for(int i=0; i<5; i++){
            System.out.println("main thread");
            Thread.sleep(10);
            // Thread.sleep(2000);
        }
        // System.out.println("main priority : "+Thread.currentThread().getPriority());
    }
}
