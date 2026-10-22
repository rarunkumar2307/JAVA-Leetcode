package OOPS;

class Morning implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++) {
            System.out.println("Good Morning ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Afternoon implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++) {
            System.out.println("Good Afternoon ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Implements_Thread {
    public static void main(String[] args){
//        Runnable obj1=new Morning();
//        Runnable obj2=new Afternoon();
//
//        Thread t1=new Thread(obj1);
//        Thread t2=new Thread(obj2);
//
//        t1.start();
//        t2.start();

        Thread t1=new Thread(new Morning());
        Thread t2=new Thread(new Afternoon());

        t1.start();
        t2.start();
    }
}
