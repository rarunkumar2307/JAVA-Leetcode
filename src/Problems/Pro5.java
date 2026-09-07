package Problems;

import java.util.Arrays;
import java.util.HashMap;

public class Pro5 {
    public static void main(String[] args) {
        int[] ar1={1,2,3,4,5};
        Wave(ar1);
        for(int r1:ar1) System.out.print(r1+" ");
        System.out.println();

        int[] ar2={4,2,12,3,5,1};
        int k=3;
        mini(ar2,k);
        System.out.println();

        int[] ar3={1,2,2,3,3,3,4,4};
        System.out.println("MAX DIFF->"+maxDiff(ar3));

        int[] ar4={1,3,5};
        int[] ar5={2,4,6};
        System.out.println(median(ar4,ar5));
    }

    static void Wave(int[] arr){
        for(int i=1;i<arr.length;i+=2){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
    }

    static void mini(int[] arr,int k){
        for(int i=0;i<=arr.length-k;i++){
            int min=arr[i];
            for(int j=i+1;j<k+i;j++){
                min=Math.min(min,arr[j]);
            }
            System.out.print(min+" ");
        }
    }

    static int maxDiff(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        int minFre=Integer.MAX_VALUE;
        int maxFre=Integer.MIN_VALUE;
        for(int r:arr){
            if(map.containsKey(r)) {
                int c=map.get(r);
                map.put(r,c+1);
            }else map.put(r,1);
        }
        for(int r:arr){
            minFre=Math.min(minFre,map.get(r));
            maxFre=Math.max(maxFre,map.get(r));
        }
        System.out.println("minFre->"+minFre);
        System.out.println("maxFre->"+maxFre);
        return maxFre-minFre;
    }

    static double median(int[] ar1,int[] ar2){
        int[] arr=new int[ar1.length+ar2.length];
        for(int i=0;i<ar1.length;i++){
            arr[i]=ar1[i];
        }
        for(int i=0;i<ar2.length;i++){
            arr[ar1.length+i]=ar2[i];
        }

        Arrays.sort(arr);

        if(arr.length%2==0) return (arr[arr.length/2]+arr[arr.length/2-1])/2.0;
        else return arr[arr.length/2];
    }
}
