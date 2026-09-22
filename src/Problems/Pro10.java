package Problems;

public class Pro10{
    public static void main(String[] args){
        int[] arr={5,2,3,7};
        int date=12;
        if(date%2==0) System.out.println(rule1(arr,date));
        else System.out.println(rule2(arr,date));

        int[] arr2={1,0,2,0,1,0,2};
        sort(arr2);
        System.out.println();

        String s="###***";
        System.out.println(valid(s));
    }
    static int rule1(int[] arr,int date){
        int fine=0;
        for(int i=0;i<arr.length;i++) if(arr[i]%2==1) fine+=200;
        return fine;
    }
    static  int rule2(int[] arr,int date){
        int fine=0;
        for(int i=0;i<arr.length;i++) if(arr[i]%2==0) fine+=200;
        return fine;
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int r:arr) System.out.print(r+" ");
    }
    static int valid(String s){
        int st=0;
        int ha=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#') ha++;
            else st++;
        }
        return st-ha;
    }
}

