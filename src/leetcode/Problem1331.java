package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Problem1331 {

    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 40};
        int[] result = arrayRankTransform(arr);
        System.out.println(Arrays.toString(result)); // Output: [3, 1, 2, 3]
    }


    public static int[] arrayRankTransform(int[] arr) {
        // Step 1: Create a copy of the original array and sort it
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // Step 2: Create a map to store the rank of each element
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        // Step 3: Assign ranks to elements, skipping duplicates
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        // Step 4: Replace each element in the original array with its rank
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }

}
