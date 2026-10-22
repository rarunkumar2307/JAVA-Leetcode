package Problems;
public class Sort {
    static void main(String[] args) {
        int[] arr={7,4,8,5,9,10,6,11,10,9};
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int r:arr) System.out.print(r+" ");
    }
}
