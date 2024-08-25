package leetcode;

import java.util.List;

public class Problem624 {
    public int maxDistance(List<List<Integer>> arrays) {
        int global_min = arrays.get(0).get(0);
        int global_max = arrays.get(0).get(arrays.get(0).size() - 1);
        int max_distance = 0;

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> array = arrays.get(i);
            int current_min = array.get(0);
            int current_max = array.get(array.size() - 1);

            max_distance = Math.max(max_distance, Math.abs(global_max - current_min));
            max_distance = Math.max(max_distance, Math.abs(current_max - global_min));

            global_min = Math.min(global_min, current_min);
            global_max = Math.max(global_max, current_max);
        }

        return max_distance;
    }

    public static void main(String[] args) {
        Problem624 solution = new Problem624();

        List<List<Integer>> arrays1 = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(1, 2, 3)
        );
        System.out.println(solution.maxDistance(arrays1)); // Output should be 4

        List<List<Integer>> arrays2 = List.of(
                List.of(1),
                List.of(1)
        );
        System.out.println(solution.maxDistance(arrays2)); // Output should be 0
    }
}
