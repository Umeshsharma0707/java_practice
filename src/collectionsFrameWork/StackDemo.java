package collectionsFrameWork;

import java.util.Stack;
// stack : last in first out
public class StackDemo {
		public static void main(String[] args) {
			
			Stack<String> cars = new Stack<>();
			
			cars.push("thar"); // to enter elements in the stack
			cars.push("tata safari");
			cars.push("tata nexon");
			
			System.out.println("cars : " + cars); // to print cars0
			
			System.out.println(cars.peek());  	// to check who is in the peek		
			cars.pop(); // to remove the peek element fromm the stack
			
			System.out.println(cars); 
			
			System.out.println(cars.peek());
		}
}
