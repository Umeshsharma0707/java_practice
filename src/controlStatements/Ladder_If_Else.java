package controlStatements;

import java.util.Scanner;

public class Ladder_If_Else {
	// students marks

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float percentage;

		int n;
		System.out.print("Enter No.Of Subjects : ");
		n = sc.nextInt();
		int sub[] = new int[n];
		int sum = 0;
		String sub1[] = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter Subject Name : ");
			sub1[i] = sc.next();
			System.out.print("Subject Marks : ");
			sub[i] = sc.nextInt();
			sum += sub[i];
			if (sub[i] > 100) {
				System.out.println("please enter marks from 100");
				break;
			}
		}

		System.out.println("total marks :" + sum + " /500");
		percentage = (float) sum / n;
		System.out.println("Percentage :" + percentage);

		if (percentage <= 33) {
			System.out.println("you are fail! koi baat nhi next year try kar");
		} else {
			if (percentage > 33 && percentage < 45) {
				System.out.println("average marks");
			} else if (percentage > 45 && percentage < 60) {
				System.out.println("good marks");
			} else if (percentage > 60 && percentage < 90) {
				System.out.println("very good marks ");
			} else if (percentage > 90) {
				System.out.println("excellent ! you cracked upsc");
			}
		}
	}
}
