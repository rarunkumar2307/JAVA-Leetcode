package Problems;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Pro13 {
    int peak(int[] arr){
        int peak=Integer.MIN_VALUE;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]) peak=Math.max(arr[i],peak);
        }
        if(arr[0]>arr[1]) peak=Math.max(arr[0],peak);
        if(arr[arr.length-1]>arr[arr.length-2]) peak=Math.max(arr[arr.length-1],peak);

        return peak;
    }

    static void str(String s){
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        LinkedHashMap<String,StringBuilder> map1=new LinkedHashMap<>();

        String[] st=s.trim().split(" ");

        for(int i=0;i<st.length;i++) {
            map.put(st[i],st[i].length());
        }
        System.out.println(map);

        for(int i=0;i<st.length;i++){
            map1.put(st[i],reverse(st[i]));
        }
        System.out.println(map1);

    }

    static StringBuilder reverse(String s){
        StringBuilder ss=new StringBuilder(s);
        int st=0;
        int en=ss.length()-1;
        while(st<en){
            char ch1=ss.charAt(st);
            char ch2=ss.charAt(en);
            ss.setCharAt(st,ch2);
            ss.setCharAt(en,ch1);
            ++st;
            --en;
        }
        return ss;
    }

    static int sum(int[] arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
            if(arr[i]>max) max=arr[i];
        }
        int s=0;
        int e=0;
        for(int i=0;i<arr.length;i++){
            if(min==arr[i]) s=i;
            if(max==arr[i]) e=i;
        }
        int count=0;
        for(int i=Math.min(s,e);i<=Math.max(e,s);i++){
            count+=arr[i];
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr={10,3,20,4,1,0};
        Pro13 p=new Pro13(); //no used
        System.out.println("Peak :"+new Pro13().peak(arr));

        str("I am Batman");
        System.out.println("Sum :"+sum(arr));
    }
}
