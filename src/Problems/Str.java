package Problems;

public class Str {
    public static void main(String[] args) {
        String s="babad";
        Solution si=new Solution();
        System.out.println(si.longestPalindrome(s));

    }
}
class Solution {
    public String longestPalindrome(String s) {
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
}
