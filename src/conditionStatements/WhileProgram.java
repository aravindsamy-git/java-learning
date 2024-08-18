package conditionStatements;
import java.util.Scanner;

public class WhileProgram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {
            System.out.println("Enter the input: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            if (n != 0) {
                int originalNumber = n;
                int reversedNumber = 0;

                while (originalNumber != 0) {
                    int lastDigit = originalNumber % 10;
                    reversedNumber = reversedNumber * 10 + lastDigit;
                    originalNumber = originalNumber / 10;
                }

                System.out.println("The reversed Input is: " + reversedNumber);
            } else {
                stop = true;
            }
        }

        scanner.close();
	}

}
