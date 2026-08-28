package Problems;

public class Pro1 {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5,6};
        int k=3;
        shift(arr1,k);
        for(int res:arr1) System.out.print(res+" ");
        System.out.println();

        int[] arr2={10,5,20,8,15,7};
        System.out.println(maxi(arr2));

        int[] arr3={1,2,2,3,4,4,5,1};
        System.out.println(sub(arr3));

        int[] arr4={4,2,4,2,7,2,2};
        peak(arr4);
    }

    public static int[] shift(int[] arr,int k){

        if(k==0) return arr;

        swap(arr,0,k-1);
        swap(arr,k,arr.length-1);
        swap(arr,0,arr.length-1);

        return arr;
    }
    static void swap(int[] arr, int l, int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }

    public static int maxi(int[] arr){

        int max_sum=0;
        for(int i=2;i<arr.length;i+=2){
                int sum=0;
                for(int j=i+2;j<arr.length;j+=2){
                    sum+=arr[i]+arr[j];
                }
                max_sum=Math.max(max_sum,sum);
        }
        return max_sum;
    }

    public static int sub(int[] arr){
        int max_length=1;
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[i]==arr[j]){
                    max_length=Math.max(max_length,j-i+1);
                }
            }
        }
        return max_length;
    }

    static void peak(int[] arr){
        for(int i=0;i<arr.length;i++){
            int l=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]) l++;
            }
            if(l%2==1) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
