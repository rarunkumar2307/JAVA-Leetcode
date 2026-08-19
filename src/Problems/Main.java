package Problems;

import java.util.Scanner;

import java.util.*;
class Main{
    static Scanner z=new Scanner(System.in);
    public static  void main(String[] args){
        int ip=z.nextInt();
        int f1=0;
        int f2=1;
        int f3;
        System.out.print(f1+","+f2);
        for(int i=0;i<ip;i++){
            f3=f1+f2;
            System.out.print(","+f3);
            f1=f2;
            f2=f3;
        }
    }
}


class Main2{
    static Scanner z=new Scanner(System.in);
    public static  void main(String[] args){
        int ip=z.nextInt();
        System.out.print(fact(ip));
    }
    public static int fact(int ip){
        if(ip==1) return 1;

        ip=ip*fact(ip-1);
        return ip;
    }
}

class Main3{
    static Scanner z=new Scanner(System.in);
    public static  void main(String[] args){
        String ip=z.nextLine();

        if(ip==null) return;

        String[] arr=ip.trim().split("\\s+");

        String longword="";
        for(String word:arr){
            if(word.length()>longword.length()) longword=word;
        }
        System.out.print(longword);
    }
}

class Main4{
    public static void main(String[] args){

        String ip="abcd";

        char[] ch=ip.toCharArray();

        int l=ip.length();
        while(l>0){
            System.out.print(ch[l-1]);
            l--;
        }
    }
}


class Main5{
    public static void main(String[] args){
        char L='a';
        char R='z';
        for(int i=1;i<=13;i++){
            System.out.print(L+""+R+" ");
            L++;
            R--;
        }
    }
}

class Main6{
    public static void main(String[] args){
        int[]  arr={2,5,3,6,4,7,10};
        int M1=Integer.MIN_VALUE;
        int M2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>M1){
                M2=M1;
                M1=arr[i];
            }
            else if(arr[i]>M2 && arr[i]!=M1){
                M2=arr[i];
            }
        }
        System.out.print(M2);
    }
}


class Main7{
    public static void main(String[] args){
        int n=11;

        for(int i=1;i<=20;i+=2){
            int d=0;
            int d2=1;
            if(n%2==0) {
                System.out.println(n+"*"+i+"="+n*(i+d));
                d=d+1;
            }
            else{
                System.out.println(n+"*"+(i+1)+"="+n*(i+d2));
                d2+=1;
            }
        }
    }
}

class AFact{
    public static void main(String[] args){
        int n=5;
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum+=fact(i);
        }
        int sum2=0;
        for(int i=2;i<=n;i+=2){
            sum2+=fact(i);
        }
        System.out.print(sum-sum2);
    }
    static int fact(int n){
        if(n<=1) return 1;

        n=n*fact(n-1);
        return n;
    }
}

class fib{
    public static void main(String[] args){
        int n=7;
        System.out.println("0-Even");
        System.out.println("1-Odd");
        int sum=0;
        for(int i=1;i<=7;i++){
            sum+=1;
            if(sum%2==0) System.out.println(sum+"-"+"Even");
            else System.out.println(sum+"-"+"Odd");
        }
    }
}


class Long {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the digit of the sequence : ");
        int n = sc.nextInt();
        System.out.println("Type those no. : ");
        int prev = sc.nextInt();
        int currentL = 1;
        int maxLength = 1;
        for (int i = 1; i < n; i++) {
            int current = sc.nextInt();

            if (prev < current) currentL++;
            else currentL = 1;

            if (currentL > maxLength) maxLength = currentL;

            prev = current;
        }
        System.out.println("MAX SEQUENCE LENGTH :" + maxLength);

    }
}
