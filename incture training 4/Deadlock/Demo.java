package Deadlock;

public class Demo {
    public static void main(String[] args) {
        final String lock1 = "lock1";
        final String lock2 = "lock2";

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 has lock1");
                try { 
                    Thread.sleep(1000);
                 }
                  catch (Exception e) {}
                synchronized (lock2) {
                    System.out.println("Thread 1 wants lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 has lock2");
                try { 
                    Thread.sleep(1000);
                 } 
                 catch (Exception e){} 
                synchronized (lock1) {
                    System.out.println("Thread 2  wants lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
