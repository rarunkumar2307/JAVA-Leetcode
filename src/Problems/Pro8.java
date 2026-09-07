package Problems;
import java.util.*;
public class Pro8 {
    public static void main(String[] a){
        String s1="programming";
        int k=2;
        System.out.println(Fchar(s1,k));

        int[][] ar1={
                {1,2,3},
                {2,4,5},
                {3,5,6}
        };
        if(symmetric(ar1)) System.out.println("Symmetric");
        else System.out.println("Not a Symmetric");

        int[][] ar2={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(sum(ar2));


    }
    static char Fchar(String s,int k){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int d=map.get(s.charAt(i));
                map.put(s.charAt(i),d+1);
                if(map.get(s.charAt(i))==k) return s.charAt(i);
            }else map.put(s.charAt(i),1);
        }
        return ' ';
    }

    static boolean symmetric(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]!=arr[j][i]) return false;
            }
        }
        return true;
    }

    static int sum(int[][] arr){
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j) sum1+=arr[i][j];
                if(i+j==arr.length-1) sum2+=arr[i][j];
            }
        }
        return sum1-sum2;
    }
}
