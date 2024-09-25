package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem16 {

    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        closest(nums,1);
        System.out.println(closestReturn(nums,1));
    }

    public static void closest(int[] arr,int target){

        int n = arr.length;
        int minSum = Integer.MAX_VALUE;
        int mindiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
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

    public static int closestReturn(int[] arr, int target){
        Arrays.sort(arr); // Sort the array
        int n = arr.length;
        int closestSum = arr[0] + arr[1] + arr[2]; // Initialize with the sum of the first three elements

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1; // The next element
            int right = n - 1; // The last element

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                // Update the closest sum if this sum is closer to the target
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                // Move the pointers based on the comparison with target
                if (sum < target) {
                    left++; // We need a larger sum
                } else if (sum > target) {
                    right--; // We need a smaller sum
                } else {
                    // If sum is exactly equal to target, return it immediately
                    return sum;
                }
            }
        }

        return closestSum; // Return the closest sum found
    }
}
