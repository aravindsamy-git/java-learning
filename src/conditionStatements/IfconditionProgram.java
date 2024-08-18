package conditionStatements;
import java.util.Scanner;

public class IfconditionProgram {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean ContinueInput = true;
        
        while(ContinueInput) {
            System.out.println("Enter the student score (0-100):");
            int score = scanner.nextInt();
            scanner.nextLine();
            
            if(score >= 0 && score <= 100) {
                
                if (score >= 90 && score <= 100) {
                    System.out.println("Grade: A");
                } else if (score >= 80 && score < 90) {
                    System.out.println("Grade: B");
                } else if (score >= 70 && score < 80) {
                    System.out.println("Grade: C");
                } else if (score >= 60 && score < 70) {
                    System.out.println("Grade: D");
                } else {
                    System.out.println("Grade: F");
                }
            } else {
                System.out.println("Please Enter a valid score");
            }
            
            boolean validInput = false;
            String userInput = "";
            
            while(!validInput) {
                System.out.println("Do you want to enter another score? (yes/no): ");
                userInput = scanner.nextLine();
                
                if(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("no")) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input, please enter 'yes' or 'no'.");
                }
            }
            
            if(!userInput.equalsIgnoreCase("yes")) {
                ContinueInput = false;
            }
        
        }
        
        scanner.close();
        
    }

}
