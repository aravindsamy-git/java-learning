package basics;
import java.util.Scanner;

public class AmstrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        boolean is_Armstrong = isArmstrong(n);
        if (is_Armstrong) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

    }

    public static boolean isArmstrong(int n){

        if(n == 0){
            return false;
        }

        int originalNumber = n;
        int numDigits = String.valueOf(n).length();
        int sum = 0;

        while(n > 0){
            int lastdigit = n % 10;
            sum += Math.pow(lastdigit, numDigits);
            n /= 10;
        }

        return sum == originalNumber;
    }
}
