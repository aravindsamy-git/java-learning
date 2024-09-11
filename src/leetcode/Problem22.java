package leetcode;

public class Problem22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    // Helper method for backtracking
    private void backtrack(List<String> result, String current, int open, int close, int max) {
        // If the current string has reached the maximum length (2 * n), add it to the result
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // Add an open parenthesis if the number of open parentheses is less than n
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        // Add a close parenthesis if the number of close parentheses is less than open
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}
