package AlgorithmsImp;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-10,11,-25,-55,0,50};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){

        boolean swapped;

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
}
