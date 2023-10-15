package collectionsFrameWork;

import java.util.HashSet;
import java.util.Set;

public class TeacherHashSet {
	
	public static void main(String[] args) {
		
		Set<Teacher> t = new HashSet<>();
		
		t.add(new Teacher(10, "umesh"));
		t.add(new Teacher(10, "umesh"));
		t.add(new Teacher(10, "umesh"));
		t.add(new Teacher(10, "umesh"));
		
		System.out.println(t);
	}
}
