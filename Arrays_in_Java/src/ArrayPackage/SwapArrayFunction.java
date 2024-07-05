package ArrayPackage;

import java.util.Arrays;

public class SwapArrayFunction {

	public static void main(String[] args) {
		int[] arr = {1 ,3,4,6,7,8,9};
		swap(arr,1,3);
		
		System.out.print(Arrays.toString(arr));
	}
	
	 static void swap(int[] arr,int index1,int index2) {
		 int temp = arr[index1];
		 arr[index1]=arr[index2];
		 arr[index2]=temp;
	 }
}

