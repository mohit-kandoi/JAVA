package Stack;

import java.util.ArrayDeque;

public class StockSpanProblem {

    public static int[] stockspan(int[] a){
        int n = a.length;
        int[] s = new int[n];
        s[0] = 1;
        ArrayDeque<Integer> stack =new ArrayDeque<>();
        stack.push(0);
        for (int i = 1; i < n; i++) {
            while(!stack.isEmpty()){
                int top = stack.peek();
                if(a[top] > a[i]){
                    break;
                }else{
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                s[i] = i;
            }else{
                s[i] = i-stack.peek();
            }
            stack.push(i);
        }
        return s;
    }
}
