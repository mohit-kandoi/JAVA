package Queue;

import java.util.ArrayDeque;
import java.util.Arrays;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] a = {2,5,1,3,2,1,4,5};
        int k = 4;
        int[] ans = maximum(a,k);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] maximum(int[] a,int k){
        int n = a.length;
        int[] ans = new int[n-k+1];
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int i = 0;
        while(i < k){
            if(!dq.isEmpty() && dq.peekLast() < a[i]){
                dq.pollLast();
            }
            dq.offerLast(a[i]);
            i++;
        }
        for( ; i<n ; i++){
            ans[i-k] = dq.peekFirst();
            if(a[i-k] == dq.peekFirst()){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && dq.peekLast() < a[i]){
                dq.pollLast();
            }
            dq.offerLast(a[i]);
        }
        ans[n-k] = dq.peekFirst();
        return ans;
    }


}
