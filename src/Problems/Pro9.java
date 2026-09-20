package Problems;

public class Pro9 {
    public static void main(String[] args) {
        int[] arr1={7,4,8,5,9,10,6,11,10,9};
        int[] arr={7,4,9,5,8};
        int count=1;
        boolean res;
        for(int i=1;i<arr.length;i++){
            res=true;
            for(int j=0;j<i;j++){
                if(arr[j]>=arr[i]) {
                    res=false;
                    break;
                }
            }
           if(res) count++;
        }
        System.out.print(count);
    }
}
