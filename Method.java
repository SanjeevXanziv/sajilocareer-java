public class Method {

	// Non return type
	public void addition(int a, int b) {
		int sum = a + b;
		System.out.println("The sum is: " + sum);
	}

	//Return type
	public int sum() {
		int a = 10;
		int b = 20;
		return a+b;
	}

	public float average() {
		return sum()/2;
	}

	public float sub() {
		return sum() - 2;
	}

	public String returnName() {
		return "sanjeev";
	}
}