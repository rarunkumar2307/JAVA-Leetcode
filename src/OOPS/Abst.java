package OOPS;

abstract class Car{
    abstract void drive();

    void music(){
        System.out.println("Playing...");
    }

    Car(){
        System.out.println("I am the Car");
    }
}

class BMW extends Car{
    void drive(){
        System.out.println("Driving...");
    }
}

public class Abst{
    public static void main(String[] args) {

        BMW obj=new BMW(); // BMW obj=new BMW(); also work
        obj.music();
        obj.drive();
    }
}
