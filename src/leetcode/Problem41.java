package leetcode;

import java.util.Arrays;

public class Problem41 {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        cycleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1){
                System.out.println(i + 1);
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]){
                int correctIndex = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }
    }
}
