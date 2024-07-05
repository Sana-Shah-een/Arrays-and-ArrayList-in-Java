package ArrayPackage;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		/*
		    1 2 3
		    2 3 4
		    6 7 8
		    
		 */

		int[][] arr = new int[3][3]; // columns specification not mandatory
		System.out.print(arr.length);
		
		Scanner in = new Scanner(System.in);
		//Array in arrays
//		int[][] arr = {
//				{2,3,4}, //0th index
//				{4,5},   //1st index
//				{6,7,8,9} //second index-> array2D[2]={6,7,8,9}
//		};
		
		//INPUT		
		for (int row=0 ; row <arr.length ; row++) {
//			now we take every row
			for (int col=0 ; col<arr[row].length ;col++) {
				arr[row][col]=in.nextInt();
			}
		}
		
		
		//OUTPUT(Method 1)
//		for (int row=0 ; row <arr.length ; row++) {
////			now we take every row
//			for (int col=0 ; col<arr[row].length ;col++) {
//			System.out.print(arr[row][col] + " ");	
//			}
//		    System.out.println();
//		}
			 
//		//Method 2
//		for (int row=0 ; row <arr.length ; row++) {
//		 System.out.println(Arrays.toString(arr[row]));
//		}
		
		//Method 3
		for(int[] num : arr) {
			System.out.println(Arrays.toString(num));
		}
		
	}

}
