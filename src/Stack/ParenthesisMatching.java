package Stack;

import java.util.ArrayDeque;

public class ParenthesisMatching {

    public static void main(String[] args) {
        String s = "[]({[]})";
        System.out.println(validParenthesis(s));
    }
    static boolean validParenthesis(String s){
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if(cur == '(' || cur == '{' || cur == '['){
                stack.push(cur);
            }
            else{
                if(stack.isEmpty()) return false;
                char opening = stack.pop();
                if(opening == '(' && cur == ')' || opening == '{' && cur == '}' || opening == '[' && cur == ']'){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
