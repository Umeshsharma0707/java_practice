package controlStatements;

import java.util.Scanner;

public class Switch_Case_prob {
						
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int num;
				System.out.println("enter any number :");
				num = sc.nextInt();
				
				switch(num) {
				case 1 : System.out.println("good");
				break;
				case 2 : System.out.println("better");
				break;
				case 3 : System.out.println("best");
				break;
				default : System.out.println("invalid");
				}
				

				
				
			}
			
}
