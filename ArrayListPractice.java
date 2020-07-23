import java.util.*;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>(); 
		arrayList.add("sanjeev");
		arrayList.add("dolma");
		// arrayList.remove(1);

		for (int i = 0; i < arrayList.size(); i++) {
			String value = arrayList.get(i);
			System.out.println(value);
		}
	}
}