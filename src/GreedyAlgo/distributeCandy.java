package GreedyAlgo;

import java.util.Arrays;

public class distributeCandy {
    public static void main(String[] args) {
        int[] a = {1,0,2,3};
        System.out.println(distribute(a));

    }
    static int distribute(int[] a){
        int n = a.length;
        int[] candy = new int[n];
        Arrays.fill(candy,1);

        // for Previous element
        for(int i = 1; i < a.length; i++){
            if(a[i] > a[i-1]){
                candy[i] = candy[i-1]+1;
            }
        }
        // for next element
        for(int i = 0; i<n-1; i++){
            if(a[i] > a[i+1] && candy[i] >= candy[i+1]){
                candy[i] = candy[i]+1;
            }
        }
        int count = 0;
        for(int e : candy){
            count = count +e;
        }

        return count;
    }
}
