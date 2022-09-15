package com.yash.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task1_SortElement {

	public static void main(String[] args) {

		
//		  List<Integer> l = new ArrayList<>();
//		  l.add(10);
//		  l.add(9);
//		  l.add(33);
//		  l.add(33);
//		  l.add(55);
//		  l.add(20);
//		  
//		  System.out.println("Before sorting list: "+l); 
//		  Collections.sort(l); //duplicate doesnot remove and sort in ascending order
//		  System.out.println("After sorting list: "+l);
		 

	//==============================================================================
		
		  
//		  List<Integer> l = new ArrayList<>();
//		  l.add(10);
//		  l.add(9);
//		  l.add(33);
//		  l.add(33);
//		  l.add(55);
//		  l.add(20);
//		  
//		  System.out.println("Before sorting list: "+l); 
//		  Set<Integer> s = new TreeSet<>(l);//duplicate remove and sort in ascending order
//		  System.out.println("After sorting list: "+s);
		
    //==============================================================================
		
		  
		List<String> l = new ArrayList<>();
		l.add("shubham");
		l.add("akshay");
		l.add("sagar");
		l.add("ashwin");

		System.out.println("Before sorting list: " + l);

		Set<String> s = new TreeSet<>(Arrays.asList("shubham", "akshay", "sagar", "ashwin"));
		System.out.println("After sorting element: ");
		for (String string : s) {
			System.out.println(string);
		}

	}

}
