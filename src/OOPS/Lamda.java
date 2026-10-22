package OOPS;

//Without Parameter
@FunctionalInterface
interface no{
    void show();
}
//With Parameter and No Return type
@FunctionalInterface
interface app{
    void addition(int a,int b);
}
//With Parameter and Return type
@FunctionalInterface
interface m{
    int multiplay(int a,int b);
}

class Lamda {
    public static void main(String[] args) {

        no obj1= () -> System.out.println("Bat in the SHOW");

        app obj2= (a, b) -> System.out.println("Addition: "+(a+b));

        m obj3= (a,b) -> a*b;

        obj1.show();
        obj2.addition(5,2);
        System.out.println("Multiplay: "+obj3.multiplay(5,5));
    }
}
