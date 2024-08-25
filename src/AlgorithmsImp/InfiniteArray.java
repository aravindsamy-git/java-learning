package AlgorithmsImp;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 165;

        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (true) {
            try {
                if (target <= arr[end]) {
                    break;
                }
                int temp = end + 1;
                end = end + (end - start + 1) * 2;
                start = temp;
            } catch (ArrayIndexOutOfBoundsException e) {
                end = getMaxIndex(arr, end);
                break;
            }
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            try {
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int getMaxIndex(int[] arr, int currentEnd) {
        int maxIndex = currentEnd;
        while (true) {
            try {
                int temp = maxIndex * 2;
                int value = arr[temp];
                maxIndex = temp;
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
        return maxIndex;
    }
}
