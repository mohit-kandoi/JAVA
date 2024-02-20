package GreedyAlgo;

import java.util.Arrays;

public class MinimumNumberOfPlatforms {
    public static void main(String[] args) {
        int[] arrival = {900,940,950,1100,1500,1800}; // arrival timings of train
        int[] departure = {910,1200,1120,1130,1900,2000}; // departing timing of train
        System.out.println(minimumPlatforms(arrival,departure));
    }
    static int minimumPlatforms(int[] a, int[] d){
        int n = a.length;
        Arrays.sort(a);
        Arrays.sort(d);
        int i = 0;
        int j = 0;
        int count = 0;
        int maxCount = 0;
        while(i < n){
            if(a[i] <= d[j]){
                count++;
                i++;
                maxCount = Math.max(count,maxCount);
            }else{
                count--;
                j++;
            }
        }
        return maxCount;
    }
}
