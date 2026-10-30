package Problems;

public class Pro15 {
    public static void main(String[] args) {
        int[] arr1={1,3,2,4,5};
        System.out.println(isSort(arr1));

        int[] arr2={1,11,5,6,12,2};
        System.out.println("The MAX Sum is: "+sum(arr2));

        int n=5;
        for(int i=0;i<n;i++){
            for(int s=0;s<n-i-1;s++){
                System.out.print(" ");
            }
            for(int j=n/2-i;j<n+i-2;j++){
                if(n/2==j) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }

        System.out.println((11>>1)&1);
        System.out.println(isHappy(3));
    }
    static String isSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]) return "Not Sorted";
        }
        return "Is Sorted";
    }
    static int sum(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int minIndex=0;
        int maxIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
            if(arr[i]<min){
                min=arr[i];
                minIndex=i;
            }
        }
        int sum=0;
        for(int i=minIndex;i<=maxIndex;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        if(n==1) return true;

        int i=1;
        while(50>i){
            i++;
            int sum=0;
            while(n>0){
                int d=n%10;
                sum=d*d;
                n/=10;
            }
            if(sum==1) return true;
            else n=sum;
        }
        return false;
    }
}
