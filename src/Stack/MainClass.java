package Stack;

public class MainClass {
    public static void main(String[] args) {
        CustomStackUsingArray stack = new CustomStackUsingArray(4);
        stack.push(5);
        stack.push(3);
        stack.push(2);
        stack.push(88);
        stack.pop();
        stack.pop();
        stack.printStack();
//        System.out.println(stack.peek());
    }
}
