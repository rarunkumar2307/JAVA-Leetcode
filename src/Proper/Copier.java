package Proper;

public class Copier{
    static void main(){
        System.out.print(sec(4,1,1)+" ");
        System.out.print(sec(5,1,2)+" ");
        System.out.print(sec(8,2,3)+" ");
    }
    static long sec(int n,int x, int y){
        if(n==0){
            return 0;
        }

        int firstCopy=Math.min(x,y);

        int remaining=n-1;

        if(remaining==0){
            return firstCopy;
        }

        long low=0;
        long high=(long)remaining*firstCopy;

        while(low<high){
            long mid=low+(high-low)/2;

            long copies =mid/x+mid/y;

            if(copies >=remaining) high=mid;
            else low=mid+1;
        }
        return firstCopy+low;
    }
}
