package leetcode;
import java.util.*;

public class Problem22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        Problem22 solution = new Problem22();
        int n1 = 3;
        List<String> result1 = solution.generateParenthesis(n1);
        System.out.println("All combinations of well-formed parentheses for n = " + n1 + ": " + result1);
        int n2 = 1;
        List<String> result2 = solution.generateParenthesis(n2);
        System.out.println("All combinations of well-formed parentheses for n = " + n2 + ": " + result2);
    }
}
