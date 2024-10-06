package leetcode;
import java.util.List;
import java.util.ArrayList;

public class Problem46 {

    public static void main(String[] args) {
        List<Integer> unprocessedList = List.of(1); // Example input
        List<List<Integer>> permutations = permutationList(new ArrayList<>(), unprocessedList);
        System.out.println(permutations);
    }

    public static List<List<Integer>> permutationList(List<Integer> p, List<Integer> up) {
        // Base case: if unprocessed is empty, return the processed list
        if (up.isEmpty()) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(p)); // Add a copy of the processed list
            return result;
        }

        int current = up.get(0); // Get the first element of unprocessed

        List<List<Integer>> permutations = new ArrayList<>();

        // Iterate through each position in the processed list to insert the current element
        for (int i = 0; i <= p.size(); i++) { // Use i <= p.size() to allow adding at the end
            List<Integer> newProcessed = new ArrayList<>(p); // Copy of processed list
            newProcessed.add(i, current); // Insert current at position i

            List<Integer> newUnprocessed = new ArrayList<>(up); // Create a new unprocessed list
            newUnprocessed.remove(0); // Remove the first element

            // Recursive call to generate permutations
            permutations.addAll(permutationList(newProcessed, newUnprocessed));
        }

        return permutations;
    }

    public List<List<Integer>> permute(int[] nums) {
        // Convert the integer array to a list
        List<Integer> unprocessedList = new ArrayList<>();
        for (int num : nums) {
            unprocessedList.add(num);
        }
        return permutationList(new ArrayList<>(), unprocessedList);
    }
}
