public class MainClass {
	public static void main(String[] args) {
		Method mthd = new Method(); //reference
		float value = mthd.average();
		System.out.println("Average: " + value);
		float sub = mthd.sub();
		System.out.println("Sub: " + sub);

		System.out.println(mthd.returnName() + " Tamang");
	}
}