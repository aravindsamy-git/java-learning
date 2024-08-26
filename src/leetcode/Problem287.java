package leetcode;

import java.util.Arrays;

public class Problem287 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        cycleSort(arr);
        System.out.println(arr[arr.length - 1]);
        System.out.println(findDuplicate(arr));
    }

    static void cycleSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            while (i != arr[i] - 1){

                if(arr[i] == arr[arr[i] - 1]){
                    break;
                }

                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }

        }
    }

    // without modifying array

    public static int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        do
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        while(slow!=fast);
        fast=nums[0];
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return fast;
    }
}
