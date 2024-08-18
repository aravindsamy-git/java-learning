package ArrayProblems;
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the n:");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		String[][] cars = new String[n][n];
		
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("Enter value for cell [%d][%d]: ", i, j);
                cars[i][j] = scanner.nextLine();
            }
        }
		
		scanner.close();
		
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
				System.out.print(cars[i][j] + " ");
				
			}
			
			System.out.println();
		}
		
	}

}
