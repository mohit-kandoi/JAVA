package HashMap;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] a ={15,2,-2,-8,1,7,10,23};
        System.out.println(largestSubArrayWithZeroSum(a));

    }
    static int largestSubArrayWithZeroSum(int[] a){
        Map<Integer,Integer> map = new HashMap<>();
        int maxLength = 0;
        int cumulativeSum = 0;
        map.put(0,-1);
        for (int i = 0; i < a.length; i++){
            cumulativeSum = cumulativeSum + a[i];
            if(map.containsKey(cumulativeSum)){
                maxLength = Math.max(maxLength,i-map.get(cumulativeSum));
            }else{
                map.put(cumulativeSum,i);
            }
        }
        return maxLength;
    }
}
