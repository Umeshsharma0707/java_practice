package collections;

import java.util.ArrayList;
import java.util.*;

public class IndexFind {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter size of arraylist : ");
			int n = sc.nextInt();
			
			
			
			
			
			ArrayList<Integer> a = new ArrayList<>();
			
			for(int i = 0; i <= n ; i++) {
				System.out.println("enter a " + i + " : ");
				int no = sc.nextInt();
				a.add(no);
			}
			System.out.println("a :" + a);
			
			System.out.println("enter index to find :");
			int x = sc.nextInt();
			
			int element = a.get(x);
			
			System.out.println("the element at index " + x + " is : " + element );
			
		}
}
