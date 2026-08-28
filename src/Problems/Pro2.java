package Problems;
import java.util.*;

public class Pro2 {
    public static void main(String[] args) {
        int[] ar1={5,2,2,8,2,3,2};
        System.out.println(secOcc(ar1));

        int[] ar2={10,20,5,30,15,40};
        System.out.println(maxOdd(ar2));

        int[] ar3={10,3,8,20,5};
        System.out.println(maxDiff(ar3));

        int[] ar4={15,-2,2,-8,1,7,10,23};
        System.out.println(subArr(ar4));

    }

    static int secOcc(int[] arr){
        int[] dup=arr.clone();
        Arrays.sort(dup);
        int small=dup[0];

        int l=0;
        int occ=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==small) if(++l==2) occ=i;
        }
        return occ;
    }

    static int maxOdd(int[] arr){
        int sum=0;
        for(int i=1;i<arr.length-2;i+=2){
            sum=Math.max(sum,arr[i]+arr[i+2]);
        }
        return sum;
    }

    static int maxDiff(int[] arr){
        int diff=0;
        for(int i=0;i<arr.length-1;i++){
            diff=Math.max(diff,arr[i]-arr[i+1]);
        }
        return diff;
    }

    static int subArr(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int curr=0;
            for(int j=i;j<arr.length;j++){
                curr+=arr[j];
                if(curr==0){
                    sum=Math.max(sum,j-i+1);
                }
            }
        }
        return sum;
    }
}
