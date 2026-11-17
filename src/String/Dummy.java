package String;
import java.util.*;

public class Dummy {
    static void main() {
        String[] s={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list=Solution.groupAnagrams(s);
        System.out.println(list);//[[eat, tea, ate], [tan, nat], [bat]]

        /*
        //AFTER SORT
        //METHOD 1
        list.sort(Comparator.comparingInt(List::size));
        System.out.println(list);//[[bat], [tan, nat], [eat, tea, ate]]

        //METHOD 2
        for (List<String> list1 : list) {
            Collections.sort(list1);
        }
        System.out.println(list);//[[bat], [nat, tan], [ate, eat, tea]]
         */
    }
}
class Solution {
    static public List<List<String>> groupAnagrams(String[] str){

        List<List<String>> res = new ArrayList<>();
        boolean[] visited = new boolean[str.length];

        for (int i = 0; i < str.length; i++){

            if (visited[i]) continue;
            List<String> cur = new ArrayList<>();
            cur.add(str[i]);
            visited[i] = true;

            for (int j = i + 1; j < str.length; j++){
                if (!visited[j] && same(str[i], str[j])) {
                    cur.add(str[j]);
                    visited[j] = true;
                }
            }
            res.add(cur);
        }
        return res;
    }
    static boolean same(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
}
