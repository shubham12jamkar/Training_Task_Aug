package com.yash.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task3_RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(2);
		l.add(11);
		l.add(5);
		l.add(66);
		l.add(11);
		
		System.out.println("Before remove duplicate element: "+l);
		Set<Integer> s = new TreeSet<>(l);
		System.out.println("After remove duplicate: "+s);
	}

}
