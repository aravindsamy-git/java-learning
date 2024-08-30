package leetcode;
import java.util.Stack;

public class Problem20 {

    public static void main(String[] args) {
        System.out.println(isValid("( { [ } ] )"));
        System.out.println(isValid("({}[])"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((current == ')' && top != '(') ||
                        (current == '}' && top != '{') ||
                        (current == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
