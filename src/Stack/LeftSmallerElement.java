package Stack;

import java.util.ArrayDeque;
import java.util.*;

public class LeftSmallerElement {
    public static void main(String[] args) {
        int[] arr = {1,6,4,10,2,4};
        int[] ans = previousSmallerElementIndices(arr);
        System.out.println(Arrays.toString(ans));
        int[] ans1 = rightSmallerElementIndices(arr);
        System.out.println(Arrays.toString(ans1));

    }
    static int[] rightSmallerElementIndices(int[] arr){
        int n = arr.length;;
        int[] ans = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
//        ans[0] = -1;
//        stack.push(0);
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = n;
            }else{
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
    static int[] previousSmallerElementIndices(int[] arr){
        int n = arr.length;;
        int[] ans = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
//        ans[0] = -1;
//        stack.push(0);
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
}
