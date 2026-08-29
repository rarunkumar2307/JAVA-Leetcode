package Problems;

public class Str {
    public static void main(String[] args) {
        String s="babadiopgdhinji";
        Solution si=new Solution();
        System.out.println(si.longestStrEnd(s));

        String ss="madddamubdiopasapoui";
        System.out.println(si.longestPalindrome(ss));

    }
}
class Solution {
    public String longestStrEnd(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){

                if(s.charAt(j)==s.charAt(i)) {
                    String c = s.substring(i, j + 1);
                    if (c.length() > ans.length()) {
                        ans = c;
                    }
                }
            }
        }
        return ans;
    }


    public String longestPalindrome(String s) {

        if(s.length()<=1) return s;

        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>i;j--){
                if(s.charAt(i)==s.charAt(j)){
                    String cuu=s.substring(i,j+1);

                    if(palindrome(cuu)){
                        if(cuu.length()>ans.length()) ans=cuu;
                    }

                }
            }
        }
        if(ans.length()==0){
            String o=String.valueOf(s.charAt(0));
            return o;
        }
        else return ans;
    }
    static boolean palindrome(String s){
        int l=0;
        int r=s.length()-1;
        boolean b=true;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return b;
    }
}
