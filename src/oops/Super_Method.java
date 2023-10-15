package oops;

import java.util.*;

class Person{
		public Person() {
			System.out.println("person class constructor"); 
		}
		public void message() {
			System.out.println("hello this is person");
		}
}
class Student extends Person{
		
		public Student() {
			super();
			System.out.println("this is student constructor");
		}
	
		public void message() {
			System.out.println("student speaking....");
			System.out.println("hello i am a student");
		}
		
		public void display() {
			message();
			
			super.message();
		}
}
public class Super_Method {
		public static void main(String[] args) {
			Student mahesh = new Student();
			mahesh.display();
		}		
}
