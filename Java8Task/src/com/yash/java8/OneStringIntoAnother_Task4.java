package com.yash.java8;

import java.util.Arrays;
import java.util.List;

public class OneStringIntoAnother_Task4 {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("shubham","akshay");
		StringBuffer sb = new StringBuffer();
		l.forEach(sb::append);
		System.out.println(sb.insert(7, " and "));
		System.out.println(sb);
	}

}
