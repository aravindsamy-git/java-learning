package leetcode;
import java.util.List;
import java.util.ArrayList;

public class Problem46 {

    public static List<List<Integer>> generatePermutations(List<Integer> processed, List<Integer> unprocessed) {
        // Base case: if unprocessed is empty, return the processed list
        if (unprocessed.isEmpty()) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(processed));
            return result;
        }

        List<List<Integer>> permutations = new ArrayList<>();

        for (int i = 0; i < unprocessed.size(); i++) {
            // Take the first element from unprocessed
            int current = unprocessed.get(i);
            // Create the new unprocessed list excluding the current element
            List<Integer> newUnprocessed = new ArrayList<>(unprocessed);
            newUnprocessed.remove(i);

            // Insert the current element at all possible positions in processed
            for (int j = 0; j <= processed.size(); j++) {
                // Create a new processed list with the current element inserted
                List<Integer> newProcessed = new ArrayList<>(processed);
                newProcessed.add(j, current);
                // Recursive call
                permutations.addAll(generatePermutations(newProcessed, newUnprocessed));
            }
        }

        return permutations;
    }
}
