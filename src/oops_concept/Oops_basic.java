package oops_concept;
import java.util.*;

class A{
	int id;
	String name;
	public A() {
		System.out.println("this is a constructor");
	}
	public void printInfo() {
		System.out.println("Name :" + this.name);
		System.out.println("Id :" + this.id);
	}
}
public class Oops_basic {
	public static void main(String[] args) {
		A a = new A();
		a.id = 15;
		a.name = "Umesh";
		a.printInfo();
	}
}
