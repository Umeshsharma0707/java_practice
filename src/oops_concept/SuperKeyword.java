package oops_concept;

class Parent{
	Parent(){
		
		System.out.println("Parent cons..");
	}
	Parent(int a){
		
		
		System.out.println(a + " int para cons of Parent");
	}
	
	public int add(int a, int b) {
		int mul = a*b;
		return mul;
	}
	
}
class Child extends Parent{
	
     Child() {
		System.out.println("Child Cons..");
	}
     Child(int a) {
		
		System.out.println(a + " int para cons of Child");
	}
	public int add(int a, int b) {
		super.add(a, b);
		int sum = a+b;
		return sum;
	}
}

public class SuperKeyword {
	
	public static void main(String[] args) {
		
		Child b = new Child();
		b.add(8, 4);
	}
	
}
