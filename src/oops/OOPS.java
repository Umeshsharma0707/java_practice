package oops;

/**
class Pen{
		public Pen() {
			System.out.println("this is pen");
		}
	 String pen_name;
	 String color;
	 String type; // ball pen , gel pen , fountain pen
	 
	 public void write() {
		 System.out.println("writing something");
	}
	 public void color() {
		System.out.println(this.color);

	}
	 
}
*/

class Students{
	String name;
	int age;
	
	public Students(String n, int age) {
		this.name = n;
		this.age = age;
	}
	
	public void studentInfo() {
			System.out.println("Student Name :"+ this.name);
			System.out.println("Student age :"+ this.age);
	}
}

public class OOPS {

	public static void main(String args[]) {   
	/**	
		Pen p1 = new Pen();
		
		p1.pen_name = "octain";
		p1.color = "blue";
		p1.type = "ball pen";
		p1.write();
		p1.color();
		
		Pen p2 = new Pen();
		
		p2.color = "black";
		p2.color();
		*/
		Students s1 = new Students("mahesh",13);
				
//		s1.age = 15;
//		s1.name = "Umesh";
		s1.studentInfo();
		
	}

}
