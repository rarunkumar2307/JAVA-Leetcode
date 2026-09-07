package Problems;

public class Pro6 {
    public static void main(String[] args) {
        String s1="babad";
        System.out.println(LongPoli(s1));

        String s2="aaabbccdaa";
        System.out.println(RemoveDup(s2));

        int[] ar1={2,5,12,8,12,15};
        int t=10;
        System.out.println(Closest(ar1,t));

        int[][] ar2={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(SumPath(ar2));
    }
    static String LongPoli(String s){
        String r="";
        for(int i=0;i<s.length()-1;i++){
            for(int j=s.length()-1;j>i;j--){
                if(s.charAt(i)==s.charAt(j) && polimor(s.substring(i,j+1))){
                    String cu=s.substring(i,j+1);
                    if(r.length()<cu.length()) r=cu;
                }
            }
        }
        return r;
    }
    static boolean polimor(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    static StringBuilder RemoveDup(String s){
        StringBuilder n=new StringBuilder();
        n.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)) n.append(s.charAt(i));
        }
        return n;
    }

    static int Closest(int[] arr,int t){
        int min=Integer.MAX_VALUE;
        int index=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>Math.abs(arr[i]-t)){
                min=Math.abs(arr[i]-t);
                index=arr[i];
            }else if(min==Math.abs(arr[i]-t)) index=Math.min(index,arr[i]);
        }
        return index;
    }

    static int SumPath(int[][] arr){
        int sum=arr[0][0];
        int i=0;
        int j=0;
        while(i<arr.length-1 || j<arr[0].length-1){
            if(i==arr.length-1) j++;
            else if(j==arr[0].length-1) i++;
            else if(arr[i][j+1]<arr[i+1][j]) i++;
            else j++;
            sum+=arr[i][j];
        }
        return sum;
    }
}
