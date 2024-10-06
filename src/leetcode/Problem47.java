package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem47 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        List<List<Integer>> permutations = permuteUnique(nums);
        System.out.println(permutations);
    }

    public static List<List<Integer>> permutationList(List<Integer> p, List<Integer> up) {
        if (up.isEmpty()) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(p));
            return result;
        }

        int current = up.get(0);

        Set<List<Integer>> permutations = new HashSet<>();

        for (int i = 0; i <= p.size(); i++) {
            List<Integer> newProcessed = new ArrayList<>(p);
            newProcessed.add(i, current);

            List<Integer> newUnprocessed = new ArrayList<>(up);
            newUnprocessed.remove(0);

            permutations.addAll(permutationList(newProcessed, newUnprocessed));
        }

        List<List<Integer>> list = new ArrayList<>(permutations);

        return list;
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> unprocessedList = new ArrayList<>();
        for (int num : nums) {
            unprocessedList.add(num);
        }
        return permutationList(new ArrayList<>(), unprocessedList);
    }
}
