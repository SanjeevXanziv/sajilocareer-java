public class Object {
	int a = 0;

	public void getA() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Object obj = new Object(); //#memory address !@#!@#$!@#
		obj.a = 50;
		obj.getA();

		Object obj1 = new Object();
		obj1.a = 100;
		obj.getA();
		obj1.getA();
	}
}