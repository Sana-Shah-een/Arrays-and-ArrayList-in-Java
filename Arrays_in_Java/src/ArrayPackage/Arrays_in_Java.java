package ArrayPackage;

import java.util.Arrays;
import java.util.Scanner; 

public class Arrays_in_Java {

	public static void main(String[] args) {
		 
//		Syntax of array	
//		datatype[] variable = new datatype[size];
//		new is used to create an object(memory allocation)
		
//		array declaration : datatype[] var;   var declare in stack
//		array initialisation: var = new datatype [size];  here object is created in heap memory
		
//		In java array may not be continuous ; depends on JVM  
//		objects are created in heap , heap obj are not continuous
		
//		Arrays are muteable(change)
		
//		null--none in Python
//		null is a special literal assigned to non-primitives (string ,arrays,objects)
//		Null is Special value literal that is by default valure what the reference variable points to.
		
// 		Non-Primitives that can be further broken down into other data tyes
//		like string can be broken down into char datatype
		
		
		
//		ARRAY OF PRIMITIVES
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		arr[0]=21;
		arr[1]=213;
		arr[2]=45;
		arr[3]=244;
		arr[4]=11;
//		[21,213,45,244,11]
//		System.out.println(arr[3]);
		
//		input using for loop
//		
//		for (int i=0;i<arr.length;i++) {
//			arr[i]=in.nextInt();
//		}
		
//		System.out.print(Arrays.toString(arr));//BEST WHAY TO OUTPUT ARRAY ELEMENTS
//		
//		for (int i=0;i<5;i++) {
//			System.out.print(arr[i] + " ");
//		}
		
//		For each Loop (Enhanced For Loop)
		
//		for(datataype variable : array){
//		System.out.println(variable)
		
//		for (int num : arr) {     // num represents the elements of array
//			System.out.print(num + " "); //for every element in array print that element
//		}
//		
//		System.out.print(arr[5]); index out of bound error
	
//	ARRAY OF OBJECTS
	String[] str = new String[4];
	for (int i=0 ; i<str.length ;i++) {
		str[i]=in.next();
				
	}
	
	System.out.print(Arrays.toString(str));
	
}
}




