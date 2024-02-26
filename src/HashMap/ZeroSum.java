package HashMap;

import java.util.HashSet;
import java.util.Set;

public class ZeroSum {
    public static void main(String[] args) {
        int[] a = {1,4,-5,2,3,-3};

        // APPROACH :
        // TotalSum in set : {1,5,0,2,5,2}

        System.out.println(countSubArraysWithZeroSum(a));
    }
    static int countSubArraysWithZeroSum(int[] a){
        Set<Integer> set = new HashSet<>();
        int totalSum = 0;
        int count = 0;
        // initially add 0 in set.
        set.add(0);
        for(int e : a){
            totalSum = totalSum + e ;
            if(set.contains(totalSum)){
                count++;
            }else{
                set.add(totalSum);
            }
        }
        return count;
    }
}
