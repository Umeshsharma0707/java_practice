package oops;



abstract class Animal{
		
		abstract void walk();
		
}
class Horse implements Animals{
	@Override
	public void walk(){
		System.out.println("walks on 4 legs....");
		
	}

	@Override
	public void eats() {
		System.out.println("eating grass");
		
		
	}
}
class Hen extends Animal{
		@Override
		public void walk() {
			System.out.println("walks on 2 legs");
		}
}

public class Abstract_Classes {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.walk();
	}
}
