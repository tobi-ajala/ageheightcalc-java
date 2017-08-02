
import java.util.Scanner;

public class AgeHeightCal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		double height;
		
		System.out.println("What is your name?");
		
		try {
			age = Integer.parseInt(scanner.nextLine());
		}
		catch(Exception e) {
			System.out.println("enter a name dumb ass " + e.getMessage());
			return;
		}

		name = scanner.nextLine();
		System.out.println("Your name is " + name);
		
		System.out.println("What is your age?");
		
		try {
			age = Integer.parseInt(scanner.nextLine());
			return;
		}
		catch(Exception e) {
			System.out.println("enter a name dumb ass " + e.getMessage());
			return;
			
		}
		
		height = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Your height is " + height);
		
		scanner.close();
		
	}

}
