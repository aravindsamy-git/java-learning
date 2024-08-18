package conditionStatements;
import java.util.Scanner;

public class NestedForloopProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of n:");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++ ) {
			for(int j = 1 ; j <= n; j++ ) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
