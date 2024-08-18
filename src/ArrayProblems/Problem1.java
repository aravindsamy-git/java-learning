package ArrayProblems;
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of element in array:");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the element of array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int largest = array[0];

        for(int i = 1; i < n; i++) {

            if(largest < array[i]) {

                largest = array[i];
            }
        }

        System.out.println("The largest element in a array is "+ largest);

        scanner.close();
    }

}
