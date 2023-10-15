package collectionsFrameWork;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new TreeSet<>();
		
		s.add(25);
		s.add(22);
		s.add(24);
		s.add(96);
		s.add(42);
		s.add(5);
		s.add(94);
		
		System.out.println(s);
		
		s.remove(94);
		System.out.println(s);
		
	}
}
