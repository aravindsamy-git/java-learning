package conditionStatements;
import java.util.Scanner;

public class switchProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the day: ");
		String Day = scanner.nextLine().toLowerCase();
		
		
		switch(Day) {
			case "sunday": System.out.println("It is Sunday");
			break;
			
			case "monday": System.out.println("It is Monday");
			break;
			
			case "tuesday": System.out.println("It is Tuesday");
			break;
			
			case "wednesday": System.out.println("It is Wednesday");
			break;
			
			case "thursday": System.out.println("It is Thursday");
			break;
			
			case "friday": System.out.println("It is Friday");
			break;
			
			case "saturday": System.out.println("It is Saturday");
			break;
		}
		
		scanner.close();
		
	}

}
