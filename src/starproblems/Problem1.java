package starproblems;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the n values");
		int n = scanner.nextInt();
		
		scanner.nextLine();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
        scanner.close();
	}

}
