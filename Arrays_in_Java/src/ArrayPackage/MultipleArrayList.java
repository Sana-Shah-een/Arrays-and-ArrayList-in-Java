package ArrayPackage;

import java.util.*;
public class MultipleArrayList {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);
		
		//initialization
		for(int i = 0; i<3; i++) {
			list.add(new ArrayList<>());
			
		//add elements
		for(int v=0; v<3; v++) {
			for(int j=0; j<3; j++) {
				list.get(i).add(in.nextInt());
			}
		}
			
		System.out.println(list);
		}
		
	}

}
