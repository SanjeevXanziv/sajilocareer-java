import java.util.*;

public class WhileLoop {
	public static void main(String[] args) {
		// When we don't know where to start but know where to end
		System.out.println("1. K cha haal khabar");
		System.out.println("2. I am a Programmer");
		System.out.println("3. Exit");

		Scanner scan = new Scanner(System.in); // ready state
		System.out.print("Enter your choice: ");
		int a = scan.nextInt(); // execute state
		// 3 != 3 => false
		while(a != 3) {
			if (a == 1) {
				System.out.println("K cha haal khabar");
			} else if(a == 2) {
				System.out.println("I am a Programmer");
			}

			System.out.println("1. K cha haal khabar");
			System.out.println("2. I am a Programmer");
			System.out.println("3. Exit");

			Scanner scans = new Scanner(System.in); // ready state
			System.out.print("Enter your choice: ");
			a = scans.nextInt(); // execute state
		}

		System.out.println("Thank You for Exiting");
	}
}