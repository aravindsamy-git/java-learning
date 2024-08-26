package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem645 {
    public static void main(String[] args) {
        int[] arr = {1,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(findtheNumber(arr)));
    }

    static void cycleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            while (i + 1 != arr[i]){

                if(arr[i] == arr[arr[i]- 1]){
                    break;
                }

                int temp = arr[i];
                arr[i] = arr[arr[i]- 1];
                arr[temp- 1] = temp;
            }
        }
    }

    static int[] findtheNumber(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i != arr[i] - 1){
                return new int[] {arr[i],i + 1};
            }
        }

        return new int[]{};
    }
}
