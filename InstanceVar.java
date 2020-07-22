public class InstanceVar {
	int a = 10;
	int b = 20;

	public void sum() {
		System.out.println(a + b);
	}

	public int sub() {
		return a - b;
	}

	public void idiAmin() {
		a = 30;
	}

	public static void main(String[] args) {
		InstanceVar ins = new InstanceVar();
		ins.sum();
		// ins.idiAmin();
		ins.sum();
	}
}