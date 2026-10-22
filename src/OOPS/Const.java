package OOPS;

class Shape{ ;
    Shape(String s){
        System.out.println("Hello "+s);
        this();
    }
    Shape(){
        System.out.println("Your Welcome");
        this(3);
    }
    Shape(int c){
        System.out.println(c);
    }
}

class Vehicle{
    String sh;
    public Vehicle(String sh){
        this.sh=sh;
        System.out.println(sh+" Vehicle initialized");
    }
}
class Caru extends Vehicle{
    int doors;

    public Caru(String sh,int doors){
        super(sh);
        this.doors=doors;
        System.out.println(sh+" Car Completed with "+doors+" Dorrs");
    }
}

class AA{
    public  AA(){
        System.out.println("Hey Buddy...");
    }
}
class BB extends AA{
    void pr(){
        System.out.println("Hello Buddy");
    }
}

public class Const {
    public static void main(String[] args) {
//        new Shape("Square");
//        new Vehicle("BMW");
//        new Caru("BMW",6);

        BB bb=new BB();
        bb.pr();

        Vehicle v=new Vehicle("WV");

    }
}

