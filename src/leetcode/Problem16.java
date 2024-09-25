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
        Arrays.sort(arr);
        int n = arr.length;
        int closestSum = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum;
                }
            }
        }
        return closestSum;
    }
}
