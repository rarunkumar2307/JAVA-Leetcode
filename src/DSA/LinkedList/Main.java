package DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.deleteFirst();
        list.insertEnd(40);
        list.insertFirst(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertFirst(5);
        list.insertAt(5,25);
        list.show();
        list.deleteFirst();
        list.show();
        list.deleteEnd();
        list.show();
        list.deleteAt(2);
        list.show();
    }
}
