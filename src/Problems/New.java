package Problems;
import java.util.*;

public class New {
    public static void main(String[] args){
        int[] arr={4,5,1,2,0,4,4,9};
        System.out.println("NON REPEATING :"+repeating(arr));


        int[] arr2={1,1,1,2,3,3,4,5,5,6};
        System.out.println("ORIGINAL ELEMENT COUNT :"+removeDup(arr2));

        int[] arr3={1,3,2};
        System.out.print(monotonic(arr2));

        plusone(arr3);

        int[][] arr4={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        rotate(arr4);
    }

    public static int repeating(int[] arr){
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                count++;
                set.add(arr[i]);
            }
        }
        return count;
    }

    public static int removeDup(int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        for(int res:arr2) set.add(res);
        for(int res2:set) System.out.print(res2+" ");
        return set.size();
    }

    public static boolean monotonic(int[] arr2){
        boolean result1=true;
        boolean result2=true;
        for(int i=0;i<arr2.length-1;i++){
            if(arr2[i]>arr2[i+1]) result1=false;
            if(arr2[i]<arr2[i+1]) result2=false;
            }
        return result1 || result2;
    }

    public static void plusone(int[] arr3){
        int num=0;
        for(int res:arr3){
            num*=10;
            num+=res;
        }

        System.out.println(num+=1);

        String st=String.valueOf(num);
        int[] res=new int[st.length()];

        for(int i=0;i<st.length();i++){
            res[i]=st.charAt(i)-'0';
        }

        for(int res2:res) System.out.print(res2+" ");
        System.out.println();
    }

    public static void rotate(int[][] arr){
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
