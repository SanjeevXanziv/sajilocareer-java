public class InstanceVar {
	int a = 10;
	int b = 20;

	public int sum() {
		return a + b;
	}

	public int sub() {
		return a - b;
	}

	public void idiAmin() {
		a = 30;
	}

	public static void main(String[] args) {
		InstanceVar ins = new InstanceVar();
		System.out.println(ins.sum());
		// ins.idiAmin();
		System.out.println(ins.sum());
	}
}