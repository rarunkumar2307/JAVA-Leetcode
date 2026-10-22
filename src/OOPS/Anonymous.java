package OOPS;

class Bat{
    void fight(){
        System.out.println("Protecting...");
    }
}

public class Anonymous{
    public static void main(String[] args){
        Bat b=new Bat(){
            void fight(){
                System.out.println("Batman is Protecting...");
            }
        };
        b.fight();
    }
}
