package ArrayPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListinJava {

	public static void main(String[] args) {
	
		//constant time complexity -> O(1)
	Scanner in = new Scanner(System.in);
		//Syntax
		
	ArrayList<Integer> list = new ArrayList<>(10);
	list.add(20);
	list.add(120);
	list.add(30);
	list.add(440);
	System.out.println(list);
	
	System.out.println(list.contains(440));
	
	list.set(0, 88);
	System.out.println(list);
	
	list.remove(3);
	System.out.println(list);

	//INPUT LIST
	for(int i=0; i<5; i++) {
		list.add(in.nextInt());
	}
	
	//OUTPUT LIST (get item at an index)
	for(int i=0; i<5; i++) {
		System.out.println(list.get(i));  //list[index] not work here 
	}


	}

}
