package Stack;

public class CustomStackUsingArray {
    private int size ;
    private int[] a;
    private int top;

    public CustomStackUsingArray(int size){
        this.size = size;
        a = new int[size];
        top = -1;
    }
    public boolean push(int data){
        if(isFull()) {
            System.out.println("Stack OverFlow");
            return false;
        }else{
            top++;
            a[top] = data;
            return true;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            int temp = a[top];
            top--;
            return temp;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            return a[top];
        }
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == size-1;
    }
    public void printStack(){
        for(int i = 0;i<=top;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

}
