package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int climbStairs(int target) {
        if (target == 0) {
            return 1;
        }
        if (target == 1) {
            return 1;
        }

        if (memo.containsKey(target)) {
            return memo.get(target);
        }

        int count = climbStairs(target - 1) + climbStairs(target - 2);

        memo.put(target, count);

        return count;
    }
}
