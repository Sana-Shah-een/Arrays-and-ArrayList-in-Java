package ArrayPackage;

public class MaxValueInRangeOfArray {

	public static void main(String[] args) {
		int[] arr = {1,2,44,17,99};
		int max=maxRange(arr,1,3);
		System.out.print(max);
		
	}
	
	//work on edge cases here like array is being null
	static int maxRange(int[] arr,int start, int end) {
		//multiple cases
		if(end>start) {
			return -1;
		}
		if(arr==null) {
			return -1;
		}
		if(arr.length==0) {
			return -1;
		}
		int maxval=start;
		for(int i=start ; i<=end ; i++) {
			if(arr[i]>maxval) {
				maxval=arr[i];
			}
		}
		return maxval;

	}

}
