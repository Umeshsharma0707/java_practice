package oops;

import java.util.*;

class ParentClass{
		int id = 15;
		String name = "umesh";
			
			public void display() {
				System.out.println("parent class method calling");
				System.out.println("Id : " + id + " Name :" + name );
			}
}
class ChildClass extends ParentClass{
	
	int id = 16;
	String name = "amit";
		public void display() {
			
			System.out.println("child class method calling");
			System.out.println("Id :" + id + " Name :" + name);
		}

}
public class Override_Method {
		public static void main(String[] args) {
			ChildClass c1 = new ChildClass();
			c1.display();
		}
}
