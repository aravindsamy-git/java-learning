package recursionImp;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] nums = {10, 80, 30, 90, 40, 50, 70};

        sort(nums, 0, nums.length - 1);  // Use correct length for nums
        sort(arr, 0, arr.length - 1);    // Use correct length for arr

        System.out.println(Arrays.toString(nums));  // Should print sorted nums
        System.out.println(Arrays.toString(arr));   // Should print sorted arr
    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        // Partition the array and get the pivot index
        int pivotIndex = partition(nums, low, high);

        // Recursively sort elements before and after the partition index
        sort(nums, low, pivotIndex - 1);
        sort(nums, pivotIndex, high);  // Fix the recursive call for the second partition
    }

    static int partition(int[] nums, int low, int high) {
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;  // Middle element as pivot
        int pivot = nums[m];

        while (s <= e) {
            // Move s until we find an element greater than or equal to pivot
            while (nums[s] < pivot) {
                s++;
            }
            // Move e until we find an element less than or equal to pivot
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                // Swap nums[s] and nums[e]
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // Return the new partition index
        return s;
    }
}
