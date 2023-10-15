package corejava;

import java.util.Scanner;

public class Arithmatics {
			public static void main(Strings[] args) {
				byte a = 010;  
				short b = 010;
				System.out.println(a+b);
				int c = a*b;
				
				Scanner sc = new Scanner(System.in);
				System.out.println("enter value for addition ");
				int d = sc.nextInt();
				System.out.println("enter second value for adition: ");
				int e = sc.nextInt();
				float ans = d+e;
				System.out.println("addition is : "+ ans);
				
				// multiplication 
				
				int multiply = d*e;
				System.out.println("multiply ans is : " + multiply);
				
				// divide 
				
				int divide = d/e;
				int modulus = d%e;
				System.out.println("divide = " + divide + "modulus is : "+modulus);
			
				// type casting 
				
				// int of float 
				System.out.println("addition with typecasting : "+ (float)ans);
				
				// float to int
				
				System.out.println("typeacsting narrowing: " + (int)ans);
			}
	
}
