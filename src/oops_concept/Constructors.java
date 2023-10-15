package oops_concept;
import java.util.*;

class Student{
	public Student(int id , String name) {
		System.out.println(id + name);
		System.out.println("first constructor");
	}
	
	public Student(int id , int roll) {
		System.out.println(id + roll);
		System.out.println("second constructor");
	}
	public Student(String name, String surname) {
		System.out.println(name + surname);
		System.out.println("third constructor");
	}	
	public Student(String Address , String name , String surname) {
		System.out.println("fourth constructor");
		System.out.println(name + surname + Address);

	}
}

public class Constructors {
	public static void main(String[] args) {
		Student s1 = new Student( "Umesh ", " Sharma ");
	}
}
