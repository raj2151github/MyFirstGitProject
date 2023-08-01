package com.velocity.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args)
	{
		ArrayList<Integer> List1 = new ArrayList();
		List1.add(10);
		List1.add(20);
		List1.add(30);
		
		ArrayList<Integer> List2 = new ArrayList();
		List2.add(40);
		List2.add(50);
		List2.add(60);
		
		List1.addAll(List2);
		
	//	System.out.println(List1);
		
//		for(int d : List1 )
//		{
//			System.out.println(d);
//			
//		} 
		
		// Using Iterator
		
		Iterator<Integer> itr  = List1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
