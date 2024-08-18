package conditionStatements;
import java.util.Scanner;

public class FibonacciProblem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the n value:");
		int n = scanner.nextInt();
		
		int a = 0;
		int b = 1;
		
		if(n == a) {
			System.out.println(a);
			scanner.close();
			return;
		}
		
		if(n == b) {
			System.out.println(b);
			scanner.close();
			return;
		}
				
		for(int i = 2; i <= n;i++) {
			int temp = a + b;
			a = b;
			b = temp;
		}
		
		System.out.println(b);
		
		scanner.close();
		
	}

}
