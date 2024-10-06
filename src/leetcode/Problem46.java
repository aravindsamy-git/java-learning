package leetcode;
import java.util.List;
import java.util.ArrayList;

public class Problem46 {

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        List<List<Integer>> permutations = permute(nums);
        System.out.println(permutations);
    }

    public static List<List<Integer>> permutationList(List<Integer> p, List<Integer> up) {
        if (up.isEmpty()) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(p));
            return result;
        }

        int current = up.get(0);

        List<List<Integer>> permutations = new ArrayList<>();

        for (int i = 0; i <= p.size(); i++) {
            List<Integer> newProcessed = new ArrayList<>(p);
            newProcessed.add(i, current);

            List<Integer> newUnprocessed = new ArrayList<>(up);
            newUnprocessed.remove(0);

            permutations.addAll(permutationList(newProcessed, newUnprocessed));
        }

        return permutations;
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> unprocessedList = new ArrayList<>();
        for (int num : nums) {
            unprocessedList.add(num);
        }
        return permutationList(new ArrayList<>(), unprocessedList);
    }
}
