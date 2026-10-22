package OOPS;

import java.util.Scanner;

class name{
    void printname(String name){
        System.out.println("Your Name is "+name);
    }
}

public class Dummy {
    static int i=1;
    static Scanner sc=new Scanner(System.in);
    public static void main(){
        System.out.print("Enter Your Name :");
        String s=sc.nextLine();
        name n=new name();
        n.printname(s);

        if(i<=10){
            System.out.println(+i);
            i++;
            main();
        }
    }
}
