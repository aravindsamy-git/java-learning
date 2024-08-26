package leetcode;

import java.util.Arrays;
import java.util.ArrayList;

public class problem448 {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,7,2,3,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(findMissindElements(arr)));
    }

    static void cycleSort(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i);
            while (i != arr[i] - 1){

                if(arr[i] == arr[arr[i] - 1]){
                    break;
                }

                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;

                System.out.println(Arrays.toString(arr));
            }
        }
    }

    static int[] findMissindElements(int[] arr){
        ArrayList<Integer> missingElements = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(i + 1 != arr[i]){
                missingElements.add(i + 1);
            }
        }

        int[] result = new int[missingElements.size()];
        for (int i = 0; i < missingElements.size(); i++) {
            result[i] = missingElements.get(i);
        }

        return result;
    }
}
