package Problems;

import java.util.*;

class Pro14 {

    public static String BracketMatcher(String str) {
        // code goes here

        int count=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='(') count++;
            else if(c==')') count--;
        }
        return count==0?"1":"0";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(BracketMatcher(s.nextLine()));
    }

}