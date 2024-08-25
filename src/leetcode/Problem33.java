package leetcode;

public class Problem33 {
    public static void main(String[] args) {
        int[] arr = {2,2,4,2,2,2};
        int target = 4;
        int result = search(arr, target);
        System.out.println(result);
    }

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        if (nums[0] == nums[nums.length - 1]) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
        }

        int k = findPivot(nums);

        if (target >= nums[0] && target <= nums[k - 1]) {
            return binarySearch(nums, target, 0, k - 1);
        } else {
            return binarySearch(nums, target, k, nums.length - 1);
        }
    }

    public static int findPivot(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }

            if (mid > low && arr[mid] < arr[mid - 1]) {
                return mid;
            }

            if (arr[mid] == arr[low] && arr[mid] == arr[high]) {
                if (arr[low] > arr[high]) {
                    low++;
                } else {
                    high--;
                }
            } else if (arr[mid] >= arr[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return 0;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}