package com.yash.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task6_StoreInHashmapAndSort {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("pune",200);
		m.put("mumbai",300);
		m.put("delhi",400);
		
		System.out.println("Before sorted element: "+m);
		
		Map<String, Integer> map = new TreeMap<>(m);
		//System.out.println(map);
		
		Set<String> key = map.keySet();
		
		for (String string : key) {
			Integer v = map.get(string);
			System.out.println(string+":"+v);
		}
	}

}
