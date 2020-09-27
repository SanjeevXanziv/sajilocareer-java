import java.util.Scanner;

public class CallClass {
	public static void main(String[] args) {
		// Constructor
		// ConstructorPrac cons = new ConstructorPrac(10, "Sanjeev");
		//the new keyword invokes the constructor
		// cons.printValues();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a name: ");
		ChildClass cc = new ChildClass();
		cc.setName(scan.nextLine());
		System.out.println(cc.getName());
	}
}