package HashMap;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String s = "abcdcbecada";
        System.out.println(longestSubstringWithoutRepeat(s));
    }
    static int longestSubstringWithoutRepeat(String s){
        Map<Character,Integer> map = new HashMap<>();
        //pointers:
        int l = 0, r = 0;
        int ans = 0;
        while(r < s.length()){
            if(!map.containsKey(s.charAt(r)) || map.get(s.charAt(r))<l){
                ans = Math.max(ans , r-l+1);
            }else{
                l = map.get(s.charAt(r))+1;
            }
            map.put(s.charAt(r),r);
            r++;
        }
        return ans;

    }
}
