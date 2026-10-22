package Problems;
import java.util.*;

public class Patten {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        String s="Java Developer";
        Patten p=new Patten();
        p.count(s);
    }
    void count(String s){
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==' ') continue;
            if(!map.containsKey(c)) map.put(c,1);
            else{
                int val=map.get(c);
                map.put(c,val+1);
            }
        }
        System.out.println(map);

        System.out.println(map.keySet());
        for(char c: map.keySet()){
            System.out.print(c);
        }
        System.out.println();
        for(int c: map.values()){
            System.out.print(c);
        }
        System.out.println();
        for(Map.Entry<Character,Integer> c: map.entrySet()){
            System.out.print(c);
        }
        System.out.println();
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }
}
