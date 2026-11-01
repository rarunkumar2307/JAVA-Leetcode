package Proper;
//SPIRAL The 2D Array
public class twoDArray {
    static void main(){
        int[][] arr = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==0) System.out.print(arr[i][j]+" ");
            }
            for(int j=0;j<arr[i].length;j++){
                if(i!=0 && j==arr[i].length-1) System.out.print(arr[i][j]+" ");
            }
            for(int j=arr[i].length-2;j>=0;j--){
                if(i==arr.length-1) System.out.print(arr[i][j]+" ");
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length-1;j++){
                if(i!=0 && i!=arr.length-1) System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
        System.out.print(toInt("1234")+1);
    }
     public static int toInt(String n){
        int r=0;
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            int in=c-'0';
            r=r*10+in;
        }
        return r;
    }
}
