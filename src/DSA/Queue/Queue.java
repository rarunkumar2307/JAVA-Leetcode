package DSA.Queue;
import java.util.NoSuchElementException;

public class Queue {
    int[] Queue= new int[5];
    int size;
    int front;
    int rear;


    public void EnQueue(int data){
        if(!isFull()){
            Queue[rear]=data;
            rear=(rear+1)%Queue.length;
            size++;
        }else System.out.println("Queue is FULL !!");
    }
    public int DeQueue(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is EMPTY !!");
        }
        int data = Queue[front];
        front = (front + 1) % Queue.length;
        size--;

        return data;
    }
    public void Show(){
        if (isEmpty()) {
            System.out.println("Queue is EMPTY !!");
            return;
        }
        for(int i=0;i<size;i++){
            System.out.print(Queue[(front+i)%Queue.length]+" ");
        }
        System.out.println();
    }
    boolean isFull(){
        return getSize()==Queue.length;
    }
    boolean isEmpty(){
        return getSize()==0;
    }
    int getSize(){
        return size;
    }
}
