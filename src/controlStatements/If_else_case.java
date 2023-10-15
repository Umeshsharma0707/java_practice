package controlStatements;

import java.util.Scanner;

public class If_else_case {
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num +" : it is even");
		} else {
			num++;
			System.out.println("it is odd");
			System.out.println("try next num like: " + num);
		}
		
		
	}
	
}
