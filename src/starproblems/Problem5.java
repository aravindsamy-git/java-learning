package starproblems;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the row value");
		int row = scanner.nextInt();
	
		scanner.nextLine();
		
		System.out.println("Enter the col value");
		int col = scanner.nextInt();
        
		for(int i = 0; i < col; i++) {
			System.out.print("*");
		}
        System.out.println();
        
        for(int i = 0; i < row - 2; i++ ) {
        	
        	System.out.print("*");
        	
        	for(int j = 0; j < col - 2; j++) {
        		
        		System.out.print(" ");
        		
        	}
        	
        	System.out.print("*");
        	System.out.println();
        }
        
        if(row > 1) {
    		for(int i = 0; i < col; i++) {
    			System.out.print("*");
    		}
        }
		
        scanner.close();
	}

}
