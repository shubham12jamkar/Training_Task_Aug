package com.yash.collection;

import java.util.Collections;
import java.util.Vector;

public class Task5_StoreInVectorAndSort {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("shubham");
		v.add("akshay");
		v.add("pratik");
		v.add("gourav");
		
		System.out.println("Before sorting element: "+v);
		Collections.sort(v);
		System.out.println("After sorting element: "+v);
	}

}
