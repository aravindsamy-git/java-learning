package basics;
import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number n: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        boolean is_prime = isprime(n);

        if(is_prime){
            System.out.println("The Number is Prime Number");
        }
        else{
            System.out.println("The Number is not Prime Number");
        }
    }

    public static boolean isprime(int n){

        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int c = 3; c * c <= n; c += 2) {
            if (n % c == 0) {
                return false;
            }
        }

        return true;
    }
}
