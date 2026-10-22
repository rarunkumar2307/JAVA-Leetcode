package OOPS;

class A{
    int data=10;
    String val="data";

    void speak(){
        System.out.println("Speaking...");
    }

    //Inside the Class A
    class B{
        void run(){
            System.out.println("Running...");
        }
    }

    static class C{
        void dance(){
            System.out.println("Dancing...");
        }
    }
}

public class Inner_Class{
    public static void main(String[] args){
        A obj=new A();
        System.out.println(obj.data);
        System.out.println(obj.val);
        obj.speak();

        A.B obj1=obj.new B();
        obj1.run();

        A.C obj2=new A.C();
        obj2.dance();
    }
}
