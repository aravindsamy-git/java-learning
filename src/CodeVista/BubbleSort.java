package CodeVista;
import java.util.*;

public class BubbleSort {
    private static int bubblesort(int[] arr, boolean ascending) {

        int swaps = 0;
        int n = arr.length;
        int [] copy = Arrays.copyOf(arr,n);

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for(int j = 0; j < n - i - 1; j++) {

                if((ascending && copy[j] > copy[j+1]) || (!ascending && copy[j] < copy[j+1])) {

                    int temp = copy[j];
                    copy[j] = copy[j+1];
                    copy[j+1] = temp;
                    swapped = true;
                    swaps++;
                }
            }

            if(!swapped) break;
        }
        return swaps;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {

            arr[i] = sc.nextInt();
        }

        int swapsAscending = bubblesort(arr,true);
        int swapsDescending = bubblesort(arr,false);

        System.out.println(Math.min(swapsAscending,swapsDescending));
    }
}
