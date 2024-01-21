package Stack;

import java.util.ArrayDeque;

public class PostfixExpression {
    public static void main(String[] args) {
        String s = "32 41 * 20 15 * + ";
        System.out.println(evaluatePostfixExpression(s));
    }

    static int evaluatePostfixExpression(String s){
        String[] tokens = s.split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int result = 0;
        for(String token : tokens){
            if(isOperator(token)){
                int second = stack.pop();
                int first = stack.pop();
                switch (token){
                    case "+":
                        result = first+second;
                        break;
                    case "-":
                        result = first-second;
                        break;
                    case "*":
                        result = first*second;
                        break;
                    case "/":
                        result = first/second;
                        break;
                    case "^":
                        result = (int) Math.pow(first,second);
                        break;
                }
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return result;
    }

    private static boolean isOperator(String token) {
        return (token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")||token.equals("^"));
    }
}
