package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Problem1331 {

    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 40};
        int[] result = arrayRankTransform(arr);
        System.out.println(Arrays.toString(result));
    }


    public static int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }

}
