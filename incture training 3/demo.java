class mythread extends Thread{
    public void run(){
        for(int i =0; i<10; i++){
            System.out.println("child threads");
        }
    }
}

public class demo {
    public static void main(String[] args) {
        mythread thread = new mythread();
        thread.start();
        //thread.run();
//main method has separate thread
        for(int i =0; i<10; i++){
            System.out.println("main threads");
        }
    }
}
