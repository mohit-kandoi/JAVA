package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueInEachWindow {
    public static void main(String[] args) {
        int[] a = {1,2,1,3,4,2,3};
        int window = 4;
        System.out.println(Arrays.toString(uniqueInEachElement(a,window)));
    }
    static int[] uniqueInEachElement(int[] a,int window){
        Map<Integer,Integer> map = new HashMap<>();
        int n = a.length;
        int[] ans = new int[n-window+1];
        for(int i = 0; i < window; i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }
        }
        for(int i = window; i < n; i++){

            ans[i-window] = map.size();

            int left = i-window;
            int right = i;
            int freqLeft = map.get(a[left]);
            if(freqLeft == 1){
                map.remove(a[left]);
            }else{
                map.put(a[left],freqLeft-1);
            }

            if(map.containsKey(a[right])){
                map.put(a[right],map.get(a[right]+1));
            }else{
                map.put(a[right],1);
            }
        }
        ans[n-window] = map.size();
        return ans;
    }
}
