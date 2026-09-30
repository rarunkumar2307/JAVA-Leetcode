package Problems;

import java.util.*;

public class Pro12 {
    public static void main(String[] args) {
        int[] arr = {-10,-20,0,7,2,0,1,6,67,67,1};
        int last=arr.length;

        for(int i=0;i<last;i++){
            if(arr[i]==0){
                --last;
                int temp=arr[last];
                arr[last]=arr[i];
                arr[i]=temp;
            }
        }
        for(int r:arr) System.out.print(r+" ");
        System.out.println();

        System.out.println("2ND LARGE = "+sl(arr));

        uniq(arr);
    }

    public static int sl(int[] arr){
        int tl=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>tl){
                sl=tl;
                tl=arr[i];
            }else  if(arr[i]>sl) sl=arr[i];
        }
        return sl;
    }

    public static void uniq(int[] arr){
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<arr.length;i++) map.add(arr[i]);
        System.out.println(map);
        for(int r:map) System.out.print(r+" ");
    }
}
