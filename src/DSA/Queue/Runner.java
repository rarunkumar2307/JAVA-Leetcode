package DSA.Queue;

public class Runner{
    public static void main(String[] args) {
        Queue qu=new Queue();
        qu.Show();
//        qu.DeQueue();
        System.out.println(qu.getSize());
        qu.EnQueue(1);
        qu.EnQueue(2);
        qu.EnQueue(3);
        qu.Show();
        qu.EnQueue(4);
        qu.EnQueue(5);
        qu.Show();
        System.out.println(qu.DeQueue());
        System.out.println(qu.DeQueue());
        System.out.println(qu.DeQueue());
        System.out.println(qu.DeQueue());
        System.out.println(qu.DeQueue());
//        System.out.println(qu.DeQueue());
        qu.Show();

    }
}
