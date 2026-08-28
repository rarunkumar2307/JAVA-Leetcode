package Problems;
import java.util.*;

public class Sample {
    public static void main(String[] args){

        Animal an=new Dog();
        an.sound();

       inc("ABCD");

       int[] ar={1,2,3,4};
       pro(ar);

       int[] arr1={1,2,3};
       int[] arr2={2,3,4,5};
       union(arr1,arr2);
       System.out.println();


       int[] arr3={2,3,7,1,6};
       sort(arr3);

    }

    static class Animal {
        void sound(){
            System.out.println("Lion");
        }
    }

    static class Dog extends Animal{
        void sound(){
            System.out.println("Lion Son");
            super.sound();
        }
    }


    public static void inc(String name){

        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            System.out.print(ch+=1);
        }
        System.out.println();
    }

    public static void pro(int[] arr){

        int sum=1;
        for(int i=0;i<arr.length;i++){
            sum*=arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int multi=sum/arr[i];
            System.out.print(multi+" ");
        }
        System.out.println();
    }

    public static void union(int[] arr1, int[] arr2){

        HashSet<Integer> set=new HashSet<>();

        for(int r1:arr1){
            set.add(r1);
        }

        for(int r1:arr2){
            set.add(r1);
        }

        for(int f:set){
            System.out.print(f+" ");
        }
    }

    public static int peak(int[] arr){

        int max=0;
        for(int i=0;i<arr.length;i++){
            int target=arr[i];
//            for(int j=0;j<)
        }
        return -1;
    }

    public static void sort(int[] arr){

    for(int i=0;i<arr.length-1;i++) {
        for (int j=0; j<arr.length-1-i;j++) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }
        for(int res:arr) System.out.print(res+" ");
    }
}

