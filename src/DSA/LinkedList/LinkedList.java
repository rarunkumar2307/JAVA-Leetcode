package DSA.LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

public class LinkedList {
    Node head;
    public void insertFirst(int data){
        Node N=new Node(data);
        N.next=head;
        head=N;
    }

    public void insertEnd(int data){
        Node N=new Node(data);

        if(head==null){
            head=N;
            return;
        }

        Node temp=head;
        while(temp.next!=null) temp=temp.next;

        temp.next=N;
    }

    public void insertAt(int index,int data){
        if(index<0) throw new IndexOutOfBoundsException("Invalid Index Value");

        if(index==0) {
            insertFirst(data);
            return;
        }

        Node temp=head;
        for(int i=0;i<index-1;i++){
            if(temp==null) throw new IndexOutOfBoundsException("Invalid Index Value");
            temp=temp.next;
        }
        if(temp==null) throw new IndexOutOfBoundsException("Invalid Index Value");

        Node N=new Node(data);
        N.next=temp.next;
        temp.next=N;
    }

    public void show(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head=head.next;
    }

    public void deleteEnd(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }

        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public void deleteAt(int index){
        if(index<0) throw new IndexOutOfBoundsException("Invalid Index Value");

        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        if(index==0){
            deleteFirst();
            return;
        }

        Node temp=head;
        for(int i=0;i<index-1;i++){
            if(temp.next==null) throw new IndexOutOfBoundsException("Invalid Index Value");
            temp=temp.next;
        }
        if(temp.next==null) throw new IndexOutOfBoundsException("Invalid Index Value");

        temp.next=temp.next.next;
    }
}
