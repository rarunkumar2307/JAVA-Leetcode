package Problems;

import java.util.*;

public class Problem {
    public static void main(String[] args){

        int[] arr1={4,3,2,7,8,2,3,1};
        dup(arr1);
        System.out.println();

        int[] arr2={2,4,8,10,12};
        System.out.print("Missing Even :"+missEven(arr2));
        System.out.println();

        int[] arr3={1,2,3,4,6,7,8,9,10,11};
        System.out.print("Max Length :"+adj(arr3));
        System.out.println();

        int[] arr4={4,3,12,7,8,1};
        System.out.print("Sum :"+sum(arr4));

    }

    public static void dup(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int res:arr) {
            if(set.contains(res)){
                System.out.print(res+" ");
            }
            set.add(res);
        }
    }

    public  static int missEven(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int res:arr) set.add(res);

        int missing=0;
        for(int i=2;i<arr.length+2;i+=2){
            if(!set.contains(i)) missing=i;
        }
        return missing;
    }

    public static int adj(int[] arr){
        int length=1;
        int maxLength=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==0 && arr[i+1]%2==1 || arr[i]%2==1 && arr[i+1]%2==0) length++;
            else {
                if(length>maxLength) maxLength=length;
                length=1;
            }
        }
        if(length>maxLength) maxLength=length;
        return maxLength;
    }

    public static int sum(int[] arr){
        int sum=0;
        int max=Integer.MIN_VALUE;
        int maxD=1;
        int min=Integer.MAX_VALUE;
        int minD=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxD=i;
            }
            if(arr[i]<min){
                min=arr[i];
                minD=i;
            }
        }

        for(int i=Math.min(maxD,minD);i<=Math.max(maxD,minD);i++){
            sum+=arr[i];
        }
        return sum;
    }
}


