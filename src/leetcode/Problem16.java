package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem16 {

    public static void main(String[] args) {
        int[] nums = {0,0,0};
        closest(nums,1);
    }

    public static void closest(int[] arr,int target){

        int n = arr.length;
        int minSum = Integer.MAX_VALUE;
        int mindiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Print the combination
                    int sum = arr[i]+arr[j]+arr[k];
                    int diff = Math.abs(sum - target);
                    if(diff < mindiff){
                        mindiff = diff;
                        minSum = sum;
                    }
                }
            }
        }

        System.out.println(minSum);
    }
}
