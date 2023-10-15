package controlStatements;

import java.util.Scanner;

class calci  {
	float num1;
	float num2;	
	float sum;
	
	
	String userinp;
	public void userInput(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value :");
		this.num1 = sc.nextFloat();
		System.out.println("enter second value :");
		this.num2 = sc.nextFloat();
	}
	public void add(){
		
		sum = num1 + num2;
		System.out.println("---------------------------");
		System.out.println("ans of addition is : " + sum);
		System.out.println("---------------------------");
	}
	public void sub(){
		sum = num1 - num2;
		System.out.println("-------------------------------");
		System.out.println("ans of substraction is : " + sum);
		System.out.println("-------------------------------");
	}
	
	public void multiply(){
		sum = num1 * num2;
		System.out.println("---------------------------");
		System.out.println("ans of multiply is : " + sum);
		System.out.println("---------------------------");
	}
	public void divide(){
		sum = num1 / num2;
		float modulus = num1 % num2;
		System.out.println("-------------------------------------------------------------");
		System.out.println("ans of divide is : " + sum + "and the modulus is :" + modulus);
		System.out.println("-------------------------------------------------------------");
	}
	
	public void switchType()  {
		Scanner sc = new Scanner(System.in);
		System.out.println("hii");
		System.out.println("enter what you want to do :");
		System.out.println("type \"+\" for addition \n type \"-\" for substraction \n type \"*\" for multiply \n type \"/\" for divide and modulus \n ");
		userinp = sc.next();
		
		switch(userinp) {
		case "+" : userInput();
		add();
		switchType();
		break;
		case "-" : userInput();
		sub();
		switchType();
		break;
		case "*" : userInput();
		multiply();
		switchType();
		break;
		case "/" : userInput();
		divide();
		switchType();
		break;
		default : System.out.println("no match found try again! ");
		switchType();
		}
		
		System.out.println("\n\n\n");
		
	}
	
}


public class Calculator {
			public static void main(String[] args) {
				
				calci c = new calci();
				c.switchType();
				
				
				
				
			}
}
