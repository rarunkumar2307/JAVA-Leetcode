package String;

class Pro1{
    public static String reverseVowels(String ss) {
        StringBuilder s=new StringBuilder(ss);
        int start=0,end=s.length()-1;
        while(start<end){
            while(  s.charAt(start)!='A' &&s.charAt(start)!='a' &&
                    s.charAt(start)!='E' &&s.charAt(start)!='e' &&
                    s.charAt(start)!='I' &&s.charAt(start)!='i' &&
                    s.charAt(start)!='O' &&s.charAt(start)!='o' &&
                    s.charAt(start)!='U' &&s.charAt(start)!='u' &&
                    start<end
            ){
                start++;
            }
            while(  s.charAt(end)!='A' &&s.charAt(end)!='a' &&
                    s.charAt(end)!='E' &&s.charAt(end)!='e' &&
                    s.charAt(end)!='I' &&s.charAt(end)!='i' &&
                    s.charAt(end)!='O' &&s.charAt(end)!='o' &&
                    s.charAt(end)!='U' &&s.charAt(end)!='u' &&
                    start<end
            ){
                end--;
            }
            if(start<end){
                char temp=s.charAt(start);
                s.setCharAt(start,s.charAt(end));
                s.setCharAt(end,temp);

                start++;
                end--;
            }
        }
        return s.toString();
    }
}

public class LongPrefix {
    public String Prefix(String[] arr) {
        String s1=arr[0];
        String s2=arr[arr.length-1];
        System.out.println(s1+" "+s2);
        return "happy";
    }

    public static void main(String[] args) {
        String[] arr={"flower","flow","flight"};
        LongPrefix n=new LongPrefix();
//        System.out.println(n.Prefix(arr));
//
//        String ss="Follow",sss="Fol";
//        System.out.println(ss.substring(0,3));
//        System.out.println(ss.contains("Follow"));
//        System.out.println(ss.contains(sss));
//        System.out.println(ss.length());

//        String haystack = "ZCBAsadbutsad", needle = "sad";
//        for(int i=0,j=needle.length();j<=haystack.length();i++,j++){
//            System.out.println(i+" "+j);
//        }

//        char cr=haystack.charAt(0);
//        int cu=haystack.charAt(0)-65+1;
//        System.out.println(cr+" "+cu);

//        int cc='Z';
//        System.out.println(cc);
//        for(int i=0;i<26;i++){
//            char c=(char)(65+i);
//            System.out.println(c);
//        }

        String ss="IceCreAm";
        System.out.println(Pro1.reverseVowels(ss));
    }
}
