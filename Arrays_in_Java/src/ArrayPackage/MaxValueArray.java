package ArrayPackage;

public class MaxValueArray {

	public static void main(String[] args) {
		int[] arr = {1,2,44,17,99};
		int max=maxfun(arr);
		System.out.print(max);
		
	}
	
	//imagine that array is not empty
	static int maxfun(int[] arr) {
		int maxval=arr[0];
		for(int i=1 ; i<arr.length ; i++) {
			if(arr[i]>maxval) {
				maxval=arr[i];
			}
		}
		return maxval;

	}

}
