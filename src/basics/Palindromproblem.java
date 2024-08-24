package basics;
import java.util.*;

public class Palindromproblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = scanner.nextLine();

        boolean check = ispalindrome(str);

        System.out.println(check);
    }

    public static boolean ispalindrome(String a){

        for (int i = 0; i < a.length()/2; i++) {

            char start = a.charAt(i);
            char end = a.charAt(a.length() - 1 - i);

            if(start != end){
                return false;
            }
        }

        return true;
    }
}
