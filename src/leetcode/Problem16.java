package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem16 {

    public static void main(String[] args) {
        int[] nums = {0,0,0};
        closest(nums,1);
    }

    public static List<List<Integer>> threeSum(int[] nums,int target) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void closest(int[] arr,int target){

        int n = arr.length;
        int minSum = Integer.MAX_VALUE;
        int mindiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Print the combination
                    int sum = arr[i]+arr[j]+arr[k];
                    int diff = Math.abs(sum - target);
                    if(diff < mindiff){
                        mindiff = diff;
                        minSum = sum;
                    }
                }
            }
        }

        System.out.println(minSum);
    }
}
