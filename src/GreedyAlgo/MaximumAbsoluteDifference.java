package GreedyAlgo;

import java.util.Arrays;

public class MaximumAbsoluteDifference {
    public static void main(String[] args) {
        int[] a = {1,9,3,7,4};
        System.out.println(maxDiff(a));
    }
    static int maxDiff(int[] a){
        Arrays.sort(a);
        int sum = 0;
        int left = 0;
        int right = a.length-1;
        boolean flip = true;
        while(left < right){
            sum = sum + Math.abs(a[right]-a[left]);
            if(flip){
                left++;
            }else{
                right--;
            }
            flip = !flip;
        }
        sum = sum + Math.abs(a[a.length/2]-a[0]);
        return sum;
    }
}
