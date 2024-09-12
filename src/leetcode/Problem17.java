package leetcode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem17 {
    private static final String[] KEYPAD = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void main(String[] args) {
        String digits = "23";
        List<String> result = letterCombinations(digits);
        System.out.println(result);  // Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    }

    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer("");

        for (char digit : digits.toCharArray()) {
            String letters = KEYPAD[digit - '0'];

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String combination = queue.poll();

                for (char letter : letters.toCharArray()) {
                    queue.offer(combination + letter);
                }
            }
        }

        combinations.addAll(queue);
        return combinations;
    }
}
