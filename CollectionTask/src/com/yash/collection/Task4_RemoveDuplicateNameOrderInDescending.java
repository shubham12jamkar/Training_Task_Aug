package com.yash.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task4_RemoveDuplicateNameOrderInDescending {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("shubham");
		l.add("sonu");
		l.add("aniket");
		l.add("ajay");
		l.add("sonu");
		System.out.println("Given list: "+l);
		
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("Reverse element: "+l);
		Set<String> s = new LinkedHashSet<>(l);
		//System.out.println("After remove duplicate and element in descending order: "+s);
		System.out.println("After remove duplicate and element in descending order: ");
		for (String string : s) {
			System.out.println(string);
		}
		
		
		
		
	}

}
