package oops;

/**
 * Inheritance is of 4 types : single ,multi level, 
 */

class Shape{
	  public void area() {
		  System.out.println("displays area");
	  }
} 
class Triangle extends Shape{
	public void area(int l , int h) {
		System.out.println(1/2*l*h);
	}
}
class EquilateralTrangle extends Triangle{
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
	}
}
public class Inheritance {
	public static void main(String[] args) {
		
		
	}
}
