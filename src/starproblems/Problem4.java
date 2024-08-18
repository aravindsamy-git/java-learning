package starproblems;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the n values");
		int n = scanner.nextInt();
		
        System.out.println();
        
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        
        }
        for(int i = n - 1 ; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
         
        scanner.close();
	}

}
