package collectionsFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
	public static void main(String[] args) {

		List<String> StudentsName = new ArrayList<>();

		StudentsName.add("umesh");
		StudentsName.add("amit");
		StudentsName.add("java");
		StudentsName.add("python");
		System.out.println(StudentsName.get(1));
		StudentsName.add(1, "kotlin");
		System.out.println(StudentsName.get(1));
		System.out.println(StudentsName.get(2));
		System.out.println(StudentsName);

		ArrayList<String> rollNo = new ArrayList<>();
		rollNo.add("10");
		rollNo.add("20");
		rollNo.add("30");
		rollNo.add("40");
		rollNo.add("50");

		rollNo.addAll(StudentsName);
		System.out.println(rollNo);
		System.out.println(StudentsName);

		System.out.println(rollNo.get(7));

		rollNo.remove(7);
		rollNo.remove("kotlin");
		System.out.println(rollNo);

		StudentsName.clear();
		System.out.println("printing empty list of StudentsName" + StudentsName);

		rollNo.set(2, "200");
		System.out.println(rollNo);

	
//		for (int i = 0; i <= rollNo.size(); i++) {
//				System.out.println( "the element at index " + i + " : " + rollNo.get(i));
//		}
		// for each loop

//		for (String a : rollNo) {
//			System.out.println("element is : " + rollNo);
//		}
		
		Iterator<String> it = rollNo.iterator();
		while(it.hasNext()) {
			System.out.println("printing through iterator : " + it.next());
		}

	}
}