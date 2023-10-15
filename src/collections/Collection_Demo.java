package collections;

import java.util.Hashtable;
import java.util.Vector;

public class Collection_Demo {
	public static void main(String[] args) {
		
		
		
		int a[] = {1,2,3,4,5,6};
		
		Vector<Integer> v = new Vector<>();
		
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);
		v.addElement(6);
		
		Hashtable<Integer, String> h = new Hashtable<>();
		
		h.put(1, "umesh");
		h.put(2, "amit");
		h.put(3, "rahul");
		h.put(4, "mahesh");
		
		System.out.println(a[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));
		
		
	}
}
