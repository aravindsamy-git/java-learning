package basics;
import java.util.Scanner;

public class ScannerProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name");
		String Name = scanner.nextLine();
		
		System.out.println("What is you age");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("What is your favrt food");
		String food = scanner.nextLine();
		
		System.out.println("Hi " + Name);
		System.out.println("Your age is " + age);
		System.out.println("Your favrt food is " + food);
		
		scanner.close();
	}

}
