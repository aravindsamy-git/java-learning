package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem442 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(fnidDuplicates(arr)));
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

    static int[] fnidDuplicates(int[] arr){
        ArrayList<Integer> DuplicateElements = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(i != arr[i] - 1){
                DuplicateElements.add(arr[i]);
            }
        }

        int[] result = new int[DuplicateElements.size()];
        for (int i = 0; i < DuplicateElements.size(); i++) {
            result[i] = DuplicateElements.get(i);
        }

        return result;
    }

}
