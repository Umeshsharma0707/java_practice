package exceptions;

import java.util.*;

class Divide{
		public void div() throws ArithmeticException{
			
			
			try {
				Scanner sc = new Scanner(System.in);

				System.out.println("enter a :");
				int a = sc.nextInt();
				System.out.println("enter b :");
				int b = sc.nextInt();
				float ans = a/b;
				System.out.println("ans : " + ans);
			} catch (ArithmeticException e) {
				System.out.println("cannot divide by Zero")
				
				;
			} catch (InputMismatchException e) {
				System.out.println("please input numeric values");
			} catch (Exception e) {
				e.printStackTrace();
			}
			div();
		}
}
public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		
		Divide d = new Divide();
		d.div();

	}
}
