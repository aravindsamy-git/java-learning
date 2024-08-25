package leetcode;

public class Problem410 {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        int value = splitArray(nums, k);
        System.out.println(value);
    }

    public static int calculateSplitsWithGivenMaximum(int[] nums, int mid) {
        int currSum = 0, splitCount = 1;
        for (int num : nums) {
            if (currSum + num > mid) {
                splitCount++;
                currSum = num;
            } else {
                currSum += num;
            }
        }
        return splitCount;
    }

    public static int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            int countSplits = calculateSplitsWithGivenMaximum(nums, mid);

            if (countSplits > k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
