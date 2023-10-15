package corejava;

import java.util.Scanner;

// Arrays in java
public class Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int a[] = new int[size];
		// input
		for(int i = 0; i<a.length;i++) {
			System.out.print("enter a"+i+" :");
			a[i] = sc.nextInt();
			
		}
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		// output
		System.out.println("enter x :");
		int x = sc.nextInt();
		
		for(int i = 0; i<a.length;i++) {
			if(a[i] == x) {
				System.out.println(a[i] +" found at index :" + i);
			}
		}
		
		
		
		
		
		/** defing ann array
		 type[] arrayname = new type[size];
		 type arrayname[] = new type[size];
		 type arraynem[] = {element1, ele2, ele3}
  		*/
	/**	int a[] = new int[5];
		
		int[] marks = new int[5];
		marks[0] = 1;
		marks[1] = 2;
		marks[2] = 3;
		marks[3] = 4;
		marks[4] = 5;
		System.out.println(marks[0]);
		
		for(int i = 0; i < marks.length;i++) {
			System.out.println(marks[i]);
		}  */
		
	
		
		/** System.out.print("enter array size :");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("size of array is:  " + a.length);
		
		// input
		for(int i = 0; i<size; i++) {
			a[i] = sc.nextInt(); 
			
		}
		// output
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		} */
		
	}
}
