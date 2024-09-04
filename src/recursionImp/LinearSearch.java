package recursionImp;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,6,2,4,72,4,4};
        System.out.println(find(arr,4,0));
        System.out.println(findIndex(arr,4,0));
        findIndexAll(arr,4,0);
        System.out.println(list);
        System.out.println(findIndexAll(arr,4,0,new ArrayList<>()));
    }

    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr,target,index + 1);
    }

    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        } else{
            return findIndex(arr,target,index + 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findIndexAll(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findIndexAll(arr,target,index + 1);
    }

    static ArrayList<Integer> findIndexAll(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        return findIndexAll(arr,target,index + 1,list);
    }
}
