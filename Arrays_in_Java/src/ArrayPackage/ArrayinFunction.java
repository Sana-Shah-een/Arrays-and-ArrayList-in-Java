package ArrayPackage;

import java.util.Arrays;

public class ArrayinFunction {

	public static void main(String[] args) {
// 		Arrays show mutable behavior in Java
		
		int[] nums= {1,3,44,56};
		System.out.println(Arrays.toString(nums));
		
		change(nums);
		System.out.print(Arrays.toString(nums));
	}
	 
	static void change(int[] arr) {
		arr[0]=99;
	}

}
