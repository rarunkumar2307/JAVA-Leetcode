package Problems;

public class Pro4 {
    public static void main(String[] args) {
        int[] ar1={-10,-20,5,7,2,8,1,6,67};
        System.out.println(maxProduct(ar1));

        int[] ar2={10,5,12,3,15,80};
        System.out.println(graterElement(ar2));

        int[] ar3={2,1,5,1,3,2};
        int k=3;
        System.out.println(SumOfK(ar3,k));

        int[] ar4={1,1,0,1,1,1,0};
        System.out.println(MaxCon(ar4));

    }

    static int maxProduct(int[] arr){
        int product=1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                product=Math.max(product,arr[i]*arr[j]);
            }
        }
        return product;
    }

    static int graterElement(int[] arr){

        for(int i=1;i<arr.length-1;i++){
            boolean res=true;
            for(int j=0;j<i;j++){
                if(arr[i]<=arr[j]){
                    res=false;
                    continue;
                }
                break;
            }
            if(res) return arr[i];

        }
        return -1;
    }

    static int SumOfK(int[] arr,int k){
        int sum=0;
        for(int i=0;i<arr.length-k;i++){
            int cu=0;
            for(int j=i;j<i+k;j++){
                cu+=arr[j];
            }
            sum=Math.max(sum,cu);
        }
        return sum;
    }

    static int MaxCon(int[] arr){
        int l=0;
        for(int i=0;i<arr.length;i++){
            int z=0;
            int c=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0){
                    z++;
                }
                if(z==2) break;

                c++;
            }
            l=Math.max(l,c);
        }
        return l;
    }
}
