package Problems;

import java.util.HashMap;

public class Pro11 {
    public static void main(String[] args){
        int[] amount={2000,500,200,100,50,20,10};
        int balance=4860;
        atm(amount,balance);

        int[] trans={500,-1200,200,-500,1000,-800};
        int n=trans.length;
        System.out.println("Available Balance :"+ withdraw(trans,n));
    }
    static void atm(int[] arr,int n){
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=n){
                int c=n/arr[i];
                n%=arr[i];
                count+=c;
                map.put(arr[i],c);
            }
        }
        System.out.println(map);
        if(n==0) System.out.println("Count Of Amounts :"+count);
        else System.out.println("Invalid Amount");
    }
    static int withdraw(int[] arr,int n){
        int balance=1000;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(balance>=-arr[i]) balance+=arr[i];
            }
            else balance+=arr[i];
        }
        return balance;
    }
}
