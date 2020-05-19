package stringJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class printList {

	public static void main(String[] args) {
		int x[] = {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<x.length;i++) {
			System.out.println(i);
		}
		
		
		
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);

		// 1. Print string representation of the list using toString()
		System.out.println(list);
		
		



	}

}
