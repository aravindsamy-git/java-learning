package basics;
import java.util.Scanner;

public class HypothesisProgram {

	public static void main(String[] args) {
		
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the x value:");
		x = scanner.nextDouble();
		
		System.out.println("Enter the y value:");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x) + (y*y));
		
		System.out.println("The hypothesis is "+ z);
		
		scanner.close();
		
	}

}
