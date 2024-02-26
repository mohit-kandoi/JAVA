package HashMap;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] a = {1,4,-5,2,3,-3};
        int k = 0;
        System.out.println(subArrayWithGivenSum(a,k));
    }

    static int subArrayWithGivenSum(int[] a,int k){
        Set<Integer> set = new HashSet<>();
        int totalSum = 0;
        int count = 0;
        // initially add 0 in set.
        set.add(0);
        for(int e : a){
            totalSum = totalSum + e ;
            if(set.contains(totalSum-k)){
                count++;
            }
            set.add(totalSum);
        }
        return count;
    }
}
