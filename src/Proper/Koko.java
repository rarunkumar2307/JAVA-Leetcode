package Proper;

public class Koko {
    static void main() {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.print(minEatingSpeed(piles, h));
    }
    static int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high =0;
        for(int p:piles) high =Math.max(high,p);
        while(low< high){
            int mid=low+(high-low)/2;
            int hr=0;
            for(int p:piles){
                hr+=(p+mid-1)/mid;
            }
            if(hr<=h) high=mid;
            else low=mid+1;
        }
        return low;
    }
}
