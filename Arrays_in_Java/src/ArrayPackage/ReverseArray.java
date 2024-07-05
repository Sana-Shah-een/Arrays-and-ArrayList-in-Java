package ArrayPackage;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,7,80,3,33};
		
		reverse(arr);
		System.out.print(Arrays.toString(arr));
	}
	
	static void reverse(int[] arr) {
		int start=0;
		int end=arr.length-1;
		
		//swap
		while(start<end) {
		
		for(int i=start;i<=end;i++) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
		}
			start++;
			end--;
		
	}
			
	}

}
