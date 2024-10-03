package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the array to handle duplicates easily
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            // Found a valid combination
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                // Skip duplicates
                continue;
            }

            if (candidates[i] > target) {
                // No need to continue if the current candidate exceeds the target
                break;
            }

            // Choose the current candidate
            current.add(candidates[i]);

            // Explore further with the reduced target and next index
            backtrack(candidates, target - candidates[i], i + 1, current, result);

            // Backtrack: remove the last added element
            current.remove(current.size() - 1);
        }
    }
}

