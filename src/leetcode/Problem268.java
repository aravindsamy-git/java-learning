package leetcode;

import java.util.Arrays;

public class Problem268 {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        cycleSort(arr);
        System.out.println(findMissing(arr));
        System.out.println(findMissingElement(arr));
    }

    static int findMissingElement(int[] arr){

        int nsum = (arr.length * (arr.length + 1))/2;
        int csum = 0;
        for (int i = 0; i < arr.length; i++) {
            csum += arr[i];
        }

        return nsum - csum;
    }

    static void cycleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i) {
                if (arr[i] < 0 || arr[i] >= arr.length) {
                    break;
                }

                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }
        }
    }

    static int findMissing(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i != arr[i]){
                return i ;
            }
        }

        return arr.length;
    }
}
