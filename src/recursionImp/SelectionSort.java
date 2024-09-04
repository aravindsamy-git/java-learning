package recursionImp;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int start, int end) {
        if (end <= 0) {
            return;
        }

        int maxIndex = findMaxIndex(arr, 0, end);

        int temp = arr[end];
        arr[end] = arr[maxIndex];
        arr[maxIndex] = temp;

        sort(arr, 0, end - 1);
    }

    static int findMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
