import java.util.*;

public class Conditions {
	public static void main(String[] args) {
		// logics should be written here
		Scanner scan = new Scanner(System.in); // class ko reference banako 
		System.out.print("Enter first number: ");
		int a = scan.nextInt(); // number haal 
		System.out.println("The number is " + a);

		Scanner scanOne = new Scanner(System.in); // class ko reference banako 
		System.out.print("Enter second number: ");
		int b = scanOne.nextInt(); // number haal vai
		System.out.println("The number is " + b);

		Scanner scanLast = new Scanner(System.in); // class ko reference banako 
		System.out.print("Enter last number: ");
		int c = scanLast.nextInt(); // number haal vai
		System.out.println("The number is " + b);

		Scanner scantwo = new Scanner(System.in); // class ko reference banako 
		System.out.print("Enter a name: ");
		String name = scantwo.nextLine(); // string haal vai
		System.out.println("The name is " + name);

		if(a > b && a > c) {
			System.out.println("A is greater");
		} else if (b > a && b > c) {
			System.out.println("B is greater");
		} else {
			System.out.println("C is greater");
		}
	}
}