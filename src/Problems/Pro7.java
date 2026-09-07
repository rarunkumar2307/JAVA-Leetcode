package Problems;

import java.util.HashSet;

public class Pro7 {

    static int Inversion(int[] arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++) if(arr[i]>arr[j]) count++;
        }
        return count;
    }

    static int Distinct(int[] arr){

        int max=0;
        for(int i=0;i<arr.length;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<arr.length;j++){
                if(set.contains(arr[j])) break;
                set.add(arr[j]);
            }
            max=Math.max(set.size(),max);
        }
        return max;
    }

    static int MaxRow(int[][] arr){
        int max=0;
        int row=0;
        for(int i=0;i<arr.length;i++){
            int currentMax=0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1) currentMax++;
            }
            if(currentMax>max){
                max=currentMax;
                row=i;
            }
        }
        return row+1;
    }

    public static void main(String[] a) {
        int[] ar1={2,4,1,3,5};
        System.out.println("Count->"+Inversion(ar1));

        int[][] ar2={
                {1,1,1,1},
                {0,1,1,1},
                {0,0,1,1}
        };
        System.out.println("MaxRow->"+MaxRow(ar2));

        int[] ar3={1,2,3,1,4,5};
        System.out.println(Distinct(ar3));
    }
}
