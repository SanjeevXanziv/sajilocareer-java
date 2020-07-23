import java.util.*;

public class StudentAdmission {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();

		Student student = new Student();
		student.setName("Hari");
		student.setAge(23);

		Student studentOne = new Student();
		studentOne.setName("Ram");
		studentOne.setAge(40);

		studentList.add(student);
		studentList.add(studentOne);

		for (Student stud : studentList) {
			System.out.println("The name of the student is " + stud.getName());
			System.out.println("The age of the student is " + stud.getAge());
		}
	}
}