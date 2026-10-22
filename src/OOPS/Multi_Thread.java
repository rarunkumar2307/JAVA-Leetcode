package OOPS;

class AM extends Thread{
    public void run(){
        for(int i=1;i<=100;i++) {
            System.out.println("Good Morning "+Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class PM extends Thread{
    public void run(){
        for(int i=1;i<=100;i++) {
            System.out.println("Good Afternoon "+Thread.currentThread().getName());
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}

public class Multi_Thread{
    public static void main(String[] aegs){

        AM obj1=new AM();
        PM obj2=new PM();

        System.out.println(Thread.currentThread().getName()+"-"+obj1.getPriority()+"\n"+
        Thread.currentThread().getName()+"-"+obj2.getPriority());

        obj1.setPriority(10);
        obj2.setPriority(Thread.MIN_PRIORITY);

        obj1.start();
        obj2.start();

//        System.out.println(Thread.currentThread().getName()+"-"+obj1.getPriority()+"\n"+
//        Thread.currentThread().getName()+"-"+obj2.getPriority());


    }
}
