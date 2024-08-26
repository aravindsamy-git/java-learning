package AlgorithmsImp;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            while (i != arr[i] - 1){
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }

        }
    }
}
