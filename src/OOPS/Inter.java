package OOPS;

interface Arun{
    int age=10;
    String name="Ben";

    void fighting();
}
class San implements Arun{
    public void fighting(){
        System.out.println("Fighting...");
    }
}

public class Inter {
    public static void main(String[] args){
        Arun obj=new San();
        System.out.println(Arun.age);
        System.out.println(Arun.name);
        obj.fighting();
    }
}
