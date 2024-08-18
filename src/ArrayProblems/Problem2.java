package ArrayProblems;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of element in array:");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the element of array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] reversedArray = new int[n];

        for(int i = n - 1 , j = 0 ; i >= 0; i-- , j++) {
            reversedArray[j] = array[i];
        }

        for(int i = 0; i < n; i++) {
            System.out.print(reversedArray[i] + " ");
        }

        scanner.close();
    }

}
