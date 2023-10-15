package collectionsFrameWork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
		public static void main(String[] args) {
	
			Set<Integer> set = new LinkedHashSet<>();
			
			set.add(32);
			set.add(34);
			set.add(96);
			set.add(32);
			set.add(45);
			set.add(49);
			
			System.out.println(set);
			
			set.remove(96);
			System.out.println(set);
			System.out.println(set.contains(49));
			
//			set.clear();
			System.out.println(set.isEmpty());
			System.out.println(set.size());
		}
}
