package corejava;
import java.util.*;
			//2d arrays
			/** declaration of 2-d array
			 	type[][] arrayname = new type[no of rows][no. of columns];
			 */
public class Two_D_Arrays {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("enter no. of rows :");
			int rows = sc.nextInt();
			System.out.print("enter no. of columns :");
			int cols = sc.nextInt();
			
			int[][] numbers = new int[rows][cols];
			
			//input
			//rows loop
			for(int i = 0;i < rows; i++) {
				//cols loop
				for(int j = 0;j < cols; j++) {
					System.out.print("enter number of row "+i+" and col. "+j+" :");
					numbers[i][j] = sc.nextInt();
				}
				System.out.println();
			}
			
			//output
			for(int i = 0;i < rows; i++) {
				for(int j =0; j < cols; j++) {
					System.out.print(numbers[i][j] + " ");
					
				}
				System.out.println();
			}
			
			System.out.println("enter number you want to search from 2d array : ");
			int x = sc.nextInt();
			
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < cols; j++) {
					if(x == numbers[i][j]) {
						System.out.println(x +" is found at index... row : "+i+" column "+j);
					}
				}
			}
			
		}
}
