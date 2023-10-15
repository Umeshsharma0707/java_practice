package controlStatements;

import java.util.Scanner;

public class Ternary_Operator {
	// check the number is smaller or bigger
	public static void main(String[] args) {
		int a, b, c;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a :");
		a = sc.nextInt();

		System.out.println("enter b :");
		b = sc.nextInt();

		System.out.println("enter c :");
		c = sc.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("a is bigger");
			} else {
				System.out.println("c is bigger");
			}
		} else if (b > c) {
			System.out.println("b is bigger");
		} else {
			System.out.println("c is bigger");
		}

		int ans = (a > b && a > c) ? a : (b > c) ? b : c;
		System.out.println("Maximum number Is :" + ans);
	}

}
