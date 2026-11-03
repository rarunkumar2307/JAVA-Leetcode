package Proper;

class Rob {
    static int rob(int[] nums) {
        int prev1=0;
        int prev2=0;

        for(int money:nums){
            int rob=money+prev2;
            int skip=prev1;
            int current=Math.max(rob,skip);
            prev2=prev1;
            prev1=current;
        }
        return prev1;
    }
    static void main() {
        int[] ar1={2,7,9,3,1};
        int[] ar2={1,2,3,1};
        System.out.println(rob(ar1));
        System.out.println(rob(ar2));
    }
}