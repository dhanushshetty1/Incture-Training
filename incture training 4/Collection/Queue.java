package Collection;

class Queue1 {
    int queue[] = new int [5];
    int size;
    int front;
    int rear;

    public void enQueue(int data){
        queue[rear] =  data;
        rear++;
        size++;
    }
    public void show(){
        System.out.println("Element : ");
        for(int i =0; i<size; i++){
            System.out.println(queue[i] + " ");
        }
    }

}

public class Queue{
    public static void main(String[] args) {
        
    }
}
