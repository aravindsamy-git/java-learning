package leetcode;

public class Problem136 {

    public static int singleNumber(int[] nums) {
        int singleNumber = 0;
        for (int num : nums) {
            singleNumber ^= num;  // XOR all numbers
        }
        return singleNumber;
    }
}
