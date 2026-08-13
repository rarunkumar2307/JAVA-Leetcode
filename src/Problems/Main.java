package Problems;

//import java.util.*;
//class Main{
//    static Scanner z=new Scanner(System.in);
//    public static  void main(String[] args){
//        int ip=z.nextInt();
//        int f1=0;
//        int f2=1;
//        int f3;
//        System.out.print(f1+","+f2);
//        for(int i=0;i<ip;i++){
//            f3=f1+f2;
//            System.out.print(","+f3);
//            f1=f2;
//            f2=f3;
//        }
//    }
//}

//import java.util.*;
//class Main{
//    static Scanner z=new Scanner(System.in);
//    public static  void main(String[] args){
//        int ip=z.nextInt();
//        System.out.print(fact(ip));
//    }
//    public static int fact(int ip){
//        if(ip==1) return 1;
//
//        ip=ip*fact(ip-1);
//        return ip;
//    }
//}

//import java.util.*;
//class Main{
//    static Scanner z=new Scanner(System.in);
//    public static  void main(String[] args){
//        String ip=z.nextLine();
//
//        if(ip==null) return;
//
//        String[] arr=ip.trim().split("\\s+");
//
//        String longword="";
//        for(String word:arr){
//            if(word.length()>longword.length()) longword=word;
//        }
//        System.out.print(longword);
//    }
//}

//import java.util.*;
//class Main{
//    public static void main(String[] args){
//
//        String ip="abcd";
//
//        char[] ch=ip.toCharArray();
//
//        int l=ip.length();
//        while(l>0){
//            System.out.print(ch[l-1]);
//            l--;
//        }
//    }
//}

//import java.util.*;
//class Main{
//    public static void main(String[] args){
//        char L='a';
//        char R='z';
//        for(int i=1;i<=13;i++){
//            System.out.print(L+""+R+" ");
//            L++;
//            R--;
//        }
//    }
//}

class Main{
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


