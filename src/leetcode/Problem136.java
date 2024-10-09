package leetcode;

public class Problem136 {

    public static void main(String[] args) {
        int[] nums = {4,2,1,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int singleNumber = 0;
        for (int num : nums) {
            singleNumber ^= num;
        }
        return singleNumber;
    }
}
