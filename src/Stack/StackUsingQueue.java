package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
        stack.push(30);
        stack.push(40);

    }

    Queue<Integer> q = new LinkedList<>();
    public void push(int data){
        q.offer(data);
    }
    public int pop(){
        if(q.isEmpty()) return -1;
        int size = q.size();
        for(int i=0;i<size-1;i++){
            q.offer(q.poll());
        }
        return q.poll();
    }
}
