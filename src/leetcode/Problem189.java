package leetcode;

public class Problem189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverseArray(nums, 0, n - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n - 1);
    }

    private void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Problem189 solution = new Problem189();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        solution.rotate(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
