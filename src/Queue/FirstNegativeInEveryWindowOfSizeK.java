package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeInEveryWindowOfSizeK {
    public static void main(String[] args) {
        int[] a = {12,-1,-7,8,-15,30,16,28};
        int k = 3;
        int[] ans = firstNegative(a,k);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] firstNegative(int[] a, int k){
        int n = a.length;
        int[] ans = new int[n-k+1];
        Queue<Integer> q = new LinkedList<>();
        int i = 0;
        while(i < k){
            if(a[i] < 0){
                q.offer(a[i]);
            }
            i++;
        }
        for(; i<n ; i++){
            if(q.isEmpty()){
                ans[i-k] = 0;
            }else{
                ans[i-k] = q.peek();
            }

            if(a[i-k] == q.peek()){
                q.poll();
            }
            if(a[i] < 0){
                q.offer(a[i]);
            }
        }
        if(q.isEmpty()){
            ans[n-k] = 0;
        }else{
            ans[n-k] = q.peek();
        }
//        ans[n-k] = q.peek();
        return ans;
    }

}
